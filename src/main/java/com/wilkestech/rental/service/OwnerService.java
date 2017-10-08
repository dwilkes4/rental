package com.wilkestech.rental.service;

import com.wilkestech.rental.domain.dto.OwnerDTO;

public interface OwnerService {

	public Long createOwner(OwnerDTO owner);

	public OwnerDTO findOwner(Long id);
}
