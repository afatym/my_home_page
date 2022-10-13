package hamoi.tower.afatym.game;

import java.util.Scanner;

class GameNewGameMenuStatus extends AbstractGameMenuItem{

   private Scanner scanner = new Scanner(System.in);
   private Game game;

   protected GameNewGameMenuStatus(String id, String name, Game game) {
       super(id, name);
       this.game = game;
   }

   @Override
   protected void doItem() {
       game.printGame();
       System.out.println("Всего ходов сделано:" + game.getMovesCount());
   }

}
