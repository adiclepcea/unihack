package org.whale.controller

import org.whale.service.*
import org.whale.entity.*
import java.util.*

import org.springframework.context.annotation.Bean


class Mocks{

    @Bean
    static ObservationService mockObservationService() {
            return new ObservationService(){
            List<Observation> findAll(){
                return new ArrayList<Observation>()
            }
            Observation findById(Integer id){
                return new Observation()
            }
            List<Observation> findByShipId(Integer id){
                return new ArrayList<Observation>()
            }
            List<Observation> findByObserverId(Integer id){
                return new ArrayList<Observation>()
            }
            Observation save(Observation observation){
                return observation
            }
        }
    }

    static ObserverService mockObserverService(){
        return new ObserverService(){
            List<Observer> findAll(){
                return new ArrayList<Observer>()
            }
            Observer findById(Integer id){
                return new Observer()
            }
            Observer findByName(String name){
                return new Observer()
            }
            Observer save(Observer observer){
                return observer
            }
        }
    }

    static ShipService mockShipService(){
        return new ShipService(){
            List<Ship> findAll(){
                return new ArrayList<Ship>()
            }
            Ship findById(Integer id){
                return new Ship()
            }
            Ship findByName(String name){
                return new Ship()
            }
            Ship save(Ship ship){
                return ship
            }
        }
    }
}