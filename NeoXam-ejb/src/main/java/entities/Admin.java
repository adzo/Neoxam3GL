package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Admin extends User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String userName;

	/**
	 * 
	 */
	public Admin() {
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
	 * @param userName
	 */
	public Admin(String firstName, String lastName, Date dateNaissance, String email, String password,
			Addresse addresse, Date registrationDate, UserStatus status, boolean permis, String userName) {
		super(firstName, lastName, dateNaissance, email, password, addresse, registrationDate, status, permis);
		this.userName = userName;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
