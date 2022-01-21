package org.zhaojd.component.demo.provider.client.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zhaojd.component.demo.provider.client.dto.req.AddExampleBaseInfoReq;
import org.zhaojd.component.demo.provider.client.dto.resp.ExampleBaseInfoResp;

/**
 * @author jdzhao2
 */
@RequestMapping("/exampleBaseInfo")
@FeignClient(value = "demo-provider-server")
public interface ExampleBaseInfoApi {
    
    /**
     * 新增对象
     *
     * @param req 请求传输对象
     */
    @PostMapping("/addExampleBaseInfo")
    void addExampleBaseInfo(@RequestBody AddExampleBaseInfoReq req);
    
    /**
     * 根据id获取对象
     *
     * @param id 主键id
     * @return 响应传输对象
     */
    @GetMapping("/getById")
    ExampleBaseInfoResp getById(@RequestParam(value = "id") long id);
}