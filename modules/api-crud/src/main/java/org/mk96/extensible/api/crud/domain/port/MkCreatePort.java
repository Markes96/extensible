package org.mk96.extensible.api.crud.domain.port;

import org.mk96.extensible.api.domain.model.MkDomain;
import org.mk96.extensible.api.domain.port.MkPort;

public interface MkCreatePort<DOM extends MkDomain>
	extends MkPort<DOM> {

	DOM create(final DOM dom);

}
