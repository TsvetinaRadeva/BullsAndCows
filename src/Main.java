import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void generateNumbers() {


        int a = (int) (Math.random() * 9);
        System.out.print(a);
        int b = (int) (Math.random() * 9);
        if (b != a) {
            System.out.print(b);
        }

        int c = (int) (Math.random() * 9);
        if (c != a && c != b) {
            System.out.print(c);
        }
        int d = (int) (Math.random() * 9);
        if (d != a && d != b && d != c) {
            System.out.println(d);


        }
    }

    public static void generateWithLoop() {
        Random r = new Random();
        for (int k = 0; k < 1; k++) {
            int val = gen(r);
            System.out.println(val);
        }

    }

    static int[] base = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static int gen(Random r) {
        int val = 0;
        int s = 10;
        for (int i = 0; i < 4; i++) {
            int n = r.nextInt(s);
            val = val * 10 + base[n];
            int save = base[n];
            base[n] = base[--s];
            base[s] = save;
        }
        return val < 1000 ? val * 10 + base[r.nextInt(s)] : val;
    }

    public static void generateNum() {


        Random random = new Random();
        int d1 = random.nextInt(9);
        int d2 = random.nextInt(9);
        int d3 = random.nextInt(9);
        int d4 = random.nextInt(9);
        while (d1 == d2 || d1 == d3 || d1 == d4 || d2 == d3 || d2 == d4 || d3 == d4) {
            if ( d1 == 0) {
                d1 = random.nextInt(9);
            }
            if (d1 == d2 || d2 == d3 || d2 == d4) {
                d2 = random.nextInt(9);
            }
            if (d1 == d3 || d2 == d3 || d3 == d4) {
                d3 = random.nextInt(9);
            }
            if (d1 == d4 || d2 == d4 || d3 == d4) {
                d4 = random.nextInt(9);
            }
        }
        System.out.println(d1 + "" + d2 + "" + d3 + "" + d4);



        }
    public static void generateNum2(){
        Random rand = new Random();


        int n = rand.nextInt(10);
        System.out.println(n);

    }
    public static void main (String[]args){
        generateNum();
        }


    }