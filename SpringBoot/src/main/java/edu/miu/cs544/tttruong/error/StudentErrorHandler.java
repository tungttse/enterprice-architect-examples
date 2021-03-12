package edu.miu.cs544.tttruong.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ErrorHandler;

public class StudentErrorHandler implements ErrorHandler {
    private static Logger log = LoggerFactory.getLogger(StudentErrorHandler.class);

    @Override
    public void handleError(Throwable t) {
        log.warn("ToDo error...");
        log.error(t.getCause().getMessage());
    }
}
