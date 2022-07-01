package cafelistandmenu;

import java.util.*;
public class cafemenuandorder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> OrderFood = new ArrayList<>();
//		ArrayList<String> OrderedList = new ArrayList<>();
		int maxnum = 1;
		int totalprice = 0;
		
		for(int a=1; a<=maxnum; a++) {
			System.out.print("Welcome to Breakfast cafe!\n"
					+ "Here is the list of foods that you can choose from: \n"
					+ "Breakfast: \n"
					+ "A1.Omelette - P40 \n"
					+ "A2.Tapsilog - P50 \n"
					+ "A3. Chicken Skin - P15 \n");
			System.out.println("Choose your order: ");
			String choices = sc.next();
			System.out.println("");
			
			if(choices.equals("A1")) {
				System.out.println("How many do you want to order? ");
				int ordernum = sc.nextInt();
				for(int i = 0; i<ordernum; i++) {
					OrderFood.add("Omelette");
					totalprice += 40;
				}
				System.out.println("Do you want to order again? [Yes] or [No]");
				System.out.print("Choices: ");
				String choices2 = sc.next();
				if(choices2.equals("Yes")) {
					System.out.println("");
					maxnum+=1;
				}
				else {
					maxnum = 0;
				}
			}
			
			else if(choices.equals("A2")) {
				System.out.println("How many do you want to order? ");
				int ordernum = sc.nextInt();
				for(int i = 0; i<ordernum; i++) {
					OrderFood.add("Tapsilog");
					totalprice += 50;
				}	
				System.out.println("Do you want to order again? [Yes] or [No]");
				System.out.print("Choices: ");
				String choices2 = sc.next();
				if(choices2.equals("Yes")) {
					System.out.println("");
					maxnum+=1;
				}
				else {
					maxnum = 0;
				}
			}
			else if(choices.equals("A3")) {
				System.out.println("How many do you want to order? ");
				int ordernum = sc.nextInt();
				for(int i = 0; i<ordernum; i++) {
					OrderFood.add("Chicken Skin");
					totalprice += 15;
				}	
				System.out.println("Do you want to order again? [Yes] or [No]");
				System.out.print("Choices: ");
				String choices2 = sc.next();
				if(choices2.equals("Yes")) {
					System.out.println("");
					maxnum+=1;
				}
				else {
					maxnum = 0;
				}
			}
			
		}
		if(maxnum==0) {
			System.out.println("");
			System.out.println("This is your Order: ");
			for(String i : OrderFood) {
			System.out.println(i);
			}
			System.out.print("Here is the TotalPrice you ordered: P" + totalprice +"\n");
			System.out.println("Payment: ");
			int payment = sc.nextInt();
			int changes = payment - totalprice;
					
			if(changes < 0) {
				System.out.println("Insufficient Fund. Please pay exactly P" + totalprice);
			}
			else {
				System.out.println("Your change is: P" + changes);
			}
		}
		sc.close();
	}
}

	