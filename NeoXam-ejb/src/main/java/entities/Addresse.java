package entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Addresse implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String street;
	private String city;
	private String State;
	private int zipCode;
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return State;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		State = state;
	}
	/**
	 * @return the zipCode
	 */
	public int getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	/**
	 * 
	 */
	public Addresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param street
	 * @param city
	 * @param state
	 * @param zipCode
	 */
	public Addresse(String street, String city, String state, int zipCode) {
		super();
		this.street = street;
		this.city = city;
		State = state;
		this.zipCode = zipCode;
	}
	
	
}
