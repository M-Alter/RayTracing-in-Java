package primitives;

import java.util.Objects;

public class Ray {

    Point3D p0;
    Vector dir;

    public Ray(Point3D pnt, Vector vec){
        p0 = new Point3D(pnt._x, pnt._y, pnt._z);
        dir = vec.normalized();
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ray ray = (Ray) o;
        return p0.equals(ray.p0) && dir.equals(ray.dir);
    }

    private Point3D getP0() {
        return p0;
    }

    private Vector getDir() {
        return dir;
    }

    @Override
    public String toString() {
        return  "p0 = " + p0.toString() +
                ", dir = " + dir;
    }
}