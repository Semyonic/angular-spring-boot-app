package com.semihonay.anuglarspringboot.controllers;

import javax.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * The type Error controller.
 */
@ControllerAdvice(basePackageClasses = CustomerControler.class)
public class ErrorController extends ResponseEntityExceptionHandler {

  /**
   * Handle controller exception response entity.
   *
   * @param request the request
   * @param ex the ex
   * @return the response entity
   */
  @ExceptionHandler(Exception.class)
  @ResponseBody
  ResponseEntity<?> handleControllerException(HttpServletRequest request, Throwable ex) {
    HttpStatus status = getStatus(request);
    return new ResponseEntity<>(new CustomErrorType(status.value(), ex.getMessage()), status);
  }

  private HttpStatus getStatus(HttpServletRequest request) {
    Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
    if (statusCode == null) {
      return HttpStatus.INTERNAL_SERVER_ERROR;
    }
    return HttpStatus.valueOf(statusCode);
  }

  @AllArgsConstructor
  private class CustomErrorType {

    /**
     * Instantiates a new Custom error type.
     *
     * @param value the value
     * @param message the message
     */
    public CustomErrorType(int value, String message) {
    }
  }
}