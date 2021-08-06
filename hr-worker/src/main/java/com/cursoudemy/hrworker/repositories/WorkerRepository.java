package com.cursoudemy.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoudemy.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
