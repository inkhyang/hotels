package org.example.data.jpa.controller;

import lombok.RequiredArgsConstructor;
import org.example.data.jpa.domain.City;
import org.example.data.jpa.service.CityRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("city")
@RequiredArgsConstructor
public class CityController {
    private final CityRepository cityRepository;

    @GetMapping
    public void create() {
        City city = new City();
        city.setName("Yar");
        city.setCountry("Ruska");
        city.setMap("100, 100");
        city.setState("Udm");
        cityRepository.save(city);
    }
}
