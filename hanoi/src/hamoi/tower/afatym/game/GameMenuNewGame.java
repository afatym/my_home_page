package hamoi.tower.afatym.game;

class GameMenuNewGame extends AbstractGameMenu {

    Game game;

    protected GameMenuNewGame(int numRings) {
        game = new Game(numRings);
        menuItems.push(new GameNewGameMenuMove("12","Move ring from tower 1 to tower 2", game));
        menuItems.push(new GameNewGameMenuMove("13","Move ring from tower 1 to tower 3", game));
        menuItems.push(new GameNewGameMenuMove("21","Move ring from tower 2 to tower 1", game));
        menuItems.push(new GameNewGameMenuMove("23","Move ring from tower 2 to tower 3", game));
        menuItems.push(new GameNewGameMenuMove("31","Move ring from tower 3 to tower 1", game));
        menuItems.push(new GameNewGameMenuMove("32","Move ring from tower 3 to tower 2", game));
        menuItems.push(new GameNewGameMenuRestart("1","Restart", game));
        menuItems.push(new GameNewGameMenuStatus("2","Status",game));
        menuItems.push(new GameNewGameMenuQuit("3","Quit"));
        chooseOne();
    }

    protected void chooseOne() {
        boolean commandIsExist = false;
        boolean returnQuit = true;
        printMenu();
        game.printGame();
        while (returnQuit) {
            System.out.print("Укажите пункт меню:");
            String itemname = scanner.nextLine();
            for (AbstractGameMenuItem item : menuItems) {
                if (itemname.equals(item.getId())) {
                    item.doItem();
                    commandIsExist = true;
                    if (item.getName().equals("Quit")) {
                        returnQuit = false;
                    }
                    if ( game.getEndGameStatus()){
                        returnQuit = false;
                        endGame();
                    }
                }

            }
            if(!commandIsExist){
                System.out.println("Данного пункта нет в меню.");
            }
        }
    }

    private void endGame(){
        System.out.println("Игра завершена.\nСделано "+ game.getMovesCount() +" ходов.\nМинимальное количество ходов:"+ (int)(Math.pow(2,game.getNumRings())-1));
        if(game.getMovesCount()==(int)(Math.pow(2,game.getNumRings())-1))
            System.out.println("Поздравляю.\nТы победил!");
        else
            System.out.println("Сожалею.\nТы проиграл!");
    }

}


