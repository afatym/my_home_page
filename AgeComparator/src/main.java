public class main {
    public static void main(String[] args) {
        int vasyaAge = 14;
        int katyaAge = 14;
        int mishaAge = 14;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        String minOutString = "Minimal age: ";
        String middleOutString = "Middle age: ";
        String maxOutString = "Maximal age: " ;

        if (vasyaAge>=katyaAge && vasyaAge>=mishaAge) {
            max = vasyaAge;
            if (katyaAge >= mishaAge) {
                middle = katyaAge;
                min = mishaAge;
            }
            else {
                min = katyaAge;
                middle = mishaAge;
            }
        } else if  (katyaAge >= vasyaAge && katyaAge>=mishaAge) {
            max = katyaAge;
            if (vasyaAge >= mishaAge) {
                middle = vasyaAge;
                min = mishaAge;
            }
            else {
                min = vasyaAge;
                middle = mishaAge;
            }
        } else {
            max = mishaAge;
            if (vasyaAge >= katyaAge) {
                middle = vasyaAge;
                min = katyaAge;
            }
            else {
                min = vasyaAge;
                middle = katyaAge;
            }
        }
        System.out.println(minOutString+min);
        System.out.println(middleOutString+middle);
        System.out.println(maxOutString+max);
    }
}
