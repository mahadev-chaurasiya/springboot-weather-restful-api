package com.mahadev.restfulweatherapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "weather_tbl")
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "wDate")
    private String date;
    @Column(name = "wLat")
    private double lat;
    @Column(name = "wLon")
    private double lon;
    @Column(name = "wCity")
    private String city;
    @Column(name = "wState")
    private String state;
    @Column(name = "wTemp")
    private double temperature;
}
