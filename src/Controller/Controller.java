package Controller;

import Model.Toy;
import Model.Type;
import Service.ToyService;
import View.ToyView;

import java.util.List;

public class Controller {
    private final ToyService toyService = new ToyService();
    private final ToyView toyView = new ToyView();

    public void createToy(Type type,  String name, int cost, String x ){
        toyService.create(type, name, cost, x);
    }
    public void printToy(){
        List<Toy> toyList = toyService.getAllToy();
        for (Toy toy: toyList){
            toyView.printOnConsole(toy);
        }
    }
}
