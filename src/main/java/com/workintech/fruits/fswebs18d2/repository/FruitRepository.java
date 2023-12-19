package com.workintech.fruits.fswebs18d2.repository;

import com.workintech.fruits.fswebs18d2.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit, Long> {

    @Query("SELECT e FROM Fruit e ORDER BY e.price DESC")
    List<Fruit> descByPrice();
    @Query("SELECT e FROM Fruit e ORDER BY e.price ASC")
    List<Fruit> ascByPrice();
    @Query("SELECT e FROM Fruit e WHERE e.name ILIKE %:name%")
    List<Fruit> searchByName(String name);
}
