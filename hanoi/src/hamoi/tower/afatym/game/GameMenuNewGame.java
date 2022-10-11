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
        //menuItems.push(new GameStartMenuStart("restart","Restart"));
        menuItems.push(new GameStartMenuQuit("quit","Quit"));
        chooseOne();
    }

    protected void chooseOne() {
        boolean commandIsExist = false;
        boolean returnQuit = true;
        printMenu();
        while (returnQuit) {
            game.printGame();
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
                        System.out.println("Игра завершена");
                    }
                }

            }
            if(!commandIsExist){
                System.out.println("Данного пункта нет в меню.");
            }
        }
    }

}


