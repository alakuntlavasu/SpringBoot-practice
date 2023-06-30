package com.dataJpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dataJpa.modal.Car;

public interface CarRepo  extends JpaRepository<Car, Integer> {

}
