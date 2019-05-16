package org.whale.service

import org.whale.entity.Observer
import org.whale.repository.ObserverRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ObserverServiceImpl implements ObserverService{

	@Autowired
	private final ObserverRepository observerRepository


	@Override
	List<Observer> findAll(){
		observerRepository.findAll()
	}


	@Override
	Observer findById(Integer id){
		observerRepository.findById(id)
	}

	@Override
	Observer findByName(String name){
		observerRepository.findByName(name);
	}

	@Override
	Observer save(Observer observer){
		observerRepository.save(observer);
	}
}
