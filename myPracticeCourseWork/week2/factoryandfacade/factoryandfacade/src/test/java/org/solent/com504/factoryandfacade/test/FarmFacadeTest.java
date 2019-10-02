package org.solent.com504.factoryandfacade.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.solent.com504.factoryandfacade.model.Animal;
import org.solent.com504.factoryandfacade.model.AnimalObjectFactory;
import org.solent.com504.factoryandfacade.model.FarmFacade;

/**
 *
 * @author cgallen
 */
public class FarmFacadeTest {        
    
    List unTypedList = new ArrayList();
    
    @Test
    public void unTypedListTest(){
        System.out.println("Start of unTypedListTest()");
        
        
        Animal cat1 = AnimalObjectFactory.createCat();
        
        unTypedList.add(cat1);
        
        for(Object obj : unTypedList)
        {
            System.out.println(obj.toString());
        }
    }

    @Test
    public void FarmFacadeTest() {

        FarmFacade farmFacade = AnimalObjectFactory.createFarmFacade();
        assertNotNull(farmFacade);
        
        // WHAT TESTS WOULD YOU CREATE HERE TO SET UP AND TEST THE FARM FACADE?                  
    }
    
    @Test
    public void CreateDogTest(){
        Animal d1 = AnimalObjectFactory.createDog();
        d1.setName("test");
        assertEquals("test",d1.getName());        
    }
    
    @Test
    public void CreateCatTest(){
        Animal cat1 = AnimalObjectFactory.createCat();
        cat1.setName("gato");
        assertEquals("gato",cat1.getName());        
    }
    
    @Test
    public void CreateCowTest(){
        Animal cow1 = AnimalObjectFactory.createCow();
        cow1.setName("test");
        assertEquals("test",cow1.getName());        
    }
}
