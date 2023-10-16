package hw1.store3d.modelelements;

public class Camera {
    //region Methods
    public void Rotate(Angle3D newAngle){
        this.angle = newAngle;
        System.out.println("The camera was rotated");
    }

    public void Move(Point3D newPoint){
        this.location = newPoint;
        System.out.println("The camera was moved");
    }
    //endregion

    //region Constructors

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    //endregion

    //region Public Properties

    public Point3D getLocation() {
        return location;
    }

    public void setLocation(Point3D location) {
        this.location = location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    //endregion

    //region Fields
    private Point3D location;
    private Angle3D angle;
    //endregion

}
