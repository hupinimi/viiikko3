package luento3;

import java.util.ArrayList;
import java.util.Scanner;

public class BottleDispenser {
    
	
	private int bottles;
	private double money;
	ArrayList<Bottle> bottle_array = new ArrayList<Bottle>();
	
	private static BottleDispenser bottleBud = new BottleDispenser();
	
	public static BottleDispenser getBottleDispenser() {
		return bottleBud;
	}
    
    private BottleDispenser() {
        bottles = 5;
        money = 0;
    
    	for(int i = 0; i< bottles; i++) {
    		Bottle temp = new Bottle();
    		bottle_array.add(temp);
    		
    	}

	    Scanner skanneri = new Scanner(System.in);
	    		
	    while (true) {
	    	System.out.println("");
	    	System.out.print("*** BOTTLE DISPENSER ***\n1) Add money to the machine\n2) Buy a bottle\n3) Take money out\n4) List bottles in the dispenser\n0) End\n");
	    	System.out.print("Your choice: ");
			int num = skanneri.nextInt();
			
			if (num == 4) {
				//System.out.print("1. Name: Pepsi Max\n\tSize: 0.5	Price: 1.8\n2. Name: Pepsi Max\n\tSize: 0.5	Price: 1.8\n3. Name: Pepsi Max\n\tSize: 0.5	Price: 1.8\n4. Name: Pepsi Max\n\tSize: 0.5	Price: 1.8\n");
				catalog();
				
			} else if (num == 1) {
				addMoney();
			
			} else if (num == 2 ) {
		    	buyBottle();
			
			}else if (num == 3) {
				returnMoney();
				
			}else if (num == 0) {
				break;
				
			}else {
				System.out.println("Huono numero.");
			}
			
	    }
	    skanneri.close();
    } 
    
	public void catalog() {
		for(int i = 1; i<= bottles; i++) {
			System.out.println(i +". " + "Name: Pepsi Max\n\tSize: 0.5	Price: 1.8");
		}
	}
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    
    public void buyBottle() {
    	if (money < 1.8) {
    		System.out.println("Add money first!");
    	} else {
    		if (bottles > 0) {
    			bottles -= 1;
    			money = money - 1.8;
    			System.out.println("KACHUNK! " + bottle_array.get(bottles).getName() + " came out of the dispenser!");

    		} else {
    			System.out.println("Out of bottles!");
    		}
    	}	
    }
    public void returnMoney() {
        money = 0;
        System.out.println("Klink klink. Money came out!");
    }
}
