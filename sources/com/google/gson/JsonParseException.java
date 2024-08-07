package com.google.gson;

public class JsonParseException extends RuntimeException {
    public JsonParseException(String str) {
        super(str);
    }

    public JsonParseException(String str, Throwable th2) {
        super(str, th2);
    }

    public JsonParseException(Exception exc) {
        super(exc);
    }
}
