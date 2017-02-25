package pl.sda.facade;


import pl.sda.sort.Sort;
import pl.sda.sort.impl.InsertSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort insertSort = new InsertSort();

        int[] tab = new int[]{231, 3421, 1, 21, 4,};
        SortFacada sort = new SortFacada();
        int [] result = sort.sortThroughFacade(tab);
        System.out.println(Arrays.toString(result));
    }
}
