package lesson5.computer;

public class MonitorBuilder {
    private String name;
    private String manufacturer;
    private String resolution;

    public MonitorBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public MonitorBuilder withManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public MonitorBuilder withResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }

    public Monitor build() {
        return new Monitor(name, manufacturer, resolution);
    }
}