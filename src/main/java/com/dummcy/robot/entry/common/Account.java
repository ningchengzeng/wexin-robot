package com.dummcy.robot.entry.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "com_account")
public class Account {

    @Id
    private String id;

    private String username;
    private String password;

    private Date lastLoginTime;
    private String lastLoginIP;

    @Autowired
    private Authority authority;

    @CreatedDate
    private Date createTime;
    @LastModifiedDate
    private Date lastUpdateTime;
    @Version
    private int version;
}
