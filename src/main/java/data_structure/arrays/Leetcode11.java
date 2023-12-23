package data_structure.arrays;

/**
 * 11. Container With Most Water
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 */

public class Leetcode11 {
    public int maxArea(int[] height) {
        if (height.length < 2) {
            return 0;
        }
        int left = 0;
        int right = height.length-1;
        int maxValue = 0;
        while (left < right) {
            int w = right - left;
            if (height[left] >= height[right]) {
                maxValue = Math.max(maxValue, w * height[right]);
                right--;
            } else {
                maxValue = Math.max(maxValue, w * height[left]);
                left++;
            }
        }
        return maxValue;
    }
}
