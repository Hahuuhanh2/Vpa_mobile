package com.airbnb.lottie;

import android.graphics.Rect;
import g4.c;
import g4.d;
import g4.h;
import j4.e;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: LottieComposition */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final j0 f4832a = new j0();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<String> f4833b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    public Map<String, List<e>> f4834c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, d0> f4835d;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, c> f4836e;

    /* renamed from: f  reason: collision with root package name */
    public List<h> f4837f;

    /* renamed from: g  reason: collision with root package name */
    public v0.i<d> f4838g;

    /* renamed from: h  reason: collision with root package name */
    public v0.e<e> f4839h;

    /* renamed from: i  reason: collision with root package name */
    public List<e> f4840i;

    /* renamed from: j  reason: collision with root package name */
    public Rect f4841j;

    /* renamed from: k  reason: collision with root package name */
    public float f4842k;

    /* renamed from: l  reason: collision with root package name */
    public float f4843l;

    /* renamed from: m  reason: collision with root package name */
    public float f4844m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4845n;

    /* renamed from: o  reason: collision with root package name */
    public int f4846o = 0;

    public final void a(String str) {
        n4.c.b(str);
        this.f4833b.add(str);
    }

    public final float b() {
        return (float) ((long) (((this.f4843l - this.f4842k) / this.f4844m) * 1000.0f));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r4.substring(0, r4.length() - 1).equalsIgnoreCase(r8) != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g4.h c(java.lang.String r8) {
        /*
            r7 = this;
            java.util.List<g4.h> r0 = r7.f4837f
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L_0x0008:
            if (r2 >= r0) goto L_0x003f
            java.util.List<g4.h> r3 = r7.f4837f
            java.lang.Object r3 = r3.get(r2)
            g4.h r3 = (g4.h) r3
            java.lang.String r4 = r3.f10364a
            boolean r4 = r4.equalsIgnoreCase(r8)
            r5 = 1
            if (r4 == 0) goto L_0x001c
            goto L_0x0039
        L_0x001c:
            java.lang.String r4 = r3.f10364a
            java.lang.String r6 = "\r"
            boolean r4 = r4.endsWith(r6)
            if (r4 == 0) goto L_0x0038
            java.lang.String r4 = r3.f10364a
            int r6 = r4.length()
            int r6 = r6 - r5
            java.lang.String r4 = r4.substring(r1, r6)
            boolean r4 = r4.equalsIgnoreCase(r8)
            if (r4 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r5 = r1
        L_0x0039:
            if (r5 == 0) goto L_0x003c
            return r3
        L_0x003c:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x003f:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.i.c(java.lang.String):g4.h");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        for (e a10 : this.f4840i) {
            sb2.append(a10.a("\t"));
        }
        return sb2.toString();
    }
}
