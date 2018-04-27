package com.xq.live.model;

import java.util.Date;

/**
 * 报名活动的选手实体类
 */
public class ActUser {

    /**
     * 参与活动申请审批状态 0 待审批 1 审批通过 2 审批不通过
     */
    public final static int ACT_USER_APPLY_STATUS_WAIT_APPLIED = 0;

    public final static int ACT_USER_APPLY_STATUS_APPLIED = 1;

    public final static int ACT_USER_APPLY_STATUS_REFUSED = 2;

    /**
     * 判断选手是否已经参加该活动 0 未报名 1已报名
     */
    public final static int ACT_USER_IS_SIGN = 1;

    public final static int ACT_USER_NO_SIGN = 0;

    private Long id;

    private Long actId;

    private Long userId;

    private String userCode;

    private String actUserName;

    private String picIds;

    private Byte applyStatus;

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
}