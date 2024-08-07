package d1;

import a1.d;
import c1.b;
import c1.e;
import c1.f;
import f0.b0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import v.v;

/* compiled from: WidgetGroup */
public final class o {

    /* renamed from: f  reason: collision with root package name */
    public static int f8522f;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<e> f8523a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public int f8524b;

    /* renamed from: c  reason: collision with root package name */
    public int f8525c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f8526d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f8527e = -1;

    /* compiled from: WidgetGroup */
    public class a {
        public a(e eVar, d dVar) {
            new WeakReference(eVar);
            c1.d dVar2 = eVar.K;
            dVar.getClass();
            d.n(dVar2);
            d.n(eVar.L);
            d.n(eVar.M);
            d.n(eVar.N);
            d.n(eVar.O);
        }
    }

    public o(int i10) {
        int i11 = f8522f;
        f8522f = i11 + 1;
        this.f8524b = i11;
        this.f8525c = i10;
    }

    public final boolean a(e eVar) {
        if (this.f8523a.contains(eVar)) {
            return false;
        }
        this.f8523a.add(eVar);
        return true;
    }

    public final void b(ArrayList<o> arrayList) {
        int size = this.f8523a.size();
        if (this.f8527e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = arrayList.get(i10);
                if (this.f8527e == oVar.f8524b) {
                    d(this.f8525c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int c(d dVar, int i10) {
        int i11;
        int i12;
        if (this.f8523a.size() == 0) {
            return 0;
        }
        ArrayList<e> arrayList = this.f8523a;
        f fVar = (f) arrayList.get(0).W;
        dVar.t();
        fVar.e(dVar, false);
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            arrayList.get(i13).e(dVar, false);
        }
        if (i10 == 0 && fVar.F0 > 0) {
            b.a(fVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.G0 > 0) {
            b.a(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.p();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f8526d = new ArrayList<>();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            this.f8526d.add(new a(arrayList.get(i14), dVar));
        }
        if (i10 == 0) {
            i11 = d.n(fVar.K);
            i12 = d.n(fVar.M);
            dVar.t();
        } else {
            i11 = d.n(fVar.L);
            i12 = d.n(fVar.N);
            dVar.t();
        }
        return i12 - i11;
    }

    public final void d(int i10, o oVar) {
        Iterator<e> it = this.f8523a.iterator();
        while (it.hasNext()) {
            e next = it.next();
            oVar.a(next);
            if (i10 == 0) {
                next.f4460u0 = oVar.f8524b;
            } else {
                next.f4462v0 = oVar.f8524b;
            }
        }
        this.f8527e = oVar.f8524b;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f8525c;
        if (i10 == 0) {
            str = "Horizontal";
        } else if (i10 == 1) {
            str = "Vertical";
        } else if (i10 == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb2.append(str);
        sb2.append(" [");
        String e10 = v.e(sb2, this.f8524b, "] <");
        Iterator<e> it = this.f8523a.iterator();
        while (it.hasNext()) {
            StringBuilder v2 = b0.v(e10, " ");
            v2.append(it.next().f4442l0);
            e10 = v2.toString();
        }
        return b0.r(e10, " >");
    }
}
