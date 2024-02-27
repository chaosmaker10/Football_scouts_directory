package com.footballers.scoutresults;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FootballerRepository extends JpaRepository<Footballers,Integer> {
}
