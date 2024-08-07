package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.u;
import androidx.camera.core.impl.y;
import b0.e;
import c0.b0;
import c0.f1;
import c0.n0;
import c0.p;
import c0.x;
import f0.c0;
import j0.i;
import j0.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import o0.b;

/* compiled from: ImageAnalysisConfig */
public final class l implements x<b0>, o, i {
    public static final c F = i.a.a(b0.b.class, "camerax.core.imageAnalysis.backpressureStrategy");
    public static final c G = i.a.a(Integer.TYPE, "camerax.core.imageAnalysis.imageQueueDepth");
    public static final c H = i.a.a(n0.class, "camerax.core.imageAnalysis.imageReaderProxyProvider");
    public static final c I = i.a.a(b0.e.class, "camerax.core.imageAnalysis.outputImageFormat");
    public static final c J;
    public static final c K;
    public final r E;

    static {
        Class<Boolean> cls = Boolean.class;
        J = i.a.a(cls, "camerax.core.imageAnalysis.onePixelShiftEnabled");
        K = i.a.a(cls, "camerax.core.imageAnalysis.outputImageRotationEnabled");
    }

    public l(r rVar) {
        this.E = rVar;
    }

    public final p A() {
        return (p) e(x.f1420u, (Object) null);
    }

    public final /* synthetic */ boolean B() {
        return f0.b0.i(this);
    }

    public final g C() {
        return (g) e(x.f1416q, (Object) null);
    }

    public final /* synthetic */ String D() {
        return f0.b0.g(this);
    }

    public final boolean E() {
        int i10 = c0.f9520a;
        return c(o.f1381f);
    }

    public final /* synthetic */ int F() {
        return c0.d(this);
    }

    public final /* synthetic */ int G() {
        return f0.b0.f(this);
    }

    public final Size H() {
        int i10 = c0.f9520a;
        return (Size) e(o.f1387l, (Object) null);
    }

    public final /* synthetic */ boolean I() {
        return f0.b0.j(this);
    }

    public final /* synthetic */ int J() {
        return c0.a(this);
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

    public final /* synthetic */ void f(e eVar) {
        f0.b0.b(this, eVar);
    }

    public final f1.a g() {
        return (f1.a) e(j.D, null);
    }

    public final /* synthetic */ x h() {
        return f0.b0.d(this);
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
        return 35;
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
        return f0.b0.e(this);
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
        return f0.b0.h(this, str);
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
        return f0.b0.c(this);
    }
}