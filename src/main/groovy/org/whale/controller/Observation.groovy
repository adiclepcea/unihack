package org.whale.controller

import org.whale.entity.Observation
import org.whale.service.ObservationService
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping('/observation')
class ObservationController {
	
	@Autowired
	private final ObservationService observationService

	@GetMapping('')
	List<Observation> findAll(){
		observationService.findAll()
	}

	@GetMapping('/{id}')
	Observation findById(@PathVariable('id') Integer id){
		observationService.findById(id)
	}

	@GetMapping('/ship/{id}')
	List<Observation> findByShipId(@PathVariable('id') Integer id){
		observationService.findByShipId(id)
	}

	@GetMapping('/observer/{id}')
	List<Observation> findByObserverId(@PathVariable('id') Integer id){
		observationService.findByObserverId(id)
	}

	@PostMapping('')
	Observation save(@RequestBody Observation observation){
		observationService.save(observation)
	}
}
