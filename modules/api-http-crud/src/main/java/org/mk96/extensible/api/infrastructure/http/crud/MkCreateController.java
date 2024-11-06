package org.mk96.extensible.api.infrastructure.http.crud;

import org.mk96.extensible.api.domain.model.MkDomain;
import org.mk96.extensible.api.infrastructure.http.dto.MkRequestDto;
import org.mk96.extensible.api.infrastructure.http.dto.MkResponseDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface MkCreateController<REQ extends MkRequestDto, DOM extends MkDomain, RES extends MkResponseDto> {

	@PostMapping("create")
	DOM create(@RequestBody DOM body);

}
