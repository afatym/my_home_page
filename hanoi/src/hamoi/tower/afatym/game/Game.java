package hamoi.tower.afatym.game;

class Game {
    private Tower[] towers = new Tower[3];
    private int numRings;

    protected void InitGame(int numRings){
        towers[0] = new Tower();
        towers[1] = new Tower();
        towers[2] = new Tower();
        this.numRings = numRings;
        for (int i = numRings;i>0;i--){
            towers[0].addRing(new Ring(i));
        }
    }

    public Game(int numRings) {
        InitGame(numRings);
    }


    protected void printGame(){
        System.out.print("1||");
        towers[0].printTower();
        System.out.print("2||");
        towers[1].printTower();
        System.out.print("3||");
        towers[2].printTower();
    }

    protected boolean getEndGameStatus(){
        return towers[0].towerIsEmpty()&& towers[1].towerIsEmpty();
    }

    protected void moveRing(int inTower, int toTower){
        inTower--;
        toTower--;
        if (!towers[inTower].towerIsEmpty()) {
            if (!towers[toTower].towerIsEmpty()) {
                if (towers[inTower].compareTo(towers[toTower]) < 0) {
                    towers[toTower].addRing(towers[inTower].getRing());
                    towers[inTower].remRing();
                } else {
                    System.out.println("Нельзя положить большее на меньшее");
                }
            }else {
                towers[toTower].addRing(towers[inTower].getRing());
                towers[inTower].remRing();
            }
        }else {
            System.out.println("Башня пустая");
        }

    }
}
