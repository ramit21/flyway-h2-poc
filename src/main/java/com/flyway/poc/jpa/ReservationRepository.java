package com.flyway.poc.jpa;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.flyway.poc.model.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{
	Collection<Reservation> findByReservationName(@Param(value = "") String rn);
}
