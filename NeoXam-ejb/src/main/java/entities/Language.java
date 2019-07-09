package entities;

public class Language {

	private int id;
	private String lang;
	private String level;
	/**
	 * 
	 */
	public Language() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param lang
	 * @param level
	 */
	public Language(int id, String lang, String level) {
		super();
		this.id = id;
		this.lang = lang;
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
	 * @return the lang
	 */
	public String getLang() {
		return lang;
	}
	/**
	 * @param lang the lang to set
	 */
	public void setLang(String lang) {
		this.lang = lang;
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
