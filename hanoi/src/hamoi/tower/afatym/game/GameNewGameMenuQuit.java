package hamoi.tower.afatym.game;

import java.util.Scanner;

class GameNewGameMenuQuit extends AbstractGameMenuItem{

   private Scanner scanner = new Scanner(System.in);
   private Game game;

   protected GameNewGameMenuQuit(String id, String name) {
       super(id, name);
       this.game = game;
   }

   @Override
   protected void doItem() {
       game.printGame();
       System.out.println("Всего ходов сделано:" + game.getMovesCount());
   }

}
