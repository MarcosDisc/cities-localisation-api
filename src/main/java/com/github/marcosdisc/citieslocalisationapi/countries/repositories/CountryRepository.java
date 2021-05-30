package com.github.marcosdisc.citieslocalisationapi.countries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.marcosdisc.citieslocalisationapi.countries.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
