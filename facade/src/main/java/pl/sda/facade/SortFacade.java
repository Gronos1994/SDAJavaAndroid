package pl.sda.facade;

import pl.sda.pl.sda.observer.Observer;
import pl.sda.sort.Sort;
import pl.sda.sort.impl.CountSort;
import pl.sda.sort.impl.InsertSort;

public class SortFacade {
    private Observer observer;

    public SortFacade() {
    }

    public SortFacade(Observer observer) {
        this.observer = observer;
    }

    public int[] sortThroughFacade(int[] arrayToSort) {
        Sort sort = new InsertSort();
        return sort.sort(arrayToSort);
    }

    public int[] sortUsingCountSort(int[] arrayToSort) {
        Sort sort = new CountSort();
        for (int i = 0; i < arrayToSort.length; i++) {


            if (arrayToSort[i] < 0 && observer != null) {
                int temp = arrayToSort[i];
                arrayToSort[i] = Math.abs(arrayToSort[i]);
                observer.react(temp);

            }
        }
        return sort.sort(arrayToSort);
    }
}