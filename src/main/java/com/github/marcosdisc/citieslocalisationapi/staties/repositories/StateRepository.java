package com.github.marcosdisc.citieslocalisationapi.staties.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.marcosdisc.citieslocalisationapi.staties.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {
}
