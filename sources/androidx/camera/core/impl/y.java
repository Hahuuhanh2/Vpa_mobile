package androidx.camera.core.impl;

import android.content.Context;
import v.m0;

/* compiled from: UseCaseConfigFactory */
public interface y {

    /* renamed from: a  reason: collision with root package name */
    public static final a f1425a = new a();

    /* compiled from: UseCaseConfigFactory */
    public class a implements y {
        public final i a(b bVar, int i10) {
            return null;
        }
    }

    /* compiled from: UseCaseConfigFactory */
    public enum b {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE,
        STREAM_SHARING,
        METERING_REPEATING
    }

    /* compiled from: UseCaseConfigFactory */
    public interface c {
        m0 a(Context context);
    }

    i a(b bVar, int i10);
}
