package io.magician.result;

import io.magician.result.jackson.JacksonUtil;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 消息结果
 *
 * @author magicianlib@gmail.com
 */
@Getter
@Setter
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 6820965203253182123L;

    /**
     * 状态码
     */
    private int code;
    /**
     * 信息
     */
    private String message;
    /**
     * 是否成功状态
     */
    private boolean success;
    /**
     * 数据
     */
    private T data;

    @Override
    public String toString() {
        return JacksonUtil.toJson(this);
    }
}
