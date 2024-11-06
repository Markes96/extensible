package org.mk96.extensible.api.crud.application.id;

import org.mk96.extensible.api.application.AbstractMkUseCase;
import org.mk96.extensible.api.crud.domain.id.port.MkIdFindPort;
import org.mk96.extensible.api.crud.domain.id.service.MkIdFindService;
import org.mk96.extensible.api.domain.model.MkDomain;
import org.springframework.beans.factory.annotation.Autowired;

public class MkIdFindUseCase<DOM extends MkDomain, ID>
	extends AbstractMkUseCase<DOM>
	implements MkIdFindService<DOM, ID> {

	@Autowired
	private MkIdFindPort<DOM, ID> port;

	@Autowired
	protected MkIdFindUseCase() {}

	public MkIdFindUseCase(final MkIdFindPort<DOM, ID> port) {
		this.port = port;
	}

	@Override
	public DOM find(final ID id) {
		return port.find(id);
	}

}
