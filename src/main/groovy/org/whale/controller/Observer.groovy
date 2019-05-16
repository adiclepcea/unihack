package org.whale.controller

import org.whale.entity.Observer
import org.whale.service.ObserverService
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping('/observer')
class ObserverController {
	
	@Autowired
	private final ObserverService observerService

	@GetMapping('')
	List<Observer> findAll(){
		observerService.findAll()
	}

	@GetMapping('/{id}')
	Observer findById(@PathVariable('id') Integer id){
		observerService.findById(id)
	}

	@PostMapping('')
	Observer save(@RequestBody Observer observer){
		observerService.save(observer)
	}
}
