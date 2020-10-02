package com;

import java.util.Scanner;

public class TwoSums {

    public static int[] twoSum(int[] nums, int target) {
        int[] label = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            int tmp = target - nums[i];
            for (int j = i; j < nums.length; j++) {
                if (tmp == nums[j]) {
                    label[0] = i;
                    label[1] = j;
                }
            }
        }
        return label;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int target = scanner.nextInt();
        int[] nums = {a, b, c, d};
        int[] label = twoSum(nums, target);
        System.out.println(label[0] + ":" + label[1]);


    }
}
