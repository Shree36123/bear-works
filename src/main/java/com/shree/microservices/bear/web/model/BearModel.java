package com.shree.microservices.bear.web.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BearModel {

	private UUID id;
	private String bearName;
	private String bearStyle;
	private String upc;
	
}

