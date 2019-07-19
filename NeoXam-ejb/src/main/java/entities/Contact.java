package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String company;
	private int phone;
	private String email;
	private String message;
	private Date dateMessage;
	private boolean stateOfMessage;
	/**
	 * 
	 */
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param company
	 * @param phone
	 * @param email
	 * @param message
	 */
	public Contact(String name, String company, int phone, String email, String message) {
		super();
		this.name = name;
		this.company = company;
		this.phone = phone;
		this.email = email;
		this.message = message;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the phone
	 */
	public int getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(int phone) {
		this.phone = phone;
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
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @param name
	 * @param company
	 * @param phone
	 * @param email
	 * @param message
	 * @param dateMessage
	 * @param stateOfMessage
	 */
	public Contact(String name, String company, int phone, String email, String message, Date dateMessage,
			boolean stateOfMessage) {
		super();
		this.name = name;
		this.company = company;
		this.phone = phone;
		this.email = email;
		this.message = message;
		this.dateMessage = dateMessage;
		this.stateOfMessage = stateOfMessage;
	}
	/**
	 * @return the dateMessage
	 */
	public Date getDateMessage() {
		return dateMessage;
	}
	/**
	 * @param dateMessage the dateMessage to set
	 */
	public void setDateMessage(Date dateMessage) {
		this.dateMessage = dateMessage;
	}
	/**
	 * @return the stateOfMessage
	 */
	public boolean isStateOfMessage() {
		return stateOfMessage;
	}
	/**
	 * @param stateOfMessage the stateOfMessage to set
	 */
	public void setStateOfMessage(boolean stateOfMessage) {
		this.stateOfMessage = stateOfMessage;
	}
	
	

	
}
