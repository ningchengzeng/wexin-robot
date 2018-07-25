package com.dummcy.robot.repository.chart;

import com.dummcy.robot.entry.chart.UserInfo;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface UserInfoRepository extends ReactiveMongoRepository<UserInfo, String> {
}
