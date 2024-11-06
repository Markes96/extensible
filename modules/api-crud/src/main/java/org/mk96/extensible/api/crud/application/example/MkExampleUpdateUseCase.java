package org.mk96.extensible.api.crud.application.example;

import org.mk96.extensible.api.application.AbstractMkUseCase;
import org.mk96.extensible.api.crud.domain.example.port.MkExampleUpdatePort;
import org.mk96.extensible.api.crud.domain.example.service.MkExampleUpdateService;
import org.mk96.extensible.api.domain.model.MkDomain;
import org.springframework.beans.factory.annotation.Autowired;

public class MkExampleUpdateUseCase<DOM extends MkDomain>
	extends AbstractMkUseCase<DOM>
	implements MkExampleUpdateService<DOM> {

	@Autowired
	private MkExampleUpdatePort<DOM> port;

	@Autowired
	protected MkExampleUpdateUseCase() {}

	public MkExampleUpdateUseCase(final MkExampleUpdatePort<DOM> port) {
		this.port = port;
	}

	@Override
	public DOM update(final DOM dom) {
		return port.update(dom);
	}

}
