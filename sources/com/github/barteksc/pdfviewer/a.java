package com.github.barteksc.pdfviewer;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Pair;
import java.util.Iterator;
import p3.l0;
import w5.b;

/* compiled from: PagesLoader */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public PDFView f5076a;

    /* renamed from: b  reason: collision with root package name */
    public int f5077b;

    /* renamed from: c  reason: collision with root package name */
    public float f5078c;

    /* renamed from: d  reason: collision with root package name */
    public float f5079d;

    /* renamed from: e  reason: collision with root package name */
    public Pair<Integer, Integer> f5080e;

    /* renamed from: f  reason: collision with root package name */
    public float f5081f;

    /* renamed from: g  reason: collision with root package name */
    public float f5082g;

    /* renamed from: h  reason: collision with root package name */
    public float f5083h;

    /* renamed from: i  reason: collision with root package name */
    public float f5084i;

    /* renamed from: j  reason: collision with root package name */
    public float f5085j;

    /* renamed from: k  reason: collision with root package name */
    public float f5086k;

    /* renamed from: l  reason: collision with root package name */
    public float f5087l;

    /* renamed from: m  reason: collision with root package name */
    public float f5088m;

    /* renamed from: n  reason: collision with root package name */
    public int f5089n;

    /* renamed from: o  reason: collision with root package name */
    public int f5090o;

    /* renamed from: p  reason: collision with root package name */
    public float f5091p;

    /* renamed from: q  reason: collision with root package name */
    public final RectF f5092q = new RectF(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: com.github.barteksc.pdfviewer.a$a  reason: collision with other inner class name */
    /* compiled from: PagesLoader */
    public class C0057a {

        /* renamed from: a  reason: collision with root package name */
        public int f5093a;

        /* renamed from: b  reason: collision with root package name */
        public int f5094b;

        /* renamed from: c  reason: collision with root package name */
        public int f5095c;
    }

    public a(PDFView pDFView) {
        this.f5076a = pDFView;
    }

    public final int a(int i10) {
        int i11;
        if (this.f5076a.getOriginalUserPages() == null) {
            i11 = i10;
        } else if (i10 < 0 || i10 >= this.f5076a.getOriginalUserPages().length) {
            return -1;
        } else {
            i11 = this.f5076a.getOriginalUserPages()[i10];
        }
        if (i11 < 0 || i10 >= this.f5076a.getDocumentPageCount()) {
            return -1;
        }
        return i11;
    }

    public final C0057a b(float f10, boolean z10) {
        float f11;
        float f12;
        C0057a aVar = new C0057a();
        if (f10 > 0.0f) {
            f10 = 0.0f;
        }
        float f13 = -f10;
        if (this.f5076a.N) {
            int S = l0.S(f13 / (this.f5078c + this.f5091p));
            aVar.f5093a = S;
            f11 = Math.abs(f13 - ((this.f5078c + this.f5091p) * ((float) S))) / this.f5083h;
            f12 = this.f5081f / this.f5084i;
        } else {
            int S2 = l0.S(f13 / (this.f5079d + this.f5091p));
            aVar.f5093a = S2;
            f12 = Math.abs(f13 - ((this.f5079d + this.f5091p) * ((float) S2))) / this.f5084i;
            f11 = this.f5082g / this.f5083h;
        }
        if (z10) {
            aVar.f5094b = l0.m(f11);
            aVar.f5095c = l0.m(f12);
        } else {
            aVar.f5094b = l0.S(f11);
            aVar.f5095c = l0.S(f12);
        }
        return aVar;
    }

    public final boolean c(int i10, int i11, int i12, int i13, float f10, float f11) {
        float f12;
        float f13;
        y5.a aVar;
        y5.a aVar2;
        float f14 = ((float) i13) * f10;
        float f15 = ((float) i12) * f11;
        float f16 = this.f5087l;
        float f17 = this.f5088m;
        if (f14 + f10 > 1.0f) {
            f12 = 1.0f - f14;
        } else {
            f12 = f10;
        }
        if (f15 + f11 > 1.0f) {
            f13 = 1.0f - f15;
        } else {
            f13 = f11;
        }
        float f18 = f16 * f12;
        float f19 = f17 * f13;
        RectF rectF = new RectF(f14, f15, f12 + f14, f13 + f15);
        boolean z10 = false;
        if (f18 <= 0.0f || f19 <= 0.0f) {
            return false;
        }
        b bVar = this.f5076a.f5042e;
        int i14 = this.f5077b;
        bVar.getClass();
        y5.a aVar3 = new y5.a(i10, i11, (Bitmap) null, rectF, false, 0);
        synchronized (bVar.f16497d) {
            try {
                Iterator<y5.a> it = bVar.f16494a.iterator();
                while (true) {
                    aVar = null;
                    if (!it.hasNext()) {
                        aVar2 = null;
                        break;
                    }
                    aVar2 = it.next();
                    if (aVar2.equals(aVar3)) {
                        break;
                    }
                }
                if (aVar2 != null) {
                    bVar.f16494a.remove(aVar2);
                    aVar2.f17532f = i14;
                    bVar.f16495b.offer(aVar2);
                    z10 = true;
                } else {
                    Iterator<y5.a> it2 = bVar.f16495b.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        y5.a next = it2.next();
                        if (next.equals(aVar3)) {
                            aVar = next;
                            break;
                        }
                    }
                    if (aVar != null) {
                        z10 = true;
                    }
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (!z10) {
            PDFView pDFView = this.f5076a;
            pDFView.E.a(i10, i11, f18, f19, rectF, false, this.f5077b, pDFView.S, pDFView.T);
        }
        this.f5077b++;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int d(boolean r11, int r12, int r13) {
        /*
            r10 = this;
            com.github.barteksc.pdfviewer.PDFView r0 = r10.f5076a
            boolean r1 = r0.N
            r2 = 0
            if (r1 == 0) goto L_0x001b
            float r1 = r10.f5083h
            float r12 = (float) r12
            float r1 = r1 * r12
            r12 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r12
            float r12 = r0.getCurrentYOffset()
            if (r11 == 0) goto L_0x002c
            com.github.barteksc.pdfviewer.PDFView r11 = r10.f5076a
            int r11 = r11.getHeight()
            goto L_0x002d
        L_0x001b:
            float r1 = r10.f5084i
            float r12 = (float) r12
            float r1 = r1 * r12
            float r12 = r0.getCurrentXOffset()
            if (r11 == 0) goto L_0x002c
            com.github.barteksc.pdfviewer.PDFView r11 = r10.f5076a
            int r11 = r11.getWidth()
            goto L_0x002d
        L_0x002c:
            r11 = r2
        L_0x002d:
            float r11 = (float) r11
            float r12 = r12 - r11
            float r12 = r12 - r1
            com.github.barteksc.pdfviewer.a$a r11 = r10.b(r12, r2)
            int r12 = r11.f5093a
            int r12 = r10.a(r12)
            if (r12 >= 0) goto L_0x003d
            return r2
        L_0x003d:
            int r0 = r11.f5093a
            r10.e(r0, r12)
            com.github.barteksc.pdfviewer.PDFView r0 = r10.f5076a
            boolean r0 = r0.N
            if (r0 == 0) goto L_0x0091
            float r0 = r10.f5081f
            float r1 = r10.f5084i
            float r0 = r0 / r1
            int r0 = p3.l0.S(r0)
            int r0 = r0 + -1
            if (r0 >= 0) goto L_0x0056
            r0 = r2
        L_0x0056:
            float r1 = r10.f5081f
            com.github.barteksc.pdfviewer.PDFView r3 = r10.f5076a
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r1 = r1 + r3
            float r3 = r10.f5084i
            float r1 = r1 / r3
            int r1 = p3.l0.m(r1)
            int r1 = r1 + 1
            android.util.Pair<java.lang.Integer, java.lang.Integer> r3 = r10.f5080e
            java.lang.Object r3 = r3.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r1 <= r3) goto L_0x0076
            r1 = r3
        L_0x0076:
            if (r0 > r1) goto L_0x00da
            int r4 = r11.f5093a
            int r6 = r11.f5094b
            float r8 = r10.f5085j
            float r9 = r10.f5086k
            r3 = r10
            r5 = r12
            r7 = r0
            boolean r3 = r3.c(r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x008b
            int r2 = r2 + 1
        L_0x008b:
            if (r2 < r13) goto L_0x008e
            return r2
        L_0x008e:
            int r0 = r0 + 1
            goto L_0x0076
        L_0x0091:
            float r0 = r10.f5082g
            float r1 = r10.f5083h
            float r0 = r0 / r1
            int r0 = p3.l0.S(r0)
            int r0 = r0 + -1
            if (r0 >= 0) goto L_0x009f
            r0 = r2
        L_0x009f:
            float r1 = r10.f5082g
            com.github.barteksc.pdfviewer.PDFView r3 = r10.f5076a
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r1 = r1 + r3
            float r3 = r10.f5083h
            float r1 = r1 / r3
            int r1 = p3.l0.m(r1)
            int r1 = r1 + 1
            android.util.Pair<java.lang.Integer, java.lang.Integer> r3 = r10.f5080e
            java.lang.Object r3 = r3.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r1 <= r3) goto L_0x00bf
            r1 = r3
        L_0x00bf:
            if (r0 > r1) goto L_0x00da
            int r4 = r11.f5093a
            int r7 = r11.f5095c
            float r8 = r10.f5085j
            float r9 = r10.f5086k
            r3 = r10
            r5 = r12
            r6 = r0
            boolean r3 = r3.c(r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x00d4
            int r2 = r2 + 1
        L_0x00d4:
            if (r2 < r13) goto L_0x00d7
            return r2
        L_0x00d7:
            int r0 = r0 + 1
            goto L_0x00bf
        L_0x00da:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.a.d(boolean, int, int):int");
    }

    public final void e(int i10, int i11) {
        boolean z10;
        b bVar = this.f5076a.f5042e;
        RectF rectF = this.f5092q;
        bVar.getClass();
        y5.a aVar = new y5.a(i10, i11, (Bitmap) null, rectF, true, 0);
        synchronized (bVar.f16496c) {
            Iterator it = bVar.f16496c.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((y5.a) it.next()).equals(aVar)) {
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
        }
        if (!z10) {
            PDFView pDFView = this.f5076a;
            pDFView.E.a(i10, i11, (float) this.f5089n, (float) this.f5090o, this.f5092q, true, 0, pDFView.S, pDFView.T);
        }
    }
}
