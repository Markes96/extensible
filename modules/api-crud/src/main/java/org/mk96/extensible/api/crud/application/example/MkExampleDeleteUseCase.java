package org.mk96.extensible.api.crud.application.example;

import org.mk96.extensible.api.application.AbstractMkUseCase;
import org.mk96.extensible.api.crud.domain.example.port.MkExampleDeletePort;
import org.mk96.extensible.api.crud.domain.example.service.MkExampleDeleteService;
import org.mk96.extensible.api.domain.model.MkDomain;
import org.springframework.beans.factory.annotation.Autowired;

public class MkExampleDeleteUseCase<DOM extends MkDomain>
	extends AbstractMkUseCase<DOM>
	implements MkExampleDeleteService<DOM> {

	@Autowired
	private MkExampleDeletePort<DOM> port;

	@Autowired
	protected MkExampleDeleteUseCase() {}

	public MkExampleDeleteUseCase(final MkExampleDeletePort<DOM> port) {
		this.port = port;
	}

	@Override
	public DOM delete(final DOM dom) {
		return port.delete(dom);
	}

}
