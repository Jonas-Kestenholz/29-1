import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> actions = new ArrayList<>();

        actions.add("Move");
        actions.add("Attack");
        actions.add("Defend");
        actions.add("Use Item");

        GameMenu gameMenu = new GameMenu(actions);

        gameMenu.printOptions();
        gameMenu.displayMenu();

    }
}