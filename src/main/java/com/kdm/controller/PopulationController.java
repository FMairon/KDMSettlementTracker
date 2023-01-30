package com.kdm.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kdm.model.Survivor;

@RestController
public class PopulationController {

	@PostMapping(value = "/population/addNewborn")
	public Survivor addNewbornSurvivor(Survivor survivor) {
		return new Survivor();
	}

	@PostMapping(value = "/population/addSurvivor")
	public Survivor addExistingSurvivor(Survivor survivor) {
		return new Survivor();
	}

	@DeleteMapping(value = "/population/deleteSurvivor")
	public void deleteSurvivorByName(@RequestParam String name, @RequestParam String familyName) {
	}
}
