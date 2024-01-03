package Model;

public class EntertainmentToy extends Toy{
    public EntertainmentToy(int id, String name, int cost) {
        super(id, name, cost);
    }
    @Override
    public String toString() {
        return "EntertainmentToy-" +
                "id-" + super.getId() +
                "-name-'" +  super.getName()  + '\'' +
                "-cost-" + super.getCost() ;
    }

}
