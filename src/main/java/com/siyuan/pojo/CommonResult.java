package com.siyuan.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author ruthguo
 */
public class CommonResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)

    private int result;
    private String reason;
    private Object data;

    public CommonResult(int result, String reason, Object data) {
        this.result = result;
        this.reason = reason;
        this.data = data;
    }

    public int getResult() {
        return result;
    }

    public String getReason() {
        return reason;
    }

    public Object getData() {
        return data;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "result=" + result +
                ", reason='" + reason + '\'' +
                ", data=" + data +
                '}';
    }
}
