﻿//------------------------------------------------------------------------------
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
    using System.Data.Entity;
    using System.Data.Entity.Infrastructure;
    
    public partial class neoxamdbEntities : DbContext
    {
        public neoxamdbEntities()
            : base("name=neoxamdbEntities")
        {
        }
    
        protected override void OnModelCreating(DbModelBuilder modelBuilder)
        {
            throw new UnintentionalCodeFirstException();
        }
    
        public DbSet<admin> admin { get; set; }
        public DbSet<answer> answer { get; set; }
        public DbSet<candidate> candidate { get; set; }
        public DbSet<candidateresponse> candidateresponse { get; set; }
        public DbSet<cv> cv { get; set; }
        public DbSet<employee> employee { get; set; }
        public DbSet<experienceprofessionelle> experienceprofessionelle { get; set; }
        public DbSet<formation> formation { get; set; }
        public DbSet<hobbie> hobbie { get; set; }
        public DbSet<holiday> holiday { get; set; }
        public DbSet<language> language { get; set; }
        public DbSet<message> message { get; set; }
        public DbSet<question> question { get; set; }
        public DbSet<skills> skills { get; set; }
        public DbSet<test> test { get; set; }
    }
}
