package com.qa;

import java.util.Scanner;

public class Choice_Scooty {
		int Budget;
		int Model;
	
	public void a() {
		System.out.println("~~~~~----Welcome----~~~~");
		System.out.println("please enter your Budget(60000 to 1,00,000)");
		Scanner B=new Scanner(System.in);
		int Budget=B.nextInt();
		System.out.println("Your budget is "+Budget);
		System.out.println("___________________________________________________");
		if(Budget>60000&Budget<70000) {
			System.out.println("you can buy below Scooties.");
			System.out.println("1)pleasure plus price=62000-71000"+"\n"+"2)Maestro Edge 125 price=65000-68000"+"\n"+"3)TVS Pep plus 67000 -71000");

		}
		else if(Budget>70000& Budget<80000) {
			System.out.println("you can buy below Scooties.");
			System.out.println("4)Destini 125 price=71000-75000"+"\n"+"5)Masetro Edge 125 price=73000-78000"+"\n"+"6)TVS Zest Price 75000-77000"+"\n"+"7)Honda Dio price 78000-81000");
		}
		else {
			System.out.println("you can buy below Scooties.");
			System.out.println("8)Ola S1 price 85000-95000"+"\n"+"9)Suzuki ACCESS 125 price 80000-88000"+"\n"+"10)yamha 125 price 95000-100000");
		}
		System.out.println("Please select your choice for more details");
		Scanner C=new Scanner(System.in);
		int Model=C.nextInt();
		System.out.println("You have selected "+Model);
		System.out.println("_________________________________________________");
		B.close();
		C.close();
		switch(Model) {
		case 1 : System.out.println("Maker model-Hero"+"\n"+"Model Name pleasure plus"+"\n"+"Price 62000-71000"+"\n"+"Mileage 65-70 "+"\n"+"Colours Available-blue,gray,yellow,black,red");break;
		case 2 : System.out.println("Maker model-Hero Maestro Edge 110"+"\n"+"Price 65000-68000"+"\n"+"Mileage 50-55 "+"\n"+"Colours Available-blue,black,red,blue,white");break;
		case 3 : System.out.println("Maker model-TVS pep plus"+"\n"+"Price 67000-71000"+"\n"+"Mileage 60-65 "+"\n"+"Colours Available-blue,gray,yellow,purple,red");break;
		case 4 : System.out.println("Maker model-Hero Destini 125"+"\n"+"Price 71000-75000"+"\n"+"Mileage 47-53 "+"\n"+"Colours Available-blue,white,yellow,red");break;
		case 5 : System.out.println("Maker model-Hero Mastro Edge 125"+"\n"+"Price 73000-78000"+"\n"+"Mileage 45-50 "+"\n"+"Colours Available-blue,gray,black,red");break;
		case 6 : System.out.println("Maker model-TVS Zest"+"\n"+"Price 75000-78000"+"\n"+"Mileage 55-61 "+"\n"+"Colours Available-blue,yellow,black,red");break;
		case 7 : System.out.println("Maker model-Honda Dio"+"\n"+"Price 78000-81000"+"\n"+"Mileage 62-66 "+"\n"+"Colours Available-blue,gray,yellow,black,red");break;
		case 8 : System.out.println("Maker model-OLA S1"+"\n"+"Price 85000-95000"+"\n"+"Electric "+"\n"+"Colours Available-bkue,gray,white,black,red");break;
		case 9 : System.out.println("Maker model-SUZUKI ACCESS"+"\n"+"Price 80000-88000"+"\n"+"Mileage 51-56 "+"\n"+"Colours Available-bkue,gray,yello,black,red");break;
		case 10 : System.out.println("Maker model-YAMHA125"+"\n"+"Price 90000-100000"+"\n"+"Mileage 46-49 "+"\n"+"Colours Available-bkue,gray,yello,black,red");break;       		
		}
	}
	public static void b() {
		System.out.println("~~~THANK YOU FOR VISITING..~~~");
	}
	public static void main(String[]args) {

		Choice_Scooty A=new Choice_Scooty();
		A.a();
		b();
	}
}
