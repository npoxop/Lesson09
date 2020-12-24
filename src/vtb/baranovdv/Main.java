package vtb.baranovdv;
//Заставить программу ”Hello, World!” упасть…
//Смоделировав ошибку «ArrayIndexOutOfBoundsException»

public class Main {

    public static void main(String[] args) {
        String[] a = new String[2];
        a[0] = "Hello";
        a[1] = "World!";
        System.out.println(a[0] + " " + a[1]);

        try {
            a[2] = "Small";
            System.out.println(a[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Смоделировал ошибку ArrayIndexOutOfBoundsException");
        }
    }
}