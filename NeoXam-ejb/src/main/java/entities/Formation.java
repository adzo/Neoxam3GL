package entities;

import java.util.Date;

public class Formation {
	private int id;
	private Date dateDebut;
	private Date dateFin;
	private String nom;
	private String lieux;
	/**
	 * 
	 */
	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param dateDebut
	 * @param dateFin
	 * @param nom
	 * @param lieux
	 */
	public Formation(Date dateDebut, Date dateFin, String nom, String lieux) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.nom = nom;
		this.lieux = lieux;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}
	/**
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	/**
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}
	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the lieux
	 */
	public String getLieux() {
		return lieux;
	}
	/**
	 * @param lieux the lieux to set
	 */
	public void setLieux(String lieux) {
		this.lieux = lieux;
	}
	
	
}
