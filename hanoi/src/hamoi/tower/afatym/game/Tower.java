package hamoi.tower.afatym.game;

import java.util.Stack;
class Tower implements Comparable <Tower> {
    private Stack<Ring> ringList;

    protected Tower() {
        this.ringList = new Stack<>();
    }

    protected void addRing(Ring ring){
        ringList.push(ring);
    }
    protected void remRing(){
        if (!ringList.isEmpty()) {
            ringList.pop();
        }
    }

    protected boolean towerIsEmpty(){
        return ringList.isEmpty();
    }

    protected Ring getRing(){
        return ringList.peek();
    }
    protected void printTower(){
        for(Ring ring : ringList){
            System.out.print(ring.getNumber()+" ");
        }
        System.out.println("\n");
    }


    @Override
    public int compareTo(Tower o) {
        return ringList.peek().getNumber()-o.ringList.peek().getNumber();
    }
}
