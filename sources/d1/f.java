package d1;

import android.support.v4.media.a;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DependencyNode */
public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public p f8503a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8504b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8505c = false;

    /* renamed from: d  reason: collision with root package name */
    public p f8506d;

    /* renamed from: e  reason: collision with root package name */
    public int f8507e = 1;

    /* renamed from: f  reason: collision with root package name */
    public int f8508f;

    /* renamed from: g  reason: collision with root package name */
    public int f8509g;

    /* renamed from: h  reason: collision with root package name */
    public int f8510h = 1;

    /* renamed from: i  reason: collision with root package name */
    public g f8511i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f8512j = false;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f8513k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f8514l = new ArrayList();

    public f(p pVar) {
        this.f8506d = pVar;
    }

    public final void a(d dVar) {
        Iterator it = this.f8514l.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f8512j) {
                return;
            }
        }
        this.f8505c = true;
        p pVar = this.f8503a;
        if (pVar != null) {
            pVar.a(this);
        }
        if (this.f8504b) {
            this.f8506d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        Iterator it2 = this.f8514l.iterator();
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f8512j) {
            g gVar = this.f8511i;
            if (gVar != null) {
                if (gVar.f8512j) {
                    this.f8508f = this.f8510h * gVar.f8509g;
                } else {
                    return;
                }
            }
            d(fVar.f8509g + this.f8508f);
        }
        p pVar2 = this.f8503a;
        if (pVar2 != null) {
            pVar2.a(this);
        }
    }

    public final void b(d dVar) {
        this.f8513k.add(dVar);
        if (this.f8512j) {
            dVar.a(dVar);
        }
    }

    public final void c() {
        this.f8514l.clear();
        this.f8513k.clear();
        this.f8512j = false;
        this.f8509g = 0;
        this.f8505c = false;
        this.f8504b = false;
    }

    public void d(int i10) {
        if (!this.f8512j) {
            this.f8512j = true;
            this.f8509g = i10;
            Iterator it = this.f8513k.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                dVar.a(dVar);
            }
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8506d.f8529b.f4442l0);
        sb2.append(":");
        sb2.append(a.B(this.f8507e));
        sb2.append("(");
        if (this.f8512j) {
            obj = Integer.valueOf(this.f8509g);
        } else {
            obj = "unresolved";
        }
        sb2.append(obj);
        sb2.append(") <t=");
        sb2.append(this.f8514l.size());
        sb2.append(":d=");
        sb2.append(this.f8513k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
