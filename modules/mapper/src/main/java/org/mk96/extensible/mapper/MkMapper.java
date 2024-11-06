package org.mk96.extensible.mapper;

import org.mk96.common.type.MkObject;

public interface MkMapper<A extends MkObject, B extends MkObject> {

	B map(A source);

}
