package org.whale.repository

import org.whale.entity.Ship
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ShipRepository extends JpaRepository<Ship,Integer>{
	List<Ship> findAll()
	
	Ship findById(Integer id)
	Ship save(Ship ship)
}
