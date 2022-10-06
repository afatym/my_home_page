import java.util.ArrayList;
import java.util.List;

public class Tower {
    private List<Blincik> blinList;

    public Tower(int maxColBlin,boolean firstTower) {
        this.blinList = new ArrayList<>();
        if (firstTower) {
            for (int i = maxColBlin;i>0;i--)
                blinList.add(new Blincik(i));
        }
    }

    public void addBlinckir(Blincik blin){
        blinList.add(blin);
    }
    public void removeBlinckir(){
        if (!blinList.isEmpty()) {
            blinList.remove(returnMinBlinId());
        }
    }

    public Blincik returnMinBlinId(){
        int min =1000;
        Blincik minBlincik = null;
        for(Blincik blin : blinList){
            if (blin.getNumber() <min) {
                min = blin.getNumber();
                minBlincik = blin;
            }
        }
        return minBlincik;
    }

    public boolean towerIsEmpty(){
        return blinList.isEmpty();
    }

    public void printTower(){
        for(Blincik blin : blinList){
            System.out.print(blin.getNumber()+" ");
        }
        System.out.println();
        System.out.println();
    }

}
