package org.mk96.extensible.api.crud.domain.id.port;

import org.mk96.extensible.api.domain.model.MkDomain;
import org.mk96.extensible.api.domain.port.MkPort;

public interface MkIdFindPort<DOM extends MkDomain, ID>
	extends MkPort<DOM> {

	DOM find(final ID id);

}