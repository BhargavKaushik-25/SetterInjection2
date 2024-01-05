package SetterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("1. HP");
        System.out.println("2. DELL");
        int choice = scanner.nextInt();

        Laptop laptop = null;

        if (choice == 1){
            laptop = context.getBean("hp", HP.class);
        } else if (choice == 2) {
            laptop = context.getBean("dell", Dell.class);
        }else {
            System.out.println("INVALID CHOICE");
        }

        if (laptop != null){
            laptop.laptopInformation();
            laptop.processorInformation();
        }
    }
}
