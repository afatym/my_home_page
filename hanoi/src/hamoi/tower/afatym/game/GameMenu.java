package hamoi.tower.afatym.game;

public class GameMenu extends AbstractGameMenu {

    public GameMenu() {
        menuItems.push(new GameStartMenuStart("1","Start"));
        menuItems.push(new GameStartMenuRule("2","Rule"));
        menuItems.push(new GameStartMenuQuit("3","Quit"));
        chooseOne();
    }

}


