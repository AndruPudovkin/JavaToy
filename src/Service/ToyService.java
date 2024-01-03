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
    private Toy findMaxToy(List<Toy> toyList ){
        Toy ToyMax = toyList.get(0);
        int num = 0;
        for (int i = 0; i < toyList.size(); i++) {
            if (ToyMax.getCost() < toyList.get(i).getCost()){
                num = i;
            }
        }
        return toyList.remove(num);
    }
    public List<Toy> winToy(int n, List<Toy> toyList  ){
        List<Toy> winListToy =new ArrayList<>();
        while (n>0){
            Toy toy = findMaxToy(toyList);
            winListToy.add(toy);
            n = n-1;
        }
        return winListToy;
    }

}
