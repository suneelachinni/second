package selenium001;

import java.util.Scanner;

import org.checkerframework.common.value.qual.StaticallyExecutable;

public class FoodBill {
	
	

		static int PaneerTikka = 120;
		static int CashewPulao = 150;
		static int VegFriedRice = 130;
		static int Gobi = 100;
		static int vegThali = 140;
		
		static int ChickenBiryani = 200;
		static int FishCurry = 150;
		static int chicken65 = 120;
		static int muttonGravy = 220;
		static int chickenFriedRice = 180;	
	
	public static void vegMenu() {
		System.out.println("1 PaneerTikka="+PaneerTikka);
		System.out.println("2 CashewPulao= "+CashewPulao);
		System.out.println("3 VegFriedRice="+VegFriedRice);
		System.out.println("4 Gobi= "+Gobi);
		System.out.println("5 vegThali="+vegThali);	
	}
	
	public static void nonVegMenu() {
		System.out.println("1 ChickenBiryani= "+ChickenBiryani);
		System.out.println("2 FishCurry= "+FishCurry);
		System.out.println("3 chicken65="+chicken65);
		System.out.println("4 muttonGravy= "+muttonGravy);
		System.out.println("5 chickenFriedRice= "+chickenFriedRice);
	}
public static void main(String[] args) {
	System.out.println("Welcome to numpyninza restaurent");
	System.out.println("please select the service offering from below");
	System.out.println("1 dineIn");
	System.out.println("2 takeaway");
	System.out.println("plase enter the option");
	
	Scanner sc = new Scanner (System.in);
	 int packing = sc.nextInt();
	
	 System.out.println("please select the service offering from below");
	 System.out.println("1 Vegetarian");
	 System.out.println("2 Non-vegetarian");
	 System.out.println("plase enter the option");
	 
	 int vegOrNonveg = sc.nextInt();
	 if (vegOrNonveg==1) {
		 vegMenu();
	 }
	 else {
		 nonVegMenu();
	 }
	 System.out.println("plase select the item number");
	 
	 int inum = sc.nextInt();
	 int i=2;
	 if (i==vegOrNonveg) {
	 switch (inum) {
	 case 1: System.out.println("please enter the number of chicken biriyani you want=");
	 int orderquantity = sc.nextInt();
	 int total = orderquantity*ChickenBiryani;
	 System.out.println("bill total="+total);
	 System.out.println("GST Tax="+total*6/100);
	 if (total>1000) {
		 System.out.println("Net total="+total*10/100); 
		 System.out.println("final bill="+((total)+(total*6/100)+(total*6/100)));
	 }
		 else if (total>1500) {
			 System.out.println("Net total="+total*15/100);
			 System.out.println("final bill="+((total)+(total*15/100)+(total*6/100)));
		 }
		 else {
			 System.out.println("final bill="+((total)+(total*6/100)));
		 }
		 break;
	 case 2: System.out.println("please enter the number of fish curry you want=");
	 int orderquantity1 = sc.nextInt();
	 int total1 = orderquantity1*FishCurry;
	 System.out.println("bill total="+total1);
	 System.out.println("GST Tax="+total1*6/100);
	 if (total1>1000) {
		 System.out.println("Net total="+total1*10/100); 
		 System.out.println("final bill="+((total1)+(total1*6/100)+(total1*6/100)));
	 }
		 else if (total1>1500) {
			 System.out.println("Net total="+total1*15/100);
			 System.out.println("final bill="+((total1)+(total1*15/100)+(total1*6/100)));
		 }
		 else {
			 System.out.println("final bill="+((total1)+(total1*6/100)));
		 }
		 break;
		 
	 case 3: System.out.println("please enter the number of chicken 65 you want=");
	 int orderquantity2 = sc.nextInt();
	 int total2 = orderquantity2*chicken65;
	 System.out.println("bill total="+total2);
	 System.out.println("GST Tax="+total2*6/100);
	 if (total2>1000) {
		 System.out.println("Net total="+total2*10/100); 
		 System.out.println("final bill="+((total2)+(total2*6/100)+(total2*6/100)));
	 }
		 else if (total2>1500) {
			 System.out.println("Net total="+total2*15/100);
			 System.out.println("final bill="+((total2)+(total2*15/100)+(total2*6/100)));
		 }
		 else {
			 System.out.println("final bill="+((total2)+(total2*6/100)));
		 }
		 break;
		 
	 case 4: System.out.println("please enter the number of mutton gravy you want=");
	 int orderquantity3 = sc.nextInt();
	 int total3 = orderquantity3*muttonGravy;
	 System.out.println("bill total="+total3);
	 System.out.println("GST Tax="+total3*6/100);
	 if (total3>1000) {
		 System.out.println("Net total="+total3*10/100); 
		 System.out.println("final bill="+((total3)+(total3*6/100)+(total3*6/100)));
	 }
		 else if (total3>1500) {
			 System.out.println("Net total="+total3*15/100);
			 System.out.println("final bill="+((total3)+(total3*15/100)+(total3*6/100)));
		 }
		 else {
			 System.out.println("final bill="+((total3)+(total3*6/100)));
		 }
		 break;
	 case 5: System.out.println("please enter the number of chicken fried rice you want=");
	 int orderquantity4 = sc.nextInt();
	 int total4 = orderquantity4*chickenFriedRice;
	 System.out.println("bill total="+total4);
	 System.out.println("GST Tax="+total4*6/100);
	 if (total4>1000) {
		 System.out.println("Net total="+total4*10/100); 
		 System.out.println("final bill="+((total4)+(total4*6/100)+(total4*6/100)));
	 }
		 else if (total4>1500) {
			 System.out.println("Net total="+total4*15/100);
			 System.out.println("final bill="+((total4)+(total4*15/100)+(total4*6/100)));
		 }
		 else {
			 System.out.println("final bill="+((total4)+(total4*6/100)));
		 }
		 break;
	 case 6 : System.out.println("invalid");
	     break; 
			 
	 }
	 }
	 else {
		 switch (inum) {
		 case 1: System.out.println("please enter the number of paneer tikka you want=");
		 int orderquantity = sc.nextInt();
		 int total = orderquantity*PaneerTikka;
		 System.out.println("bill total="+total);
		 System.out.println("GST Tax="+total*6/100);
		 if (total>1000) {
			 System.out.println("Net total="+total*10/100); 
			 System.out.println("final bill="+((total)+(total*6/100)+(total*6/100)));
		 }
			 else if (total>1500) {
				 System.out.println("Net total="+total*15/100);
				 System.out.println("final bill="+((total)+(total*15/100)+(total*6/100)));
			 }
			 else {
				 System.out.println("final bill="+((total)+(total*6/100)));
			 } 
		  break;
		 case 2: System.out.println("please enter the number of cashew pulao you want=");
		 int orderquantity2 = sc.nextInt();
		 int total1 = orderquantity2*CashewPulao;
		 System.out.println("bill total="+total1);
		 System.out.println("GST Tax="+total1*6/100);
		 if (total1>1000) {
			 System.out.println("Net total="+total1*10/100); 
			 System.out.println("final bill="+((total1)+(total1*6/100)+(total1*6/100)));
		 }
			 else if (total1>1500) {
				 System.out.println("Net total="+total1*15/100);
				 System.out.println("final bill="+((total1)+(total1*15/100)+(total1*6/100)));
			 }
			 else {
				 System.out.println("final bill="+((total1)+(total1*6/100)));
			 }
			 break;
		 case 3: System.out.println("please enter the number of veg fried rice you want=");
		 int orderquantity3 = sc.nextInt();
		 int total3 = orderquantity3*CashewPulao;
		 System.out.println("bill total="+total3);
		 System.out.println("GST Tax="+total3*6/100);
		 if (total3>1000) {
			 System.out.println("Net total="+total3*10/100); 
			 System.out.println("final bill="+((total3)+(total3*6/100)+(total3*6/100)));
		 }
			 else if (total3>1500) {
				 System.out.println("Net total="+total3*15/100);
				 System.out.println("final bill="+((total3)+(total3*15/100)+(total3*6/100)));
			 }
			 else {
				 System.out.println("final bill="+((total3)+(total3*6/100)));
			 }
			 break;	 
			 
		 case 4: System.out.println("please enter the number of gobi 65 you want=");
		 int orderquantity4 = sc.nextInt();
		 int total4 = orderquantity4*Gobi;
		 System.out.println("bill total="+total4);
		 System.out.println("GST Tax="+total4*6/100);
		 if (total4>1000) {
			 System.out.println("Net total="+total4*10/100); 
			 System.out.println("final bill="+((total4)+(total4*6/100)+(total4*6/100)));
		 }
			 else if (total4>1500) {
				 System.out.println("Net total="+total4*15/100);
				 System.out.println("final bill="+((total4)+(total4*15/100)+(total4*6/100)));
			 }
			 else {
				 System.out.println("final bill="+((total4)+(total4*6/100)));
			 }
			 break;
			 
		 case 5: System.out.println("please enter the number of veg thali you want=");
		 int orderquantity5 = sc.nextInt();
		 int total5 = orderquantity5*vegThali;
		 System.out.println("bill total="+total5);
		 System.out.println("GST Tax="+total5*6/100);
		 if (total5>1000) {
			 System.out.println("Net total="+total5*10/100); 
			 System.out.println("final bill="+((total5)+(total5*6/100)+(total5*6/100)));
		 }
			 else if (total5>1500) {
				 System.out.println("Net total="+total5*15/100);
				 System.out.println("final bill="+((total5)+(total5*15/100)+(total5*6/100)));
			 }
			 else {
				 System.out.println("final bill="+((total5)+(total5*6/100)));
			 }
			 break;
		 case 6 : System.out.println("invalid");
		     break; 
	 } 
	 }	 
     int orderquantity = sc.nextInt();  
}
}
