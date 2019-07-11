package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	private String firstName;
	private String lastName;
	private Date dateNaissance;
	private String email;
	private String password;
	@Embedded
	private Addresse addresse;
	private Date registrationDate;
	@Enumerated(EnumType.STRING)
	private UserStatus status;
	private boolean permis;
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the addresse
	 */
	public Addresse getAddresse() {
		return addresse;
	}
	/**
	 * @param addresse the addresse to set
	 */
	public void setAddresse(Addresse addresse) {
		this.addresse = addresse;
	}
	/**
	 * @return the registrationDate
	 */
	public Date getRegistrationDate() {
		return registrationDate;
	}
	/**
	 * @param registrationDate the registrationDate to set
	 */
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	/**
	 * @return the status
	 */
	public UserStatus getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(UserStatus status) {
		this.status = status;
	}
	/**
	 * @return the permis
	 */
	public boolean isPermis() {
		return permis;
	}
	/**
	 * @param permis the permis to set
	 */
	public void setPermis(boolean permis) {
		this.permis = permis;
	}
	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param firstName
	 * @param lastName
	 * @param dateNaissance
	 * @param email
	 * @param password
	 * @param addresse
	 * @param registrationDate
	 * @param status
	 * @param permis
	 */
	public User(String firstName, String lastName, Date dateNaissance, String email, String password, Addresse addresse,
			Date registrationDate, UserStatus status, boolean permis) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.password = password;
		this.addresse = addresse;
		this.registrationDate = registrationDate;
		this.status = status;
		this.permis = permis;
	}
	
	
	
}
