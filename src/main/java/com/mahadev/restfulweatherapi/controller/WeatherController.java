package com.mahadev.restfulweatherapi.controller;

import com.mahadev.restfulweatherapi.entity.Weather;
import com.mahadev.restfulweatherapi.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService mWeatherService;

    @PostMapping("/addWeather")
    public ResponseEntity<Weather> addWeatherReq(@RequestBody Weather weather) {
        Weather wData = mWeatherService.addWeatherReport(weather);
        return ResponseEntity.status(HttpStatus.CREATED).body(wData);
    }

    @GetMapping("/getAllWeatherReports")
    public List<Weather> getAllWeatherData() {
        return mWeatherService.getAllWeather();
    }

    @GetMapping("/getWeatherById/{id}")
    public ResponseEntity<Weather> getWeatherReportById(@PathVariable Long id) {
        Weather weather = mWeatherService.getWeatherDataById(id);
        if (weather != null) {
            return ResponseEntity.status(HttpStatus.OK).body(weather);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteWeatherReport(@PathVariable Long id) {
        Weather weather = mWeatherService.getWeatherDataById(id);
        if (weather != null) {
            mWeatherService.deleteItem(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
