package org.lsh.dubhe.domain.common;

import java.io.Serializable;

/**
 * 结果类
 * 用途:controller/service层的返回结果类
 */
public class Result<T> implements Serializable {

    /**
     * 执行状态
     */
    private boolean success;

    /**
     * 错误编码
     */
    private String  errorCode;

    /**
     * 提示信息
     */
    private String message;

    /**
     * 错误信息栈
     */
    private String errorStack;

    /**
     * 返回值对象
     */
    private T result;

    public Result(boolean success) {
        this.success = success;
    }

    public Result(boolean success, T result) {
        this.success = success;
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }
}
