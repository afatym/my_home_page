public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket(100000000);
        basket.add("Milk", 40);

        basket.add("Onion", 15,1,23);

        System.out.println("Вес корзины составляет: "+basket.getTotalWeight());

    }
}
