package br.edu.ifspcjo.ads.dw2sa.ifitness.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifspcjo.ads.dw2sa.ifitness.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
