package utez.edu.mx.sigev.model;

public class ContentApp {
    private int id;
    private String imageLogin;
    private String logo1;
    private String logo2;
    private Color color;

    public ContentApp() {
    }

    public ContentApp(int id, String imageLogin, String logo1, String logo2, Color color) {
        this.id = id;
        this.imageLogin = imageLogin;
        this.logo1 = logo1;
        this.logo2 = logo2;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageLogin() {
        return imageLogin;
    }

    public void setImageLogin(String imageLogin) {
        this.imageLogin = imageLogin;
    }

    public String getLogo1() {
        return logo1;
    }

    public void setLogo1(String logo1) {
        this.logo1 = logo1;
    }

    public String getLogo2() {
        return logo2;
    }

    public void setLogo2(String logo2) {
        this.logo2 = logo2;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
