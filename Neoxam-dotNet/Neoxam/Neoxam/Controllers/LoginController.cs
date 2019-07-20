using Neoxam.Models;
using Neoxam.Models.View_Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Neoxam.Controllers
{
    public class LoginController : Controller
    {
        private neoxamdbEntities db = new neoxamdbEntities();

        public ActionResult Index()
        {
            if (Session["userId"] == null)
            {
                return RedirectToAction("Index", "Home");
            }
            return View();
        }

        public ActionResult Login2()
        {
            return View();
        }

        public ActionResult PreLogin()
        {
            return View();
        }

        // GET: Login
        public ActionResult LoginCandidat()
        {
            return View();
        }

        [HttpPost]
        public ActionResult LoginCandidat([Bind(Include = "userName,password")] LoginInfo credentials)
        {
            candidate can;
            try
            {
                 can = db.candidate.Where(e => e.email == credentials.userName).First();
            }
            catch
            {
                can = null;
            }
            
            if(can != null)
            {
                if (can.password.Equals(credentials.password))
                {
                    Session["userId"] = can.id;
                    Session["name"] = can.firstName;
                    Session["type"] = "candidate";
                    return RedirectToAction("Index");
                }
                //good credentials redirect to candidate space
                return View();
            }
            else { 
            return View();
            }
        }



        public ActionResult LoginMember()
        {
            return View();
        }


        [HttpPost]
        public ActionResult LoginMember([Bind(Include = "userName,password")] LoginInfo credentials)
        {
            employee can;
            try
            {
                can = db.employee.Where(e => e.email == credentials.userName).First();
            }
            catch
            {
                can = null;
            }
            if (can != null)
            {
                if (can.password.Equals(credentials.password))
                {
                    Session["userId"] = can.id;
                    Session["name"] = can.firstName;
                    Session["type"] = "employee";
                    return RedirectToAction("Index");
                }
                //good credentials redirect to candidate space
                return View();
            }
            else
            {
                return View();
            }
        }

    }
}

