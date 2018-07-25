package com.dummcy.robot.repository.common;

import com.dummcy.robot.entry.common.Authority;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface AuthorityRepository extends ReactiveMongoRepository<Authority, String> {
}
