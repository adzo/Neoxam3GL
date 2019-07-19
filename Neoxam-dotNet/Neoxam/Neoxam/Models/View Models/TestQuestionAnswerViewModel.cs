using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Neoxam.Models.View_Models
{
    public class TestQuestionAnswerViewModel
    {

        public string questionBody { get; set; }
        public string answerBody { get; set; }
        public bool correct { get; set; }
        public string category { get; set; }
        public string description { get; set; }
        public string name { get; set; }
        public string summary { get; set; }

        public TestQuestionAnswerViewModel()
        {

        }
    }
}