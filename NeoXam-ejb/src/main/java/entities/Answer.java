package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Answer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String answerBody;
	private boolean correct;
	
	
	//Assocations:
	
	@ManyToOne
	@JoinColumn(name="FK_ANSWER_QUESTION")
	private Question question;
	
	
	/**
	 * 
	 */
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param answerBody
	 * @param correct
	 */
	public Answer(String answerBody, boolean correct) {
		super();
		this.answerBody = answerBody;
		this.correct = correct;
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
	 * @return the answerBody
	 */
	public String getAnswerBody() {
		return answerBody;
	}
	/**
	 * @param answerBody the answerBody to set
	 */
	public void setAnswerBody(String answerBody) {
		this.answerBody = answerBody;
	}
	/**
	 * @return the correct
	 */
	public boolean isCorrect() {
		return correct;
	}
	/**
	 * @param correct the correct to set
	 */
	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
	
	
}
