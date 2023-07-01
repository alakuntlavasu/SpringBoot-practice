package com.dataJpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dataJpa.modal.Employe;

@Repository
public interface Employerepo  extends JpaRepository<Employe, Integer>
{

}
