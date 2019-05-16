package org.whale.controller

import org.whale.entity.Ship
import org.whale.service.ShipService
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping('/ship')
class ShipController {
	
	@Autowired
	private final ShipService shipService

	@GetMapping('')
	List<Ship> findAll(){
		shipService.findAll()
	}

	@GetMapping('/{id}')
	Ship findById(@PathVariable('id') Integer id){
		shipService.findById(id)
	}

	@PostMapping('')
	Ship addShip(@RequestBody Ship ship){
		return shipService.save(ship)
	}
}
