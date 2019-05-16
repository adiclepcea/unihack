package org.whale.service

import org.whale.entity.Observer

interface ObserverService {
	List<Observer> findAll();
	Observer findById(Integer id);
	Observer findByName(String name);
	Observer save(Observer observer);
}
