package utez.edu.mx.sigev.model;

public class Committee {
    private int id;
    private Colony colony;

    public Committee() {
    }

    public Committee(int id, Colony colony) {
        this.id = id;
        this.colony = colony;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Colony getColony() {
        return colony;
    }

    public void setColony(Colony colony) {
        this.colony = colony;
    }
}
