public class Main {
    public static void main(String[] args) {
        //todo Тут увольняем айтишников
        /*
        for (int i = 1; i < 50; i++) {
            if(i % 2 == 0) {
                System.out.println("Уволен айтишник с id " + i);
            }
        }*/

// ---------------------------------------------------------------

        /*
        for (int i = 2; i <= 50; i += 2) {
            System.out.println("Уволен айтишник с id " + i);
        }*/

// ---------------------------------------------------------------
        int i = 2;
        while (i <= 50) {
            System.out.println("Уволен айтишник с id " + i);
            i += 2; // i = i + 2
        }
    }
}
