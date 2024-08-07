package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.g;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.u;
import androidx.camera.core.impl.y;
import c0.f1;
import c0.j0;
import c0.n0;
import c0.p;
import c0.x;
import f0.b0;
import f0.c0;
import f0.v;
import j0.e;
import j0.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import o0.b;

/* compiled from: ImageCaptureConfig */
public final class m implements x<j0>, o, e {
    public static final c F;
    public static final c G;
    public static final c H = i.a.a(v.class, "camerax.core.imageCapture.captureBundle");
    public static final c I;
    public static final c J = i.a.a(n0.class, "camerax.core.imageCapture.imageReaderProxyProvider");
    public static final c K = i.a.a(Boolean.TYPE, "camerax.core.imageCapture.useSoftwareJpegEncoder");
    public static final c L;
    public final r E;

    static {
        Class<Integer> cls = Integer.class;
        Class cls2 = Integer.TYPE;
        F = i.a.a(cls2, "camerax.core.imageCapture.captureMode");
        G = i.a.a(cls2, "camerax.core.imageCapture.flashMode");
        I = i.a.a(cls, "camerax.core.imageCapture.bufferFormat");
        i.a.a(cls, "camerax.core.imageCapture.maxCaptureStages");
        L = i.a.a(cls2, "camerax.core.imageCapture.flashType");
        i.a.a(cls2, "camerax.core.imageCapture.jpegCompressionQuality");
    }

    public m(r rVar) {
        this.E = rVar;
    }

    public final p A() {
        return (p) e(x.f1420u, (Object) null);
    }

    public final /* synthetic */ boolean B() {
        return b0.i(this);
    }

    public final g C() {
        return (g) e(x.f1416q, (Object) null);
    }

    public final /* synthetic */ String D() {
        return b0.g(this);
    }

    public final boolean E() {
        int i10 = c0.f9520a;
        return c(o.f1381f);
    }

    public final /* synthetic */ int F() {
        return c0.d(this);
    }

    public final /* synthetic */ int G() {
        return b0.f(this);
    }

    public final Size H() {
        int i10 = c0.f9520a;
        return (Size) e(o.f1387l, (Object) null);
    }

    public final /* synthetic */ boolean I() {
        return b0.j(this);
    }

    public final /* synthetic */ int J() {
        return c0.a(this);
    }

    public final g.b K() {
        return (g.b) e(x.f1418s, (Object) null);
    }

    public final Object a(i.a aVar) {
        return ((r) b()).a(aVar);
    }

    public final i b() {
        return this.E;
    }

    public final boolean c(i.a aVar) {
        return ((r) b()).c(aVar);
    }

    public final Set d() {
        return ((r) b()).d();
    }

    public final Object e(i.a aVar, Object obj) {
        return ((r) b()).e(aVar, obj);
    }

    public final /* synthetic */ void f(b0.e eVar) {
        b0.b(this, eVar);
    }

    public final f1.a g() {
        return (f1.a) e(j.D, null);
    }

    public final /* synthetic */ x h() {
        return b0.d(this);
    }

    public final List i() {
        int i10 = c0.f9520a;
        return (List) e(o.f1388m, (Object) null);
    }

    public final b j() {
        int i10 = c0.f9520a;
        return (b) a(o.f1389n);
    }

    public final Range k() {
        return (Range) e(x.f1421v, (Object) null);
    }

    public final int l() {
        return ((Integer) ((r) b()).a(n.f1379d)).intValue();
    }

    public final /* synthetic */ int m() {
        return c0.c(this);
    }

    public final Object n(i.a aVar, i.b bVar) {
        return ((r) b()).n(aVar, bVar);
    }

    public final u o() {
        return (u) e(x.f1415p, (Object) null);
    }

    public final /* synthetic */ int p() {
        return b0.e(this);
    }

    public final u.d q() {
        return (u.d) e(x.f1417r, (Object) null);
    }

    public final /* synthetic */ ArrayList r() {
        return c0.b(this);
    }

    public final b s() {
        int i10 = c0.f9520a;
        return (b) e(o.f1389n, (Object) null);
    }

    public final /* synthetic */ String t(String str) {
        return b0.h(this, str);
    }

    public final Size u() {
        int i10 = c0.f9520a;
        return (Size) e(o.f1386k, (Object) null);
    }

    public final i.b v(i.a aVar) {
        return ((r) b()).v(aVar);
    }

    public final Set w(i.a aVar) {
        return ((r) b()).w(aVar);
    }

    public final /* synthetic */ int x() {
        return c0.e(this);
    }

    public final Size y() {
        int i10 = c0.f9520a;
        return (Size) e(o.f1385j, (Object) null);
    }

    public final /* synthetic */ y.b z() {
        return b0.c(this);
    }
}
