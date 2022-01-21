package org.zhaojd.component.demo.provider.client.dto.resp;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author jdzhao2
 */
@Data
@Accessors(chain = true)
public class ExampleBaseInfoResp implements Serializable {
    
    private static final long serialVersionUID = 4844604049928815848L;
    
    /**
     * 主键id
     */
    private Long id;
    
    /**
     * 编号
     */
    private Integer num;
    
    /**
     * 名称
     */
    private String name;
    
    /**
     * 修改时间
     */
    private LocalDateTime modifiedTime;
    
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
}