package com.wjw.excption;

/**
 * Created on 2020/12/21 0021
 *
 * @author weng
 */
public class UserNotExistException extends RuntimeException {
    public UserNotExistException() {
        super("用户不存在");
    }
}
