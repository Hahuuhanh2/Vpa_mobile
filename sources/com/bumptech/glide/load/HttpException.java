package com.bumptech.glide.load;

import java.io.IOException;

public final class HttpException extends IOException {
    public HttpException() {
        throw null;
    }

    public HttpException(int i10, String str, IOException iOException) {
        super(str + ", status code: " + i10, iOException);
    }
}
