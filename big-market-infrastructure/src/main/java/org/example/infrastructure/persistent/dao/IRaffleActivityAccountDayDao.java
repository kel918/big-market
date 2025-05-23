package org.example.infrastructure.persistent.dao;

import org.example.infrastructure.persistent.po.RaffleActivityAccountDay;
import cn.bugstack.middleware.db.router.annotation.DBRouter;
import org.apache.ibatis.annotations.Mapper;

/**
 * 抽奖活动账户表-日次数
 */
@Mapper
public interface IRaffleActivityAccountDayDao {

    @DBRouter
    RaffleActivityAccountDay queryActivityAccountDayByUserId(RaffleActivityAccountDay raffleActivityAccountDayReq);

    int updateActivityAccountDaySubtractionQuota(RaffleActivityAccountDay raffleActivityAccountDay);

    void insertActivityAccountDay(RaffleActivityAccountDay raffleActivityAccountDay);

    @DBRouter
    Integer queryRaffleActivityAccountDayPartakeCount(RaffleActivityAccountDay raffleActivityAccountDay);

    void addAccountQuota(RaffleActivityAccountDay raffleActivityAccountDay);

}
