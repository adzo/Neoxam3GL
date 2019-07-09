package entities;

public class Skills {
	private int id;
	private String name;
	private String level;
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
