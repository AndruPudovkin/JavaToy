package Model;

public class PlotFormationToy extends Toy {
    private String plot;
    public PlotFormationToy(int id, String name, int cost) {
        super(id, name, cost);
    }

    public PlotFormationToy(int id, String name, int cost, String plot) {
        super(id, name, cost);
        this.plot = plot;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    @Override
    public String toString() {
        return "PlotFormation{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", cost=" + super.getCost()+
                "plot='" + plot + '\'' +
                '}';
    }
}