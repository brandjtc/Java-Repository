// File:    Passw0rdBrandon.java
// Project: CSIS3101 Assignment 11 
// Author:  Brandon Catalano 
// History: Version 1.0 4/9/2022
public class Passw0rdBrandon {
	private String password;
	
	public Passw0rdBrandon() {
		password="";
		
	}
	
	public Passw0rdBrandon(String password) {
		this.password=password;
	}
	
	public String checkPassword() {
	boolean perhaps=false;
	int upper=0;
	int number=0;
	int special=0;
	int space=0;
	int i = 0;
	String wrongPass=this.password;
	for (int j=0; j<password.length(); j++) {
		if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))&&(!Character.isWhitespace(password.charAt(i)))){
			special+=1;
			 }
		if(Character.isDigit(password.charAt(i))) {
			number+=1;
			 }
		if(Character.isUpperCase(password.charAt(i))) {
			upper+=1;
		}
		if (Character.isWhitespace(password.charAt(i))) {
			space+=1;
		}
		i++;
	}

	if (upper == 2&&number==2&&special==1&&space==0&&password.length()>=12) 
		perhaps=true;
	
	if (perhaps==true) {	
		/*
		System.out.println(this.password);
		System.out.println("upper: "+upper);
		System.out.println("number: "+number);
		System.out.println("space: "+space);
		System.out.println("special: "+special);
		*/
	
	String success=(this.password+" iss a valid password.\nPassword accepted.\n\n");
	return success;
	} else {
		wrongPass+=" is not a valid password.\n";		
		if(special!=1) {
			wrongPass+="Incorrect number of special characters. You need exactly 1 in the password.\n";
		}
		if(upper!=2) {
			wrongPass+="Incorrect number of uppercase letters. You need exactly 2 in the password. \n";
		}
		if(space>0) {
			wrongPass+="Password contains a space. This is not allowed.\n";
		}
		if(number!=2) {
			wrongPass+="Incorrect number of digits. Password requires exactly two digits\n";
		}
		if(password.length()<12) {
			wrongPass+="Password too short. Password requires miniumum of 12 digits.\n";
		}
		}
		wrongPass+="\n";
		/*
		System.out.println(this.password);
		System.out.println("upper: "+upper);
		System.out.println("number: "+number);
		System.out.println("space: "+space);
		System.out.println("special: "+special);
		*/
		return wrongPass;

	}
	
	
	
	}
	
