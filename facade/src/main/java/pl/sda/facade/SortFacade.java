package pl.sda.facade;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import pl.sda.observer.Observer;
import pl.sda.sort.Sort;
import pl.sda.sort.factory.SortFactory;
import pl.sda.sort.impl.CountSort;
import pl.sda.sort.impl.InsertSort;

public class SortFacade {
    private Observer observer = null;

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
            if (arrayToSort[i] < arrayToSort.length && observer != null) {
                int tmp=arrayToSort[i];
                arrayToSort[i] = Math.abs(arrayToSort[i]);
                observer.react(tmp);
            }
        }
        return sort.sort(arrayToSort);
    }
}
