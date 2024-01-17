/**
 * @author 一只羊驼
 * @date 2024/1/7
 */

package java_Basics.java_array;

public class work02 {
    public static void main(String args[]) {
        //随机生成10个整数 1-100，保存到数组，并倒序打印以及求平均值、最大值和下标，并查找里面是否有8
        int[] nums = new int[10];
        int sum = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("正序打印：");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("倒序打印：");
        //也可以直接将下标进行逆序 for(int i=nums.length-1;i>=0;i--)
        for (int i = 0; i <= nums.length / 2; i++) {
            int temp = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = nums[i];
            nums[i] = temp;
        }
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[index]) {
                index = i;
            }
        }
        System.out.println("最大值是：" + nums[index] + " 下标是：" + index + " 平均值是：" + sum / nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 8) {
                System.out.println("数组里有8！");
                break;
            } else {
                System.out.println("数组里没有8！");
                break;
            }
        }
    }
}
