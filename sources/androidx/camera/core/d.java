package androidx.camera.core;

import android.annotation.SuppressLint;
import android.media.Image;
import c0.k0;
import java.nio.ByteBuffer;

/* compiled from: ImageProxy */
public interface d extends AutoCloseable {

    /* compiled from: ImageProxy */
    public interface a {
        ByteBuffer a();

        int b();

        int c();
    }

    int b();

    int c();

    void close();

    k0 f0();

    int getFormat();

    @SuppressLint({"ArrayReturn"})
    a[] l();

    Image r0();
}
