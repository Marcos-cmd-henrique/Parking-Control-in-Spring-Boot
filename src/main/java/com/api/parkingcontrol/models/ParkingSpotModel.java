package com.api.parkingcontrol.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //uso para banco de dados
@Table(name = "TB_PARKING_SPOT")
public class ParkingSpotModel implements Serializable{ 
    private static final long serialVersionUID = 1L; 

    
    @Id
    @GenerateValue(strategy = GenerationType.AUTO) //ID gerados de forma automatica 
    private UUID id; //identificadores únicos
    @Column(nullable = false, unique = true, length =10) //campo unico p/ não ter 2 cadastro de uma mesma vaga 
    private String parkingSpotNumber; //Número da vaga

    @Column(nullable = false, unique = true, length =7)
    private String licensePlateCar; //Placa do carro

    @Column(nullable = false, length =70)
    private String brandCar;

    @Column(nullable = false, length =70)
    private String modelCar;

    @Column(nullable = false, length =70)
    private String colorCar;

    @Column(nullable = false)
    private LocalDateTime registrationDate; //Data de registro 

    @Column(nullable = false, length =130)
    private String responsibleName;

    @Column(nullable = false, length =30)
    private String apartment;

    @Column(nullable = false, length =30)
    private String block;
    

}
