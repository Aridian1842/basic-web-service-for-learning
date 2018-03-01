package org.openmrs.module.conceptnames.rest.controller;

import org.openmrs.module.webservices.rest.web.RestConstants;
import org.openmrs.module.webservices.rest.web.v1_0.controller.MainResourceController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rest/" + RestConstants.VERSION_1 + ConceptnamesRestController.CONCEPTNAMES_REST_NAMESPACE)
public class ConceptnamesRestController extends MainResourceController {
	
	public static final String CONCEPTNAMES_REST_NAMESPACE = "/conceptnames";
	
	/**
	 * @see org.openmrs.module.webservices.rest.web.v1_0.controller.BaseRestController#getNamespace()
	 */
	@Override
	public String getNamespace() {
		return RestConstants.VERSION_1 + ConceptnamesRestController.CONCEPTNAMES_REST_NAMESPACE;
	}
}
