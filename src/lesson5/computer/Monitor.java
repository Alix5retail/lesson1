package lesson5.computer;

public class Monitor {
    private String name;
    private String manufacturer;
    private String resolution;

    public Monitor(String name, String manufacturer, String resolution) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", resolution='" + resolution + '\'' +
                '}';
    }
}