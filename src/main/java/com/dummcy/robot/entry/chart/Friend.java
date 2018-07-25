package com.dummcy.robot.entry.chart;

import com.dummcy.robot.entry.common.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 微信好友列表
 * @author ningchengzeng
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "chart_friend")
public class Friend {

    @Id
    private String id;

    @DBRef
    private Account account;
    @DBRef
    private UserInfo userInfo;
}
