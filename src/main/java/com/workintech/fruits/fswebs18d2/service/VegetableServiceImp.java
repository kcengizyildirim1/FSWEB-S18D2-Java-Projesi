package com.workintech.fruits.fswebs18d2.service;


import com.workintech.fruits.fswebs18d2.entity.Vegetable;
import com.workintech.fruits.fswebs18d2.repository.VegetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class VegetableServiceImp implements VegetableService{

    private VegetableRepository vegetableRepository;
    @Autowired
    public VegetableServiceImp(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }

    @Override
    public Vegetable save(Vegetable vegetable) {
        return vegetableRepository.save(vegetable);
    }

    @Override
    public List<Vegetable> findAll() {
        return vegetableRepository.findAll();
    }

    @Override
    public Vegetable findById(Long id) {
        Optional<Vegetable> optionalVegetable = vegetableRepository.findById(id);
        if (optionalVegetable.isPresent()){
            return optionalVegetable.get();
        }
        throw null;
    }

    @Override
    public List<Vegetable> searchByName(String name) {
        return vegetableRepository.searchByName(name);
    }

    @Override
    public List<Vegetable> sortAscByPrice() {
        return vegetableRepository.ascByPrice();
    }

    @Override
    public List<Vegetable> sortDescByPrice() {
        return vegetableRepository.descByPrice();
    }

    @Override
    public Vegetable delete(Long id) {
        Vegetable vegetable = findById(id);
        vegetableRepository.delete(vegetable);
        return vegetable;
    }
}
