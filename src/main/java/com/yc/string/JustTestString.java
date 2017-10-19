package com.yc.string;

import java.util.ArrayList;
import java.util.List;

public class JustTestString {
    public static void main(String[] args) {
        String strInfo = "袁青海 &lt;13928231359@163.com.cn&gt;;\"86704841@qq.com\" &lt;86704841@qq.com&gt;@126.com;@126.com,@152.com;@163.com;@163.com;@163.com";
        String[] strData = strInfo.split("@");
        List<String> getStr = new ArrayList<>();
        List<Str> beanStr = new ArrayList<Str>();
        for (int i = 1; i < strData.length; i++) {
            String[] strData2 = strData[i].split("\\.c");
            String str2 = strData2[0];
            getStr.add(str2);
        }

        for (String string : getStr) {
            if (beanStr.size() > 0) {
                int flag = 0;
                for (int i = 0; i < beanStr.size(); i++) {
                    if (string.equals(beanStr.get(i).getType())) {
                        beanStr.get(i).setNum(beanStr.get(i).getNum() + 1);
                        flag = 1;
                    }
                }

                if (flag == 0) {
                    Str str = new Str();
                    str.setType(string);
                    str.setNum(1);
                    beanStr.add(str);
                }
            } else {
                Str str = new Str();
                str.setType(string);
                str.setNum(1);
                beanStr.add(str);
            }
        }

        for (int i = 0; i < beanStr.size() - 1; i++) {
            for (int j = 0; j < beanStr.size() - 1 - i; j++) {
                if (beanStr.get(j).getNum() < beanStr.get(j + 1).getNum()) {
                    Str strTemp = new Str();
                    strTemp.setType(beanStr.get(j).getType());
                    strTemp.setNum(beanStr.get(j).getNum());
                    beanStr.get(j).setType(beanStr.get(j + 1).getType());
                    beanStr.get(j).setNum(beanStr.get(j + 1).getNum());
                    beanStr.get(j + 1).setType(strTemp.getType());
                    beanStr.get(j + 1).setNum(strTemp.getNum());
                }
            }
        }

        for (Str getSort : beanStr
                ) {
            System.out.println(getSort.getType() + "\t命中次数:" + getSort.getNum());
        }

    }

}
