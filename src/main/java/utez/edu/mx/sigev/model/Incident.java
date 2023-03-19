package utez.edu.mx.sigev.model;

public class Incident {
    private int id;
    private String description;
    private String dateResgister;
    private Annexes annexes;
    private State_Incident state_incident;
    private Category category;
    private Committee committee;

    public Incident() {
    }

    public Incident(int id, String description, String dateResgister, Annexes annexes, State_Incident state_incident, Category category, Committee committee) {
        this.id = id;
        this.description = description;
        this.dateResgister = dateResgister;
        this.annexes = annexes;
        this.state_incident = state_incident;
        this.category = category;
        this.committee = committee;
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

    public String getDateResgister() {
        return dateResgister;
    }

    public void setDateResgister(String dateResgister) {
        this.dateResgister = dateResgister;
    }

    public Annexes getAnnexes() {
        return annexes;
    }

    public void setAnnexes(Annexes annexes) {
        this.annexes = annexes;
    }

    public State_Incident getState_incident() {
        return state_incident;
    }

    public void setState_incident(State_Incident state_incident) {
        this.state_incident = state_incident;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Committee getCommittee() {
        return committee;
    }

    public void setCommittee(Committee committee) {
        this.committee = committee;
    }
}
