package com.workintech.fruits.fswebs18d2.service;

import com.workintech.fruits.fswebs18d2.entity.Fruit;


import java.util.List;


public interface FruitService {
    Fruit save(Fruit fruit);
    List<Fruit> getAllFruit();
    Fruit findByFruitId(Long id);
    List<Fruit> searchByName(String name);
    List<Fruit> findByAscPrice();
    List<Fruit> findByDescPrice();
    Fruit delete(Long id);


}
