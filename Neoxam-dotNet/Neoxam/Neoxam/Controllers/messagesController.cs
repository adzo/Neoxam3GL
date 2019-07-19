using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Entity;
using System.Linq;
using System.Net;
using System.Web;
using System.Web.Mvc;
using Neoxam.Models;

namespace Neoxam.Controllers
{
    public class messagesController : Controller
    {
        private neoxamdbEntities db = new neoxamdbEntities();

        // GET: messages
        public ActionResult Index()
        {
            var message = db.message.Include(m => m.employee).Include(m => m.employee1);
            return View(message.ToList());
        }

        // GET: messages/Details/5
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            message message = db.message.Find(id);
            if (message == null)
            {
                return HttpNotFound();
            }
            return View(message);
        }

        // GET: messages/Create
        public ActionResult Create()
        {
            ViewBag.reciever_id = new SelectList(db.employee, "id", "State");
            ViewBag.sender_id = new SelectList(db.employee, "id", "State");
            return View();
        }

        // POST: messages/Create
        // Afin de déjouer les attaques par sur-validation, activez les propriétés spécifiques que vous voulez lier. Pour 
        // plus de détails, voir  https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "id,body,date,object,reciever_id")] message message)
        {
            if (ModelState.IsValid)
            {
                
                db.message.Add(message);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            ViewBag.reciever_id = new SelectList(db.employee, "id", "State", message.reciever_id);
            ViewBag.sender_id = new SelectList(db.employee, "id", "State", message.sender_id);
            return View(message);
        }

        // GET: messages/Edit/5
        public ActionResult Edit(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            message message = db.message.Find(id);
            if (message == null)
            {
                return HttpNotFound();
            }
            ViewBag.reciever_id = new SelectList(db.employee, "id", "State", message.reciever_id);
            ViewBag.sender_id = new SelectList(db.employee, "id", "State", message.sender_id);
            return View(message);
        }

        // POST: messages/Edit/5
        // Afin de déjouer les attaques par sur-validation, activez les propriétés spécifiques que vous voulez lier. Pour 
        // plus de détails, voir  https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "id,body,date,object,reciever_id,sender_id")] message message)
        {
            if (ModelState.IsValid)
            {
                db.Entry(message).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            ViewBag.reciever_id = new SelectList(db.employee, "id", "State", message.reciever_id);
            ViewBag.sender_id = new SelectList(db.employee, "id", "State", message.sender_id);
            return View(message);
        }

        // GET: messages/Delete/5
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            message message = db.message.Find(id);
            if (message == null)
            {
                return HttpNotFound();
            }
            return View(message);
        }

        // POST: messages/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            message message = db.message.Find(id);
            db.message.Remove(message);
            db.SaveChanges();
            return RedirectToAction("Index");
        }

        protected override void Dispose(bool disposing)
        {
            if (disposing)
            {
                db.Dispose();
            }
            base.Dispose(disposing);
        }
    }
}
