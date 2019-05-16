package org.whale.service

import org.whale.entity.Ship

interface ShipService{
	List<Ship> findAll();
	Ship findById(Integer id);
	Ship findByName(String name);
	Ship save(Ship ship);
}
