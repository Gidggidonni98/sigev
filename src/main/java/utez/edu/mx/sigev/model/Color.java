package utez.edu.mx.sigev.model;

public class Color {
    private int id;
    private String colorMain;
    private String colorSecundary;
    private String colorText;
    private String colorTitle;

    public Color() {
    }

    public Color(int id, String colorMain, String colorSecundary, String colorText, String colorTitle) {
        this.id = id;
        this.colorMain = colorMain;
        this.colorSecundary = colorSecundary;
        this.colorText = colorText;
        this.colorTitle = colorTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColorMain() {
        return colorMain;
    }

    public void setColorMain(String colorMain) {
        this.colorMain = colorMain;
    }

    public String getColorSecundary() {
        return colorSecundary;
    }

    public void setColorSecundary(String colorSecundary) {
        this.colorSecundary = colorSecundary;
    }

    public String getColorText() {
        return colorText;
    }

    public void setColorText(String colorText) {
        this.colorText = colorText;
    }

    public String getColorTitle() {
        return colorTitle;
    }

    public void setColorTitle(String colorTitle) {
        this.colorTitle = colorTitle;
    }
}
