package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Question  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String questionBody;
	
	
	//Association
	
	@ManyToOne
	@JoinColumn(name="FK_TEST_QUESTION")
	private Test test;
	
	@OneToMany(mappedBy = "question")
	private List<Answer> answers;
	
	
	/**
	 * @param id
	 * @param questionBody
	 */
	public Question(String questionBody) {
		super();
		this.questionBody = questionBody;
	}
	/**
	 * 
	 */
	public Question() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the questionBody
	 */
	public String getQuestionBody() {
		return questionBody;
	}
	/**
	 * @param questionBody the questionBody to set
	 */
	public void setQuestionBody(String questionBody) {
		this.questionBody = questionBody;
	}
	
	
	
}
