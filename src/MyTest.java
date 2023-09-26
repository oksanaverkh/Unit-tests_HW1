import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyTest {
    @Test
    public void sumListsShouldBeCorrect() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> result = new ArrayList<>(Arrays.asList(2, 4, 6));

        List<Integer> resultTest = ListOperations.sumLists(list1, list2);
        assertEquals(result, resultTest, "Resulting list is not equal to correct list!");

    }

    @Test
    public void findMaxShouldBeCorrect() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 0, 5));
        int maxNumber = 5;
        int maxNumberTest = ListOperations.findMax(list1);
        assertEquals(maxNumber, maxNumberTest, "Maximum list element is incorrect");

    }

    @Test
    public void filterStringsShouldBeCorrect() {
        List<String> list1 = new ArrayList<>(
                Arrays.asList("one", "two", "three", "twelve", "eleven", "ten", "yyyyyyyyyyyy"));
        int minLength = 4;
        List<String> result = new ArrayList<>(Arrays.asList("three", "twelve", "eleven", "yyyyyyyyyyyy"));
        List<String> resultTest = ListOperations.filterStrings(list1, minLength);
        assertEquals(result, resultTest, "Resulting list is not equal to correct list!");

    }

}



