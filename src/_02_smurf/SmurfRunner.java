package _02_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf handy = new Smurf("handy","white","boy");
	handy.getName();
	handy.eat();
	Smurf papa = new Smurf("papa","red","boy");
	papa.getName();
	papa.isGirlOrBoy();
	papa.getHatColor();
	Smurf smurfette = new Smurf("smurfette","white","girl");
	smurfette.getName();
	smurfette.isGirlOrBoy();
	smurfette.getHatColor();
	
}
}
