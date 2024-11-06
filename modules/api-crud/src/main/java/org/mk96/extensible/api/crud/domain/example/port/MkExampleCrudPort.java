package org.mk96.extensible.api.crud.domain.example.port;

import org.mk96.extensible.api.crud.domain.port.MkCreatePort;
import org.mk96.extensible.api.domain.model.MkDomain;

public interface MkExampleCrudPort<DOM extends MkDomain>
	extends MkCreatePort<DOM>,
	MkExampleUpdatePort<DOM>,
	MkExampleFindPort<DOM>,
	MkExampleDeletePort<DOM> {}