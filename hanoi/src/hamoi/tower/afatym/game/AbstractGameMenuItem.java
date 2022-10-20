package hamoi.tower.afatym.game;

import java.util.Scanner;

abstract class AbstractGameMenuItem {
    private String id;
    private String name;

    protected AbstractGameMenu menu;

    Game game;


    protected AbstractGameMenuItem(String id, String name, AbstractGameMenu menu){
        this.name = name;
        this.id = id;
        this.menu = menu;
    }

    protected AbstractGameMenuItem(String id, String name,AbstractGameMenu menu, Game game){
        this.name = name;
        this.id = id;
        this.menu = menu;
        this.game = game;
    }


    protected String getId(){
        return this.id;
    }


    protected void display(){
        System.out.println(id+") "+name);
    }

    protected abstract boolean doItem(String command);

}

class QuitStartGameMenuItem extends AbstractGameMenuItem{
        protected QuitStartGameMenuItem(String id, String name, AbstractGameMenu menu) {
            super(id, name, menu);
        }

        @Override
        protected boolean doItem(String command) {
            return false;
        }

}

class RuleStartGameMenuItem extends AbstractGameMenuItem{
    protected RuleStartGameMenuItem(String id, String name, AbstractGameMenu menu) {
        super(id, name, menu);
    }

    @Override
    protected boolean doItem(String command) {
        System.out.println("Ханойская башня является одной из популярных головоломок XIX века. \n" +
                "Даны три стержня, на один из которых нанизаны восемь колец, причём кольца отличаются размером и лежат меньшее на большем.\n" +
                "Задача состоит в том, чтобы перенести пирамиду из восьми колец за наименьшее число ходов на другой стержень. \n" +
                "За один раз разрешается переносить только одно кольцо, причём нельзя класть большее кольцо на меньшее иди снимать и класть обратно.");
        menu.printMenu();
        return true;
    }
}

class NewStartGameMenuItem extends AbstractGameMenuItem{
    protected NewStartGameMenuItem(String id, String name, AbstractGameMenu menu) {
        super(id, name, menu);
    }

    @Override
    protected boolean doItem(String command) {
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количетсо колец:");
            try {
                PlayGameMenu pgm = new PlayGameMenu(Integer.parseInt(scanner.nextLine()));
                break;
            }catch (NumberFormatException e){
                System.out.println("Введенное значение не является числом");
            }

        }
        this.menu.printMenu();
        return true;
    }
}

class StatusPlayGameMenuItem extends AbstractGameMenuItem{
    protected StatusPlayGameMenuItem(String id, String name, AbstractGameMenu menu,Game game) {
        super(id, name, menu, game);
    }

    @Override
    protected boolean doItem(String command) {
        System.out.println("Сделано "+this.game.getMovesCount()+" ходов из "+ this.game.getMovesMaxToWin());
        game.printGame();
        menu.printMenu();
        return true;
    }

}

class RestartPlayGameMenuItem extends AbstractGameMenuItem{
    protected RestartPlayGameMenuItem(String id, String name, AbstractGameMenu menu,Game game) {
        super(id, name, menu, game);
    }

    @Override
     protected boolean doItem(String command) {
        game.InitGame();
        game.printGame();
        menu.printMenu();
        return true;
    }

}

class MovePlayGameMenuItem extends AbstractGameMenuItem{
    protected MovePlayGameMenuItem(String id, String name, AbstractGameMenu menu,Game game) {
        super(id, name, menu, game);
    }

    protected boolean doItem(String command) {

        int mvComand = Integer.parseInt(command);
        game.moveRing(mvComand/10, mvComand%10);

        if(game.getEndGameStatus()){
            if(game.getMovesMaxToWin()==game.getMovesCount())
                System.out.println("Поздравляю ты победил сделав "+game.getMovesCount()+" ходов из "+game.getMovesMaxToWin() +" возможных");
            else
                System.out.println("к сожалению ты проиграл сделав "+game.getMovesCount()+" ходов из"+game.getMovesMaxToWin() +" возможных");
            return false;
        }
        game.printGame();
        menu.printMenu();
        return true;
    }

}


