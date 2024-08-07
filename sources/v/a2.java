package v;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import x.l;
import z.d;

/* compiled from: SynchronizedCaptureSessionOpener */
public final class a2 {

    /* renamed from: a  reason: collision with root package name */
    public final b f15575a;

    /* compiled from: SynchronizedCaptureSessionOpener */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Executor f15576a;

        /* renamed from: b  reason: collision with root package name */
        public final ScheduledExecutorService f15577b;

        /* renamed from: c  reason: collision with root package name */
        public final Handler f15578c;

        /* renamed from: d  reason: collision with root package name */
        public final b1 f15579d;

        /* renamed from: e  reason: collision with root package name */
        public final d f15580e;

        /* renamed from: f  reason: collision with root package name */
        public final d f15581f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f15582g;

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
            if (r2 != false) goto L_0x0047;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(android.os.Handler r2, v.b1 r3, z.d r4, z.d r5, h0.g r6, h0.b r7) {
            /*
                r1 = this;
                r1.<init>()
                r1.f15576a = r6
                r1.f15577b = r7
                r1.f15578c = r2
                r1.f15579d = r3
                r1.f15580e = r4
                r1.f15581f = r5
                java.lang.Class<y.e0> r2 = y.e0.class
                boolean r2 = r5.a(r2)
                java.lang.Class<y.z> r3 = y.z.class
                boolean r3 = r4.a(r3)
                java.lang.Class<y.i> r6 = y.i.class
                boolean r6 = r4.a(r6)
                r7 = 0
                r0 = 1
                if (r2 != 0) goto L_0x002c
                if (r3 != 0) goto L_0x002c
                if (r6 == 0) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r2 = r7
                goto L_0x002d
            L_0x002c:
                r2 = r0
            L_0x002d:
                if (r2 != 0) goto L_0x0047
                z.s r2 = new z.s
                r2.<init>(r4)
                boolean r2 = r2.f17767a
                if (r2 != 0) goto L_0x0047
                java.lang.Class<y.g> r2 = y.g.class
                f0.m0 r2 = r5.f(r2)
                y.g r2 = (y.g) r2
                if (r2 == 0) goto L_0x0044
                r2 = r0
                goto L_0x0045
            L_0x0044:
                r2 = r7
            L_0x0045:
                if (r2 == 0) goto L_0x0048
            L_0x0047:
                r7 = r0
            L_0x0048:
                r1.f15582g = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v.a2.a.<init>(android.os.Handler, v.b1, z.d, z.d, h0.g, h0.b):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: v.z1} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: v.x1} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: v.z1} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: v.z1} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final v.a2 a() {
            /*
                r9 = this;
                v.a2 r0 = new v.a2
                boolean r1 = r9.f15582g
                if (r1 == 0) goto L_0x0019
                v.z1 r1 = new v.z1
                z.d r5 = r9.f15580e
                z.d r6 = r9.f15581f
                v.b1 r4 = r9.f15579d
                java.util.concurrent.Executor r7 = r9.f15576a
                java.util.concurrent.ScheduledExecutorService r8 = r9.f15577b
                android.os.Handler r3 = r9.f15578c
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7, r8)
                goto L_0x0026
            L_0x0019:
                v.x1 r1 = new v.x1
                v.b1 r2 = r9.f15579d
                java.util.concurrent.Executor r3 = r9.f15576a
                java.util.concurrent.ScheduledExecutorService r4 = r9.f15577b
                android.os.Handler r5 = r9.f15578c
                r1.<init>(r2, r3, r4, r5)
            L_0x0026:
                r0.<init>(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: v.a2.a.a():v.a2");
        }
    }

    /* compiled from: SynchronizedCaptureSessionOpener */
    public interface b {
        v8.a c(ArrayList arrayList);

        v8.a<Void> e(CameraDevice cameraDevice, l lVar, List<DeferrableSurface> list);

        boolean stop();
    }

    public a2(x1 x1Var) {
        this.f15575a = x1Var;
    }
}
