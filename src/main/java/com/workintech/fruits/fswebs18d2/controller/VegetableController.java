package com.workintech.fruits.fswebs18d2.controller;

import com.workintech.fruits.fswebs18d2.entity.Fruit;
import com.workintech.fruits.fswebs18d2.entity.Vegetable;
import com.workintech.fruits.fswebs18d2.service.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vegetables")
public class VegetableController {
    private VegetableService vegetableService;
    @Autowired
    public VegetableController(VegetableService vegetableService) {
        this.vegetableService = vegetableService;
    }
    @GetMapping("/")
    public List<Vegetable> getAllVegetables(){
        return vegetableService.findAll();
    }
    @GetMapping
    public List<Vegetable> getFruitAscPrice(){
        return vegetableService.sortAscByPrice();
    }
    @GetMapping("/{id}")
    public Vegetable getFruitById(@PathVariable Long id){
        return vegetableService.findById(id);
    }
    @GetMapping("/desc")
    public List<Vegetable> getFruitByDescPrice(){
        return vegetableService.sortDescByPrice();
    }
    @PostMapping
    public Vegetable saveFruit(@RequestBody Vegetable vegetable) {
        return vegetableService.save(vegetable);
    }
    @PostMapping("/{name}")
    public List<Vegetable> searchByName(@RequestBody String name){
        return vegetableService.searchByName(name);
    }
    @DeleteMapping("/{id}")
    public Vegetable delete(@PathVariable Long id){
        return vegetableService.delete(id);
    }
}
