package com.josdugan.brewery.web.service;

import com.josdugan.brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
