package org.mk96.extensible.api.crud.domain.service;

import org.mk96.extensible.api.crud.domain.example.service.MkExampleCrudService;
import org.mk96.extensible.api.crud.domain.id.service.MkIdCrudService;
import org.mk96.extensible.api.domain.model.MkDomain;

public interface MkCrudService<DOM extends MkDomain, ID>
	extends MkExampleCrudService<DOM>, MkIdCrudService<DOM, ID> {}
