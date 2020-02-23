package com.suddenwealth.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by yxd on 2020/1/6.
 */
public class CommonDataResponse<T> {
    @ApiModelProperty(value = "响应数据", required = true, position = 1)
    private T data;
    @ApiModelProperty(value = "响应时间", position = 3)
    private long timeSpent;
    @ApiModelProperty(value = "响应状态", position = 2)
    private CommonResponseCommonType status = new CommonResponseCommonType();

    public long getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(long timeSpent) {
        this.timeSpent = timeSpent;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public CommonResponseCommonType getStatus() {
        return status;
    }

    public void setStatus(CommonResponseCommonType status) {
        this.status = status;
    }
}
