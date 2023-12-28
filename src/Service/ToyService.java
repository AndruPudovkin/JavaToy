package Service;

import Model.*;

import java.util.ArrayList;
import java.util.List;

public class ToyService {
    private List<Toy> toyList;

    public ToyService(List<Toy> toyList) {
        this.toyList = toyList;
    }
    public ToyService(){
        this.toyList = new ArrayList<>();
    }

    public List<Toy> getToyList(){
        return toyList;
    }

    private int getFreeId(){
        int lastId = 1;
        for (Toy toy:toyList) {
            lastId = toy.getId()+1;
        }
        return lastId;
    }
    public void create (Type type, String name, int cost, String x){
        int id = getFreeId();
        if (type == type.ENTERTAINMENTTOY){
            EntertainmentToy entertainmentToy = new EntertainmentToy(id, name, cost);
            toyList.add(entertainmentToy);
        }
        if (type == type.SPORTTOY){

            SportToy sportToy = new SportToy(id, name, cost, x);
            toyList.add(sportToy);
        }
        if (type == type.PLOTFORMATIONTOY){
            PlotFormationToy plotFormationToy =new PlotFormationToy(id, name, cost, x);
            toyList.add(plotFormationToy);

        }
    }
    public List<Toy> getAllToy() {
        List<Toy> studentList = new ArrayList<>();
        for (Toy toy : toyList) {
            studentList.add(toy);
        }
        return studentList;
    }
}
