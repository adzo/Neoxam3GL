package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Candidate extends User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String socialStatus;

	//Association
	@OneToOne(mappedBy = "candidate", cascade = CascadeType.ALL)
	private CV cv;
	
	
	/**
	 * 
	 */
	public Candidate() {
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
	 * @param socialStatus
	 */
	public Candidate(String firstName, String lastName, Date dateNaissance, String email, String password,
			Addresse addresse, Date registrationDate, UserStatus status, boolean permis, String socialStatus) {
		super(firstName, lastName, dateNaissance, email, password, addresse, registrationDate, status, permis);
		this.socialStatus = socialStatus;
	}

	/**
	 * @return the socialStatus
	 */
	public String getSocialStatus() {
		return socialStatus;
	}

	/**
	 * @param socialStatus the socialStatus to set
	 */
	public void setSocialStatus(String socialStatus) {
		this.socialStatus = socialStatus;
	}
	
	
}
