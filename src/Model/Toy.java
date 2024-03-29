package Model;

public abstract class Toy {
    private int id;
    private String name;
    private int cost;

    public Toy(int id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Toy-" +
                "id-" + id +
                "-name-'" + name + '\'' +
                "-cost-" + cost ;
    }
}
