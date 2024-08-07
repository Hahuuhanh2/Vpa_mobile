package d;

import com.airbnb.lottie.e0;
import com.airbnb.lottie.h0;
import com.airbnb.lottie.i0;
import java.util.ArrayList;
import java.util.Iterator;
import n4.c;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8426a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f8427b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f8426a = i10;
        this.f8427b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r2 != 2) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        r3 = r0.f2412d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0020, code lost:
        if (r2 != 0) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3 = s1.n.f14600a;
        s1.n.a.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
        r2 = r0.f2411c;
        r3 = r0.f2409a;
        r2.getClass();
        r2 = n1.h.f13434a.b(r3, new t1.m[]{r1}, 0);
        r1 = n1.p.e(r0.f2409a, r1.f14786a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        if (r1 == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        if (r2 == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        s1.n.a.a("EmojiCompat.MetadataRepo.create");
        r3 = new androidx.emoji2.text.h(r2, l2.f.a(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        s1.n.a.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        s1.n.a.b();
        r1 = r0.f2412d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005e, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r2 = r0.f2416h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0061, code lost:
        if (r2 == null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0063, code lost:
        r2.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0066, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r0.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r2 = s1.n.f14600a;
        s1.n.a.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0074, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x007c, code lost:
        throw new java.lang.RuntimeException("Unable to open file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x007d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r2 = s1.n.f14600a;
        s1.n.a.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0083, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x009f, code lost:
        throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r2 + ")");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00a0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a3, code lost:
        monitor-enter(r0.f2412d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r3 = r0.f2416h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00a6, code lost:
        if (r3 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00a8, code lost:
        r3.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ac, code lost:
        r0.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r1 = r0.d();
        r2 = r1.f14790e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f8427b
            androidx.emoji2.text.g$b r0 = (androidx.emoji2.text.g.b) r0
            java.lang.Object r1 = r0.f2412d
            monitor-enter(r1)
            androidx.emoji2.text.d$h r2 = r0.f2416h     // Catch:{ all -> 0x00b3 }
            if (r2 != 0) goto L_0x000e
            monitor-exit(r1)     // Catch:{ all -> 0x00b3 }
            goto L_0x00af
        L_0x000e:
            monitor-exit(r1)     // Catch:{ all -> 0x00b3 }
            t1.m r1 = r0.d()     // Catch:{ all -> 0x00a0 }
            int r2 = r1.f14790e     // Catch:{ all -> 0x00a0 }
            r3 = 2
            if (r2 != r3) goto L_0x0020
            java.lang.Object r3 = r0.f2412d     // Catch:{ all -> 0x00a0 }
            monitor-enter(r3)     // Catch:{ all -> 0x00a0 }
            monitor-exit(r3)     // Catch:{ all -> 0x001d }
            goto L_0x0020
        L_0x001d:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x001d }
            throw r1     // Catch:{ all -> 0x00a0 }
        L_0x0020:
            if (r2 != 0) goto L_0x0084
            java.lang.String r2 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
            int r3 = s1.n.f14600a     // Catch:{ all -> 0x007d }
            s1.n.a.a(r2)     // Catch:{ all -> 0x007d }
            androidx.emoji2.text.g$a r2 = r0.f2411c     // Catch:{ all -> 0x007d }
            android.content.Context r3 = r0.f2409a     // Catch:{ all -> 0x007d }
            r2.getClass()     // Catch:{ all -> 0x007d }
            r2 = 1
            t1.m[] r2 = new t1.m[r2]     // Catch:{ all -> 0x007d }
            r4 = 0
            r2[r4] = r1     // Catch:{ all -> 0x007d }
            n1.o r5 = n1.h.f13434a     // Catch:{ all -> 0x007d }
            android.graphics.Typeface r2 = r5.b(r3, r2, r4)     // Catch:{ all -> 0x007d }
            android.content.Context r3 = r0.f2409a     // Catch:{ all -> 0x007d }
            android.net.Uri r1 = r1.f14786a     // Catch:{ all -> 0x007d }
            java.nio.MappedByteBuffer r1 = n1.p.e(r3, r1)     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x0075
            if (r2 == 0) goto L_0x0075
            java.lang.String r3 = "EmojiCompat.MetadataRepo.create"
            s1.n.a.a(r3)     // Catch:{ all -> 0x006e }
            androidx.emoji2.text.h r3 = new androidx.emoji2.text.h     // Catch:{ all -> 0x006e }
            m2.b r1 = l2.f.a(r1)     // Catch:{ all -> 0x006e }
            r3.<init>(r2, r1)     // Catch:{ all -> 0x006e }
            s1.n.a.b()     // Catch:{ all -> 0x007d }
            s1.n.a.b()     // Catch:{ all -> 0x00a0 }
            java.lang.Object r1 = r0.f2412d     // Catch:{ all -> 0x00a0 }
            monitor-enter(r1)     // Catch:{ all -> 0x00a0 }
            androidx.emoji2.text.d$h r2 = r0.f2416h     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x0066
            r2.b(r3)     // Catch:{ all -> 0x006b }
        L_0x0066:
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            r0.b()     // Catch:{ all -> 0x00a0 }
            goto L_0x00af
        L_0x006b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            throw r2     // Catch:{ all -> 0x00a0 }
        L_0x006e:
            r1 = move-exception
            int r2 = s1.n.f14600a     // Catch:{ all -> 0x007d }
            s1.n.a.b()     // Catch:{ all -> 0x007d }
            throw r1     // Catch:{ all -> 0x007d }
        L_0x0075:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x007d }
            java.lang.String r2 = "Unable to open file."
            r1.<init>(r2)     // Catch:{ all -> 0x007d }
            throw r1     // Catch:{ all -> 0x007d }
        L_0x007d:
            r1 = move-exception
            int r2 = s1.n.f14600a     // Catch:{ all -> 0x00a0 }
            s1.n.a.b()     // Catch:{ all -> 0x00a0 }
            throw r1     // Catch:{ all -> 0x00a0 }
        L_0x0084:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00a0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a0 }
            r3.<init>()     // Catch:{ all -> 0x00a0 }
            java.lang.String r4 = "fetchFonts result is not OK. ("
            r3.append(r4)     // Catch:{ all -> 0x00a0 }
            r3.append(r2)     // Catch:{ all -> 0x00a0 }
            java.lang.String r2 = ")"
            r3.append(r2)     // Catch:{ all -> 0x00a0 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x00a0 }
            r1.<init>(r2)     // Catch:{ all -> 0x00a0 }
            throw r1     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r1 = move-exception
            java.lang.Object r2 = r0.f2412d
            monitor-enter(r2)
            androidx.emoji2.text.d$h r3 = r0.f2416h     // Catch:{ all -> 0x00b0 }
            if (r3 == 0) goto L_0x00ab
            r3.a(r1)     // Catch:{ all -> 0x00b0 }
        L_0x00ab:
            monitor-exit(r2)     // Catch:{ all -> 0x00b0 }
            r0.b()
        L_0x00af:
            return
        L_0x00b0:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b0 }
            throw r0
        L_0x00b3:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00b3 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d.d.a():void");
    }

    private final void b() {
        i0 i0Var = (i0) this.f8427b;
        h0<T> h0Var = i0Var.f4851d;
        if (h0Var != null) {
            V v2 = h0Var.f4830a;
            if (v2 != null) {
                synchronized (i0Var) {
                    Iterator it = new ArrayList(i0Var.f4848a).iterator();
                    while (it.hasNext()) {
                        ((e0) it.next()).onResult(v2);
                    }
                }
                return;
            }
            Throwable th2 = h0Var.f4831b;
            synchronized (i0Var) {
                ArrayList arrayList = new ArrayList(i0Var.f4849b);
                if (arrayList.isEmpty()) {
                    c.c("Lottie encountered an error but no failure listener was added:", th2);
                    return;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((e0) it2.next()).onResult(th2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0269, code lost:
        if (r5 != null) goto L_0x026e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0274  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.f8426a
            r2 = 0
            r3 = 0
            r4 = 1
            switch(r0) {
                case 0: goto L_0x028f;
                case 1: goto L_0x000a;
                case 2: goto L_0x020a;
                case 3: goto L_0x0202;
                case 4: goto L_0x01fa;
                case 5: goto L_0x01cd;
                case 6: goto L_0x01c5;
                case 7: goto L_0x01bb;
                case 8: goto L_0x01b3;
                case 9: goto L_0x01ab;
                case 10: goto L_0x0198;
                case 11: goto L_0x0190;
                case 12: goto L_0x0188;
                case 13: goto L_0x017e;
                case 14: goto L_0x016f;
                case 15: goto L_0x0146;
                case 16: goto L_0x013c;
                case 17: goto L_0x0138;
                case 18: goto L_0x0128;
                case 19: goto L_0x011d;
                case 20: goto L_0x00a0;
                case 21: goto L_0x0092;
                case 22: goto L_0x0084;
                case 23: goto L_0x0077;
                case 24: goto L_0x0073;
                case 25: goto L_0x003e;
                case 26: goto L_0x0020;
                case 27: goto L_0x0016;
                case 28: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0297
        L_0x000c:
            java.lang.Object r0 = r1.f8427b
            v9.f r0 = (v9.f) r0
            v9.e r0 = r0.f16101a
            r0.getClass()
            throw r3
        L_0x0016:
            java.lang.Object r0 = r1.f8427b
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            android.widget.EditText r0 = r0.f6971d
            r0.requestLayout()
            return
        L_0x0020:
            java.lang.Object r0 = r1.f8427b
            com.google.android.material.search.o r0 = (com.google.android.material.search.o) r0
            com.google.android.material.internal.ClippableRoundedCornerLayout r2 = r0.f6710c
            int r3 = r2.getHeight()
            float r3 = (float) r3
            r2.setTranslationY(r3)
            android.animation.AnimatorSet r2 = r0.h(r4)
            com.google.android.material.search.m r3 = new com.google.android.material.search.m
            r3.<init>(r0)
            r2.addListener(r3)
            r2.start()
            return
        L_0x003e:
            java.lang.Object r0 = r1.f8427b
            com.google.android.material.search.SearchView r0 = (com.google.android.material.search.SearchView) r0
            android.widget.EditText r2 = r0.f6670q
            boolean r2 = r2.requestFocus()
            if (r2 == 0) goto L_0x0051
            android.widget.EditText r2 = r0.f6670q
            r3 = 8
            r2.sendAccessibilityEvent(r3)
        L_0x0051:
            android.widget.EditText r2 = r0.f6670q
            boolean r0 = r0.G
            if (r0 == 0) goto L_0x0063
            w1.x0 r0 = w1.d0.h(r2)
            if (r0 == 0) goto L_0x0063
            w1.x0$e r0 = r0.f16423a
            r0.e()
            goto L_0x0072
        L_0x0063:
            android.content.Context r0 = r2.getContext()
            java.lang.Class<android.view.inputmethod.InputMethodManager> r3 = android.view.inputmethod.InputMethodManager.class
            java.lang.Object r0 = k1.a.getSystemService(r0, r3)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r0.showSoftInput(r2, r4)
        L_0x0072:
            return
        L_0x0073:
            r17.b()
            return
        L_0x0077:
            java.lang.Object r0 = r1.f8427b
            al.i1 r0 = (al.i1) r0
            java.lang.String r2 = "$job"
            sk.j.f(r0, r2)
            r0.cancel((java.util.concurrent.CancellationException) r3)
            return
        L_0x0084:
            java.lang.Object r0 = r1.f8427b
            x2.m r0 = (x2.m) r0
            java.lang.String r2 = "this$0"
            sk.j.f(r0, r2)
            r0.getClass()
            r0 = 0
            throw r0
        L_0x0092:
            java.lang.Object r0 = r1.f8427b
            x2.k r0 = (x2.k) r0
            java.lang.String r2 = "this$0"
            sk.j.f(r0, r2)
            r0.getClass()
            r0 = 0
            throw r0
        L_0x00a0:
            java.lang.Object r0 = r1.f8427b
            x2.j r0 = (x2.j) r0
            java.lang.String r5 = "this$0"
            sk.j.f(r0, r5)
            x2.h r5 = r0.f16931b
            x2.h$c r0 = r0.f16934e
            if (r0 == 0) goto L_0x0117
            r5.getClass()
            o.b<x2.h$c, x2.h$d> r3 = r5.f16916j
            monitor-enter(r3)
            o.b<x2.h$c, x2.h$d> r6 = r5.f16916j     // Catch:{ all -> 0x0114 }
            java.lang.Object r0 = r6.l(r0)     // Catch:{ all -> 0x0114 }
            x2.h$d r0 = (x2.h.d) r0     // Catch:{ all -> 0x0114 }
            monitor-exit(r3)
            if (r0 == 0) goto L_0x0113
            x2.h$b r3 = r5.f16915i
            int[] r0 = r0.f16926b
            int r6 = r0.length
            int[] r0 = java.util.Arrays.copyOf(r0, r6)
            r3.getClass()
            java.lang.String r6 = "tableIds"
            sk.j.f(r0, r6)
            monitor-enter(r3)
            int r6 = r0.length     // Catch:{ all -> 0x0110 }
            r7 = r2
            r8 = r7
        L_0x00d5:
            if (r7 >= r6) goto L_0x00ed
            r9 = r0[r7]     // Catch:{ all -> 0x0110 }
            long[] r10 = r3.f16920a     // Catch:{ all -> 0x0110 }
            r11 = r10[r9]     // Catch:{ all -> 0x0110 }
            r13 = 1
            long r15 = r11 - r13
            r10[r9] = r15     // Catch:{ all -> 0x0110 }
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x00ea
            r3.f16923d = r4     // Catch:{ all -> 0x0110 }
            r8 = r4
        L_0x00ea:
            int r7 = r7 + 1
            goto L_0x00d5
        L_0x00ed:
            ek.i r0 = ek.i.f20112a     // Catch:{ all -> 0x0110 }
            monitor-exit(r3)
            if (r8 == 0) goto L_0x0113
            x2.n r0 = r5.f16907a
            c3.b r0 = r0.f16944a
            if (r0 == 0) goto L_0x00ff
            boolean r0 = r0.isOpen()
            if (r0 != r4) goto L_0x00ff
            r2 = r4
        L_0x00ff:
            if (r2 != 0) goto L_0x0102
            goto L_0x0113
        L_0x0102:
            x2.n r0 = r5.f16907a
            c3.c r0 = r0.g()
            c3.b r0 = r0.P()
            r5.e(r0)
            goto L_0x0113
        L_0x0110:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0113:
            return
        L_0x0114:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0117:
            java.lang.String r0 = "observer"
            sk.j.l(r0)
            throw r3
        L_0x011d:
            java.lang.Object r0 = r1.f8427b
            android.support.v4.media.a.s(r0)
            java.lang.String r0 = "this$0"
            sk.j.f(r3, r0)
            throw r3
        L_0x0128:
            java.lang.Object r0 = r1.f8427b
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.i0 r2 = r0.V
            android.os.Bundle r4 = r0.f2446d
            a3.d r2 = r2.f2653f
            r2.b(r4)
            r0.f2446d = r3
            return
        L_0x0138:
            r17.a()
            return
        L_0x013c:
            java.lang.Object r0 = r1.f8427b
            androidx.camera.view.c$a r0 = (androidx.camera.view.c.a) r0
            r0.f r0 = (r0.f) r0
            r0.a()
            return
        L_0x0146:
            java.lang.Object r0 = r1.f8427b
            n0.x r0 = (n0.x) r0
            n0.x$c r0 = r0.f13421c
            if (r0 == 0) goto L_0x016e
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0156:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x016e
            java.lang.Object r2 = r0.next()
            n0.u r2 = (n0.u) r2
            r2.getClass()
            g0.m.a()
            r2.c()
            r2.f13403n = r4
            goto L_0x0156
        L_0x016e:
            return
        L_0x016f:
            java.lang.Object r0 = r1.f8427b
            z0.b$a r0 = (z0.b.a) r0
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "Failed to snapshot: OpenGLRenderer not ready."
            r2.<init>(r3)
            r0.b(r2)
            return
        L_0x017e:
            java.lang.Object r0 = r1.f8427b
            n0.j r0 = (n0.j) r0
            r0.f13347j = r4
            r0.e()
            return
        L_0x0188:
            java.lang.Object r0 = r1.f8427b
            c0.x0 r0 = (c0.x0) r0
            r0.close()
            return
        L_0x0190:
            java.lang.Object r0 = r1.f8427b
            v8.a r0 = (v8.a) r0
            r0.cancel(r4)
            return
        L_0x0198:
            java.lang.Object r0 = r1.f8427b
            f0.t$c r0 = (f0.t.c) r0
            v.u$b r0 = (v.u.b) r0
            v.u r3 = v.u.this
            int r3 = r3.f15867e
            r4 = 2
            if (r3 != r4) goto L_0x01aa
            v.u r0 = v.u.this
            r0.J(r2)
        L_0x01aa:
            return
        L_0x01ab:
            java.lang.Object r0 = r1.f8427b
            e0.h0 r0 = (e0.h0) r0
            r0.c()
            return
        L_0x01b3:
            java.lang.Object r0 = r1.f8427b
            c0.t0 r0 = (c0.t0) r0
            r0.o()
            return
        L_0x01bb:
            java.lang.Object r0 = r1.f8427b
            w.z$a r0 = (w.z.a) r0
            android.hardware.camera2.CameraManager$AvailabilityCallback r0 = r0.f16262b
            w.e.a(r0)
            return
        L_0x01c5:
            java.lang.Object r0 = r1.f8427b
            v.c0$d r0 = (v.c0.d) r0
            r0.c()
            return
        L_0x01cd:
            java.lang.Object r0 = r1.f8427b
            v.u$e$b r0 = (v.u.e.b) r0
            boolean r5 = r0.f15897b
            if (r5 != 0) goto L_0x01f9
            v.u$e r5 = v.u.e.this
            v.u r5 = v.u.this
            int r5 = r5.f15867e
            r6 = 7
            if (r5 != r6) goto L_0x01df
            r2 = r4
        L_0x01df:
            al.g0.E(r3, r2)
            v.u$e r2 = v.u.e.this
            boolean r2 = r2.c()
            if (r2 == 0) goto L_0x01f2
            v.u$e r0 = v.u.e.this
            v.u r0 = v.u.this
            r0.I(r4)
            goto L_0x01f9
        L_0x01f2:
            v.u$e r0 = v.u.e.this
            v.u r0 = v.u.this
            r0.J(r4)
        L_0x01f9:
            return
        L_0x01fa:
            java.lang.Object r0 = r1.f8427b
            f0.f r0 = (f0.f) r0
            r0.a()
            return
        L_0x0202:
            java.lang.Object r0 = r1.f8427b
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            r0.l()
            return
        L_0x020a:
            java.lang.Object r0 = r1.f8427b
            android.content.Context r0 = (android.content.Context) r0
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r2 < r5) goto L_0x028c
            androidx.appcompat.app.q$a r2 = androidx.appcompat.app.f.f428a
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r5 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r2.<init>(r0, r5)
            android.content.pm.PackageManager r5 = r0.getPackageManager()
            int r5 = r5.getComponentEnabledSetting(r2)
            if (r5 == r4) goto L_0x028c
            boolean r5 = s1.a.a()
            java.lang.String r6 = "locale"
            if (r5 == 0) goto L_0x0267
            v0.d<java.lang.ref.WeakReference<androidx.appcompat.app.f>> r5 = androidx.appcompat.app.f.f434n
            java.util.Iterator r5 = r5.iterator()
        L_0x0235:
            r7 = r5
            v0.g$a r7 = (v0.g.a) r7
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0256
            java.lang.Object r7 = r7.next()
            java.lang.ref.WeakReference r7 = (java.lang.ref.WeakReference) r7
            java.lang.Object r7 = r7.get()
            androidx.appcompat.app.f r7 = (androidx.appcompat.app.f) r7
            if (r7 == 0) goto L_0x0235
            android.content.Context r7 = r7.f()
            if (r7 == 0) goto L_0x0235
            java.lang.Object r3 = r7.getSystemService(r6)
        L_0x0256:
            if (r3 == 0) goto L_0x026c
            android.os.LocaleList r3 = androidx.appcompat.app.f.b.a(r3)
            s1.j r5 = new s1.j
            s1.m r7 = new s1.m
            r7.<init>(r3)
            r5.<init>(r7)
            goto L_0x026e
        L_0x0267:
            s1.j r5 = androidx.appcompat.app.f.f430c
            if (r5 == 0) goto L_0x026c
            goto L_0x026e
        L_0x026c:
            s1.j r5 = s1.j.f14593b
        L_0x026e:
            boolean r3 = r5.d()
            if (r3 == 0) goto L_0x0285
            java.lang.String r3 = androidx.appcompat.app.q.b(r0)
            java.lang.Object r5 = r0.getSystemService(r6)
            if (r5 == 0) goto L_0x0285
            android.os.LocaleList r3 = androidx.appcompat.app.f.a.a(r3)
            androidx.appcompat.app.f.b.b(r5, r3)
        L_0x0285:
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r0.setComponentEnabledSetting(r2, r4, r4)
        L_0x028c:
            androidx.appcompat.app.f.f433f = r4
            return
        L_0x028f:
            java.lang.Object r0 = r1.f8427b
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            r0.invalidateOptionsMenu()
            return
        L_0x0297:
            java.lang.Object r0 = r1.f8427b
            ab.b r0 = (ab.b) r0
            java.lang.Object r3 = ab.b.f143m
            r0.b(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.d.run():void");
    }
}
