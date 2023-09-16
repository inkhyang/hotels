package org.example.data.jpa.service;

import org.example.data.jpa.domain.City;
import org.example.data.jpa.domain.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;


interface HotelRepository extends JpaRepository<Hotel, Long> {
    Hotel findByCityAndName(City city, String name);
}
