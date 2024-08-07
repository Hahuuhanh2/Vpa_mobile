package androidx.camera.core.impl;

import android.util.Range;
import androidx.camera.core.impl.g;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.u;
import androidx.camera.core.impl.y;
import c0.f1;
import c0.p;
import j0.h;
import j0.j;

/* compiled from: UseCaseConfig */
public interface x<T extends f1> extends h<T>, j, n {

    /* renamed from: p  reason: collision with root package name */
    public static final c f1415p = i.a.a(u.class, "camerax.core.useCase.defaultSessionConfig");

    /* renamed from: q  reason: collision with root package name */
    public static final c f1416q = i.a.a(g.class, "camerax.core.useCase.defaultCaptureConfig");

    /* renamed from: r  reason: collision with root package name */
    public static final c f1417r = i.a.a(u.d.class, "camerax.core.useCase.sessionConfigUnpacker");

    /* renamed from: s  reason: collision with root package name */
    public static final c f1418s = i.a.a(g.b.class, "camerax.core.useCase.captureConfigUnpacker");

    /* renamed from: t  reason: collision with root package name */
    public static final c f1419t = i.a.a(Integer.TYPE, "camerax.core.useCase.surfaceOccupancyPriority");

    /* renamed from: u  reason: collision with root package name */
    public static final c f1420u = i.a.a(p.class, "camerax.core.useCase.cameraSelector");

    /* renamed from: v  reason: collision with root package name */
    public static final c f1421v = i.a.a(Range.class, "camerax.core.useCase.targetFrameRate");

    /* renamed from: w  reason: collision with root package name */
    public static final c f1422w;

    /* renamed from: x  reason: collision with root package name */
    public static final c f1423x;

    /* renamed from: y  reason: collision with root package name */
    public static final c f1424y = i.a.a(y.b.class, "camerax.core.useCase.captureType");

    /* compiled from: UseCaseConfig */
    public interface a<T extends f1, C extends x<T>, B> extends c0.y<T> {
        C b();
    }

    static {
        Class cls = Boolean.TYPE;
        f1422w = i.a.a(cls, "camerax.core.useCase.zslDisabled");
        f1423x = i.a.a(cls, "camerax.core.useCase.highResolutionDisabled");
    }

    p A();

    boolean B();

    g C();

    int G();

    boolean I();

    Range k();

    u o();

    int p();

    u.d q();

    y.b z();
}
