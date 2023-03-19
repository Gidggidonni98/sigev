package utez.edu.mx.sigev.model;

public class Colony {
    private int id;
    private String name;
    private Municipality municipality;

    public Colony() {
    }

    public Colony(int id, String name, Municipality municipality) {
        this.id = id;
        this.name = name;
        this.municipality = municipality;
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

    public Municipality getMunicipality() {
        return municipality;
    }

    public void setMunicipality(Municipality municipality) {
        this.municipality = municipality;
    }
}
