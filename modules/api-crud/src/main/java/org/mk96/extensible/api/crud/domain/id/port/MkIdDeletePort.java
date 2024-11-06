package org.mk96.extensible.api.crud.domain.id.port;

import org.mk96.extensible.api.domain.model.MkDomain;
import org.mk96.extensible.api.domain.port.MkPort;

public interface MkIdDeletePort<DOM extends MkDomain, ID>
	extends MkPort<DOM> {

	DOM delete(final ID id);

}