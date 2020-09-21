package lesson5.computer;

public class ProcessorBuilder {
    private double clockFrequency;
    private double numberOfCores;
    private double cacheMemory;
    private String name;
    private String manufacturer;

    public ProcessorBuilder withClockFrequency(double clockFrequency) {
        this.clockFrequency = clockFrequency;
        return this;
    }

    public ProcessorBuilder withNumberOfCores(double numberOfCores) {
        this.numberOfCores = numberOfCores;
        return this;
    }

    public ProcessorBuilder withCacheMemory(double cacheMemory) {
        this.cacheMemory = cacheMemory;
        return this;
    }

    public ProcessorBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public ProcessorBuilder withManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public Processor build(){
        return new Processor(clockFrequency, numberOfCores, cacheMemory, name, manufacturer);
    }
}
