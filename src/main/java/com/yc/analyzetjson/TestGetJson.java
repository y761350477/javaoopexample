package com.yc.analyzetjson;

import net.sf.json.JSONObject;

public class TestGetJson {
    public static void main(String[] args) {

        String jsonStr = "{\n" +
                "    \"appid\": \"wxfb437ba8beb02046\",\n" +
                "    \"attach\": \"1;30;1\",\n" +
                "    \"bank_type\": \"CFT\",\n" +
                "    \"cash_fee\": \"1\",\n" +
                "    \"fee_type\": \"CNY\",\n" +
                "    \"is_subscribe\": \"Y\",\n" +
                "    \"mch_id\": \"1488006732\",\n" +
                "    \"nonce_str\": \"201709231237078964\",\n" +
                "    \"openid\": \"oq2WYuKMyQuVm_QZ9lPb85oPFjeU\",\n" +
                "    \"out_trade_no\": \"1506141427700\",\n" +
                "    \"result_code\": \"SUCCESS\",\n" +
                "    \"return_code\": \"SUCCESS\",\n" +
                "    \"sign\": \"DA2BCC513B876B3B90AFF1067738E21A\",\n" +
                "    \"time_end\": \"20170923123719\",\n" +
                "    \"total_fee\": \"1\",\n" +
                "    \"trade_type\": \"JSAPI\",\n" +
                "    \"transaction_id\": \"4200000027201709233740269862\"\n" +
                "}";

        JSONObject json_test = JSONObject.fromObject(jsonStr);
        System.out.println();
        System.out.println(json_test.get("attach"));
        String str = json_test.get("attach").toString();
        String[] strList = str.split(";");
        System.out.println("------YC------strList[0]的值 = " + strList[0] + ", " + "当前类 = TestGetJson, 当前方法 = main;");
        System.out.println("------YC------strList[1]的值 = " + strList[1] + ", " + "当前类 = TestGetJson, 当前方法 = main;");
        System.out.println("------YC------strList[2]的值 = " + strList[2] + ", " + "当前类 = TestGetJson, 当前方法 = main;");

        /*String json = "{\"2\":\"efg\",\"1\":\"abc\"}";
        JSONObject json_test1 = JSONObject.fromObject(json);
        System.out.println(json_test1.getString("1"));*/
    }
}
