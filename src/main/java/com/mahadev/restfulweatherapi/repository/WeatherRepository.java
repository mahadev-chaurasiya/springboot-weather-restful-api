package com.mahadev.restfulweatherapi.repository;

import com.mahadev.restfulweatherapi.entity.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author MAHADEV CHAURASIYA
 * <a href="https://www.linkedin.com/in/mahadev-chaurasiya/">MAHADEV CHAURASIYA</a>
 */
public interface WeatherRepository extends JpaRepository<Weather, Long> {
}
