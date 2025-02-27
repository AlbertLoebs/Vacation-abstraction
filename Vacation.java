public abstract class Vacation {

    private String destination;
    private double budget;

    Vacation(String destination, double budget){
        setBudget(budget); 
        setDestination(destination);
    }

    public double getBudget(){
        return budget;
    }

    public void setBudget(double budget){
        if(budget >= 0){
            this.budget = budget;
        } else {
            throw new IllegalArgumentException("Budget must be above $0");
        }
    }

    public String getDestination(){
        return destination;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }

    public String toString(){
        return String.format("Destination: %s; Budget: $%.2f\n", destination, budget);
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Vacation)){
            return false;
        }
        Vacation objVac = (Vacation) obj;
        return this.destination.equals(objVac.destination) &&
               Math.abs(this.budget - objVac.budget) < 0.0001;
    }

    public abstract double overBudget();

}
