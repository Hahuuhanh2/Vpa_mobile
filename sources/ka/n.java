package ka;

import android.support.v4.media.a;
import ka.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution */
public final class n extends b0.e.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final c0<b0.e.d.a.b.C0148d> f12364a;

    /* renamed from: b  reason: collision with root package name */
    public final b0.e.d.a.b.C0145b f12365b;

    /* renamed from: c  reason: collision with root package name */
    public final b0.a f12366c;

    /* renamed from: d  reason: collision with root package name */
    public final b0.e.d.a.b.c f12367d;

    /* renamed from: e  reason: collision with root package name */
    public final c0<b0.e.d.a.b.C0143a> f12368e;

    public n() {
        throw null;
    }

    public n(c0 c0Var, b0.e.d.a.b.C0145b bVar, b0.a aVar, b0.e.d.a.b.c cVar, c0 c0Var2) {
        this.f12364a = c0Var;
        this.f12365b = bVar;
        this.f12366c = aVar;
        this.f12367d = cVar;
        this.f12368e = c0Var2;
    }

    public final b0.a a() {
        return this.f12366c;
    }

    public final c0<b0.e.d.a.b.C0143a> b() {
        return this.f12368e;
    }

    public final b0.e.d.a.b.C0145b c() {
        return this.f12365b;
    }

    public final b0.e.d.a.b.c d() {
        return this.f12367d;
    }

    public final c0<b0.e.d.a.b.C0148d> e() {
        return this.f12364a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b)) {
            return false;
        }
        b0.e.d.a.b bVar = (b0.e.d.a.b) obj;
        c0<b0.e.d.a.b.C0148d> c0Var = this.f12364a;
        if (c0Var != null ? c0Var.equals(bVar.e()) : bVar.e() == null) {
            b0.e.d.a.b.C0145b bVar2 = this.f12365b;
            if (bVar2 != null ? bVar2.equals(bVar.c()) : bVar.c() == null) {
                b0.a aVar = this.f12366c;
                if (aVar != null ? aVar.equals(bVar.a()) : bVar.a() == null) {
                    if (this.f12367d.equals(bVar.d()) && this.f12368e.equals(bVar.b())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        c0<b0.e.d.a.b.C0148d> c0Var = this.f12364a;
        int i12 = 0;
        if (c0Var == null) {
            i10 = 0;
        } else {
            i10 = c0Var.hashCode();
        }
        int i13 = (i10 ^ 1000003) * 1000003;
        b0.e.d.a.b.C0145b bVar = this.f12365b;
        if (bVar == null) {
            i11 = 0;
        } else {
            i11 = bVar.hashCode();
        }
        int i14 = (i13 ^ i11) * 1000003;
        b0.a aVar = this.f12366c;
        if (aVar != null) {
            i12 = aVar.hashCode();
        }
        return ((((i14 ^ i12) * 1000003) ^ this.f12367d.hashCode()) * 1000003) ^ this.f12368e.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.q("Execution{threads=");
        q10.append(this.f12364a);
        q10.append(", exception=");
        q10.append(this.f12365b);
        q10.append(", appExitInfo=");
        q10.append(this.f12366c);
        q10.append(", signal=");
        q10.append(this.f12367d);
        q10.append(", binaries=");
        q10.append(this.f12368e);
        q10.append("}");
        return q10.toString();
    }
}
