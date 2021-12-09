package com.pokeapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokeapi.entities.RequestInfo;

public interface RequestInfoRepository extends JpaRepository<RequestInfo, Long> {

}
