package hamoi.tower.afatym.game;

import java.util.Scanner;
import java.util.Stack;

public abstract class AbstractGameMenu {
    protected Stack<AbstractGameMenuItem> menuItems = new Stack<>();
    protected Scanner scanner = new Scanner(System.in);

    protected AbstractGameMenu() {
    }

    protected void printMenu() {
        System.out.println("-----------------------");
        for (AbstractGameMenuItem item : menuItems)
            item.display();
        System.out.println("-----------------------");
    }

    protected void chooseOne() {
        boolean commandIsExist = false;
        boolean returnQuit = true;
        while (returnQuit) {
            printMenu();
            System.out.print("Укажите пункт меню:");
            String itemname = scanner.nextLine();
            for (AbstractGameMenuItem item : menuItems) {
                if (itemname.equals(item.getId())) {
                    item.doItem();
                    commandIsExist = true;
                    if (item.getName().equals("Quit")) {
                        returnQuit = false;
                    }
                }

            }
            if(!commandIsExist){
                System.out.println("Данного пункта нет в меню.");
            }
        }
    }
}


