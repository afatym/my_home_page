public class Elevator {
    //����������
    private int currentFloor = 1;
    private final int minFloor;
    private final int maxFloor ;

    //�����������
    public Elevator(int minFloor, int maxFloor){
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
    }

    //������
    private int getCurrentFloor(){
        return this.currentFloor;
    }

    private void moveDown(){
            System.out.println("���������� �� "+(--this.currentFloor) + " ����");
    }

    private void moveUp(){
        System.out.println("����������� �� "+(++this.currentFloor) + " ����");
    }

    public void move(int floor){
        if(floor<this.minFloor || floor>this.maxFloor)
            System.out.println("������ ����� �����. ���������� ������� ���������� ����");
        else {
            while (getCurrentFloor()!=floor) {
                if (getCurrentFloor()<floor)
                    moveUp();
                else
                    moveDown();
            }
            System.out.println("��������, �� �� "+ this.currentFloor+" �����");
        }


    }

}
