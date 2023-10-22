package lista_2;

class ComplexNumber extends Vector2D {

    public ComplexNumber(double x, double y) {
        super(x, y);
    }

    private ComplexNumber(Vector2D vektor) {
        super(vektor.getX(), vektor.getY());
    }

    public double argument() {
        return Math.atan(y / x);
    }

    public String exponential() {
        return (module() + "e^(i" +  argument() + ")");
    }


    public ComplexNumber pow(int power){
        double real = Math.pow(module(), power) * (Math.cos(power * argument()));
        double imaginary = Math.pow(module(), power) * (Math.sin(power * argument()));
        return new ComplexNumber(Math.round(real), Math.round(imaginary)); //No ideal
    }
    public static ComplexNumber pow(ComplexNumber number, int power){
        double real = Math.pow(number.module(), power) * Math.cos(power * number.argument());
        double imaginary = Math.pow(number.module(), power) * Math.sin(power * number.argument());
        return new ComplexNumber(Math.round(real), Math.round(imaginary));//No ideal
    }



    @Override
    public Vector2D add(Vector2D addend) {
        return new ComplexNumber(super.add(addend));
    }

    @Override
    public Vector2D subtract(Vector2D minuend){
        return new ComplexNumber(super.add(minuend));
    }

    @Override
    public Vector2D multiplication(double value) {
        return new ComplexNumber(super.multiplication(value));
    }

    @Override
    public String toString() {
        return "z = " + x + " + " + (y + "i");
    }


}