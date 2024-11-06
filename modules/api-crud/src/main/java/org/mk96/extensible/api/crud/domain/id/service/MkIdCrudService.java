package org.mk96.extensible.api.crud.domain.id.service;

import org.mk96.extensible.api.crud.domain.service.MkCreateService;
import org.mk96.extensible.api.domain.model.MkDomain;

public interface MkIdCrudService<DOM extends MkDomain, ID>
	extends MkCreateService<DOM>,
	MkIdUpdateService<DOM, ID>,
	MkIdFindService<DOM, ID>,
	MkIdDeleteService<DOM, ID> {}