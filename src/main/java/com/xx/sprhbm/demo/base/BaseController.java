package com.xx.sprhbm.demo.base;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by wxiao on 2016/12/12.
 */
public class BaseController {
    
    public String success() {
        return this.success(null);        
    }
    
    public String success(Object result) {
        JSONObject resultJson = new JSONObject();
        resultJson.put("status", true);
        if( result != null) {
            resultJson.put("result", result);
        }
        return resultJson.toJSONString();
    }
    
}
