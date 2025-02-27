public class AllInclusiveVacation extends Vacation {

    private String brand;
    private int rating; // 1 to 5
    private double price;

    AllInclusiveVacation(String destination, double budget, String brand, int rating, double price){
        super(destination, budget);
        setBrand(brand);
        setRating(rating);
        setPrice(price);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setRating(int rating){
        if (rating < 0 || rating > 5){
            throw new IllegalArgumentException("Rating must be between 0 and 5");
        } else {
            this.rating = rating;
        }
    }
    
    public int getRating(){
        return rating;
    }

    public void setPrice(double price){
        if (price < 0){
            throw new IllegalArgumentException("Price must be more then $0");
        } else {
            this.price = price;
        }
    }

    public double getPrice(){
        return price;
    }

    public String toString(){
        return String.format(super.toString() + "Brand: %s; Rating: %d; Price: $%.2f\n", brand, rating, price);
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof AllInclusiveVacation)){
            return false;
        }
        AllInclusiveVacation other = (AllInclusiveVacation) obj;
        return super.equals(other) &&
               this.brand.equalsIgnoreCase(other.brand) &&
               this.rating == other.rating &&
               Math.abs(this.price - other.price) < 0.0001;
    }
    
    @Override
    public double overBudget() {
        return Math.abs(this.price - getBudget());
    }

}
