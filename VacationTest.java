public class VacationTest {
    public static void main(String[] args) throws Exception {


        AllInclusiveVacation obj1 = new AllInclusiveVacation( "Orlando", 1000.00 , "Disney", 4, 989.49 );
        System.out.printf("The first all-inclusive vacation is:\n%s", obj1.toString());

        double budgetAmount = obj1.overBudget();
        if (budgetAmount > 0) {
            System.out.printf("The vacation is over budget by: $%.2f\n", budgetAmount);
        } else {
            System.out.printf("The vacation is under budget by: $%.2f\n", budgetAmount);
        }

        AllInclusiveVacation obj2 = new AllInclusiveVacation("Bahamas", 2000.00, "ClubMed", 4,
2049.99 );
        System.out.printf("\nThe second all-inclusive vacation is:\n%s", obj2.toString());

        double budgetAmount2 = obj2.overBudget();
        if (budgetAmount2 > 0) {
            System.out.printf("The vacation is over budget by: $%.2f\n", budgetAmount2);
        } else {
            System.out.printf("The vacation is under budget by: $%.2f\n", budgetAmount2);
        }

        obj2.setBrand(obj1.getBrand());
        obj2.setPrice(obj1.getPrice());

        if (obj1.equals(obj2)) {
            System.out.println("\naiv1 and aiv2 are equal");
        } else {
            System.out.println("\naiv1 and aiv2 are not equal");
        }
        
        obj2.setDestination(obj1.getDestination());
        obj2.setBudget(obj1.getBudget());
        
        if (obj1.equals(obj2)) {
            System.out.println("aiv1 and aiv2 are now equal");
        } else {
            System.out.println("aiv1 and aiv2 are now not equal");
        }
    
        String[] itemsList1 =  { "hotel", "meals", "airfare", "windsurfing" };
        double [] costsList1 = { 750.00, 250.00, 400.00 };

        PieceMealVacation pmv1 = new  PieceMealVacation("Miami", 1500.00, itemsList1, costsList1);
        System.out.printf("\nThe first piecemeal vacation is:\n");
        System.out.printf(pmv1.toString());
        

        double budgetAmount3 = pmv1.overBudget();
        if (budgetAmount3 > 0) {
            System.out.printf("The vacation is over budget by: $%.2f\n", budgetAmount3);
        } else {
            System.out.printf("The vacation is under budget by: $%.2f\n", budgetAmount3);
        }

        String[] itemsList2 =  { "hotel", "meals", "airfare", "windsurfing" };
        double [] costsList2 = { 750.00, 250.00, 400.00, 120.00, 200.00 };

        PieceMealVacation pmv2 = new  PieceMealVacation("Miami", 1500.00, itemsList2, costsList2);
        System.out.printf("\nThe second piecemeal vacation is:\n");
        System.out.printf(pmv2.toString());

        double budgetAmount4 = pmv2.overBudget();
        if (budgetAmount4 > 0) {
            System.out.printf("The vacation is over budget by: $%.2f\n", budgetAmount4);
        } else {
            System.out.printf("The vacation is under budget by: $%.2f\n", budgetAmount4);
        }


        if(pmv1.equals(pmv2)){
            System.out.printf("\npmv1 and pmv2 are equal");
        } else { 
            System.out.printf("\npmv1 and pmv2 are not equal");
        }

        pmv2.setCosts(pmv1.getCosts());
        pmv2.setItems(pmv1.getItems());

        if(pmv1.equals(pmv2)){
            System.out.printf("\npmv1 and pmv2 are equal");
        } else { 
            System.out.printf("\npmv1 and pmv2 are not equal");
        }


    }
}
