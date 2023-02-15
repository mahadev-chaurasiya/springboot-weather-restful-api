package com.mahadev.restfulweatherapi.repository;

import com.mahadev.restfulweatherapi.entity.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<Weather, Long> {
}
