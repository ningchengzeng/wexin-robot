package com.dummcy.robot.entry.chart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 微信群组信息
 * @author ningchengzeng
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "chart_group")
public class Group {

    @Id
    private String id;

    @DBRef
    private UserInfo userInfo;
}
