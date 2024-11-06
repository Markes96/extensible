package org.mk96.extensible.api.crud.domain.id.port;

import org.mk96.extensible.api.crud.domain.port.MkCreatePort;
import org.mk96.extensible.api.domain.model.MkDomain;

public interface MkIdCrudPort<DOM extends MkDomain, ID>
	extends MkCreatePort<DOM>,
	MkIdUpdatePort<DOM, ID>,
	MkIdFindPort<DOM, ID>,
	MkIdDeletePort<DOM, ID> {}