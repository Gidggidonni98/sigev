package utez.edu.mx.sigev.model;

public class State_Incident {
    private int id;
    private String description;

    public State_Incident() {
    }

    public State_Incident(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
