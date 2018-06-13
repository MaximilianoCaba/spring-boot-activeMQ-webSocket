package com.example.socket.errorHandle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ErrorHandler;

@Service
public class ErrorHandle implements ErrorHandler {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public void handleError(Throwable t) {
        log.debug(t.getMessage());
    }
}
