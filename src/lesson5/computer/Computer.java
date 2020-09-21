package lesson5.computer;

public class Computer {
    private ProcessorBuilder processorBuilder;
    private RamBuilder ramBuilder;
    private VideoCardBuilder videoCardBuilder;
    private CardBuilder cardBuilder;
    private MonitorBuilder monitorBuilder;

    public Computer() {
        this.processorBuilder = new ProcessorBuilder();
        this.ramBuilder = new RamBuilder();
        this.videoCardBuilder = new VideoCardBuilder();
        this.cardBuilder = new CardBuilder();
        this.monitorBuilder = new MonitorBuilder();
    }

    public void turnOn(){
        Processor processor = processorBuilder.withClockFrequency(3100).withNumberOfCores(4).withCacheMemory(11).withName("AMD Athlon X4 840").withManufacturer("AMD").build();
        Ram ram = ramBuilder.withManufacturer("AMD").withMemory(16).withFrequency(2666).withMemoryType("DDR4").build();
        VideoCard videoCard = videoCardBuilder.withManufacturer("AMD").withMemoryType("GDDR5").withMemory(8).withCooler("Active").build();
        Card card = cardBuilder.withManufacturer("Samsung").withMemory(500).withCardType("SSD").withFormFactor(3.5).build();
        Monitor monitor = monitorBuilder.withName("S11").withManufacturer("SAMSUNG").withResolution("4K").build();

        System.out.println(processor);
        System.out.println(ram);
        System.out.println(videoCard);
        System.out.println(card);
        System.out.println(monitor);
    }
}