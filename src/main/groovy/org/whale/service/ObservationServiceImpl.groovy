package org.whale.service

import org.whale.entity.Observation
import org.whale.repository.ObservationRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ObservationServiceImpl implements ObservationService{

	@Autowired
	private final ObservationRepository observationRepository


	@Override
	List<Observation> findAll(){
		observationRepository.findAll()
	}


	@Override
	Observation findById(Integer id){
		observationRepository.findById(id)
	}

	@Override
	List<Observation> findByShipId(Integer id){
		observationRepository.findByShipId(id)
	}

	@Override
	List<Observation> findByObserverId(Integer id){
		observationRepository.findByObserverId(id)
	}

	@Override
	Observation save(Observation observation){
		observationRepository.save(observation)
	}

}
