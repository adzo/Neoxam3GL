package services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PersistanceUnit {

	@PersistenceContext(name="NeoXam-ejb")
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
}
