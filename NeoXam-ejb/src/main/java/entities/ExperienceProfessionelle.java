package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ExperienceProfessionelle implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Date dateDebut;
	private Date dateFin;
	private String societe;
	private String position;
	private String description;
	
	//Navigation properties: Associations:
	@ManyToOne
	@JoinColumn(name="FK_CV_EXPERIENCE")
	private CV cv;
	
	
	/**
	 * 
	 */
	public ExperienceProfessionelle() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param dateDebut
	 * @param dateFin
	 * @param societe
	 * @param position
	 * @param description
	 */
	public ExperienceProfessionelle(Date dateDebut, Date dateFin, String societe, String position, String description) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.societe = societe;
		this.position = position;
		this.description = description;
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
	 * @return the societe
	 */
	public String getSociete() {
		return societe;
	}
	/**
	 * @param societe the societe to set
	 */
	public void setSociete(String societe) {
		this.societe = societe;
	}
	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
