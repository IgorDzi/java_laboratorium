package lista_2;

public class vector2D {
    double x;
    double y;

    public vector2D(double x, double y){
        this.x = x;
        this.y = y;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double module(){
        return Math.pow(Math.pow(x,2) + Math.pow(y,2), 0.5);
    }
    public vector2D add(vector2D addend){
        return new vector2D(x + addend.getX(), y + addend.getY());

    }

    public vector2D multiplication(double value) {
        return new vector2D(x * value, y * value);
    }

    {

    }
    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }

    public static void main(String[] args)
    {System.out.println(new vector2D(4,3).module());
        complexNumber z = (complexNumber) new complexNumber(1,1).add(new complexNumber(1,1));
        System.out.println(z);


    }
}

class complexNumber extends vector2D{

    public complexNumber(double x, double y) {
        super(x, y);
    }
    public double argument(){
        return Math.atan(y/x);
    }
    public String exponential(){
        return (module() + "e^(i" + argument() + ")");
    }
    @Override
    public String toString(){
        return  "z = " + x + " + " + (y + "i");
    }

}
