package com.olivejua.array;

/**
 * 빗물 트래핑
 * https://leetcode.com/problems/trapping-rain-water
 */
public class TrappingRainWater {

    public static void main(String[] args) {
//        int[] height = {1, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
//        int[] height = {2, 0, 2};
        int[] height = {1};

        TrappingRainWater _this = new TrappingRainWater();
        int result = _this.trap2(height);

        System.out.println(result);
    }

    public int trap1(int[] height) {
        int volume = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0, rightMax = 0;

        while (left <= right) {
            System.out.printf("=> left: %d, right: %d, volume: %d \n", left, right, volume);

            if (left == right) {
                if (Math.max(leftMax, rightMax) > height[left]) {
                    volume += Math.max(leftMax, rightMax) - height[left];
                }
                break;
            }

            if (height[left] > leftMax) {
                leftMax = height[left];
            } else {
                System.out.println("==> volume (from left) + " + (leftMax - height[left]));
                volume += leftMax - height[left];
            }

            if (height[right] > rightMax) {
                rightMax = height[right];
            } else {
                System.out.println("==> volume (from right) + " + (rightMax - height[right]));
                volume += rightMax - height[right];
            }


            System.out.printf("===> left Max: %d, rightMax: %d \n", leftMax, rightMax);

            if (leftMax <= rightMax) {
                left++;
            }

            if (rightMax <= leftMax) {
                right--;
            }
        }

        return volume;
    }

    public int trap2(int[] height) {
        int volume = 0;
        int left = 0;
        int right = height.length-1;
        int leftMax = height[left];
        int rightMax = height[right];

        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if (leftMax <= rightMax) {
                volume += leftMax - height[left];
                left += 1;
            } else {
                volume += rightMax - height[right];
                right -= 1;
            }
        }

        return volume;
    }
}
