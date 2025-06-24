package com.cqupt.yyzx.handler;
import com.cqupt.yyzx.utils.ResultVo;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import io.jsonwebtoken.SignatureException;


@ControllerAdvice //监听controller处理器方法是否发生异常
public class GlobalExceptionHandler {
    //定义异常处理方法
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultVo ExceptionHandler(Exception e) {
        if (e.getMessage().contains("token")) {
            return ResultVo.fail(e.getMessage(), "token_error");
        }
        return ResultVo.error(e);
    }

    //SignatureException  token的非法操作
    @ExceptionHandler(SignatureException.class)
    @ResponseBody
    public ResultVo SignatureExceptionHandler(SignatureException e) {
        return ResultVo.fail("token的非法操作！", "token_error");
    }

    //MalformedJwtException  token解析异常
    @ExceptionHandler(MalformedJwtException.class)
    @ResponseBody
    public ResultVo SignatureExceptionHandler(MalformedJwtException e) {
        return ResultVo.fail("token解析异常", "token_error");
    }


    //ExpiredJwtException 过时
    @ExceptionHandler(ExpiredJwtException.class)
    @ResponseBody
    public ResultVo SignatureExceptionHandler(ExpiredJwtException e) {
        return ResultVo.fail("登录过时，请重新登录", "token_error");
    }
}

