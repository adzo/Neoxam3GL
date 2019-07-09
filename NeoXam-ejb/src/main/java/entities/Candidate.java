package entities;

import java.util.Date;

public class Candidate extends User {
	
	private String socialStatus;

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
