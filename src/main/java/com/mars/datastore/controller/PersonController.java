package com.mars.datastore.controller;

import com.mars.datastore.model.PersonCompId;
import com.mars.datastore.model.PersonComposedId;
import com.mars.datastore.model.PersonSimpleId;
import com.mars.datastore.repository.PersonComposedRepo;
import com.mars.datastore.repository.PersonSimpleRepo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author Angel Ruiz
 * @version 1.0.0
 * date 14/06/23
 */
@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/v1/person")
public class PersonController {

	private final PersonSimpleRepo personSimpleRepo;
	private final PersonComposedRepo personComposedRepo;
	private final Clock clock;

	@PostMapping(value = "simple")
	public String simple() {
		var d = PersonSimpleId.builder()
				.id(UUID.randomUUID().toString())
				.name("demo")
				.desc("demo 1").build();
		this.personSimpleRepo.save(d);
		return "ok!!!";
	}

	@PostMapping(value = "comp")
	public String comp() {
		var d = PersonComposedId.builder()
				.id(PersonCompId.builder().id(UUID.randomUUID().toString())
						.timestamp(LocalDateTime.now(clock))
						.build())
				.name("demo")
				.desc("demo 1").build();
		this.personComposedRepo.save(d);
		return "ok!!!";
	}

}
