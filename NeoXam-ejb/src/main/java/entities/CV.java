package entities;

public class CV {
	private int id;
	private String path;
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
