package hw1.store3d.modelelements;

public class Flash {
    //region Methods
    public void Rotate(Angle3D newAngle){
        this.angle = newAngle;
        System.out.println("The flash was rotated");
    }

    public void Move(Point3D newPoint){
        this.location = newPoint;
        System.out.println("The flash was moved");
    }
    //endregion

    //region Constructors

    public Flash(Point3D location, Angle3D angle, Color color, Float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    //endregion

    //region Public Properties

    public Point3D getLocation() {
        return location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Float getPower() {
        return power;
    }

    public void setPower(Float power) {
        this.power = power;
    }
    //endregion

    //region Fields
    private Point3D location;
    private Angle3D angle;
    private  Color color;
    private Float power;
    //endregion
}
