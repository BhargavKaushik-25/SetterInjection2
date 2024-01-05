package SetterInjection;

public class Dell implements Laptop
{
    private Processor processor;

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public void laptopInformation() {
        System.out.println("COMPANY NAME:- DELL");
        System.out.println("PRICE:-54999.99");
        System.out.println("----------------------");
    }

    @Override
    public void processorInformation() {
        processor.processorInformation();
    }
}
