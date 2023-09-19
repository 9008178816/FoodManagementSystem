package FoodManagementSystem;

public class Pizza {
	private int prize;
	private boolean veg;
	private int quantity;
	private String size="";

	private int extraToppingPrize = 100;
	private int extraCheesePrize = 50;
	private int parcelPrize = 20;

	public Pizza(boolean veg,String size,int quantity) {
		this.veg = veg;
		this.size=size;
		if (this.veg) {
			this.prize = 300;
		} else {
			this.prize = 400;
		}
		
		switch(size) {
		case "small":this.prize+=0;
		break;
		
		case "medium":this.prize+=100;
		break;
		
		case "large":this.prize+=200;
		break;
		
		}
		
		this.prize*=quantity;
		System.out.println("Base pizza Prize :"+ this.prize);
	}

	public void addToppings(int n) {
		System.out.println("Extra Topping added :"+extraToppingPrize*n);
		this.prize += extraToppingPrize*n;
	}

	public void addCheese(int n) {
		System.out.println("Extra Cheese added :"+extraCheesePrize*n);
		this.prize += extraCheesePrize*n;
	}

	public void parcel(int n) {
		System.out.println("Parcel needed :"+parcelPrize*n);
		this.prize += parcelPrize*n;
	}
	
	public int getBill() {
		System.out.println("Total prize is : " + this.prize);
		return this.prize;
	}

	public static void main(String[] args) {
        Pizza p1 = new Pizza(false, "large", 1);
        p1.addToppings(1);
        p1.addCheese(1);
        p1.parcel(1);
        System.out.println("------------------------------------------------------------");
        p1.getBill();
    }

}
}