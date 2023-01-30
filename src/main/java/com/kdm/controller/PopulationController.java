package com.kdm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kdm.model.Survivor;

@RestController
public class PopulationController {

	@RequestMapping(value = "/population/addSurvivor", method = RequestMethod.POST)
	public Survivor addSurvivor(Survivor survivor) {
		return new Survivor();
	}
}
