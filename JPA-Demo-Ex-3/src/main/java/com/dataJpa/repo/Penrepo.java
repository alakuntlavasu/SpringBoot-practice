package com.dataJpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dataJpa.modal.Pen;


@Repository
public interface Penrepo extends JpaRepository<Pen, Integer> {

}
