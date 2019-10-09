package solent.ac.uk.ood.examples.week10.model;

public class Lorry extends Vehicle {

    @Override
    public Double calculateFee() {
        
        double maxWeight = 8000;
       
        
        return (getWeight() < maxWeight) ? 10.00 : 15.00;
            
    }
}
