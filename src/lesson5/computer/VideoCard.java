package lesson5.computer;

public class VideoCard {
    private String manufacturer;
    private String memoryType;
    private String cooler;
    private double memory;

    public VideoCard(String manufacturer, String memoryType, String cooler, double memory) {
        this.manufacturer = manufacturer;
        this.memoryType = memoryType;
        this.cooler = cooler;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "VideoCard{" +
                "manufacturer='" + manufacturer + '\'' +
                ", memoryType='" + memoryType + '\'' +
                ", cooler='" + cooler + '\'' +
                ", memory=" + memory +
                '}';
    }
}