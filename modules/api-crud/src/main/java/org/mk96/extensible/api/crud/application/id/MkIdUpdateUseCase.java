package org.mk96.extensible.api.crud.application.id;

import org.mk96.extensible.api.application.AbstractMkUseCase;
import org.mk96.extensible.api.crud.domain.id.port.MkIdUpdatePort;
import org.mk96.extensible.api.crud.domain.id.service.MkIdUpdateService;
import org.mk96.extensible.api.domain.model.MkDomain;
import org.springframework.beans.factory.annotation.Autowired;

public class MkIdUpdateUseCase<DOM extends MkDomain, ID>
	extends AbstractMkUseCase<DOM>
	implements MkIdUpdateService<DOM, ID> {

	@Autowired
	private MkIdUpdatePort<DOM, ID> port;

	@Autowired
	protected MkIdUpdateUseCase() {}

	public MkIdUpdateUseCase(final MkIdUpdatePort<DOM, ID> port) {
		this.port = port;
	}

	@Override
	public DOM update(final ID id, final DOM dom) {
		return port.update(id, dom);
	}

}
