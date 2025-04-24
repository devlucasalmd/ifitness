package br.edu.ifspcjo.ads.dw2sa.ifitness.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifspcjo.ads.dw2sa.ifitness.domain.model.Activity;


public interface ActivityRepository extends JpaRepository<Activity, Long> {

}