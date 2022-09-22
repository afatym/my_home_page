public class Elevator {
    //переменные
    private int currentFloor = 1;
    private final int minFloor;
    private final int maxFloor ;

    //Конструктор
    public Elevator(int minFloor, int maxFloor){
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
    }

    //Методы
    private int getCurrentFloor(){
        return this.currentFloor;
    }

    private void moveDown(){
            System.out.println("Опускаемся на "+(--this.currentFloor) + " Этаж");
    }

    private void moveUp(){
        System.out.println("Поднимаемся на "+(++this.currentFloor) + " Этаж");
    }

    public void move(int floor){
        if(floor<this.minFloor || floor>this.maxFloor)
            System.out.println("Ошибка ввода этажа. Пожалуйста укажите корректный этаж");
        else {
            while (getCurrentFloor()!=floor) {
                if (getCurrentFloor()<floor)
                    moveUp();
                else
                    moveDown();
            }
            System.out.println("Приехали, мы на "+ this.currentFloor+" этаже");
        }


    }

}
