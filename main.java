package FoodManagementSystem;

public class main {
    public static void main(String[] args) {
        Pizza p1 = new Pizza(false, "large", 1);
        p1.addToppings(1);
        p1.addCheese(1);
        p1.parcel(1);
        System.out.println("------------------------------------------------------------");
        p1.getBill();
    }

}
