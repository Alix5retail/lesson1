package lesson5.computer;

public class Ram {
    private String manufacturer;
    private String memoryType;
    private double memory;
    private double frequency;

    public Ram(String manufacturer, String memoryType, double memory, double frequency) {
        this.manufacturer = manufacturer;
        this.memoryType = memoryType;
        this.memory = memory;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "manufacturer='" + manufacturer + '\'' +
                ", memoryType='" + memoryType + '\'' +
                ", memory=" + memory +
                ", frequency=" + frequency +
                '}';
    }
}
