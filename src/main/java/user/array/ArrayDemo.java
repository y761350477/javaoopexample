package user.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 有数组A和B类型都是int, A的长度1000W, B的长度1500W, 求A和B的交集?
 * 思路:
 * 1.把长度小的数组放到HashSet里面(循环数组放入Set集合);
 * 2.遍历长度大的数组, 判断每个值在Set集合中是否存在, 如果存在放到Set2集合中;
 *
 * 核心点: 利用Set集合中的值无重复性的特点
 * 引申思考:
 *  1.并集、数组中含有重复的情况呢?
 *
 * @author YC
 * @create 2018/3/22 11:47.
 */
public class ArrayDemo {

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 7, 3, 6, 9};
        int[] array2 = new int[]{11, 7, 3, 16, 19};

        System.out.println("获取int[]结果:");
        for (Object o : getIntArray(array1, array2)) {
            System.out.print(o + "\t");
        }
        System.out.println("\n------------------");
        System.out.println("获取Set集合结果:");
        System.out.println(getSet(array1, array2));
    }

    /**
     * 获取交集的数组
     *
     * @author YC
     * @create 2018/3/22 12:14.
     */
    public static int[] getIntArray(int[] nums1, int[] nums2) {
        Set<Integer> set1, set2;
        set1 = new HashSet();
        for (int i : nums1) {
            set1.add(i);
        }

        set2 = new HashSet();
        for (int i : nums2) {
            if (set1.contains(i)) {
                set2.add(i);
            }
        }

        int[] result = new int[set2.size()];
        int i = 0;
        for (int n : set2) {
            result[i++] = n;
        }
        return result;
    }

    /**
     * 获取交集的Set集合
     *
     * @author YC
     * @create 2018/3/22 12:15.
     */
    public static Set getSet(int[] nums1, int[] nums2) {
        Set<Integer> set1, set2;
        set1 = new HashSet();
        for (int i : nums1) {
            set1.add(i);
        }

        set2 = new HashSet();
        for (int i : nums2) {
            if (set1.contains(i)) {
                set2.add(i);
            }
        }
        return set2;
    }

}