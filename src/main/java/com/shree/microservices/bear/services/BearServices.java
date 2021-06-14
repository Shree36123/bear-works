package com.shree.microservices.bear.services;

import java.util.UUID;

import com.shree.microservices.bear.web.model.BearModel;

public interface BearServices {
 BearModel getBearbyId(UUID id);
}
