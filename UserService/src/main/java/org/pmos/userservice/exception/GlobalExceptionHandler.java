package org.pmos.userservice.exception;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.websocketchat.websocketchat.pojo.Result;

/**
 * @author ALL
 * @date 2024/4/4
 * @Description
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public Result handleException(Exception e){
        e.printStackTrace();
        return Result.error(StringUtils.hasLength(e.getMessage())?e.getMessage():"操作失败");
    }

}
