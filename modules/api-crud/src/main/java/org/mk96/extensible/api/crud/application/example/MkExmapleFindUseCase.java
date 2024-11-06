package org.mk96.extensible.api.crud.application.example;

import org.mk96.extensible.api.application.AbstractMkUseCase;
import org.mk96.extensible.api.crud.domain.example.port.MkExampleFindPort;
import org.mk96.extensible.api.crud.domain.example.service.MkExampleFindService;
import org.mk96.extensible.api.domain.model.MkDomain;
import org.springframework.beans.factory.annotation.Autowired;

public class MkExmapleFindUseCase<DOM extends MkDomain>
	extends AbstractMkUseCase<DOM>
	implements MkExampleFindService<DOM> {

	@Autowired
	private MkExampleFindPort<DOM> port;

	@Autowired
	protected MkExmapleFindUseCase() {}

	public MkExmapleFindUseCase(final MkExampleFindPort<DOM> port) {
		this.port = port;
	}

	@Override
	public DOM find(final DOM dom) {
		return port.find(dom);
	}

}
