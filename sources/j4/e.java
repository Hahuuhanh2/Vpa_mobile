package j4;

import c7.j;
import com.airbnb.lottie.i;
import h4.c;
import h4.g;
import i4.b;
import i4.f;
import java.util.List;
import java.util.Locale;
import o4.a;

/* compiled from: Layer */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f11662a;

    /* renamed from: b  reason: collision with root package name */
    public final i f11663b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11664c;

    /* renamed from: d  reason: collision with root package name */
    public final long f11665d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11666e;

    /* renamed from: f  reason: collision with root package name */
    public final long f11667f;

    /* renamed from: g  reason: collision with root package name */
    public final String f11668g;

    /* renamed from: h  reason: collision with root package name */
    public final List<f> f11669h;

    /* renamed from: i  reason: collision with root package name */
    public final g f11670i;

    /* renamed from: j  reason: collision with root package name */
    public final int f11671j;

    /* renamed from: k  reason: collision with root package name */
    public final int f11672k;

    /* renamed from: l  reason: collision with root package name */
    public final int f11673l;

    /* renamed from: m  reason: collision with root package name */
    public final float f11674m;

    /* renamed from: n  reason: collision with root package name */
    public final float f11675n;

    /* renamed from: o  reason: collision with root package name */
    public final int f11676o;

    /* renamed from: p  reason: collision with root package name */
    public final int f11677p;

    /* renamed from: q  reason: collision with root package name */
    public final c f11678q;

    /* renamed from: r  reason: collision with root package name */
    public final a1.c f11679r;

    /* renamed from: s  reason: collision with root package name */
    public final h4.b f11680s;

    /* renamed from: t  reason: collision with root package name */
    public final List<a<Float>> f11681t;

    /* renamed from: u  reason: collision with root package name */
    public final int f11682u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f11683v;

    /* renamed from: w  reason: collision with root package name */
    public final lc.b f11684w;

    /* renamed from: x  reason: collision with root package name */
    public final j f11685x;

    /* JADX WARNING: type inference failed for: r1v4, types: [int] */
    /* JADX WARNING: type inference failed for: r1v19, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(java.util.List<i4.b> r4, com.airbnb.lottie.i r5, java.lang.String r6, long r7, java.lang.Object r9, long r10, java.lang.String r12, java.util.List<i4.f> r13, h4.g r14, int r15, int r16, int r17, float r18, float r19, int r20, int r21, h4.c r22, a1.c r23, java.util.List<o4.a<java.lang.Float>> r24, java.lang.Object r25, h4.b r26, boolean r27, lc.b r28, c7.j r29) {
        /*
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r4
            r0.f11662a = r1
            r1 = r5
            r0.f11663b = r1
            r1 = r6
            r0.f11664c = r1
            r1 = r7
            r0.f11665d = r1
            r1 = r9
            r0.f11666e = r1
            r1 = r10
            r0.f11667f = r1
            r1 = r12
            r0.f11668g = r1
            r1 = r13
            r0.f11669h = r1
            r1 = r14
            r0.f11670i = r1
            r1 = r15
            r0.f11671j = r1
            r1 = r16
            r0.f11672k = r1
            r1 = r17
            r0.f11673l = r1
            r1 = r18
            r0.f11674m = r1
            r1 = r19
            r0.f11675n = r1
            r1 = r20
            r0.f11676o = r1
            r1 = r21
            r0.f11677p = r1
            r1 = r22
            r0.f11678q = r1
            r1 = r23
            r0.f11679r = r1
            r1 = r24
            r0.f11681t = r1
            r1 = r25
            r0.f11682u = r1
            r1 = r26
            r0.f11680s = r1
            r1 = r27
            r0.f11683v = r1
            r1 = r28
            r0.f11684w = r1
            r1 = r29
            r0.f11685x = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.e.<init>(java.util.List, com.airbnb.lottie.i, java.lang.String, long, int, long, java.lang.String, java.util.List, h4.g, int, int, int, float, float, int, int, h4.c, a1.c, java.util.List, int, h4.b, boolean, lc.b, c7.j):void");
    }

    public final String a(String str) {
        StringBuilder q10 = android.support.v4.media.a.q(str);
        q10.append(this.f11664c);
        q10.append("\n");
        i iVar = this.f11663b;
        e eVar = (e) iVar.f4839h.f((Long) null, this.f11667f);
        if (eVar != null) {
            q10.append("\t\tParents: ");
            q10.append(eVar.f11664c);
            i iVar2 = this.f11663b;
            e eVar2 = (e) iVar2.f4839h.f((Long) null, eVar.f11667f);
            while (eVar2 != null) {
                q10.append("->");
                q10.append(eVar2.f11664c);
                i iVar3 = this.f11663b;
                eVar2 = (e) iVar3.f4839h.f((Long) null, eVar2.f11667f);
            }
            q10.append(str);
            q10.append("\n");
        }
        if (!this.f11669h.isEmpty()) {
            q10.append(str);
            q10.append("\tMasks: ");
            q10.append(this.f11669h.size());
            q10.append("\n");
        }
        if (!(this.f11671j == 0 || this.f11672k == 0)) {
            q10.append(str);
            q10.append("\tBackground: ");
            q10.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(this.f11671j), Integer.valueOf(this.f11672k), Integer.valueOf(this.f11673l)}));
        }
        if (!this.f11662a.isEmpty()) {
            q10.append(str);
            q10.append("\tShapes:\n");
            for (b next : this.f11662a) {
                q10.append(str);
                q10.append("\t\t");
                q10.append(next);
                q10.append("\n");
            }
        }
        return q10.toString();
    }

    public final String toString() {
        return a("");
    }
}
