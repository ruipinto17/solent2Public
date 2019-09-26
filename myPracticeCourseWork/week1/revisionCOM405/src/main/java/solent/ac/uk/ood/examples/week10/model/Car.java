package solent.ac.uk.ood.examples.week10.model;

public class Car extends Vehicle {
    


    @Override
    public Double calculateFee() {
        Double weight= getWeight();
        if(weight <= 1590) return 5.00;        
        
        return 10.0;
        
    }
}
