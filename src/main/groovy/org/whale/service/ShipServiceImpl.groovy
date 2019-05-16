package org.whale.service

import org.whale.entity.Ship
import org.whale.repository.ShipRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ShipServiceImpl implements ShipService{

	@Autowired
	private final ShipRepository shipRepository


	@Override
	List<Ship> findAll(){
		shipRepository.findAll()
	}


	@Override
	Ship findById(Integer id){
		shipRepository.findById(id)
	}

	@Override
	Ship findByName(String name){
		shipRepository.findByName(name);
	}

	@Override
	Ship save(Ship ship){
		shipRepository.save(ship);
	}
}
