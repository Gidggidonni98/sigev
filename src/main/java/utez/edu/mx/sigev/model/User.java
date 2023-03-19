package utez.edu.mx.sigev.model;

public class User {
    private int id;
    private String email;
    private String password;
    private Person person;
    private State_User state_user;

    public User() {
    }

    public User(int id, String email, String password, Person person, State_User state_user) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.person = person;
        this.state_user = state_user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public State_User getState_user() {
        return state_user;
    }

    public void setState_user(State_User state_user) {
        this.state_user = state_user;
    }
}
