package lesson5.computer;

public class Card {
    private String manufacturer;
    private String cardType;
    private double memory;
    private double formFactor;

    public Card(String manufacturer, String cardType, double memory, double formFactor) {
        this.manufacturer = manufacturer;
        this.cardType = cardType;
        this.memory = memory;
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        return "Card{" +
                "manufacturer='" + manufacturer + '\'' +
                ", cardType='" + cardType + '\'' +
                ", memory=" + memory +
                ", formFactor=" + formFactor +
                '}';
    }
}