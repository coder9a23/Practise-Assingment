package stockmangement;

import java.util.Scanner;

public class Driver1 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		
		BubbleSort BubbleSort=new BubbleSort();
		DecendinSort d= new DecendinSort();
		//Taking input total number of companies
		System.out.println("Enter total number of companies:");
		int com =sc.nextInt();
		float [] stp = new float[com];
		String [] a=new String[com];
		int count=0;
		String temp="false";
		
		
		//Storing stock rate and its or taking its stock price rose or not
		for(int i=0;i<com;i++) {
			System.out.println("Enter current stock price of the company"+" " +(i+1));
			stp[i]=sc.nextFloat();
			System.out.println("Weather companie's stock price rose today compare to yesturday");
			temp=sc.next();
			if(temp.matches("false")!=true) {
				count++;
			
			}
		}
		int n;
		int len=stp.length;
		do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Enter the operation that you want to perform:");
			System.out.println("1.Display the companies stock price in ascecding order");
			System.out.println("2.Display the companies stock price in decending order");
			System.out.println("3.Display total number of companies for which stock prices rose today");
			System.out.println("4.Display total number of companies for which stock prices declined today");
			System.out.println("5.Search a specific sotck price");
			System.out.println("6.Exit");
			System.out.println("----------------------------------------------------------------");
			 n=sc.nextInt();
			 
			 switch(n) {
			 			
			 case 1:
				BubbleSort.sort(stp, len);
				break;
			 case 2: 
				 d.decendingSort(stp, len);
				 break;
			 case 3:
				 
				 System.out.println("The companies whose stock price rose today is: " + count);
				 break;
			 case 4:
				 System.out.println("The companies whose sotck price is declined today is: "+ (len-count));
				break;
			 case 5: 
				 int flor=0;
				 System.out.print("Ennter the key value: ");
				 float key=sc.nextFloat();
				 for(int i=0;i<len;i++) {
					 if(key==stp[i]) {
						 flor=1;
					 }
					
					 }
				 if(flor==1) {
					 System.out.println("Value found "+key);
				 }
				 else {
					 System.out.println("Value not present,please enter correct value");
				 }
				 
			 }
		}while(n!=6);
			System.out.println("Exit successfully");
	}
}
