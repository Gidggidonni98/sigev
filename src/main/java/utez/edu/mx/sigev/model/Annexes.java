package utez.edu.mx.sigev.model;

public class Annexes {
    private int id;
    private String data;
    private String description;

    public Annexes() {
    }

    public Annexes(int id, String data, String description) {
        this.id = id;
        this.data = data;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
