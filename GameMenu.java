import java.util.ArrayList;

public class GameMenu{
	
	private ArrayList<String> actions;

    public GameMenu(ArrayList<String> actions) {
        actions = new ArrayList<String>();
        this.actions = actions;


    public void printOptions() {
        System.out.println("Options:");
        for (String action : actions) {
            System.out.println("- " + action);
        }
    }

     public void displayMenu() {
        System.out.println("Welcome to the Game Menu!");
        printOptions();
    }
   
    }

}