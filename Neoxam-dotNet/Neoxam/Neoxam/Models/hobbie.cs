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
    
    public partial class hobbie
    {
        public int id { get; set; }
        public string name { get; set; }
        public Nullable<int> FK_CV_HOBBIE { get; set; }
    
        public virtual cv cv { get; set; }
    }
}
