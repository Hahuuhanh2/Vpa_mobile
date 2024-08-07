package e0;

import androidx.camera.core.f;
import androidx.camera.core.impl.g;
import androidx.camera.core.impl.m;
import e0.l;
import f0.e0;
import j7.a;
import java.util.Objects;
import v.j2;

/* compiled from: ImagePipeline */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final m f9028a;

    /* renamed from: b  reason: collision with root package name */
    public final g f9029b;

    /* renamed from: c  reason: collision with root package name */
    public final l f9030c;

    /* renamed from: d  reason: collision with root package name */
    public final e0 f9031d;

    /* renamed from: e  reason: collision with root package name */
    public final v f9032e;

    /* renamed from: f  reason: collision with root package name */
    public final b f9033f;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: e0.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: androidx.camera.core.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: e0.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: e0.s} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o(androidx.camera.core.impl.m r17, android.util.Size r18, c0.k r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r16.<init>()
            g0.m.a()
            r0.f9028a = r1
            androidx.camera.core.impl.g$b r2 = r17.K()
            if (r2 == 0) goto L_0x01af
            androidx.camera.core.impl.g$a r3 = new androidx.camera.core.impl.g$a
            r3.<init>()
            r2.a(r1, r3)
            androidx.camera.core.impl.g r2 = r3.d()
            r0.f9029b = r2
            e0.l r2 = new e0.l
            r2.<init>()
            r0.f9030c = r2
            e0.e0 r3 = new e0.e0
            r3.<init>()
            r0.f9031d = r3
            e0.v r4 = new e0.v
            h0.e r5 = j7.a.P()
            androidx.camera.core.impl.c r6 = j0.e.f11454z
            androidx.camera.core.impl.i r7 = r17.b()
            androidx.camera.core.impl.r r7 = (androidx.camera.core.impl.r) r7
            java.lang.Object r5 = r7.e(r6, r5)
            java.util.concurrent.Executor r5 = (java.util.concurrent.Executor) r5
            java.util.Objects.requireNonNull(r5)
            r6 = 0
            r7 = 0
            if (r19 != 0) goto L_0x01ab
            r4.<init>(r5)
            r0.f9032e = r4
            int r10 = r17.l()
            androidx.camera.core.impl.c r5 = androidx.camera.core.impl.m.I
            androidx.camera.core.impl.i r8 = r17.b()
            androidx.camera.core.impl.r r8 = (androidx.camera.core.impl.r) r8
            java.lang.Object r5 = r8.e(r5, r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0067
            int r5 = r5.intValue()
            goto L_0x0069
        L_0x0067:
            r5 = 256(0x100, float:3.59E-43)
        L_0x0069:
            r11 = r5
            androidx.camera.core.impl.c r5 = androidx.camera.core.impl.m.J
            androidx.camera.core.impl.i r1 = r17.b()
            androidx.camera.core.impl.r r1 = (androidx.camera.core.impl.r) r1
            java.lang.Object r1 = r1.e(r5, r7)
            r13 = r1
            c0.n0 r13 = (c0.n0) r13
            e0.b r1 = new e0.b
            n0.k r14 = new n0.k
            r14.<init>()
            n0.k r15 = new n0.k
            r15.<init>()
            r8 = r1
            r9 = r18
            r12 = r20
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0.f9033f = r1
            e0.l$b r5 = r2.f9022e
            r7 = 1
            if (r5 != 0) goto L_0x009a
            androidx.camera.core.f r5 = r2.f9020c
            if (r5 != 0) goto L_0x009a
            r5 = r7
            goto L_0x009b
        L_0x009a:
            r5 = r6
        L_0x009b:
            java.lang.String r8 = "CaptureNode does not support recreation yet."
            al.g0.E(r8, r5)
            r2.f9022e = r1
            android.util.Size r5 = r1.f8976c
            int r8 = r1.f8977d
            boolean r9 = r1.f8979f
            r9 = r9 ^ r7
            r10 = 4
            if (r9 == 0) goto L_0x00c7
            c0.n0 r9 = r1.f8980g
            if (r9 != 0) goto L_0x00c7
            androidx.camera.core.e r9 = new androidx.camera.core.e
            int r11 = r5.getWidth()
            int r5 = r5.getHeight()
            r9.<init>(r11, r5, r8, r10)
            androidx.camera.core.e$a r5 = r9.f1288b
            r1.f9025a = r5
            e0.j r5 = new e0.j
            r5.<init>(r2, r6)
            goto L_0x00ec
        L_0x00c7:
            e0.s r9 = new e0.s
            c0.n0 r11 = r1.f8980g
            int r12 = r5.getWidth()
            int r5 = r5.getHeight()
            if (r11 == 0) goto L_0x00da
            f0.d0 r5 = r11.b()
            goto L_0x00e4
        L_0x00da:
            android.media.ImageReader r5 = android.media.ImageReader.newInstance(r12, r5, r8, r10)
            c0.b r8 = new c0.b
            r8.<init>(r5)
            r5 = r8
        L_0x00e4:
            r9.<init>(r5)
            e0.k r5 = new e0.k
            r5.<init>(r2, r9)
        L_0x00ec:
            android.view.Surface r8 = r9.getSurface()
            java.util.Objects.requireNonNull(r8)
            f0.e0 r10 = r1.f9026b
            if (r10 != 0) goto L_0x00f9
            r10 = r7
            goto L_0x00fa
        L_0x00f9:
            r10 = r6
        L_0x00fa:
            java.lang.String r11 = "The surface is already set."
            al.g0.E(r11, r10)
            f0.e0 r10 = new f0.e0
            android.util.Size r11 = r1.f8976c
            int r12 = r1.f8977d
            r10.<init>(r8, r11, r12)
            r1.f9026b = r10
            androidx.camera.core.f r8 = new androidx.camera.core.f
            r8.<init>(r9)
            r2.f9020c = r8
            c0.q0 r8 = new c0.q0
            r8.<init>(r2, r7)
            h0.b r10 = j7.a.f0()
            r9.g(r8, r10)
            n0.k<e0.w> r8 = r1.f8981h
            r8.f13350a = r5
            n0.k<androidx.camera.core.ImageCaptureException> r5 = r1.f8982i
            e0.j r8 = new e0.j
            r8.<init>(r2, r7)
            r5.f13350a = r8
            int r5 = r1.f8977d
            int r1 = r1.f8978e
            e0.c r7 = new e0.c
            n0.k r8 = new n0.k
            r8.<init>()
            n0.k r9 = new n0.k
            r9.<init>()
            r7.<init>(r8, r9, r5, r1)
            r2.f9021d = r7
            n0.k<androidx.camera.core.d> r1 = r7.f8985a
            e0.b0 r2 = new e0.b0
            r2.<init>(r3, r6)
            r1.f13350a = r2
            n0.k<e0.w> r1 = r7.f8986b
            e0.c0 r2 = new e0.c0
            r2.<init>(r3, r6)
            r1.f13350a = r2
            int r1 = r7.f8987c
            int r2 = r7.f8988d
            e0.f r5 = new e0.f
            n0.k r7 = new n0.k
            r7.<init>()
            r5.<init>(r7, r1, r2)
            r3.f8997b = r5
            r4.f9041b = r5
            n0.k<e0.v$b> r1 = r5.f8998a
            e0.u r2 = new e0.u
            r2.<init>(r4, r6)
            r1.f13350a = r2
            e0.t r1 = new e0.t
            r1.<init>()
            r4.f9042c = r1
            e0.m r1 = new e0.m
            z.d r2 = r4.f9049j
            r1.<init>(r2)
            r4.f9043d = r1
            e0.p r1 = new e0.p
            r1.<init>()
            r4.f9046g = r1
            e0.h r1 = new e0.h
            r1.<init>()
            r4.f9044e = r1
            e0.q r1 = new e0.q
            r1.<init>()
            r4.f9045f = r1
            a.a r1 = new a.a
            r1.<init>()
            r4.f9047h = r1
            int r1 = r5.f8999b
            r2 = 35
            if (r1 == r2) goto L_0x01a2
            boolean r1 = r4.f9050k
            if (r1 == 0) goto L_0x01aa
        L_0x01a2:
            lb.b r1 = new lb.b
            r2 = 2
            r1.<init>(r2)
            r4.f9048i = r1
        L_0x01aa:
            return
        L_0x01ab:
            al.g0.z(r6)
            throw r7
        L_0x01af:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Implementation is missing option unpacker for "
            java.lang.StringBuilder r3 = android.support.v4.media.a.q(r3)
            java.lang.String r4 = r17.toString()
            java.lang.String r1 = f0.b0.h(r1, r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.o.<init>(androidx.camera.core.impl.m, android.util.Size, c0.k, boolean):void");
    }

    public final void a() {
        g0.m.a();
        l lVar = this.f9030c;
        lVar.getClass();
        g0.m.a();
        l.b bVar = lVar.f9022e;
        Objects.requireNonNull(bVar);
        f fVar = lVar.f9020c;
        Objects.requireNonNull(fVar);
        e0 e0Var = bVar.f9026b;
        Objects.requireNonNull(e0Var);
        e0Var.a();
        e0 e0Var2 = bVar.f9026b;
        Objects.requireNonNull(e0Var2);
        e0Var2.d().b(new j2(fVar, 1), a.f0());
        this.f9031d.getClass();
        this.f9032e.getClass();
    }
}
