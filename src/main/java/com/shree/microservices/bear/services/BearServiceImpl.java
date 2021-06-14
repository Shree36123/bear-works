package com.shree.microservices.bear.services;

import java.util.UUID;

import org.springframework.stereotype.Service;
import com.shree.microservices.bear.web.model.BearModel;

@Service
public class BearServiceImpl implements BearServices {

	@Override
	public BearModel getBearbyId(UUID beerId) {

		return BearModel.builder().id(UUID.randomUUID()).bearName("shreeBear").bearStyle("not a valid")
				.upc("hello").build();
	}
/*	public class BeerServiceImpl implements BeerService {
	    @Override
	    public BeerDto getBeerById(UUID beerId) {
	        return BeerDto.builder().id(UUID.randomUUID())
	                .beerName("Galaxy Cat")
	                .beerStyle("Pale Ale")
	                .build();
	    }
*/
}
