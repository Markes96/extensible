package org.mk96.extensible.api.crud.domain.example.service;

import org.mk96.extensible.api.domain.model.MkDomain;
import org.mk96.extensible.api.domain.service.MkService;

public interface MkExampleDeleteService<DOM extends MkDomain>
	extends MkService<DOM> {

	DOM delete(final DOM dom);

}