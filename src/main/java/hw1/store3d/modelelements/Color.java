package hw1.store3d.modelelements;

public class Color {
    //region Constructors

    public Color(String colorName) {
        this.colorName = colorName;
    }

    //endregion

    //region Public Properties
    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
    //endregion

    //region Fields
    private String colorName;
    //endregion
}
