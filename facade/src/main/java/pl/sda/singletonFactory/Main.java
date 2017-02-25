package pl.sda.singletonFactory;

import pl.sda.sort.Sort;
import pl.sda.sort.factory.SortTypeEnum;

import java.util.Arrays;

/**
 * Created by RENT on 2017-02-25.
 */
public class Main {
    public static void main(String[] args) {


        SortSingletonFactory factory = SortSingletonFactory.getInstance();
        Sort sort = factory.produce(SortTypeEnum.BUBBLE);
        int[] sortedArray = sort.sort(new int[]{312423, 5342, 543, 5664, 213, 123, 1});
        System.out.println(Arrays.toString(sortedArray));
    }
}
