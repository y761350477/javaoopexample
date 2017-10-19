package com.yc.string;

import java.util.ArrayList;
import java.util.List;

public class JustTest1 {
    public static void main(String[] args) {
        /*
         * YC_TODO:
         * 2017/9/15
         *
         * 测试List集合中存放Bean对象的排序
         */
        List<JustBean> beanList = new ArrayList<JustBean>();
        JustBean justBean = new JustBean();
        justBean.setLabelName("上访");
        justBean.setCaseNum(12);
        justBean.setDataNum(1);
        justBean.setSuspectNum(0);
        beanList.add(justBean);

        JustBean justBean1 = new JustBean();
        justBean1.setLabelName("暴恐");
        justBean1.setCaseNum(12);
        justBean1.setDataNum(1);
        justBean1.setSuspectNum(0);
        beanList.add(justBean1);

        JustBean justBean2 = new JustBean();
        justBean2.setLabelName("走私");
        justBean2.setCaseNum(122);
        justBean2.setDataNum(11);
        justBean2.setSuspectNum(2);
        beanList.add(justBean2);

        JustBean justBean3 = new JustBean();
        justBean3.setLabelName("走私金丝猴");
        justBean3.setCaseNum(122);
        justBean3.setDataNum(111);
        justBean3.setSuspectNum(2);
        beanList.add(justBean3);

        JustBean justBean4 = new JustBean();
        justBean4.setLabelName("贩毒");
        justBean4.setCaseNum(12);
        justBean4.setDataNum(123);
        justBean4.setSuspectNum(0);
        beanList.add(justBean4);

        JustBean justBean5 = new JustBean();
        justBean5.setLabelName("嫖娼");
        justBean5.setCaseNum(12);
        justBean5.setDataNum(1);
        justBean5.setSuspectNum(0);
        beanList.add(justBean5);

        for (int i = 0; i < beanList.size() - 1; i++) {
            for (int j = 0; j < beanList.size() - 1 - i; j++) {
                int caseNum = beanList.get(j).getCaseNum();
                int dataNum = beanList.get(j).getDataNum();
                int suspectNum = beanList.get(j).getSuspectNum();

                int caseNum1 = beanList.get(j + 1).getCaseNum();
                int dataNum1 = beanList.get(j + 1).getDataNum();
                int suspectNum1 = beanList.get(j + 1).getSuspectNum();
                if ((caseNum + dataNum + suspectNum) < (caseNum1 + dataNum1 + suspectNum1)) {
                    JustBean strTemp = new JustBean();
                    strTemp.setLabelName(beanList.get(j).getLabelName());
                    strTemp.setCaseNum(caseNum);
                    strTemp.setDataNum(dataNum);
                    strTemp.setSuspectNum(suspectNum);

                    beanList.get(j).setLabelName(beanList.get(j + 1).getLabelName());
                    beanList.get(j).setCaseNum(caseNum1);
                    beanList.get(j).setDataNum(dataNum1);
                    beanList.get(j).setSuspectNum(suspectNum1);

                    beanList.get(j + 1).setLabelName(strTemp.getLabelName());
                    beanList.get(j + 1).setCaseNum(strTemp.getCaseNum());
                    beanList.get(j + 1).setDataNum(strTemp.getDataNum());
                    beanList.get(j + 1).setSuspectNum(strTemp.getSuspectNum());
                }
            }
        }

        for (JustBean bean : beanList) {
            System.out.println("------YC------bean.getLabelName()的值 = " + bean.getLabelName() + ", " + "当前类 = JustTest1, 当前方法 = main;");
            System.out.println("------YC------bean.getCaseNum()的值 = " + bean.getCaseNum() + ", " + "当前类 = JustTest1, 当前方法 = main;");
            System.out.println("------YC------bean.getDataNum()的值 = " + bean.getDataNum() + ", " + "当前类 = JustTest1, 当前方法 = main;");
            System.out.println("------YC------bean.getSuspectNum()的值 = " + bean.getSuspectNum() + ", " + "当前类 = JustTest1, 当前方法 = main;");
            System.out.println();
        }

    }
}
