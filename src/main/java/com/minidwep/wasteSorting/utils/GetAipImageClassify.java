package com.minidwep.wasteSorting.utils;

import com.baidu.aip.imageclassify.AipImageClassify;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.UUID;

public  class GetAipImageClassify {
    //设置APPID/AK/SK
    private static final String APP_ID = "18552949";
    private static final String API_KEY = "8E0eN6lUQxPkQrsvyA7UDPGF";
    private static final String SECRET_KEY = "7P0oYl4GBGNzUPRzx0Ywf93vX0orrERY";
    private static GetAipImageClassify instance;
    public static AipImageClassify client;
    private static String uuid;
    private GetAipImageClassify (){
        client = new AipImageClassify(APP_ID, API_KEY, SECRET_KEY);
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        uuid = UUID.randomUUID().toString();
    }
    public static synchronized GetAipImageClassify getInit() {
        if (instance == null) {
            instance = new GetAipImageClassify();
        }
        return instance;
    }

    public static AipImageClassify getClient() {
        return client;
    }
    public static String getUuid() {
        return uuid;
    }


    public static void main(String[] args) {
//        GetAipImageClassify instance = GetAipImageClassify.getInit();
//        // 传入可选参数调用接口
//        HashMap<String, String> options = new HashMap<String, String>();
//        options.put("baike_num", "5");
//        // 参数为本地路径
//        String image = "E:\\Photos\\1.jpg";
//        JSONObject res = instance.client.advancedGeneral(image, options);
//        System.out.println(res.toString(2));

    }
}