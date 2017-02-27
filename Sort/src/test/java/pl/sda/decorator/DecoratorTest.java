package pl.sda.decorator;

import org.junit.Assert;
import org.junit.Test;
import pl.sda.sort.Sort;
import pl.sda.sort.impl.BubbleSort;

public class DecoratorTest {
    @Test
    public void testDecorator() {
        Sort sort = new BubbleSort();
        int[] arrayToSort = new int[]{55, 33, 77, 1, -33, 0, -222, 5, -111};

        SortDecoratorWithReverse decoratorSort = new SortDecoratorWithReverse(new BubbleSort());

        //when
        int[] result = decoratorSort.sort(arrayToSort);

        //then
        Assert.assertEquals(77, result[0]);
        Assert.assertEquals(-222, result[result.length - 1]);
    }
}
