package com.dummcy.robot.repository.chart;

import com.dummcy.robot.entry.chart.Friend;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface FriendRepository extends ReactiveMongoRepository<Friend, String> {
}