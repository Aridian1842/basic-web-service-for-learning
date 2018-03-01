package org.openmrs.module.conceptnames;

import org.openmrs.BaseOpenmrsMetadata;
import org.openmrs.ConceptDescription;

public class Conceptnames extends BaseOpenmrsMetadata {
	
	private Integer conceptId;
	
	public Conceptnames() {
		
	}
	
	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	private Integer getConceptId() {
		return conceptId;
	}
	
	private void setConceptId(Integer conceptId) {
		this.conceptId = conceptId;
	}
	
	public void setDescription(ConceptDescription description) {
		this.setDescription(description);
	}
	
}
