package hamoi.tower.afatym.game;

 class GameStartMenuQuit extends AbstractGameMenuItem{
     protected GameStartMenuQuit(String id, String name) {
        super(id, name);
    }

    @Override
    protected void doItem() {
        System.out.println("Спасибо за игру");
    }

}
