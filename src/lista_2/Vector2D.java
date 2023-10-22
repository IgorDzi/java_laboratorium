package lista_2;

import java.util.Objects;

public class Vector2D {
    protected final double x;
    protected final double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double module() {
        return Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);
    }


    public Vector2D add(Vector2D addend) {
        return new Vector2D(x + addend.getX(), y + addend.getY());

    }
    public static Vector2D add(Vector2D number, Vector2D addend){
        return number.add(addend);
    }
    public Vector2D subtract(Vector2D minuend){
        return new Vector2D(x - minuend.getX(), y - minuend.getY());
    }
    public static  Vector2D subtract(Vector2D number, Vector2D minuend){
        return number.subtract(minuend);
    }
    public Vector2D multiplication(double value) {

        return new Vector2D(x * value, y * value);
    }
    public static  Vector2D multiplication(Vector2D number, double value){
        return number.multiplication(value);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector2D vector2D = (Vector2D) o;
        return Double.compare(x, vector2D.x) == 0 && Double.compare(y, vector2D.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }


}




