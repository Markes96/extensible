package org.mk96.extensible.api.crud.domain.example.port;

import org.mk96.extensible.api.domain.model.MkDomain;
import org.mk96.extensible.api.domain.port.MkPort;

public interface MkExampleDeletePort<DOM extends MkDomain>
	extends MkPort<DOM> {

	DOM delete(final DOM dom);

}