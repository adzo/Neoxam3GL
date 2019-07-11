package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CV implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String path;
	
	
	//Association:
	@OneToMany(mappedBy = "cv")
	private List<ExperienceProfessionelle> experienceProfessionelles;
	@OneToMany(mappedBy = "cv")
	private List<Formation> formations;
	@OneToMany(mappedBy = "cv")	
	private List<Hobbie> hobbies;
	@OneToMany(mappedBy = "cv")
	private List<Skills> skills;
	
	
	
	/**
	 * 
	 */
	public CV() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param path
	 */
	public CV(String path) {
		super();
		this.path = path;
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
	 * @return the path
	 */
	public String getPath() {
		return path;
	}
	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}
	
	
}
