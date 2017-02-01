package pl.gawly;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void testEx1() {
        Assert.assertEquals(1, s.solution(new int[] {4, 1, 3, 2}));
    }

    @Test
    public void testEx2() {
        Assert.assertEquals(0, s.solution(new int[] {4, 1, 3}));
    }

    @Test
    public void testEx3() {
        Assert.assertEquals(0, s.solution(new int[] {10000000}));
    }
}
