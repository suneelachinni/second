

package package2;

public class salary {
	
	
	
	public static void main(String[] args) {
	
	int level;
	int allowance;
    int bonus;
	int pfcontribution;
	int monthlytakehome;
	int s = 20000;
	int yearly;
	int taxrate;
	int taxpay;
	int netmonthlypay;
	
	
	
if  ((s > 1) && (s <= 7000)) {
	
	level = 1;
	allowance = 5000;
	bonus = 2000;
	}

else if ((s > 7000) && (s <= 10000)) {
	level = 2;
	allowance = 7000;
	bonus = 2500;
	}
else if ((s > 10000) && (s <= 12000)) {
	level = 3;
	allowance = 9000;
	bonus = 3000;
	}
else  {
	level = 4;
	allowance = 10000;
	bonus = 3500;
	}




pfcontribution = ((s*12)/100);
System.out.println("Provident fund is : "+pfcontribution);

monthlytakehome = (s-pfcontribution+allowance+bonus);
System.out.println("Monthly Pay is : "+monthlytakehome);

yearly = monthlytakehome*12;
System.out.println("yearly Pay is : "+yearly );

if ((yearly > 1) && (yearly <= 250000)) {
	taxrate = 0;
}
	else if ((yearly > 250000) && (yearly <= 500000)) {
	taxrate = 5;}
	else if ((yearly > 500000) && (yearly <= 750000)) {
		taxrate = 10;}

	else if ((yearly >750000) && (yearly <= 1000000)) {
		taxrate= 15;}

	else if ((yearly >1000000) && (yearly<= 1250000)) {
		taxrate = 20;}

	else if ((yearly >1250000) && (yearly <= 1500000)) {
		taxrate = 25;}

	else   {taxrate = 30;}
		
System.out.println("tax percentage is : "+taxrate );

taxpay = (yearly*taxrate/100);
System.out.println("Employee monthly basic salary is : "+s );	
System.out.println("Employee Level is : "+level );
System.out.println("Tax payment is : "+taxpay );
netmonthlypay=(monthlytakehome-(taxpay/12));
System.out.println("Net monthly payment is : "+netmonthlypay );
   }

}	
