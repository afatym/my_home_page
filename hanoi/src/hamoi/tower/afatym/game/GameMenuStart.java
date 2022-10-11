package hamoi.tower.afatym.game;

public class GameMenuStart extends AbstractGameMenu {

    public GameMenuStart() {
        menuItems.push(new GameStartMenuStart("1","Start"));
        menuItems.push(new GameStartMenuRule("2","Rule"));
        menuItems.push(new GameStartMenuQuit("3","Quit"));
        chooseOne();
    }

}


