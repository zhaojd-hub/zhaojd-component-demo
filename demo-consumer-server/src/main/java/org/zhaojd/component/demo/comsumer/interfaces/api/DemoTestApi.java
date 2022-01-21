package org.zhaojd.component.demo.comsumer.interfaces.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zhaojd.component.demo.provider.client.api.ExampleBaseInfoApi;
import org.zhaojd.component.demo.provider.client.dto.resp.ExampleBaseInfoResp;

import lombok.extern.slf4j.Slf4j;

/**
 * @author jdzhao2
 */
@Slf4j
@RestController
public class DemoTestApi extends BaseOpenApi {
    
    @Autowired
    private ExampleBaseInfoApi exampleBaseInfoApi;
    
    @GetMapping("/invokeConsumer")
    public ExampleBaseInfoResp invokeConsumer() {
        ExampleBaseInfoResp resp = exampleBaseInfoApi.getById(1L);
        log.info("请求参数：{}, 响应：{}", 1L, JsonUtils.toJSONString(resp));
        return resp;
    }
}