package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CandidateResponse  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int idCandidat;
	private int idTest;
	private int idQuestion;
	private int idResponse;
	/**
	 * 
	 */
	public CandidateResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param idCandidat
	 * @param idTest
	 * @param idQuestion
	 * @param idResponse
	 */
	public CandidateResponse(int idCandidat, int idTest, int idQuestion, int idResponse) {
		super();
		this.idCandidat = idCandidat;
		this.idTest = idTest;
		this.idQuestion = idQuestion;
		this.idResponse = idResponse;
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
	 * @return the idCandidat
	 */
	public int getIdCandidat() {
		return idCandidat;
	}
	/**
	 * @param idCandidat the idCandidat to set
	 */
	public void setIdCandidat(int idCandidat) {
		this.idCandidat = idCandidat;
	}
	/**
	 * @return the idTest
	 */
	public int getIdTest() {
		return idTest;
	}
	/**
	 * @param idTest the idTest to set
	 */
	public void setIdTest(int idTest) {
		this.idTest = idTest;
	}
	/**
	 * @return the idQuestion
	 */
	public int getIdQuestion() {
		return idQuestion;
	}
	/**
	 * @param idQuestion the idQuestion to set
	 */
	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}
	/**
	 * @return the idResponse
	 */
	public int getIdResponse() {
		return idResponse;
	}
	/**
	 * @param idResponse the idResponse to set
	 */
	public void setIdResponse(int idResponse) {
		this.idResponse = idResponse;
	}
	
	
	
}
