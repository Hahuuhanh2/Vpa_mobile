package org.threeten.bp;

public class DateTimeException extends RuntimeException {
    public DateTimeException(String str) {
        super(str);
    }

    public DateTimeException(String str, Exception exc) {
        super(str, exc);
    }
}
