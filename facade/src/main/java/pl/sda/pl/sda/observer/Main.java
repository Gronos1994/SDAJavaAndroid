package pl.sda.pl.sda.observer;

import pl.sda.facade.SortFacade;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Observer observer = new Observer();
        SortFacade sortFacade = new SortFacade(observer);
        int[] input = new int[]{32432, 4212, 6,1,44, -1};
        int[] result = sortFacade.sortUsingCountSort(input);
        System.out.println(Arrays.toString(result));
    }
}
