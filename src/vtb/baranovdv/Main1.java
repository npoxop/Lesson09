package vtb.baranovdv;
//Заставить программу ”Hello, World!” упасть…
//Смоделировав ошибку «NullPointerException»

public class Main1 {

    public static void main(String[] args) {
        String[] a = null;

        try {
            System.out.println(a[1]);
        } catch (NullPointerException e) {
            System.out.println("Смоделировал ошибку NullPointerException");
            e.printStackTrace();
        }
    }
}