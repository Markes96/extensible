package org.mk96.extensible.api.crud.domain.id.service;

import org.mk96.extensible.api.domain.model.MkDomain;
import org.mk96.extensible.api.domain.service.MkService;

public interface MkIdFindService<DOM extends MkDomain, ID>
	extends MkService<DOM> {

	DOM find(final ID id);

}