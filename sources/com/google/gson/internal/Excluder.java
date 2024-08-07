package com.google.gson.internal;

import bc.h;
import bc.u;
import bc.v;
import cc.c;
import cc.d;
import hc.b;
import java.util.Collections;
import java.util.List;

public final class Excluder implements v, Cloneable {

    /* renamed from: f  reason: collision with root package name */
    public static final Excluder f7727f = new Excluder();

    /* renamed from: a  reason: collision with root package name */
    public double f7728a = -1.0d;

    /* renamed from: b  reason: collision with root package name */
    public int f7729b = 136;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7730c = true;

    /* renamed from: d  reason: collision with root package name */
    public List<bc.a> f7731d = Collections.emptyList();

    /* renamed from: e  reason: collision with root package name */
    public List<bc.a> f7732e = Collections.emptyList();

    public class a extends u<T> {

        /* renamed from: a  reason: collision with root package name */
        public u<T> f7733a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f7734b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f7735c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ h f7736d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ gc.a f7737e;

        public a(boolean z10, boolean z11, h hVar, gc.a aVar) {
            this.f7734b = z10;
            this.f7735c = z11;
            this.f7736d = hVar;
            this.f7737e = aVar;
        }

        public final T a(hc.a aVar) {
            if (this.f7734b) {
                aVar.v0();
                return null;
            }
            u<T> uVar = this.f7733a;
            if (uVar == null) {
                uVar = this.f7736d.g(Excluder.this, this.f7737e);
                this.f7733a = uVar;
            }
            return uVar.a(aVar);
        }

        public final void b(b bVar, T t10) {
            if (this.f7735c) {
                bVar.B();
                return;
            }
            u<T> uVar = this.f7733a;
            if (uVar == null) {
                uVar = this.f7736d.g(Excluder.this, this.f7737e);
                this.f7733a = uVar;
            }
            uVar.b(bVar, t10);
        }
    }

    public static boolean e(Class cls) {
        boolean z10;
        if (!Enum.class.isAssignableFrom(cls)) {
            if ((cls.getModifiers() & 8) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        return false;
    }

    public final <T> u<T> a(h hVar, gc.a<T> aVar) {
        boolean z10;
        boolean z11;
        Class<? super T> cls = aVar.f10437a;
        boolean b10 = b(cls);
        if (b10 || c(cls, true)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (b10 || c(cls, false)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 || z11) {
            return new a(z11, z10, hVar, aVar);
        }
        return null;
    }

    public final boolean b(Class<?> cls) {
        boolean z10;
        if (this.f7728a != -1.0d && !f((c) cls.getAnnotation(c.class), (d) cls.getAnnotation(d.class))) {
            return true;
        }
        if (!this.f7730c) {
            boolean z11 = false;
            if (cls.isMemberClass()) {
                if ((cls.getModifiers() & 8) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    z11 = true;
                }
            }
            if (z11) {
                return true;
            }
        }
        return e(cls);
    }

    public final boolean c(Class<?> cls, boolean z10) {
        List<bc.a> list;
        if (z10) {
            list = this.f7731d;
        } else {
            list = this.f7732e;
        }
        for (bc.a a10 : list) {
            if (a10.a()) {
                return true;
            }
        }
        return false;
    }

    public final Object clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(cc.c r7, cc.d r8) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L_0x0011
            double r2 = r7.value()
            double r4 = r6.f7728a
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r7 = r0
            goto L_0x0012
        L_0x0011:
            r7 = r1
        L_0x0012:
            if (r7 == 0) goto L_0x0027
            if (r8 == 0) goto L_0x0023
            double r7 = r8.value()
            double r2 = r6.f7728a
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r7 = r0
            goto L_0x0024
        L_0x0023:
            r7 = r1
        L_0x0024:
            if (r7 == 0) goto L_0x0027
            r0 = r1
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.Excluder.f(cc.c, cc.d):boolean");
    }
}
