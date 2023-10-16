package hw1.store3d.modelelements;

import java.util.Collection;

public class Poligon {

    //region Constructors
    public Poligon(Collection<Point3D> points) {
        this.points = points;
    }

    //endregion
    public Collection<Point3D> getPoints() {
        return points;
    }


    //region Fields
    private Collection<Point3D> points;
    //endregion
}
