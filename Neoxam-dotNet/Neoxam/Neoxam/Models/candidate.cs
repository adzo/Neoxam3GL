//------------------------------------------------------------------------------
// <auto-generated>
//     Ce code a été généré à partir d'un modèle.
//
//     Des modifications manuelles apportées à ce fichier peuvent conduire à un comportement inattendu de votre application.
//     Les modifications manuelles apportées à ce fichier sont remplacées si le code est régénéré.
// </auto-generated>
//------------------------------------------------------------------------------

namespace Neoxam.Models
{
    using System;
    using System.Collections.Generic;
    
    public partial class candidate
    {
        public int id { get; set; }
        public string State { get; set; }
        public string city { get; set; }
        public string street { get; set; }
        public int zipCode { get; set; }
        public Nullable<System.DateTime> dateNaissance { get; set; }
        public string email { get; set; }
        public string firstName { get; set; }
        public string lastName { get; set; }
        public string password { get; set; }
        public bool permis { get; set; }
        public Nullable<System.DateTime> registrationDate { get; set; }
        public string status { get; set; }
        public string socialStatus { get; set; }
    
        public virtual cv cv { get; set; }
    }
}
