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
    
    public partial class experienceprofessionelle
    {
        public int id { get; set; }
        public Nullable<System.DateTime> dateDebut { get; set; }
        public Nullable<System.DateTime> dateFin { get; set; }
        public string description { get; set; }
        public string position { get; set; }
        public string societe { get; set; }
        public Nullable<int> FK_CV_EXPERIENCE { get; set; }
    
        public virtual cv cv { get; set; }
    }
}
