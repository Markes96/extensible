package org.mk96.extensible.api.crud.requirement.domain.service;

import org.mk96.extensible.api.crud.domain.example.service.MkExampleDeleteService;
import org.mk96.extensible.api.crud.domain.service.MkCreateService;
import org.mk96.extensible.api.crud.requirement.domain.DomainObject;

public interface CrudService
    extends MkCreateService<DomainObject>, MkExampleDeleteService<DomainObject> {

}
