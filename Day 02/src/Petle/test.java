package Petle;

public class test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + " " + j);
            }
        }


        MY_LOOP:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(i + " " + j);
                if (i == 1) break MY_LOOP;
            }
        }
        char a = 'A';
        System.out.println(a);

        char c = 'a';
        System.out.println(c + 1);
        int ab = 0;

        for (int i = 0; i < 5; i++){

            if (i % 2 == 0) continue;

            ab++;

        }
    }
}
