package hamoi.tower.afatym.game;

class Ring {
    private final int number;
    private final int size;

    protected Ring(int id) {
        this.number = id;
        this.size = id*2;

    }
    public int getNumber() {
        return number;
    }
}
