package hamoi.tower.afatym.game;

import java.util.LinkedList;
import java.util.Scanner;

abstract class AbstractGameMenu {
    protected LinkedList<AbstractGameMenuItem> menuItems = new LinkedList<>();
    protected Scanner scanner = new Scanner(System.in);

    private boolean returnQuit = true;

    protected AbstractGameMenu() {

    }

    protected void printMenu() {
        System.out.println("-----------------------\nДоступные команды:");
        for (AbstractGameMenuItem item : menuItems)
            item.display();
        System.out.println("-----------------------");
    }

    protected void chooseOne() {
        printWithStart();
        while (returnQuit) {
            System.out.print("Ввод команды:");
            if (!checkCommand(scanner.nextLine())) {
                System.out.println("Такой команды нет.");
                printMenu();
            }
        }
    }

    protected void printWithStart() {
        printMenu();
    }

    private boolean checkCommand(String command){
        for (AbstractGameMenuItem item : menuItems) {
            if (command.equals(item.getId())) {
                returnQuit = item.doItem();
                return true;
            }
        }
        return false;
    }
}

public class StartGameMenu extends AbstractGameMenu{

    public StartGameMenu(){
        this.menuItems.add(new NewStartGameMenuItem("1","New Game",this));
        this.menuItems.add(new RuleStartGameMenuItem("2","Print Rule",this));
        this.menuItems.add(new QuitStartGameMenuItem("3", "Quit game",this));
        chooseOne();
    }
}

class PlayGameMenu extends AbstractGameMenu{

    Game game;
    PlayGameMenu(int ring){
        game = new Game(ring);
        //todo move
        this.menuItems.add(new MovePlayGameMenuItem("1", "Move Rings (please",this,game));
        this.menuItems.add(new RestartPlayGameMenuItem("2", "Restart game",this,game));
        this.menuItems.add(new StatusPlayGameMenuItem("3", "Status game moves",this,game));
        this.menuItems.add(new QuitStartGameMenuItem("4", "Return to main menu",this));
        chooseOne();

    }
    @Override
    protected void printWithStart() {
        game.printGame();
        printMenu();
    }
}
