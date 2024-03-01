import java.util.Scanner;

class Main2{

public static void main(String [] args){

String startMsg = "Please type your name";
String name;
int retirement = 67;
String retirementMsg = "You can happily retire in: ";

Scanner scanner = new Scanner(System.in);
	
System.out.println(startMsg);
name = scanner.nextLine();
System.out.println("Hello, " + name + "!");

System.out.println("Please type your age");
int age = scanner.nextInt();
System.out.println("Your age is: " + age);


int yearsUntilRetirement = retirement - age;
    if (yearsUntilRetirement > 0) {
        System.out.println(retirementMsg + yearsUntilRetirement + " years.");
    } else {
        System.out.println("You're already past retirement age!");
    }
}
}