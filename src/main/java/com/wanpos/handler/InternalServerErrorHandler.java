package com.wanpos.handler;

import com.wanpos.app.dto.response.BaseResponse;
import org.springframework.http.HttpStatus;

import java.util.logging.Level;
import java.util.logging.Logger;

public class InternalServerErrorHandler {

    private static Logger logger;

    public static BaseResponse InternalServerError(Exception e) {
        logger.log(Level.SEVERE, e.toString());

        return new BaseResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), false, "INTERNAL_SERVER_ERROR", null);
    }

}
