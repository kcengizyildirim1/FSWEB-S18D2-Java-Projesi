package com.workintech.fruits.fswebs18d2.service;

import com.workintech.fruits.fswebs18d2.entity.Fruit;
import com.workintech.fruits.fswebs18d2.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitServiceImpl implements FruitService{

    private FruitRepository fruitRepository;
    @Autowired
    public FruitServiceImpl(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Override
    public List<Fruit> searchByName(String name) {
        return fruitRepository.searchByName(name);
    }

    @Override
    public Fruit save(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public List<Fruit> getAllFruit() {
        return fruitRepository.findAll();
    }

    @Override
    public Fruit findByFruitId(Long id) {
        Optional<Fruit> fruitOptional = fruitRepository.findById(id);
        if(fruitOptional.isPresent()){
            return fruitOptional.get();
        }
        //TODO [Kürşad] buraya handle edilmis exception yolla null olarak kalmasin.
        throw null;
    }



    @Override
    public List<Fruit> findByAscPrice() {
        return fruitRepository.ascByPrice();
    }

    @Override
    public List<Fruit> findByDescPrice() {
        return fruitRepository.descByPrice();
    }

    @Override
    public Fruit delete(Long id) {
        Fruit fruit = findByFruitId(id);
        fruitRepository.delete(fruit);
        return fruit;
    }
}
