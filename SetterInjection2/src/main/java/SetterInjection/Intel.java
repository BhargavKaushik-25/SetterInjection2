package SetterInjection;

public class Intel implements Processor
{

    @Override
    public void processorInformation() {
        System.out.println("PROCESSOR PROVIDED :- INTEL i5 NEW GENERATION");
        System.out.println("FAST AND SECURE");
    }
}
