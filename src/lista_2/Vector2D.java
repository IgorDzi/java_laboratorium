package lista_2;

import java.util.Objects;

public class Vector2D {
    protected final double x;
    protected final double y;

    /**
     * @param x Współrzędna x wektora
     * @param y Współrzędna y wektora
     */
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


    /**
     * @return Zwraca moduł/długość wektora
     */
    public double module() {
        return Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);
    }


    /**
     * @param addend Wektor do dodania
     * @return Wektor po dodaniu do niego podanego wektora
     */
    public Vector2D add(Vector2D addend) {
        return new Vector2D(x + addend.getX(), y + addend.getY());

    }

    /**
     * @param number Wektor 1
     * @param addend Wektor 2
     * @return Wektor, który jest suma dwóch wektorów
     */
    public static Vector2D add(Vector2D number, Vector2D addend){
        return number.add(addend);
    }

    /**
     * @param minuend Wektor do odjęcia
     * @return Wektor po odjęciu podanego wektora
     */
    public Vector2D subtract(Vector2D minuend){
        return new Vector2D(x - minuend.getX(), y - minuend.getY());
    }

    /**
     * @param number Wektor 1
     * @param minuend Wektor 2
     * @return Różnica podanych wektorów
     */
    public static  Vector2D subtract(Vector2D number, Vector2D minuend){
        return number.subtract(minuend);
    }

    /**
     * @param value stała, przez która pomnożyć wektor
     * @return wektor po przemnożeniu
     */
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




