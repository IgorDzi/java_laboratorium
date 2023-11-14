package lista_4.main;

public class ComplexNumber extends Vector2D {

    /**
     * @param x - część rzeczywista liczby zespolonej
     * @param y - część urojona liczby zespolonej
     */
    public ComplexNumber(double x, double y) {
        super(x, y);
    }
    public ComplexNumber(String number){
        super(parseNumber(number)[0], parseNumber(number)[1]);

    }
    private ComplexNumber(Vector2D vektor) {
        super(vektor.getX(), vektor.getY());
    }

    /**
     * @param number liczba urojona jako tekst
     * @return Odpowiednią wartość Input w zależności od postaci liczby urojonej
     */
    private static Input checkInput(String number){
        String s = number.replaceAll("\\s+", "");
        int plusCount = (int) s.chars().filter(ch -> ch == '+').count();
        int iCount = (int) s.chars().filter(ch -> ch == 'i').count();
        if (!s.matches("[0-9.+i\\-]+") || plusCount>1 || iCount>1){
            return Input.INCORRECT;
        }
        if (plusCount == 0){
            if (iCount == 0){
                return Input.ONLYREAL;
            }
            else {
                return Input.ONLYIMAGINARY;
            }
        }
        else {
            return Input.REALANDIMAGINARY;
        }
    }

    /**
     * @param number liczba urojona w postaci tekstu
     * @return zmieniona liczba urojona na parametry do utworzenia obiektu
     */
    private static double[] parseNumber(String number){
        String s = number.replaceAll("\\s+", "");
        switch (checkInput(s)){
                case ONLYREAL -> {
                return new double[]{Double.parseDouble(s), 0};
            }
            case ONLYIMAGINARY -> {
                return new double[]{0,Double.parseDouble(s.substring(1))};
            }
            case REALANDIMAGINARY -> {
                String[] half = s.split("[+]+");
                return new double[]{Double.parseDouble(half[0]), Double.parseDouble(half[1].substring(1))};
            }
            default -> throw new WrongInputException();
        }
    }

    /**
     * @return argument liczby zespolonej
     */
    public double argument() {
        return Math.atan(y / x);
    }

    /**
     * @return postać wykładnicza liczby zespolonej
     */
    public String exponential() {
        int roundInt = (int) (argument()*1000);
        double roundArgument = (double) roundInt /1000;
        return (module() + "e^(i" +  roundArgument + ")");
    }

    /**
     * @param power n-ta potęga liczby zespolonej
     * @return liczba zespolona podniesiona do n-tej potęgi
     */
    public ComplexNumber pow(double power){
        double real = Math.pow(module(), power) * (Math.cos(power * argument()));
        double imaginary = Math.pow(module(), power) * (Math.sin(power * argument()));
        return new ComplexNumber(real, imaginary);
    }
    public static ComplexNumber pow(ComplexNumber number, double power){
        double real = Math.pow(number.module(), power) * Math.cos(power * number.argument());
        double imaginary = Math.pow(number.module(), power) * Math.sin(power * number.argument());
        return new ComplexNumber(real, imaginary);
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