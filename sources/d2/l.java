package d2;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.library.R$id;
import d2.h;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

/* compiled from: ViewDataBinding */
public abstract class l extends a {

    /* renamed from: s  reason: collision with root package name */
    public static final boolean f8547s = true;

    /* renamed from: t  reason: collision with root package name */
    public static final a f8548t = new a();

    /* renamed from: u  reason: collision with root package name */
    public static final ReferenceQueue<l> f8549u = new ReferenceQueue<>();

    /* renamed from: v  reason: collision with root package name */
    public static final b f8550v = new b();

    /* renamed from: b  reason: collision with root package name */
    public final c f8551b = new c();

    /* renamed from: c  reason: collision with root package name */
    public boolean f8552c = false;

    /* renamed from: d  reason: collision with root package name */
    public n[] f8553d;

    /* renamed from: e  reason: collision with root package name */
    public final View f8554e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8555f;

    /* renamed from: n  reason: collision with root package name */
    public Choreographer f8556n;

    /* renamed from: o  reason: collision with root package name */
    public final m f8557o;

    /* renamed from: p  reason: collision with root package name */
    public Handler f8558p;

    /* renamed from: q  reason: collision with root package name */
    public final e f8559q;

    /* renamed from: r  reason: collision with root package name */
    public l f8560r;

    /* compiled from: ViewDataBinding */
    public class a {
        public final n a(l lVar, int i10, ReferenceQueue<l> referenceQueue) {
            return new e(lVar, i10, referenceQueue).f8565a;
        }
    }

    /* compiled from: ViewDataBinding */
    public class b implements View.OnAttachStateChangeListener {
        @TargetApi(19)
        public final void onViewAttachedToWindow(View view) {
            l lVar;
            if (view != null) {
                lVar = (l) view.getTag(R$id.dataBinding);
            } else {
                lVar = null;
            }
            lVar.f8551b.run();
            view.removeOnAttachStateChangeListener(this);
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewDataBinding */
    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            synchronized (this) {
                l.this.f8552c = false;
            }
            while (true) {
                Reference<? extends l> poll = l.f8549u.poll();
                if (poll == null) {
                    break;
                } else if (poll instanceof n) {
                    ((n) poll).a();
                }
            }
            if (!l.this.f8554e.isAttachedToWindow()) {
                View view = l.this.f8554e;
                b bVar = l.f8550v;
                view.removeOnAttachStateChangeListener(bVar);
                l.this.f8554e.addOnAttachStateChangeListener(bVar);
                return;
            }
            l.this.j();
        }
    }

    /* compiled from: ViewDataBinding */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final String[][] f8562a;

        /* renamed from: b  reason: collision with root package name */
        public final int[][] f8563b;

        /* renamed from: c  reason: collision with root package name */
        public final int[][] f8564c;

        public d(int i10) {
            this.f8562a = new String[i10][];
            this.f8563b = new int[i10][];
            this.f8564c = new int[i10][];
        }

        public final void a(int i10, int[] iArr, int[] iArr2, String[] strArr) {
            this.f8562a[i10] = strArr;
            this.f8563b[i10] = iArr;
            this.f8564c[i10] = iArr2;
        }
    }

    /* compiled from: ViewDataBinding */
    public static class e extends h.a implements j<h> {

        /* renamed from: a  reason: collision with root package name */
        public final n<h> f8565a;

        public e(l lVar, int i10, ReferenceQueue<l> referenceQueue) {
            this.f8565a = new n<>(lVar, i10, this, referenceQueue);
        }

        public final void a(Object obj) {
            ((h) obj).a(this);
        }

        public final void b(i iVar) {
            iVar.d(this);
        }

        public final void c(int i10, a aVar) {
            n<h> nVar = this.f8565a;
            l lVar = (l) nVar.get();
            if (lVar == null) {
                nVar.a();
            }
            if (lVar != null) {
                n<h> nVar2 = this.f8565a;
                if (((h) nVar2.f8569c) == aVar && lVar.p(aVar, nVar2.f8568b, i10)) {
                    lVar.t();
                }
            }
        }
    }

    public l(int i10, View view, Object obj) {
        e g2 = g(obj);
        this.f8559q = g2;
        this.f8553d = new n[i10];
        this.f8554e = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        } else if (f8547s) {
            this.f8556n = Choreographer.getInstance();
            this.f8557o = new m(this);
        } else {
            this.f8557o = null;
            this.f8558p = new Handler(Looper.myLooper());
        }
    }

    public static e g(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof e) {
            return (e) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    public static l l(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, Object obj) {
        return f.c(layoutInflater, i10, viewGroup, false, g(obj));
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01a6 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void n(d2.e r19, android.view.View r20, java.lang.Object[] r21, d2.l.d r22, android.util.SparseIntArray r23, boolean r24) {
        /*
            r6 = r19
            r0 = r20
            r7 = r22
            r8 = r23
            if (r0 == 0) goto L_0x0013
            int r1 = androidx.databinding.library.R$id.dataBinding
            java.lang.Object r1 = r0.getTag(r1)
            d2.l r1 = (d2.l) r1
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            if (r1 == 0) goto L_0x0017
            return
        L_0x0017:
            java.lang.Object r1 = r20.getTag()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x0022
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            java.lang.String r10 = "layout"
            r11 = -1
            r13 = 1
            if (r24 == 0) goto L_0x0078
            if (r1 == 0) goto L_0x0078
            boolean r2 = r1.startsWith(r10)
            if (r2 == 0) goto L_0x0078
            r2 = 95
            int r2 = r1.lastIndexOf(r2)
            if (r2 <= 0) goto L_0x0074
            int r2 = r2 + r13
            int r3 = r1.length()
            if (r3 != r2) goto L_0x0042
        L_0x0040:
            r3 = 0
            goto L_0x0054
        L_0x0042:
            r4 = r2
        L_0x0043:
            if (r4 >= r3) goto L_0x0053
            char r5 = r1.charAt(r4)
            boolean r5 = java.lang.Character.isDigit(r5)
            if (r5 != 0) goto L_0x0050
            goto L_0x0040
        L_0x0050:
            int r4 = r4 + 1
            goto L_0x0043
        L_0x0053:
            r3 = r13
        L_0x0054:
            if (r3 == 0) goto L_0x0074
            int r3 = r1.length()
            r4 = 0
        L_0x005b:
            if (r2 >= r3) goto L_0x0069
            int r4 = r4 * 10
            char r5 = r1.charAt(r2)
            int r5 = r5 + -48
            int r4 = r4 + r5
            int r2 = r2 + 1
            goto L_0x005b
        L_0x0069:
            r1 = r21[r4]
            if (r1 != 0) goto L_0x006f
            r21[r4] = r0
        L_0x006f:
            if (r7 != 0) goto L_0x0072
            r4 = r11
        L_0x0072:
            r1 = r13
            goto L_0x0076
        L_0x0074:
            r4 = r11
            r1 = 0
        L_0x0076:
            r14 = r4
            goto L_0x00a5
        L_0x0078:
            if (r1 == 0) goto L_0x00a3
            java.lang.String r2 = "binding_"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x00a3
            r2 = 8
            int r3 = r1.length()
            r4 = 0
        L_0x0089:
            if (r2 >= r3) goto L_0x0097
            int r4 = r4 * 10
            char r5 = r1.charAt(r2)
            int r5 = r5 + -48
            int r4 = r4 + r5
            int r2 = r2 + 1
            goto L_0x0089
        L_0x0097:
            r1 = r21[r4]
            if (r1 != 0) goto L_0x009d
            r21[r4] = r0
        L_0x009d:
            if (r7 != 0) goto L_0x00a0
            r4 = r11
        L_0x00a0:
            r14 = r4
            r1 = r13
            goto L_0x00a5
        L_0x00a3:
            r14 = r11
            r1 = 0
        L_0x00a5:
            if (r1 != 0) goto L_0x00bb
            int r1 = r20.getId()
            if (r1 <= 0) goto L_0x00bb
            if (r8 == 0) goto L_0x00bb
            int r1 = r8.get(r1, r11)
            if (r1 < 0) goto L_0x00bb
            r2 = r21[r1]
            if (r2 != 0) goto L_0x00bb
            r21[r1] = r0
        L_0x00bb:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0209
            r15 = r0
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            int r5 = r15.getChildCount()
            r0 = 0
            r1 = 0
        L_0x00c8:
            if (r0 >= r5) goto L_0x0209
            android.view.View r2 = r15.getChildAt(r0)
            if (r14 < 0) goto L_0x01de
            java.lang.Object r3 = r2.getTag()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L_0x01de
            java.lang.Object r3 = r2.getTag()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "_0"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L_0x01de
            boolean r4 = r3.startsWith(r10)
            if (r4 == 0) goto L_0x01de
            r4 = 47
            int r16 = r3.indexOf(r4)
            if (r16 <= 0) goto L_0x01de
            int r4 = r3.indexOf(r4)
            int r4 = r4 + r13
            int r16 = r3.length()
            int r9 = r16 + -2
            java.lang.CharSequence r3 = r3.subSequence(r4, r9)
            java.lang.String[][] r4 = r7.f8562a
            r4 = r4[r14]
            int r9 = r4.length
            r13 = r1
        L_0x0109:
            if (r13 >= r9) goto L_0x0117
            r12 = r4[r13]
            boolean r12 = android.text.TextUtils.equals(r3, r12)
            if (r12 == 0) goto L_0x0114
            goto L_0x0118
        L_0x0114:
            int r13 = r13 + 1
            goto L_0x0109
        L_0x0117:
            r13 = r11
        L_0x0118:
            if (r13 < 0) goto L_0x01de
            int r1 = r13 + 1
            int[][] r3 = r7.f8563b
            r3 = r3[r14]
            r3 = r3[r13]
            int[][] r4 = r7.f8564c
            r4 = r4[r14]
            r4 = r4[r13]
            android.view.View r9 = r15.getChildAt(r0)
            java.lang.Object r9 = r9.getTag()
            java.lang.String r9 = (java.lang.String) r9
            int r12 = r9.length()
            int r12 = r12 + r11
            r13 = 0
            java.lang.String r12 = r9.substring(r13, r12)
            int r13 = r12.length()
            int r11 = r15.getChildCount()
            int r17 = r0 + 1
            r20 = r1
            r24 = r5
            r1 = r17
            r5 = r0
        L_0x014d:
            if (r1 >= r11) goto L_0x01af
            android.view.View r17 = r15.getChildAt(r1)
            java.lang.Object r7 = r17.getTag()
            boolean r7 = r7 instanceof java.lang.String
            if (r7 == 0) goto L_0x0162
            java.lang.Object r7 = r17.getTag()
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0163
        L_0x0162:
            r7 = 0
        L_0x0163:
            if (r7 == 0) goto L_0x01a4
            boolean r17 = r7.startsWith(r12)
            if (r17 == 0) goto L_0x01a4
            int r8 = r7.length()
            r17 = r10
            int r10 = r9.length()
            if (r8 != r10) goto L_0x0186
            int r8 = r7.length()
            r10 = -1
            int r8 = r8 + r10
            char r8 = r7.charAt(r8)
            r10 = 48
            if (r8 != r10) goto L_0x0186
            goto L_0x01b1
        L_0x0186:
            int r8 = r7.length()
            if (r8 != r13) goto L_0x018e
        L_0x018c:
            r7 = 0
            goto L_0x01a0
        L_0x018e:
            r10 = r13
        L_0x018f:
            if (r10 >= r8) goto L_0x019f
            char r18 = r7.charAt(r10)
            boolean r18 = java.lang.Character.isDigit(r18)
            if (r18 != 0) goto L_0x019c
            goto L_0x018c
        L_0x019c:
            int r10 = r10 + 1
            goto L_0x018f
        L_0x019f:
            r7 = 1
        L_0x01a0:
            if (r7 == 0) goto L_0x01a6
            r5 = r1
            goto L_0x01a6
        L_0x01a4:
            r17 = r10
        L_0x01a6:
            int r1 = r1 + 1
            r7 = r22
            r8 = r23
            r10 = r17
            goto L_0x014d
        L_0x01af:
            r17 = r10
        L_0x01b1:
            if (r5 != r0) goto L_0x01ba
            d2.l r1 = d2.f.a(r6, r2, r4)
            r21[r3] = r1
            goto L_0x01d9
        L_0x01ba:
            int r5 = r5 - r0
            r1 = 1
            int r5 = r5 + r1
            android.view.View[] r1 = new android.view.View[r5]
            r7 = 0
        L_0x01c0:
            if (r7 >= r5) goto L_0x01cd
            int r8 = r0 + r7
            android.view.View r8 = r15.getChildAt(r8)
            r1[r7] = r8
            int r7 = r7 + 1
            goto L_0x01c0
        L_0x01cd:
            androidx.databinding.DataBinderMapperImpl r7 = d2.f.f8544a
            d2.l r1 = r7.c(r6, r1, r4)
            r21[r3] = r1
            int r5 = r5 + -1
            int r5 = r5 + r0
            r0 = r5
        L_0x01d9:
            r8 = r20
            r7 = r0
            r1 = 1
            goto L_0x01e5
        L_0x01de:
            r24 = r5
            r17 = r10
            r7 = r0
            r8 = r1
            r1 = 0
        L_0x01e5:
            if (r1 != 0) goto L_0x01f7
            r5 = 0
            r0 = r19
            r1 = r2
            r2 = r21
            r3 = r22
            r4 = r23
            r9 = r24
            n(r0, r1, r2, r3, r4, r5)
            goto L_0x01f9
        L_0x01f7:
            r9 = r24
        L_0x01f9:
            r0 = 1
            int r1 = r7 + 1
            r7 = r22
            r13 = r0
            r0 = r1
            r1 = r8
            r5 = r9
            r10 = r17
            r11 = -1
            r8 = r23
            goto L_0x00c8
        L_0x0209:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.l.n(d2.e, android.view.View, java.lang.Object[], d2.l$d, android.util.SparseIntArray, boolean):void");
    }

    public static Object[] o(e eVar, View view, int i10, d dVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        n(eVar, view, objArr, dVar, sparseIntArray, true);
        return objArr;
    }

    public abstract void h();

    public final void i() {
        if (this.f8555f) {
            t();
        } else if (k()) {
            this.f8555f = true;
            h();
            this.f8555f = false;
        }
    }

    public final void j() {
        l lVar = this.f8560r;
        if (lVar == null) {
            i();
        } else {
            lVar.j();
        }
    }

    public abstract boolean k();

    public abstract void m();

    public abstract boolean p(Object obj, int i10, int i11);

    public final void r(int i10, i iVar, a aVar) {
        if (iVar != null) {
            n nVar = this.f8553d[i10];
            if (nVar == null) {
                nVar = aVar.a(this, i10, f8549u);
                this.f8553d[i10] = nVar;
            }
            nVar.a();
            nVar.f8569c = iVar;
            nVar.f8567a.b(iVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        if (f8547s == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        r2.f8556n.postFrameCallback(r2.f8557o);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        r2.f8558p.post(r2.f8551b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t() {
        /*
            r2 = this;
            d2.l r0 = r2.f8560r
            if (r0 == 0) goto L_0x0008
            r0.t()
            goto L_0x0026
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f8552c     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x000f
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            return
        L_0x000f:
            r0 = 1
            r2.f8552c = r0     // Catch:{ all -> 0x0027 }
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            boolean r0 = f8547s
            if (r0 == 0) goto L_0x001f
            android.view.Choreographer r0 = r2.f8556n
            d2.m r1 = r2.f8557o
            r0.postFrameCallback(r1)
            goto L_0x0026
        L_0x001f:
            android.os.Handler r0 = r2.f8558p
            d2.l$c r1 = r2.f8551b
            r0.post(r1)
        L_0x0026:
            return
        L_0x0027:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.l.t():void");
    }

    public final void u(int i10, i iVar) {
        a aVar = f8548t;
        if (iVar == null) {
            n nVar = this.f8553d[i10];
            if (nVar != null) {
                nVar.a();
                return;
            }
            return;
        }
        n nVar2 = this.f8553d[i10];
        if (nVar2 == null) {
            r(i10, iVar, aVar);
        } else if (nVar2.f8569c != iVar) {
            if (nVar2 != null) {
                nVar2.a();
            }
            r(i10, iVar, aVar);
        }
    }
}
