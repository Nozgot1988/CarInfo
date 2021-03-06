package ua.Nazar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.Nazar.entity.CarEntity;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long>{
	
	CarEntity findByCarId(String carId);
	
}
