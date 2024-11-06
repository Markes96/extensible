package org.mk96.extensible.api.crud.domain.example.port;

import org.mk96.extensible.api.domain.model.MkDomain;
import org.mk96.extensible.api.domain.port.MkPort;

public interface MkExampleUpdatePort<DOM extends MkDomain>
	extends MkPort<DOM> {

	DOM update(final DOM dom);

}