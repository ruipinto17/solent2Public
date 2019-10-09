/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.solent.com504.factoryandfacade.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 4coelr28
 */
public class FarmFacadeImpl implements FarmFacade {

    private List<Animal> animals = new ArrayList<Animal>();

    @Override
    public List<Animal> getAllAnimals() {
        return new ArrayList(animals);
    }

    @Override
    public void addDog(String name) {
        Animal d1 = AnimalObjectFactory.createDog();
        d1.setName(name);
        animals.add(d1);
    }

    @Override
    public void addCow(String name) {
        Animal cow1 = AnimalObjectFactory.createCow();
        cow1.setName(name);
        animals.add(cow1);
    }

    @Override
    public void addCat(String name) {
        Animal cat1 = AnimalObjectFactory.createCat();
        cat1.setName(name);
        animals.add(cat1);
    }
    
    @Override
    public void addDuck(String name) {
        Animal duck1 = AnimalObjectFactory.createCat();
        duck1.setName(name);
        animals.add(duck1);
    }
    

}
