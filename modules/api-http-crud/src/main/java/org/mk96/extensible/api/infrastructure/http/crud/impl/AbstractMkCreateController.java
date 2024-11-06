package org.mk96.extensible.api.infrastructure.http.crud.impl;

import org.mk96.extensible.api.crud.domain.service.MkCreateService;
import org.mk96.extensible.api.domain.model.MkDomain;
import org.mk96.extensible.api.infrastructure.http.AbstractMkController;
import org.mk96.extensible.api.infrastructure.http.crud.MkCreateController;
import org.mk96.extensible.api.infrastructure.http.dto.MkRequestDto;
import org.mk96.extensible.api.infrastructure.http.dto.MkResponseDto;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractMkCreateController<REQ extends MkRequestDto, DOM extends MkDomain, RES extends MkResponseDto>
	extends AbstractMkController<REQ, DOM, RES>
	implements MkCreateController<REQ, DOM, RES> {

	@Autowired
	protected MkCreateService<DOM> service;

	@Autowired
	protected AbstractMkCreateController() {}

	@Autowired
	protected AbstractMkCreateController(final MkCreateService<DOM> service) {
		this.service = service;
	}

}
