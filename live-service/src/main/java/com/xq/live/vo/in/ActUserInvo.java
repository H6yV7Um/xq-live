package com.xq.live.vo.in;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 活动选手入参
 * Created by lipeng on 2018/4/27.
 */
public class ActUserInVo {

    private Long id;

    @NotNull(message = "actId必填")
    private Long actId;//活动id

    @NotNull(message = "userId必填")
    private Long userId;//选手id

    private String userCode;//选手编号

    @NotNull(message = "actUserName必填")
    private String actUserName;//报名参加填写的名字

    @NotNull(message = "picIds必填")
    private String picIds;//图片和视频组

    private Byte applyStatus;//审批状态

    @NotNull(message = "age必填")
    private Integer age;//年龄

    @NotNull(message = "height必填")
    private Integer height;//身高

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getActId() {
        return actId;
    }

    public void setActId(Long actId) {
        this.actId = actId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getActUserName() {
        return actUserName;
    }

    public void setActUserName(String actUserName) {
        this.actUserName = actUserName == null ? null : actUserName.trim();
    }

    public String getPicIds() {
        return picIds;
    }

    public void setPicIds(String picIds) {
        this.picIds = picIds == null ? null : picIds.trim();
    }

    public Byte getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(Byte applyStatus) {
        this.applyStatus = applyStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
