package com.itb.tcc.myproject2e.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itb.tcc.myproject2e.model.Pai;

@Repository
public interface PaiRepository extends JpaRepository<Pai, Long >{

}
