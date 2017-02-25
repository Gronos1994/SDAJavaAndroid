package pl.sda.mvc.mvc.view;

import pl.sda.mvc.mvc.controller.Controller;

import java.util.Scanner;

/**
 * Created by RENT on 2017-02-25.
 */
public class View {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            Integer choice = scanner.nextInt();
            Controller controller = new Controller();
            if (choice != null && choice > 0) {
                int result = controller.getFibValue(choice);
                System.out.println("FIB = " + result);
            } else {
                System.out.println("AVG = " + controller.average());
            }
        }
    }
}
