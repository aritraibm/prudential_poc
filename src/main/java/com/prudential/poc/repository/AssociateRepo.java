package com.prudential.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prudential.poc.entity.Associate;

@Repository
public interface AssociateRepo extends JpaRepository<Associate, Long> {

}
