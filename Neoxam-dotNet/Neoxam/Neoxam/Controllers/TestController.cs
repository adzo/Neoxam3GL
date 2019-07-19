using Neoxam.Models;
using Neoxam.Models.View_Models;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Web;
using System.Web.Mvc;

namespace Neoxam.Controllers
{
    public class TestController : Controller
    {
        public static TestQuestionAnswerViewModel result { get; set; }
        private neoxamdbEntities db = new neoxamdbEntities();


        // GET: Test
        public ActionResult Index()
        {
            return View(db.test.ToList());
        }

        // GET: Test/Details/5
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return RedirectToAction("Index");
            }
            test test = db.test.Find(id);
            if (test == null)
            {
                return RedirectToAction("Index");
            }
            return View(test);
        }


        // GET: Test/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: Test/Create
        [HttpPost]
        public ActionResult Create([Bind(Include = "summary, category,description,name")] TestQuestionAnswerViewModel element)
        {
            try
            {
                result = element;
                test t = new test();
                t.category = element.category;
                t.description = element.description;
                t.name = element.name;
                t.question = new List<question>();
                List <RootObject> listQuestions = JsonConvert.DeserializeObject<List<RootObject>>(element.summary);
                foreach ( var item in listQuestions)
                {
                    question quest = new question() {
                        questionBody = item.question,
                        answer = new List<answer>()
                    };
                    //parcourir liste des answers:
                    foreach(var ans in item.answers)
                    {
                        answer answerObject = new answer(){
                            answerBody = ans.answers_data,
                            correct = ans.answer_value
                        };
                        quest.answer.Add(answerObject);
                    }
                    t.question.Add(quest);
                }
                
                

                db.test.Add(t);
                db.SaveChanges();


                return RedirectToAction("Index");
            }
            catch
            {
                return View();
            }
        }

        // GET: Test/Edit/5
        public ActionResult Edit(int id)
        {
            return View();
        }

        // POST: Test/Edit/5
        [HttpPost]
        public ActionResult Edit(int id, FormCollection collection)
        {
            try
            {
                // TODO: Add update logic here

                return RedirectToAction("Index");
            }
            catch
            {
                return View();
            }
        }

        // GET: Test/Delete/5
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            test test = db.test.Find(id);
            if (test == null)
            {
                return HttpNotFound();
            }
            return View(test);
        }

        // POST: Test/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            test test = db.test.Find(id);
            foreach(var quest in test.question.ToList())
            {
                foreach(var item in quest.answer.ToList())
                {
                    db.answer.Remove(db.answer.Find(item.id));
                }
                db.question.Remove(db.question.Find(quest.id));
            }



            db.test.Remove(test);
            db.SaveChanges();
            return RedirectToAction("Index");
        }
    }
}



public class Answer
{
    public string answers_data { get; set; }
    public bool answer_value { get; set; }
}

public class RootObject
{
    public string question { get; set; }
    public List<Answer> answers { get; set; }
}