package org.mk96.extensible.api.crud.application;

import org.mk96.extensible.api.application.AbstractMkUseCase;
import org.mk96.extensible.api.crud.application.example.MkExampleCrudUseCase;
import org.mk96.extensible.api.crud.application.id.MkIdCrudUseCase;
import org.mk96.extensible.api.crud.domain.example.service.MkExampleCrudService;
import org.mk96.extensible.api.crud.domain.id.service.MkIdCrudService;
import org.mk96.extensible.api.crud.domain.port.MkCrudPort;
import org.mk96.extensible.api.crud.domain.service.MkCreateService;
import org.mk96.extensible.api.crud.domain.service.MkCrudService;
import org.mk96.extensible.api.domain.model.MkDomain;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.annotation.PostConstruct;
import lombok.experimental.Delegate;

public class MkCrudUseCase<DOM extends MkDomain, ID>
	extends AbstractMkUseCase<DOM>
	implements MkCrudService<DOM, ID> {

	@Autowired
	private MkCrudPort<DOM, ID> port;

	@Autowired
	protected MkCrudUseCase() {}

	public MkCrudUseCase(final MkCrudPort<DOM, ID> port) {
		this.port = port;
		init();
	}

	@Delegate
	MkExampleCrudService<DOM> exampleCrudService;
	@Delegate(excludes = MkCreateService.class)
	MkIdCrudService<DOM, ID> idCrudService;

	@PostConstruct
	void init() {
		exampleCrudService = new MkExampleCrudUseCase<>(port);
		idCrudService = new MkIdCrudUseCase<>(port);
	}

}
