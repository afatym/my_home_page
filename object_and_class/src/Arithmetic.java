public class Arithmetic {
    private int first_int;
    private int second_int;

    public void Arithmetic(int first_int, int second_int) {
        this.first_int = first_int;
        this.second_int = second_int;
        System.out.println("Был создан объект класса Arithmetic с аргументами" + this.first_int + " и " + this.second_int);

    }

    public int sumOfTwo(){
        return first_int + second_int;
    }

    public int multiplyOfTwo(){
        return first_int * second_int;
    }

    public int maxOfTwo(){
        return first_int > second_int ? first_int : second_int;
    }

    public int minOfTwo(){
        return first_int < second_int ? first_int : second_int;
    }
}
