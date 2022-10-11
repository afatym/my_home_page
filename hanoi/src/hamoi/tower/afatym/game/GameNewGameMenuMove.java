package hamoi.tower.afatym.game;

import java.util.Scanner;

class GameNewGameMenuMove extends AbstractGameMenuItem{

   private Scanner scanner = new Scanner(System.in);
   private Game game;

   protected GameNewGameMenuMove(String id, String name, Game game) {
       super(id, name);
       this.game = game;
   }

   @Override
   protected void doItem() {
       game.moveRing(Integer.parseInt(this.getId()) / 10, Integer.parseInt(this.getId()) % 10);
   }

}
