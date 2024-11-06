package org.mk96.extensible.api.crud.application.id;

import org.mk96.extensible.api.application.AbstractMkUseCase;
import org.mk96.extensible.api.crud.application.MkCreateUseCase;
import org.mk96.extensible.api.crud.domain.id.port.MkIdCrudPort;
import org.mk96.extensible.api.crud.domain.id.service.MkIdCrudService;
import org.mk96.extensible.api.crud.domain.id.service.MkIdDeleteService;
import org.mk96.extensible.api.crud.domain.id.service.MkIdFindService;
import org.mk96.extensible.api.crud.domain.id.service.MkIdUpdateService;
import org.mk96.extensible.api.crud.domain.service.MkCreateService;
import org.mk96.extensible.api.domain.model.MkDomain;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.annotation.PostConstruct;
import lombok.experimental.Delegate;

public class MkIdCrudUseCase<DOM extends MkDomain, ID>
	extends AbstractMkUseCase<DOM>
	implements MkIdCrudService<DOM, ID> {

	@Autowired
	private MkIdCrudPort<DOM, ID> port;

	@Autowired
	protected MkIdCrudUseCase() {}

	public MkIdCrudUseCase(final MkIdCrudPort<DOM, ID> port) {
		this.port = port;
		init();
	}

	@Delegate
	MkCreateService<DOM> createService;
	@Delegate
	MkIdUpdateService<DOM, ID> updateService;
	@Delegate
	MkIdFindService<DOM, ID> findService;
	@Delegate
	MkIdDeleteService<DOM, ID> deleteService;

	@PostConstruct
	void init() {
		createService = new MkCreateUseCase<>(port);
		updateService = new MkIdUpdateUseCase<>(port);
		findService = new MkIdFindUseCase<>(port);
		deleteService = new MkIdDeleteUseCase<>(port);
	}

}
