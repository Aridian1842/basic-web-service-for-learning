package org.openmrs.module.conceptnames.rest.resource;

import org.openmrs.Concept;
import org.openmrs.api.ConceptService;
import org.openmrs.api.context.Context;

import org.openmrs.module.conceptnames.Conceptnames;
import org.openmrs.module.conceptnames.rest.controller.ConceptnamesRestController;
import org.openmrs.module.webservices.rest.web.RequestContext;
import org.openmrs.module.webservices.rest.web.RestConstants;
import org.openmrs.module.webservices.rest.web.annotation.Resource;
import org.openmrs.module.webservices.rest.web.representation.DefaultRepresentation;
import org.openmrs.module.webservices.rest.web.representation.FullRepresentation;
import org.openmrs.module.webservices.rest.web.representation.Representation;
import org.openmrs.module.webservices.rest.web.resource.impl.DelegatingResourceDescription;
import org.openmrs.module.webservices.rest.web.resource.impl.MetadataDelegatingCrudResource;
import org.openmrs.module.webservices.rest.web.response.ResponseException;

@Resource(name = RestConstants.VERSION_1 + ConceptnamesRestController.CONCEPTNAMES_REST_NAMESPACE + "/conceptnames", supportedClass = Concept.class, supportedOpenmrsVersions = {
        "1.9.*", "1.10.*", "1.11.*", "1.12.*", "2.0.*", "2.1.*" })
public class ConceptNamesResource extends MetadataDelegatingCrudResource<Conceptnames> {
	
	@Override
	public DelegatingResourceDescription getRepresentationDescription(Representation rep) {
		if (rep instanceof DefaultRepresentation) {
			DelegatingResourceDescription description = new DelegatingResourceDescription();
			description.addProperty("uuid");
			description.addProperty("display", findMethod("getDisplayString"));
			description.addProperty("name");
			description.addProperty("description");
			description.addProperty("retired");
			description.addSelfLink();
			description.addLink("full", ".?v=" + RestConstants.REPRESENTATION_FULL);
			return description;
		} else if (rep instanceof FullRepresentation) {
			DelegatingResourceDescription description = new DelegatingResourceDescription();
			description.addProperty("uuid");
			description.addProperty("display", findMethod("getDisplayString"));
			description.addProperty("name");
			description.addProperty("description");
			description.addProperty("retired");
			description.addSelfLink();
			return description;
		}
		return null;
	}
	
	@Override
	public DelegatingResourceDescription getCreatableProperties() {
		DelegatingResourceDescription description = new DelegatingResourceDescription();
		description.addRequiredProperty("name");
		description.addRequiredProperty("description");
		return description;
	}
	
	@Override
	public DelegatingResourceDescription getUpdatableProperties() {
		return getCreatableProperties();
	}
	
	@Override
	public Conceptnames newDelegate() {
		return new Conceptnames();
	}
	
	@Override
	public Conceptnames save(Conceptnames conceptNames) {
		//return Context.getService(ConceptService.class).saveConcept(concept)(appointmentType);
		return null;
	}
	
	@Override
	public Conceptnames getByUniqueId(String uuid) {
		Concept con = Context.getService(ConceptService.class).getConceptByUuid(uuid);
		Conceptnames con1 = new Conceptnames();
		con1.setUuid(con.getUuid());
		con1.setDescription(con.getDescription());
		con1.setRetired(con.getRetired());
		return con1;
	}
	
	@Override
	public void purge(Conceptnames arg0, RequestContext arg1) throws ResponseException {
		// TODO Auto-generated method stub
		return;
	}
	
}
