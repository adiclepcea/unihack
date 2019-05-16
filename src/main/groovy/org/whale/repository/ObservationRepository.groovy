package org.whale.repository

import org.whale.entity.Observation
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ObservationRepository extends JpaRepository<Observation, Integer>{
	List<Observation> findAll();
	Observation findById(Integer id);
	List<Observation> findByObserverId(Integer id);
	List<Observation> findByShipId(Integer id);
	List<Observation> findByShipName(String name);
}
