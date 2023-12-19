package com.workintech.fruits.fswebs18d2.service;

import com.workintech.fruits.fswebs18d2.entity.Vegetable;

import java.util.List;

public interface VegetableService {
    Vegetable save(Vegetable vegetable);
    List<Vegetable> findAll();
    Vegetable findById(Long id);

    List<Vegetable> searchByName(String name);

    List<Vegetable> sortAscByPrice();

    List<Vegetable> sortDescByPrice();

    Vegetable delete(Long id);

}
