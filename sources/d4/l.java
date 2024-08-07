package d4;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import e4.o;
import i4.g;
import java.util.ArrayList;
import java.util.List;
import v.v;

@TargetApi(19)
/* compiled from: MergePathsContent */
public final class l implements m, j {

    /* renamed from: a  reason: collision with root package name */
    public final Path f8681a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Path f8682b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f8683c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f8684d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final g f8685e;

    public l(g gVar) {
        gVar.getClass();
        this.f8685e = gVar;
    }

    @TargetApi(19)
    public final void a(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        this.f8682b.reset();
        this.f8681a.reset();
        for (int size = this.f8684d.size() - 1; size >= 1; size--) {
            m mVar = (m) this.f8684d.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                ArrayList arrayList = (ArrayList) dVar.e();
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    Path g2 = ((m) arrayList.get(size2)).g();
                    o oVar = dVar.f8629k;
                    if (oVar != null) {
                        matrix2 = oVar.d();
                    } else {
                        dVar.f8621c.reset();
                        matrix2 = dVar.f8621c;
                    }
                    g2.transform(matrix2);
                    this.f8682b.addPath(g2);
                }
            } else {
                this.f8682b.addPath(mVar.g());
            }
        }
        int i10 = 0;
        m mVar2 = (m) this.f8684d.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List<m> e10 = dVar2.e();
            while (true) {
                ArrayList arrayList2 = (ArrayList) e10;
                if (i10 >= arrayList2.size()) {
                    break;
                }
                Path g10 = ((m) arrayList2.get(i10)).g();
                o oVar2 = dVar2.f8629k;
                if (oVar2 != null) {
                    matrix = oVar2.d();
                } else {
                    dVar2.f8621c.reset();
                    matrix = dVar2.f8621c;
                }
                g10.transform(matrix);
                this.f8681a.addPath(g10);
                i10++;
            }
        } else {
            this.f8681a.set(mVar2.g());
        }
        this.f8683c.op(this.f8681a, this.f8682b, op);
    }

    public final void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < this.f8684d.size(); i10++) {
            ((m) this.f8684d.get(i10)).b(list, list2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(java.util.ListIterator<d4.c> r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.previous()
            d4.c r0 = (d4.c) r0
            boolean r1 = r0 instanceof d4.m
            if (r1 == 0) goto L_0x000d
            java.util.ArrayList r1 = r2.f8684d
            d4.m r0 = (d4.m) r0
            r1.add(r0)
            r3.remove()
            goto L_0x000d
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.l.e(java.util.ListIterator):void");
    }

    public final Path g() {
        this.f8683c.reset();
        g gVar = this.f8685e;
        if (gVar.f11106b) {
            return this.f8683c;
        }
        int g2 = v.g(gVar.f11105a);
        if (g2 == 0) {
            for (int i10 = 0; i10 < this.f8684d.size(); i10++) {
                this.f8683c.addPath(((m) this.f8684d.get(i10)).g());
            }
        } else if (g2 == 1) {
            a(Path.Op.UNION);
        } else if (g2 == 2) {
            a(Path.Op.REVERSE_DIFFERENCE);
        } else if (g2 == 3) {
            a(Path.Op.INTERSECT);
        } else if (g2 == 4) {
            a(Path.Op.XOR);
        }
        return this.f8683c;
    }
}
