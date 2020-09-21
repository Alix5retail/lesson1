package lesson5.computer;

public class Processor {
    private double clockFrequency;
    private double numberOfCores;
    private double cacheMemory;
    private String name;
    private String manufacturer;

    public Processor(double clockFrequency, double numberOfCores, double cacheMemory, String name, String manufacturer) {
        this.clockFrequency = clockFrequency;
        this.numberOfCores = numberOfCores;
        this.cacheMemory = cacheMemory;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "clockFrequency=" + clockFrequency +
                ", numberOfCores=" + numberOfCores +
                ", cacheMemory=" + cacheMemory +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
