package androidx.datastore.core;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.IOException;

/* compiled from: Serializer.kt */
public final class CorruptionException extends IOException {
    public CorruptionException(InvalidProtocolBufferException invalidProtocolBufferException) {
        super("Unable to parse preferences proto.", invalidProtocolBufferException);
    }

    public CorruptionException(String str) {
        super(str, (Throwable) null);
    }
}
