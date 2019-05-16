package org.whale.repository

import org.whale.entity.Observer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ObserverRepository extends JpaRepository<Observer, Integer> {
	List<Observer> findAll();
	Observer findById(Integer id);
	Observer findByName(String name);
}
