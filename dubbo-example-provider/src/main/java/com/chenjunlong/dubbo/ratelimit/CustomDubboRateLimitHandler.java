package com.chenjunlong.dubbo.ratelimit;

import com.alibaba.fastjson.JSONObject;
import com.github.jratelimit.filter.DubboRateLimitHandler;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenjunlong on 2018/7/19.
 */
@Component
public class CustomDubboRateLimitHandler implements DubboRateLimitHandler {

    @Override
    public Map<String, Integer> limitConfig() {
        Map<String, Integer> limitConfig = new HashMap<>();
        limitConfig.put("sayHello", 1);
        limitConfig.put("sayHello2", 1);
        limitConfig.put("sayHello3", 1);
        return limitConfig;
    }

    @Override
    public <T> T defaultValue(String interfaceName, String methodName, Object[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", "400");
        jsonObject.put("msg", "接口访问受限制2...");
        return (T) jsonObject.toJSONString();
    }
}
