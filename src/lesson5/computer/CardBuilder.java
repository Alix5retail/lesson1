package lesson5.computer;

public class CardBuilder {
    private String manufacturer;
    private String cardType;
    private double memory;
    private double formFactor;

    public CardBuilder withManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public CardBuilder withCardType(String cardType) {
        this.cardType = cardType;
        return this;
    }

    public CardBuilder withMemory(double memory) {
        this.memory = memory;
        return this;
    }

    public CardBuilder withFormFactor(double formFactor) {
        this.formFactor = formFactor;
        return this;
    }

    public Card build() {
        return new Card(manufacturer, cardType, memory, formFactor);
    }
}