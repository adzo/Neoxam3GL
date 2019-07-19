using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace Neoxam.Models.View_Models
{

    public class LoginInfo
    {
        public String userName { get; set; }
        [Required(ErrorMessage = "Password is Required.")]
        public String password { get; set; }
        public int usedId { get; set; }
        public String userType { get; set; }
    }
}