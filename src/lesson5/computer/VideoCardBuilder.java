package lesson5.computer;

public class VideoCardBuilder {
    private String manufacturer;
    private String memoryType;
    private String cooler;
    private double memory;

    public VideoCardBuilder withManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public VideoCardBuilder withMemoryType(String memoryType) {
        this.memoryType = memoryType;
        return this;
    }

    public VideoCardBuilder withCooler(String cooler) {
        this.cooler = cooler;
        return this;
    }

    public VideoCardBuilder withMemory(double memory) {
        this.memory = memory;
        return this;
    }

    public VideoCard build() {
        return new VideoCard(manufacturer, memoryType, cooler, memory);
    }
}