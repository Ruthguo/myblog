package com.siyuan.enums;

/**
 * Created by ruthguo on 2017/11/7.
 * @author ruthguo
 */
public enum ResultEnum {

    ACCEPTED(1), REJECTED(0), OK(0), FAIL(1),
    // 需审核
    REVIEW_NEEDED(2);

    private int code;

    ResultEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}