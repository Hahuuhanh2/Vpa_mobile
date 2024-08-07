package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;

public final class TinkBugException extends RuntimeException {
    public TinkBugException(String str) {
        super(str);
    }

    public TinkBugException(String str, GeneralSecurityException generalSecurityException) {
        super(str, generalSecurityException);
    }
}
