package lista_3.zadanie_1;

public class PlywoodElement {
    private final int percentage;
    private final WoodType WoodType;

    public int getPercentage() {
        return percentage;
    }

    public WoodType getWoodType() {
        return WoodType;
    }

    public PlywoodElement(int percentage, WoodType WoodType) {
        this.percentage = percentage;
        this.WoodType = WoodType;
    }
}
