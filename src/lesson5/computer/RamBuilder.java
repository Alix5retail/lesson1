package lesson5.computer;

public class RamBuilder {
    private String manufacturer;
    private String memoryType;
    private double memory;
    private double frequency;

    public RamBuilder withManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public RamBuilder withMemoryType(String memoryType) {
        this.memoryType = memoryType;
        return this;
    }

    public RamBuilder withMemory(double memory) {
        this.memory = memory;
        return this;
    }

    public RamBuilder withFrequency(double frequency) {
        this.frequency = frequency;
        return this;
    }

    public Ram build() {
        return new Ram(manufacturer, memoryType, memory, frequency);
    }
}
