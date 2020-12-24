package vtb.baranovdv;

//Заставить программу ”Hello, World!” упасть…
//Вызвав свой вариант ошибки через оператор throw

public class Main2 {
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld("НовыйПривет");
        //hw.hasHello();
        hw.hasWorld();
        try {
            hw.sayIt();
        } catch (WorldIsNotPreparedToHelloException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

class WorldIsNotPreparedToHelloException extends Exception {

    WorldIsNotPreparedToHelloException(String message) {
        super(message);
    }
}

class HelloWorld {

    String hw;
    boolean hasHello;
    boolean hasWorld;

    HelloWorld(String hw) {
        this.hw = hw;
    }

    void hasHello() {

        this.hasHello = true;
    }

    void hasWorld() {

        this.hasWorld = true;
    }

    void sayIt() throws WorldIsNotPreparedToHelloException {

        System.out.println("Ну, говори уже!");
        if (hasHello && hasWorld) {
            System.out.println("Hello World!");
        } else {
            throw new WorldIsNotPreparedToHelloException("Ты не готов!");
        }
    }
}
