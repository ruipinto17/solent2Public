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
import org.solent.com504.factoryandfacade.model.Cat;
import org.solent.com504.factoryandfacade.model.Dog;
import org.solent.com504.factoryandfacade.model.Cow;


/**
 *
 * @author cgallen
 */
public class FarmFacadeTest {        
    
    //untyped list of objects (intiliazing) - rui
    List unTypedList = new ArrayList();
    
    //typed list of objects (initializing) - rui 
    List<Animal> TypedList = new ArrayList<Animal>();
    
    //untyped list test - rui
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
    
    //typed list test - rui
    @Test
    public void TypedListTest()
    {
        System.out.println("Start of the function TypedListTest()");
        
        //Removing all the objects in the typed list - rui
        TypedList.clear();
        //creating a cat object - rui
        Cat c1 = new Cat();
        //giving the cat a name - rui
        c1.setName("theodora");
        //adding the cat to the typed list (index 0 by default) - rui
        TypedList.add(c1);
        
        //creating a dog object - rui
        Dog d1 = new Dog();
        //giving the cat a name - rui
        d1.setName("rex");
        //adding the cat to the typed list (index 0 by default) - rui
        TypedList.add(d1);
        
        
        System.out.println("\n Listing animals with explicit casting:");
        
        for(Object obj : TypedList)
        {
            //all objects have a ToString method - rui
            System.out.println(obj.toString());
            
            //the objects in the list are only Animals so its possible to cast them to animal
            Animal a = (Animal) obj;
            
            System.out.println("animal '" + a.getName() 
                    +"' makes this sound'" + a.getSound() 
                    +"because it is a " + a.getClass().getSimpleName()
                    +"implemented by "+a.getClass().getTypeName());
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
        d1.getSound();
    }
    
    @Test
    public void CreateCatTest(){
        Animal cat1 = AnimalObjectFactory.createCat();
        cat1.setName("gato");
        assertEquals("gato",cat1.getName());   
        cat1.getSound();
    }
    
    @Test
    public void CreateCowTest(){
        Animal cow1 = AnimalObjectFactory.createCow();
        cow1.setName("test");
        assertEquals("test",cow1.getName());  
        cow1.getSound();
    }
    
    @Test
    public void CreateDuckTest(){
        Animal duck1 = AnimalObjectFactory.createDuck();
        duck1.setName("test");
        assertEquals("test",duck1.getName());     
        duck1.getSound();
        
    }
    
    
}
