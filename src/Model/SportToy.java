package Model;

public class SportToy extends Toy {
    private String sport;

    public SportToy(int id, String name, int cost) {
        super(id, name, cost);
    }

    public SportToy(int id, String name, int cost, String sport) {
        super(id, name, cost);
        this.sport = sport;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "SportToy-" +
                "id-" + super.getId() +
                "-name-'" + super.getName() + '\'' +
                "-cost-" + super.getCost()+
                "-sport-'" + sport + '\'';
    }
}
