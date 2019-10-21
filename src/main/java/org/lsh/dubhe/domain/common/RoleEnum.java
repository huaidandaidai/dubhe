package org.lsh.dubhe.domain.common;

/**
 * 系统角色
 *    系统管理员(system)：网站监控相关功能管理员。
 *    网站管理员(website):三权分立：网站授权、菜单、字典等相关功能管理员。
 *    业务人员(business):
 */
public enum RoleEnum {
    system,
    website,
    business;

}
