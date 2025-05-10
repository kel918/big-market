package org.example.domain.award.repository;

import org.example.domain.award.model.aggregate.UserAwardRecordAggregate;

/**
 * 奖品仓储服务
 */
public interface IAwardRepository {

    void saveUserAwardRecord(UserAwardRecordAggregate userAwardRecordAggregate);

}
