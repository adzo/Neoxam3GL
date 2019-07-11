package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Skills implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String level;
	
	
	//Association
		@ManyToOne
		@JoinColumn(name="FK_CV_SKILLS")
		private CV cv;
	
	
	/**
	 * 
	 */
	public Skills() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param lang
	 * @param level
	 */
	public Skills(int id, String name, String level) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
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
	 * @param lang the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(String level) {
		this.level = level;
	}
}
