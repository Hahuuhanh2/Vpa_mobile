package com.google.gson;

public final class JsonIOException extends JsonParseException {
    public JsonIOException(String str) {
        super(str);
    }

    public JsonIOException(String str, Throwable th2) {
        super(str, th2);
    }

    public JsonIOException(Exception exc) {
        super(exc);
    }
}
