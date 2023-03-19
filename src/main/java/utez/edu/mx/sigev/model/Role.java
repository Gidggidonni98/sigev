package utez.edu.mx.sigev.model;

public class Role {
    private int id;
    private String ROLE_NAME;

    public Role() {
    }

    public Role(int id, String ROLE_NAME) {
        this.id = id;
        this.ROLE_NAME = ROLE_NAME;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getROLE_NAME() {
        return ROLE_NAME;
    }

    public void setROLE_NAME(String ROLE_NAME) {
        this.ROLE_NAME = ROLE_NAME;
    }
}
