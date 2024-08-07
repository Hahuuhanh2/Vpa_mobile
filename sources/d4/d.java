package d4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.c0;
import e4.a;
import e4.o;
import g4.e;
import g4.f;
import java.util.ArrayList;
import java.util.List;
import m9.b;
import n4.g;
import z.k;

/* compiled from: ContentGroup */
public final class d implements e, m, a.C0097a, f {

    /* renamed from: a  reason: collision with root package name */
    public final c4.a f8619a;

    /* renamed from: b  reason: collision with root package name */
    public final RectF f8620b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f8621c;

    /* renamed from: d  reason: collision with root package name */
    public final Path f8622d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f8623e;

    /* renamed from: f  reason: collision with root package name */
    public final String f8624f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f8625g;

    /* renamed from: h  reason: collision with root package name */
    public final List<c> f8626h;

    /* renamed from: i  reason: collision with root package name */
    public final c0 f8627i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f8628j;

    /* renamed from: k  reason: collision with root package name */
    public o f8629k;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(com.airbnb.lottie.c0 r8, j4.b r9, i4.n r10) {
        /*
            r7 = this;
            java.lang.String r3 = r10.f11138a
            boolean r4 = r10.f11140c
            java.util.List<i4.b> r0 = r10.f11139b
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = r0.size()
            r5.<init>(r1)
            r1 = 0
            r2 = r1
        L_0x0011:
            int r6 = r0.size()
            if (r2 >= r6) goto L_0x0029
            java.lang.Object r6 = r0.get(r2)
            i4.b r6 = (i4.b) r6
            d4.c r6 = r6.a(r8, r9)
            if (r6 == 0) goto L_0x0026
            r5.add(r6)
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0029:
            java.util.List<i4.b> r10 = r10.f11139b
        L_0x002b:
            int r0 = r10.size()
            if (r1 >= r0) goto L_0x0042
            java.lang.Object r0 = r10.get(r1)
            i4.b r0 = (i4.b) r0
            boolean r2 = r0 instanceof h4.g
            if (r2 == 0) goto L_0x003f
            h4.g r0 = (h4.g) r0
            r6 = r0
            goto L_0x0044
        L_0x003f:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0042:
            r10 = 0
            r6 = r10
        L_0x0044:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.d.<init>(com.airbnb.lottie.c0, j4.b, i4.n):void");
    }

    public final void a() {
        this.f8627i.invalidateSelf();
    }

    public final void b(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(this.f8626h.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.f8626h.size() - 1; size >= 0; size--) {
            c cVar = this.f8626h.get(size);
            cVar.b(arrayList, this.f8626h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        this.f8621c.set(matrix);
        o oVar = this.f8629k;
        if (oVar != null) {
            this.f8621c.preConcat(oVar.d());
        }
        this.f8623e.set(0.0f, 0.0f, 0.0f, 0.0f);
        int size = this.f8626h.size();
        while (true) {
            size--;
            if (size >= 0) {
                c cVar = this.f8626h.get(size);
                if (cVar instanceof e) {
                    ((e) cVar).d(this.f8623e, this.f8621c, z10);
                    rectF.union(this.f8623e);
                }
            } else {
                return;
            }
        }
    }

    public final List<m> e() {
        if (this.f8628j == null) {
            this.f8628j = new ArrayList();
            for (int i10 = 0; i10 < this.f8626h.size(); i10++) {
                c cVar = this.f8626h.get(i10);
                if (cVar instanceof m) {
                    this.f8628j.add((m) cVar);
                }
            }
        }
        return this.f8628j;
    }

    public final void f(Canvas canvas, Matrix matrix, int i10) {
        boolean z10;
        int i11;
        if (!this.f8625g) {
            this.f8621c.set(matrix);
            o oVar = this.f8629k;
            if (oVar != null) {
                this.f8621c.preConcat(oVar.d());
                a<Integer, Integer> aVar = this.f8629k.f9146j;
                if (aVar == null) {
                    i11 = 100;
                } else {
                    i11 = aVar.f().intValue();
                }
                i10 = (int) ((((((float) i11) / 100.0f) * ((float) i10)) / 255.0f) * 255.0f);
            }
            boolean z11 = false;
            if (this.f8627i.f4789y) {
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i12 < this.f8626h.size()) {
                        if ((this.f8626h.get(i12) instanceof e) && (i13 = i13 + 1) >= 2) {
                            z10 = true;
                            break;
                        }
                        i12++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (z10 && i10 != 255) {
                    z11 = true;
                }
            }
            if (z11) {
                this.f8620b.set(0.0f, 0.0f, 0.0f, 0.0f);
                d(this.f8620b, this.f8621c, true);
                this.f8619a.setAlpha(i10);
                RectF rectF = this.f8620b;
                c4.a aVar2 = this.f8619a;
                g.a aVar3 = g.f13513a;
                canvas.saveLayer(rectF, aVar2);
                b.v();
            }
            if (z11) {
                i10 = 255;
            }
            for (int size = this.f8626h.size() - 1; size >= 0; size--) {
                c cVar = this.f8626h.get(size);
                if (cVar instanceof e) {
                    ((e) cVar).f(canvas, this.f8621c, i10);
                }
            }
            if (z11) {
                canvas.restore();
            }
        }
    }

    public final Path g() {
        this.f8621c.reset();
        o oVar = this.f8629k;
        if (oVar != null) {
            this.f8621c.set(oVar.d());
        }
        this.f8622d.reset();
        if (this.f8625g) {
            return this.f8622d;
        }
        for (int size = this.f8626h.size() - 1; size >= 0; size--) {
            c cVar = this.f8626h.get(size);
            if (cVar instanceof m) {
                this.f8622d.addPath(((m) cVar).g(), this.f8621c);
            }
        }
        return this.f8622d;
    }

    public final String getName() {
        return this.f8624f;
    }

    public final void h(k kVar, Object obj) {
        o oVar = this.f8629k;
        if (oVar != null) {
            oVar.c(kVar, obj);
        }
    }

    public final void i(e eVar, int i10, ArrayList arrayList, e eVar2) {
        if (eVar.c(i10, this.f8624f) || "__container".equals(this.f8624f)) {
            if (!"__container".equals(this.f8624f)) {
                String str = this.f8624f;
                eVar2.getClass();
                e eVar3 = new e(eVar2);
                eVar3.f10360a.add(str);
                if (eVar.a(i10, this.f8624f)) {
                    e eVar4 = new e(eVar3);
                    eVar4.f10361b = this;
                    arrayList.add(eVar4);
                }
                eVar2 = eVar3;
            }
            if (eVar.d(i10, this.f8624f)) {
                int b10 = eVar.b(i10, this.f8624f) + i10;
                for (int i11 = 0; i11 < this.f8626h.size(); i11++) {
                    c cVar = this.f8626h.get(i11);
                    if (cVar instanceof f) {
                        ((f) cVar).i(eVar, b10, arrayList, eVar2);
                    }
                }
            }
        }
    }

    public d(c0 c0Var, j4.b bVar, String str, boolean z10, ArrayList arrayList, h4.g gVar) {
        this.f8619a = new c4.a();
        this.f8620b = new RectF();
        this.f8621c = new Matrix();
        this.f8622d = new Path();
        this.f8623e = new RectF();
        this.f8624f = str;
        this.f8627i = c0Var;
        this.f8625g = z10;
        this.f8626h = arrayList;
        if (gVar != null) {
            o oVar = new o(gVar);
            this.f8629k = oVar;
            oVar.a(bVar);
            this.f8629k.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof j) {
                arrayList2.add((j) cVar);
            }
        }
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                ((j) arrayList2.get(size2)).e(arrayList.listIterator(arrayList.size()));
            } else {
                return;
            }
        }
    }
}
