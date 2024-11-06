package org.mk96.extensible.api.crud.domain.service;

import org.mk96.extensible.api.domain.model.MkDomain;
import org.mk96.extensible.api.domain.service.MkService;

public interface MkCreateService<DOM extends MkDomain>
	extends MkService<DOM> {

	DOM create(final DOM dom);

}
