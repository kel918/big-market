package org.example.domain.activity.model.valobj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * 订单状态枚举值对象（用于描述对象属性的值，如枚举，不影响数据库操作的对象，无生命周期）
 */
@Getter
@AllArgsConstructor
public enum OrderStateVO {

    completed("completed", "完成");

    private final String code;
    private final String desc;

}
