package org.mk96.extensible.api.crud.application.example;

import org.mk96.extensible.api.application.AbstractMkUseCase;
import org.mk96.extensible.api.crud.application.MkCreateUseCase;
import org.mk96.extensible.api.crud.domain.example.port.MkExampleCrudPort;
import org.mk96.extensible.api.crud.domain.example.service.MkExampleCrudService;
import org.mk96.extensible.api.crud.domain.example.service.MkExampleDeleteService;
import org.mk96.extensible.api.crud.domain.example.service.MkExampleFindService;
import org.mk96.extensible.api.crud.domain.example.service.MkExampleUpdateService;
import org.mk96.extensible.api.crud.domain.service.MkCreateService;
import org.mk96.extensible.api.domain.model.MkDomain;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.annotation.PostConstruct;
import lombok.experimental.Delegate;

public class MkExampleCrudUseCase<DOM extends MkDomain>
	extends AbstractMkUseCase<DOM>
	implements MkExampleCrudService<DOM> {

	@Autowired
	private MkExampleCrudPort<DOM> port;

	@Autowired
	protected MkExampleCrudUseCase() {}

	public MkExampleCrudUseCase(final MkExampleCrudPort<DOM> port) {
		this.port = port;
		init();
	}

	@Delegate
	MkCreateService<DOM> createService;
	@Delegate
	MkExampleUpdateService<DOM> updateService;
	@Delegate
	MkExampleFindService<DOM> findService;
	@Delegate
	MkExampleDeleteService<DOM> deleteService;

	@PostConstruct
	void init() {
		createService = new MkCreateUseCase<>(port);
		updateService = new MkExampleUpdateUseCase<>(port);
		findService = new MkExmapleFindUseCase<>(port);
		deleteService = new MkExampleDeleteUseCase<>(port);
	}

}
