package hamoi.tower.afatym.game;

import java.util.Scanner;

class GameNewGameMenuRestart extends AbstractGameMenuItem{

   private Scanner scanner = new Scanner(System.in);
   private Game game;

   protected GameNewGameMenuRestart(String id, String name, Game game) {
       super(id, name);
       this.game = game;
   }

   @Override
   protected void doItem() {
       game.InitGame();
       game.printGame();
   }

}
