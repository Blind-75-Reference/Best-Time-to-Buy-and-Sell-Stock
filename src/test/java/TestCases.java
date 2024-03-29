import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCases {
    Solution solution = new Solution();

    @Test
    public void testCase1() {
        int[] prices = new int[]{7,1,5,3,6,4};
        int expected = 5;

        Assertions.assertEquals(expected, solution.maxProfit(prices));

    }

    @Test
    public void testCase2() {
        int[] prices = new int[]{7,6,4,3,1};
        int expected = 0;

        Assertions.assertEquals(expected, solution.maxProfit(prices));

    }
}
