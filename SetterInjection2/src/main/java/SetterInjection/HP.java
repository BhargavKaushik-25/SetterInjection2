package SetterInjection;

public class HP implements Laptop
{
    private Processor processor;

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public void laptopInformation() {
        System.out.println("COMPANY NAME:- HEWLETT PACKARD");
        System.out.println("PRICE:-39999.99");
        System.out.println("-------------------------------");
    }

    @Override
    public void processorInformation() {
        processor.processorInformation();
    }
}
