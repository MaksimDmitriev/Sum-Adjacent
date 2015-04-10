package careepcup.fb.sumadj;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

    @Test
    public void testFindSum() {
        // k exists in the input array

        // It's the first element
        assertTrue(Main.findSum(new int[] { 15, 4, 6, 10, 2, 11 }, 15));
        // It's in the middle
        assertTrue(Main.findSum(new int[] { 1, 4, 15, 10, 2, 11 }, 15));
        // It's the last element
        assertTrue(Main.findSum(new int[] { 1, 4, 0, 10, 2, 15 }, 15));

        // k equals to the sum of a few elements

        // The elements are at the beginning
        assertTrue(Main.findSum(new int[] { 10, 4, 4, 10, 2, 16 }, 14));

        // The elements are at the middle
        assertTrue(Main.findSum(new int[] { 1, 4, 4, 10, 2, 16 }, 14));

        // The elements are at the end
        assertTrue(Main.findSum(new int[] { 1, 4, 4, 1, 1, 13 }, 14));

        // k is the sum of all the elements
        assertTrue(Main.findSum(new int[] { 1, 4, 4, 1, 4 }, 14));

        // There is an element which is greater than k
        // It's in the middle
        assertFalse(Main.findSum(new int[] { 1, 42, 4, 1, 4 }, 14));

        // It's the first element
        assertFalse(Main.findSum(new int[] { 42, 1, 4, 1, 4 }, 14));

        // It's the last element
        assertFalse(Main.findSum(new int[] { 1, 0, 4, 1, 42 }, 14));

        // Last but one
        assertFalse(Main.findSum(new int[] { 1, 0, 4, 144, 12 }, 14));

        // Worst case
        assertTrue(Main.findSum(new int[] { 1, 3, 4, 1, 0, 23 }, 23));

        // a[i] is greater than k, and there is the exact sum then
        assertTrue(Main.findSum(new int[] { 10, 8, 1 }, 9));
        // a[i] is greater than k, and there is the exact sum then
        assertTrue(Main.findSum(new int[] { 20, 15 }, 15));
        // k==0
        assertTrue(Main.findSum(new int[] { 20, 15 }, 0));

    }

}
