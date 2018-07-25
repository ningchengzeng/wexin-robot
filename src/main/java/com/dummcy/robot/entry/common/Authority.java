package com.dummcy.robot.entry.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "com_authority")
public class Authority {

    @Id
    private String id;
    //币关注信息
    private Coin coin = new Coin();
    //是否开启对应数据分析权限
    private Map<String, Boolean> analyse;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Coin{
        private Integer count;                          //关注币的个数
        private List<String> pairs = new ArrayList<>(); //关注交易对
    }
}
