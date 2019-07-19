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
public class Message implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Date date;
	private String objectOfMessage;
	private String body;
	
	//Association;
	
	@ManyToOne
	@JoinColumn(name="sender_id")
	private Employee sender;
	
	@ManyToOne
	@JoinColumn(name="reciever_id")
	private Employee receiver;

	
	
	/**
	 * @return the object
	 */
	
	/**
	 * 
	 */
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the objectOfMessage
	 */
	public String getObjectOfMessage() {
		return objectOfMessage;
	}

	/**
	 * @param objectOfMessage the objectOfMessage to set
	 */
	public void setObjectOfMessage(String objectOfMessage) {
		this.objectOfMessage = objectOfMessage;
	}

	/**
	 * @param date
	 * @param body
	 * @param sender
	 * @param receiver
	 */
	public Message(Date date, String body) {
		super();
		this.date = date;
		this.body = body;
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
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}

	/**
	 * @return the sender
	 */
	public Employee getSender() {
		return sender;
	}

	/**
	 * @param sender the sender to set
	 */
	public void setSender(Employee sender) {
		this.sender = sender;
	}

	/**
	 * @return the receiver
	 */
	public Employee getReceiver() {
		return receiver;
	}

	/**
	 * @param receiver the receiver to set
	 */
	public void setReceiver(Employee receiver) {
		this.receiver = receiver;
	}
	
	
	
}
