public class PieceMealVacation extends Vacation {
    private String[] items;
    private double[] costs;

    PieceMealVacation(String destination, double budget, String[] items, double[] costs){
        super(destination, budget);
        setItems(items);
        setCosts(costs);
    }

    public void setItems(String[] newItems) {
        this.items = new String[newItems.length];
        for (int i = 0; i < items.length; i++) {
            this.items[i] = newItems[i];
        }
    }

    public void setCosts(double[] newCosts){
        this.costs = new double[items.length];
        for (int i = 0; i < items.length; i++) {
            if (i < newCosts.length) {
                this.costs[i] = newCosts[i];
            } else {
                this.costs[i] = 0.0;
            }
        }
    }

    public String[] getItems() {
        return items;
    }

    public double[] getCosts() {
        return costs;
    }


    public String toString(){
        String result = super.toString();
        for (int i = 0; i < items.length; i++) {
            result += String.format("%s: $%.2f\n", items[i], costs[i]);
        }
        return result;
    }

    @Override
    public boolean equals(Object obj){
    if (!(obj instanceof PieceMealVacation)) {
        return false;
    }

    PieceMealVacation PMVac = (PieceMealVacation) obj;
    if (!super.equals(PMVac)) {
        return false;
    }

    if (this.items.length != PMVac.items.length) {
        return false;
    }
    for (int i = 0; i < this.items.length; i++) {
        if (!this.items[i].equals(PMVac.items[i])) {
            return false;
        }
    }

    if (this.costs.length != PMVac.costs.length) {
        return false;
    }
    for (int i = 0; i < this.costs.length; i++) {
        if (Math.abs(this.costs[i] - PMVac.costs[i]) >= 0.0001) {
            return false;
        }
    }
    return true;
}

@Override
public double overBudget() {
    double sum = 0;
    for(int i = 0; i < costs.length; i++){
        sum += costs[i];
    }
    return Math.abs(sum - getBudget());
}

}
