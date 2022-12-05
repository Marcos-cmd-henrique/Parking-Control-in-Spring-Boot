package com.api.parkingcontrol.models;

import jakarta.persistence.GenerationType;

public @interface GenerateValue {

    GenerationType strategy();

}
