package com.workintech.fruits.fswebs18d2.controller;

import com.workintech.fruits.fswebs18d2.entity.Fruit;
import com.workintech.fruits.fswebs18d2.entity.FruitType;
import com.workintech.fruits.fswebs18d2.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruits")
public class FruitController {
    private FruitService fruitService;
    @Autowired
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @GetMapping("/")
    public List<Fruit> getAllFruit(){
        return fruitService.getAllFruit();
    }

    @GetMapping
    public List<Fruit> getFruitAscPrice(){
        return fruitService.findByAscPrice();
    }
    @GetMapping("/{id}")
    public Fruit getFruitById(@PathVariable Long id){
       return fruitService.findByFruitId(id);
    }
    @GetMapping("/desc")
    public List<Fruit> getFruitByDescPrice(){
        return fruitService.findByDescPrice();
    }
    @PostMapping
    public Fruit saveFruit(@RequestBody Fruit fruit) {
        return fruitService.save(fruit);
    }
    @PostMapping("/{name}")
    public List<Fruit> searchByName(@PathVariable @RequestBody String name){
        return fruitService.searchByName(name);
    }
    @DeleteMapping("/{id}")
    public Fruit delete(@PathVariable Long id){
        return fruitService.delete(id);
    }

}
