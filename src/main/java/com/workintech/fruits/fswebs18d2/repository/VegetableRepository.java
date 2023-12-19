package com.workintech.fruits.fswebs18d2.repository;

import com.workintech.fruits.fswebs18d2.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable, Long> {

    @Query("SELECT e FROM Vegetable e ORDER BY e.price DESC")
    List<Vegetable> descByPrice();
    @Query("SELECT e FROM Vegetable e ORDER BY e.price ASC")
    List<Vegetable> ascByPrice();
    @Query("SELECT e FROM Vegetable e WHERE e.name ILIKE %:name%")
    List<Vegetable> searchByName(String name);

}
