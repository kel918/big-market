package org.example.domain.award.service;

import org.example.domain.award.model.entity.UserAwardRecordEntity;

/**
 * 奖品服务接口
 */
public interface IAwardService {

    void saveUserAwardRecord(UserAwardRecordEntity userAwardRecordEntity);

}
