package org.whale.service

import org.whale.entity.Observation

interface ObservationService{
	List<Observation> findAll();
	Observation findById(Integer id);
	List<Observation> findByShipId(Integer id);
	List<Observation> findByObserverId(Integer id);
	Observation save(Observation observation);
}
