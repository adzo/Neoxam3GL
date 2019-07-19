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
    public class holidaysController : Controller
    {
        private neoxamdbEntities db = new neoxamdbEntities();

        // GET: holidays
        public ActionResult Index()
        {
            var holiday = db.holiday.Include(h => h.employee);
            return View(holiday.ToList());
        }

        // GET: holidays/Details/5
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            holiday holiday = db.holiday.Find(id);
            if (holiday == null)
            {
                return HttpNotFound();
            }
            return View(holiday);
        }

        // GET: holidays/Create
        public ActionResult Create()
        {
            ViewBag.FK_EMPLOYEE_HOLIDAY = new SelectList(db.employee, "id", "State");
            return View();
        }

        // POST: holidays/Create
        // Afin de déjouer les attaques par sur-validation, activez les propriétés spécifiques que vous voulez lier. Pour 
        // plus de détails, voir  https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "id,dateStart,nbrDays,status,type,FK_EMPLOYEE_HOLIDAY")] holiday holiday)
        {
            if (ModelState.IsValid)
            {
                db.holiday.Add(holiday);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            ViewBag.FK_EMPLOYEE_HOLIDAY = new SelectList(db.employee, "id", "State", holiday.FK_EMPLOYEE_HOLIDAY);
            return View(holiday);
        }

        // GET: holidays/Edit/5
        public ActionResult Edit(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            holiday holiday = db.holiday.Find(id);
            if (holiday == null)
            {
                return HttpNotFound();
            }
            ViewBag.FK_EMPLOYEE_HOLIDAY = new SelectList(db.employee, "id", "State", holiday.FK_EMPLOYEE_HOLIDAY);
            return View(holiday);
        }

        // POST: holidays/Edit/5
        // Afin de déjouer les attaques par sur-validation, activez les propriétés spécifiques que vous voulez lier. Pour 
        // plus de détails, voir  https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "id,dateStart,nbrDays,status,type,FK_EMPLOYEE_HOLIDAY")] holiday holiday)
        {
            if (ModelState.IsValid)
            {
                db.Entry(holiday).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            ViewBag.FK_EMPLOYEE_HOLIDAY = new SelectList(db.employee, "id", "State", holiday.FK_EMPLOYEE_HOLIDAY);
            return View(holiday);
        }

        // GET: holidays/Delete/5
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            holiday holiday = db.holiday.Find(id);
            if (holiday == null)
            {
                return HttpNotFound();
            }
            return View(holiday);
        }

        // POST: holidays/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            holiday holiday = db.holiday.Find(id);
            db.holiday.Remove(holiday);
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
