package SetterInjection;

public class Ryzen implements Processor
{

    @Override
    public void processorInformation() {
        System.out.println("PROCESSOR PROVIDED:- AMD RYZEN 5");
        System.out.println("COOL AND FAST BUT NOT EFFICIENT IN THE WEATHER OF INIDA");
    }
}
