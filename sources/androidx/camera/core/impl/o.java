package androidx.camera.core.impl;

import android.util.Size;
import androidx.camera.core.impl.i;
import c0.c;
import java.util.ArrayList;
import java.util.List;
import o0.b;

/* compiled from: ImageOutputConfig */
public interface o extends t {

    /* renamed from: f  reason: collision with root package name */
    public static final c f1381f = i.a.a(c.class, "camerax.core.imageOutput.targetAspectRatio");

    /* renamed from: g  reason: collision with root package name */
    public static final c f1382g;

    /* renamed from: h  reason: collision with root package name */
    public static final c f1383h;

    /* renamed from: i  reason: collision with root package name */
    public static final c f1384i;

    /* renamed from: j  reason: collision with root package name */
    public static final c f1385j = i.a.a(Size.class, "camerax.core.imageOutput.targetResolution");

    /* renamed from: k  reason: collision with root package name */
    public static final c f1386k = i.a.a(Size.class, "camerax.core.imageOutput.defaultResolution");

    /* renamed from: l  reason: collision with root package name */
    public static final c f1387l = i.a.a(Size.class, "camerax.core.imageOutput.maxResolution");

    /* renamed from: m  reason: collision with root package name */
    public static final c f1388m = i.a.a(List.class, "camerax.core.imageOutput.supportedResolutions");

    /* renamed from: n  reason: collision with root package name */
    public static final c f1389n = i.a.a(b.class, "camerax.core.imageOutput.resolutionSelector");

    /* renamed from: o  reason: collision with root package name */
    public static final c f1390o = i.a.a(List.class, "camerax.core.imageOutput.customOrderedResolutions");

    static {
        Class cls = Integer.TYPE;
        f1382g = i.a.a(cls, "camerax.core.imageOutput.targetRotation");
        f1383h = i.a.a(cls, "camerax.core.imageOutput.appTargetRotation");
        f1384i = i.a.a(cls, "camerax.core.imageOutput.mirrorMode");
    }

    boolean E();

    int F();

    Size H();

    int J();

    List i();

    b j();

    int m();

    ArrayList r();

    b s();

    Size u();

    int x();

    Size y();
}
