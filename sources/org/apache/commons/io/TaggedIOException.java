package org.apache.commons.io;

import java.io.IOException;

public class TaggedIOException extends IOExceptionWithCause {
    public final Throwable getCause() {
        IOException iOException;
        synchronized (this) {
            iOException = (IOException) super.getCause();
        }
        return iOException;
    }
}
