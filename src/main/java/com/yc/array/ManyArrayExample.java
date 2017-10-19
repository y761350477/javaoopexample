package com.yc.array;

public class ManyArrayExample {
    public static void main(String[] args) {
        String[][] strArray = new String[1][2];
        String strArray2[][] = new String[1][2];
        String[][] strArray3 = new String[][]{{"1", "2", "3"}, {"11", "22", "33"}};
        String[][] strArray4 = {{"1", "2", "3"}, {"11", "22", "33"}};

        System.out.println(strArray.length);
        System.out.println(strArray2.length);
        System.out.println(strArray3.length);
        System.out.println(strArray4.length);
        System.out.println("-----------------");
        strArray[0][0] = "str0";
        strArray[0][1] = "str1";
        System.out.println(strArray[0][0]);
        System.out.println(strArray[0][1]);

        /*遍历多维数组的长度*/
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[i].length; j++) {
                System.out.println(strArray[i][j]);
            }
        }

    }
}
