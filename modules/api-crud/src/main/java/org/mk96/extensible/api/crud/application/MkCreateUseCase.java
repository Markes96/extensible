package org.mk96.extensible.api.crud.application;

import org.mk96.extensible.api.application.AbstractMkUseCase;
import org.mk96.extensible.api.crud.domain.port.MkCreatePort;
import org.mk96.extensible.api.crud.domain.service.MkCreateService;
import org.mk96.extensible.api.domain.model.MkDomain;
import org.springframework.beans.factory.annotation.Autowired;

public class MkCreateUseCase<DOM extends MkDomain>
	extends AbstractMkUseCase<DOM>
	implements MkCreateService<DOM> {

	@Autowired
	private MkCreatePort<DOM> port;

	@Autowired
	protected MkCreateUseCase() {}

	public MkCreateUseCase(final MkCreatePort<DOM> port) {
		this.port = port;
	}

	@Override
	public DOM create(final DOM dom) {
		return port.create(dom);
	}

}
