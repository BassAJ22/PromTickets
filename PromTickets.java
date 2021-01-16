package practice;

public class PromTickets {// assigns a student the price of their ticket and a 6 character code
	String student;
	int year, group;
	String code;
	PromTickets(String studentx , int yearx , int groupx){
		student = studentx;
		year = yearx;
		group = groupx;
		code = codeGen();
		System.out.println( student + " purchased a " + yos() + " " + gos() + " ticket for " + "$" + (int)ticketPrice() + ".00. "+ " The confirmation number for this sale is " + code + "." );
	}
	double ticketPrice() {// year and group to price
		if(year == 12) {
			if(group == 1)return 40;
			if(group == 2)return 60;
			return 100;}
		else if(year == 11) {
			if(group == 1)return 45;
			if(group == 2)return 68;
			return 113;}
		else if(year == 10) {
			if(group == 1)return 55;
			if(group == 2)return 83;
			return 138;}
		else {
			if(group == 1)return 65;
			if(group == 2)return 98;
			return 163;
			
		}
		
	}
	String codeGen() {//a random character from the string is called 6 times
		String password = "";
		String rando = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for(int i = 0;i<6;i++) {
			int y = (int)(Math.random()*rando.length());
			password+= rando.charAt(y);
		}
		return password;
	
		
	}
	
	String yos() {//year to string
		if(year == 9)return "freshman";
		if(year == 10)return "sophmore";
		if(year == 11)return "junior";
		if(year == 12)return "senior";
		return "error";
	}
	String gos() {
		if(group == 1)return "single";
		if(group == 2)return "couple";
		return "group";
		
	}
 
}
