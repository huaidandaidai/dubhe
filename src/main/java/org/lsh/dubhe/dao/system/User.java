package org.lsh.dubhe.dao.system;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户model
 */
@Getter
@Setter
public class User implements Serializable{
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 用户账号
     */
    private String userAccount;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 删除标志
     */
    private String deleteFlag;
    /**
     * 版本号
     */
    private String revison;
    /**
     * 创建时间
     */
    private Date createDateTime;
    /**
     * 创建人id
     */
    private Long createUserId;
    /**
     * 创建人所在单位
     */
    private Long createDepartId;
    /**
     * 修改时间
     */
    private Date updateDateTime;
    /**
     * 修改人
     */
    private Long updateUserId;
    /**
     * 修改人所在单位
     */
    private Long updateDepartId;

}
