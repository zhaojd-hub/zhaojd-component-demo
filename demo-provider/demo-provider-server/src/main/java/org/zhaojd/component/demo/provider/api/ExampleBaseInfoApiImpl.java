package org.zhaojd.component.demo.provider.api;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RestController;
import org.zhaojd.component.demo.provider.client.api.ExampleBaseInfoApi;
import org.zhaojd.component.demo.provider.client.dto.req.AddExampleBaseInfoReq;
import org.zhaojd.component.demo.provider.client.dto.resp.ExampleBaseInfoResp;

import lombok.extern.slf4j.Slf4j;

/**
 * @author jdzhao2
 */
@Slf4j
@RestController
public class ExampleBaseInfoApiImpl implements ExampleBaseInfoApi {
    
    @Override
    public void addExampleBaseInfo(AddExampleBaseInfoReq req) {
        log.info("新增示例基础信息接口处理成功");
    }
    
    @Override
    public ExampleBaseInfoResp getById(long id) {
        log.info("根据id获取对象信息成功");
        return new ExampleBaseInfoResp().setId(Long.MAX_VALUE)
                .setName("测试feign接口调用")
                .setNum(Integer.SIZE)
                .setCreateTime(LocalDateTime.now())
                .setModifiedTime(LocalDateTime.now());
    }
}