package com.yc.string;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegSplitString {

    /**
     * 截取字符串中包含邮箱格式的内容，并把其放到List集合中
     * @param str
     * @return
     */
    private static List getEmailList(String str) {
        //在此维护域名后缀表
        String dn = "com|cn|org|com.cn|xyz|net|gg|gov.cn|love";
        Pattern p = Pattern.compile("[\\w[.-]]+@[\\w[.-]]+\\.(" + dn + ")"); //邮箱验证
        Matcher m = p.matcher(str);
        List<String> emailList = new ArrayList<String >();
        while (m.find()) {
            //update  2016-1-21 10:03:45
            //去除包涵连续两个点的邮箱
            System.out.println(m.group());
            String[] testStr = m.group().split("@");
            if(!m.group().contains("..")) {
                emailList.add(testStr[1]);
            }
        }
        return emailList;
    }

    public static void main(String args[]) {
        String str = "tencent.sf.gg@10000@qq.comghghghghg\n" +
                "你好leveychen，lev；levey-chen@myema你aaa@this.gov.cn好il.gmail.com悲" +
                "剧help@admin.sf.gg了" +
                "啊m@levey.com.cnmnihao的都是</br>和<sf@sf.gggame@google.com>";
        String str1 = "CZ庄/=E7=A9=BA=E8=BF=90=E4=B8=80=E4=BB=A3/=E4=B8=8A=E6=B5=B7=E7=A9=BA=E8=BF=90 &lt;jones@sinotechline.com&gt;shelly@bona-agro.com\"[RECEIVER_USERNAME]\" &lt;npfmmp@civicconcern.org&gt;shelly &lt;shelly@bona-agro.com&gt;andy &lt;andybsdgco1@126.com&gt;shelly@bona-agro.com\"DagangHalal.com\" &lt;";
        System.out.println(getEmailList(str1));
    }
}
