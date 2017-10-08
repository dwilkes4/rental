package com.wilkestech.rental.serviceimpl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wilkestech.rental.domain.Owner;
import com.wilkestech.rental.domain.dto.OwnerDTO;
import com.wilkestech.rental.domain.repository.OwnerRepository;
import com.wilkestech.rental.service.OwnerService;

@Service
public class OwnerServiceImpl implements OwnerService{

	@Inject
	private OwnerRepository ownerRepository;
	
	@Override
	@Transactional
	public Long createOwner(OwnerDTO ownerdto) {
		Owner owner = ownerRepository.save(new Owner(ownerdto));
		return owner.getId();
	}

	@Override
	public OwnerDTO findOwner(Long id) {
		return new OwnerDTO(ownerRepository.findOne(id));
	}

}
