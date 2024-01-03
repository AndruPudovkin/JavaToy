import Controller.ControllerToy;
import Model.Type;
import Service.FileService;

public class Main {
    public static void main(String[] args) {
        ControllerToy controller = new ControllerToy();
        String fileWrite = "C:\\Users\\pudow\\Desktop\\GB\\Аттестация\\Задача_2\\untitled\\src\\ DroppedToys.txt";
//        String fileWriteTest = "C:\\Users\\pudow\\Desktop\\GB\\Аттестация\\Задача_2\\untitled\\src\\ DroppedToys.txt";
//        controller.createToy(Type.SPORTTOY, "Мяч",1,"Для игры в Футбол" );
//        controller.createToy(Type.PLOTFORMATIONTOY, "LEGO",2,"Контруктор" );
//        controller.createToy(Type.ENTERTAINMENTTOY, "Ведьмак 3",3,"Пк игры" );
//        controller.writToy(fileWriteTest);
        String fileNameWin = "C:\\Users\\pudow\\Desktop\\GB\\Аттестация\\Задача_2\\untitled\\src\\ListOfToys.txt";
        controller.winToyController(fileWrite,fileNameWin );
    }
}