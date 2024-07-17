package com.desafioApi.desafioJavaSpringBoot.repositories;

import com.desafioApi.desafioJavaSpringBoot.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository <Client, Long> {




}
