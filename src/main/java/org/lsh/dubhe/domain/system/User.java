package org.lsh.dubhe.domain.system;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    private Long userId;
    private String userAccount;
    private String userPassword;
    private String userName;
    private String deleteFlag;
    private String revison;
    private Date createDateTime;
    private Long createUserId;
    private Long createDepartId;
    private Date updateDateTime;
    private Long updateUserId;
    private Long updateDepartId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getRevison() {
        return revison;
    }

    public void setRevison(String revison) {
        this.revison = revison;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Long getCreateDepartId() {
        return createDepartId;
    }

    public void setCreateDepartId(Long createDepartId) {
        this.createDepartId = createDepartId;
    }

    public Date getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Long getUpdateDepartId() {
        return updateDepartId;
    }

    public void setUpdateDepartId(Long updateDepartId) {
        this.updateDepartId = updateDepartId;
    }
}
