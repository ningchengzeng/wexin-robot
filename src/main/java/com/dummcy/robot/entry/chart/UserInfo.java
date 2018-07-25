package com.dummcy.robot.entry.chart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 微信账户信息
 * @author ningchengzeng
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "chart_userinfo")
public class UserInfo {

    @Id
    private String id;
    private String username;
    private String usernick;
    private String indexUrl;
}
