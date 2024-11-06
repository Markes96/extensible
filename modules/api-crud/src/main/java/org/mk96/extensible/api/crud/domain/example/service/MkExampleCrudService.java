package org.mk96.extensible.api.crud.domain.example.service;

import org.mk96.extensible.api.crud.domain.service.MkCreateService;
import org.mk96.extensible.api.domain.model.MkDomain;

public interface MkExampleCrudService<DOM extends MkDomain>
	extends MkCreateService<DOM>,
	MkExampleUpdateService<DOM>,
	MkExampleFindService<DOM>,
	MkExampleDeleteService<DOM> {}