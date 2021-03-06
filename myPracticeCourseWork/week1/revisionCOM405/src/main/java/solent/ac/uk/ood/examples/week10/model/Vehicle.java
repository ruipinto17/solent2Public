package solent.ac.uk.ood.examples.week10.model;

public abstract class Vehicle {

    private Double weight;

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    private String registration;

    public abstract Double calculateFee();
    
}
