package org.mk96.extensible.api.crud.application.id;

import org.mk96.extensible.api.application.AbstractMkUseCase;
import org.mk96.extensible.api.crud.domain.id.port.MkIdDeletePort;
import org.mk96.extensible.api.crud.domain.id.service.MkIdDeleteService;
import org.mk96.extensible.api.domain.model.MkDomain;
import org.springframework.beans.factory.annotation.Autowired;

public class MkIdDeleteUseCase<DOM extends MkDomain, ID>
	extends AbstractMkUseCase<DOM>
	implements MkIdDeleteService<DOM, ID> {

	@Autowired
	private MkIdDeletePort<DOM, ID> port;

	@Autowired
	protected MkIdDeleteUseCase() {}

	public MkIdDeleteUseCase(final MkIdDeletePort<DOM, ID> port) {
		this.port = port;
	}

	@Override
	public DOM delete(final ID id) {
		return port.delete(id);
	}

}
