package com.google.protobuf;

import java.io.IOException;

public class InvalidProtocolBufferException extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f7869a = 0;

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        public InvalidWireTypeException() {
            super("Protocol message tag had invalid wire type.");
        }
    }

    public InvalidProtocolBufferException(String str) {
        super(str);
    }

    public static InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
