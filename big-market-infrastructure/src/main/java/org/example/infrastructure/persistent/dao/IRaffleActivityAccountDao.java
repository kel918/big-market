package org.example.infrastructure.persistent.dao;
import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.persistent.po.RaffleActivityAccount;

/**
 * 抽奖活动账户表
 */
@Mapper
public interface IRaffleActivityAccountDao {

    void insert(RaffleActivityAccount raffleActivityAccount);

    int updateAccountQuota(RaffleActivityAccount raffleActivityAccount);

}
