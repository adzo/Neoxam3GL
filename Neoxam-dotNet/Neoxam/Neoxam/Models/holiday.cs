//------------------------------------------------------------------------------
// <auto-generated>
//    Ce code a été généré à partir d'un modèle.
//
//    Des modifications manuelles apportées à ce fichier peuvent conduire à un comportement inattendu de votre application.
//    Les modifications manuelles apportées à ce fichier sont remplacées si le code est régénéré.
// </auto-generated>
//------------------------------------------------------------------------------

namespace Neoxam.Models
{
    using System;
    using System.Collections.Generic;
    
    public partial class holiday
    {
        public int id { get; set; }
        public Nullable<System.DateTime> dateStart { get; set; }
        public int nbrDays { get; set; }
        public string status { get; set; }
        public string type { get; set; }
        public Nullable<int> FK_EMPLOYEE_HOLIDAY { get; set; }
    
        public virtual employee employee { get; set; }
    }
}
