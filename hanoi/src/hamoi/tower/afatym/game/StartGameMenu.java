package hamoi.tower.afatym.game;

import java.util.LinkedList;
import java.util.Scanner;

abstract class AbstractGameMenu {
    protected LinkedList<AbstractGameMenuItem> menuItems = new LinkedList<>();
    protected Scanner scanner = new Scanner(System.in);

    protected boolean returnQuit = true;

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
        if(dopSearchCommand(command)){
            return true;
        }else {
            for (AbstractGameMenuItem item : menuItems) {
                if (command.equals(item.getId())) {
                    returnQuit = item.doItem(command);
                    return true;
                }

            }
        }
        return false;
    }
    abstract boolean dopSearchCommand(String command);
}

public class StartGameMenu extends AbstractGameMenu{

    public StartGameMenu(){
        this.menuItems.add(new NewStartGameMenuItem("1","New Game",this));
        this.menuItems.add(new RuleStartGameMenuItem("2","Print Rule",this));
        this.menuItems.add(new QuitStartGameMenuItem("3", "Quit game",this));
        chooseOne();
    }

    @Override
    boolean dopSearchCommand(String command) {
        return false;
    }
}

class PlayGameMenu extends AbstractGameMenu{

    Game game;
    PlayGameMenu(int ring){
        game = new Game(ring);
        //todo move
        this.menuItems.add(new MovePlayGameMenuItem("xy", "Move Rings (move x to y tower)",this,game));
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

    @Override
    boolean dopSearchCommand(String command) {
        try {
            if (Integer.parseInt(command) > 10 && Integer.parseInt(command) <= 99) ;
            {
                for (AbstractGameMenuItem item : menuItems) {
                    if ("xy".equals(item.getId())) {
                        returnQuit = item.doItem(command);
                        return true;
                    }
                }
            }
        }catch (Exception e){
        }
        return false;
    }
}
