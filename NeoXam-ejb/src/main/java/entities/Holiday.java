package entities;

import java.util.Date;

public class Holiday {

	private int id;
	private Date dateStart;
	private int nbrDays;
	private HolidaysStatus status;
	/**
	 * 
	 */
	public Holiday() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param dateStart
	 * @param nbrDays
	 * @param status
	 */
	public Holiday(Date dateStart, int nbrDays, HolidaysStatus status) {
		super();
		this.dateStart = dateStart;
		this.nbrDays = nbrDays;
		this.status = status;
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
	 * @return the dateStart
	 */
	public Date getDateStart() {
		return dateStart;
	}
	/**
	 * @param dateStart the dateStart to set
	 */
	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}
	/**
	 * @return the nbrDays
	 */
	public int getNbrDays() {
		return nbrDays;
	}
	/**
	 * @param nbrDays the nbrDays to set
	 */
	public void setNbrDays(int nbrDays) {
		this.nbrDays = nbrDays;
	}
	/**
	 * @return the status
	 */
	public HolidaysStatus getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(HolidaysStatus status) {
		this.status = status;
	}
	
	
}
