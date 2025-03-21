package com.example.infoservice.exception;

public class MemberAlreadyExistsException extends RuntimeException {
  public MemberAlreadyExistsException(String message) {
    super(message);
  }
}
