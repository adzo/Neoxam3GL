package entities;

import java.util.Date;

public class Employee extends User{

	private int cin;
	private Date recruitmentDate;
	private int nbChildren;
	private Role positionHeld;
	private int salary;
	private int bonusPts;
	/**
	 * 
	 */
	public Employee() {
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
	 * @param cin
	 * @param recruitmentDate
	 * @param nbChildren
	 * @param positionHeld
	 * @param salary
	 * @param bonusPts
	 */
	public Employee(String firstName, String lastName, Date dateNaissance, String email, String password,
			Addresse addresse, Date registrationDate, UserStatus status, boolean permis, int cin, Date recruitmentDate,
			int nbChildren, Role positionHeld, int salary, int bonusPts) {
		super(firstName, lastName, dateNaissance, email, password, addresse, registrationDate, status, permis);
		this.cin = cin;
		this.recruitmentDate = recruitmentDate;
		this.nbChildren = nbChildren;
		this.positionHeld = positionHeld;
		this.salary = salary;
		this.bonusPts = bonusPts;
	}
	/**
	 * @return the cin
	 */
	public int getCin() {
		return cin;
	}
	/**
	 * @param cin the cin to set
	 */
	public void setCin(int cin) {
		this.cin = cin;
	}
	/**
	 * @return the recruitmentDate
	 */
	public Date getRecruitmentDate() {
		return recruitmentDate;
	}
	/**
	 * @param recruitmentDate the recruitmentDate to set
	 */
	public void setRecruitmentDate(Date recruitmentDate) {
		this.recruitmentDate = recruitmentDate;
	}
	/**
	 * @return the nbChildren
	 */
	public int getNbChildren() {
		return nbChildren;
	}
	/**
	 * @param nbChildren the nbChildren to set
	 */
	public void setNbChildren(int nbChildren) {
		this.nbChildren = nbChildren;
	}
	/**
	 * @return the positionHeld
	 */
	public Role getPositionHeld() {
		return positionHeld;
	}
	/**
	 * @param positionHeld the positionHeld to set
	 */
	public void setPositionHeld(Role positionHeld) {
		this.positionHeld = positionHeld;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/**
	 * @return the bonusPts
	 */
	public int getBonusPts() {
		return bonusPts;
	}
	/**
	 * @param bonusPts the bonusPts to set
	 */
	public void setBonusPts(int bonusPts) {
		this.bonusPts = bonusPts;
	}
	
	
}
