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

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
    
    

}
