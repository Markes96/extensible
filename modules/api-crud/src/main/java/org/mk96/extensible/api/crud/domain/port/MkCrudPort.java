package org.mk96.extensible.api.crud.domain.port;

import org.mk96.extensible.api.crud.domain.example.port.MkExampleCrudPort;
import org.mk96.extensible.api.crud.domain.id.port.MkIdCrudPort;
import org.mk96.extensible.api.domain.model.MkDomain;

public interface MkCrudPort<DOM extends MkDomain, ID>
	extends MkExampleCrudPort<DOM>, MkIdCrudPort<DOM, ID> {}
