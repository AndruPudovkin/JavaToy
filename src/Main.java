import Controller.Controller;
import Model.Type;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createToy(Type.SPORTTOY, "test",1,"test" );
        controller.createToy(Type.PLOTFORMATIONTOY, "test 1",2,"test 1" );
        controller.printToy();
    }
}