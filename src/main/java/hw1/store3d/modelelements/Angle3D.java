package hw1.store3d.modelelements;

public class Angle3D {


    //region Constructors

    public Angle3D(Float degrees) {
        this.degrees = degrees;
    }

    //endregion

    //region Public Properties

    public Float getDegrees() {
        return degrees;
    }

    public void setDegrees(Float degrees) {
        this.degrees = degrees;
    }

    //endregion

    //region Fields
    private Float degrees;
    //endregion

}

