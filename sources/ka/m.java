package ka;

import ka.b0;
import v.v;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application */
public final class m extends b0.e.d.a {

    /* renamed from: a  reason: collision with root package name */
    public final b0.e.d.a.b f12354a;

    /* renamed from: b  reason: collision with root package name */
    public final c0<b0.c> f12355b;

    /* renamed from: c  reason: collision with root package name */
    public final c0<b0.c> f12356c;

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f12357d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12358e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application */
    public static final class a extends b0.e.d.a.C0142a {

        /* renamed from: a  reason: collision with root package name */
        public b0.e.d.a.b f12359a;

        /* renamed from: b  reason: collision with root package name */
        public c0<b0.c> f12360b;

        /* renamed from: c  reason: collision with root package name */
        public c0<b0.c> f12361c;

        /* renamed from: d  reason: collision with root package name */
        public Boolean f12362d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f12363e;

        public a(b0.e.d.a aVar) {
            this.f12359a = aVar.c();
            this.f12360b = aVar.b();
            this.f12361c = aVar.d();
            this.f12362d = aVar.a();
            this.f12363e = Integer.valueOf(aVar.e());
        }

        public final m a() {
            String str;
            if (this.f12359a == null) {
                str = " execution";
            } else {
                str = "";
            }
            if (this.f12363e == null) {
                str = f0.b0.r(str, " uiOrientation");
            }
            if (str.isEmpty()) {
                return new m(this.f12359a, this.f12360b, this.f12361c, this.f12362d, this.f12363e.intValue());
            }
            throw new IllegalStateException(f0.b0.r("Missing required properties:", str));
        }
    }

    public m() {
        throw null;
    }

    public m(b0.e.d.a.b bVar, c0 c0Var, c0 c0Var2, Boolean bool, int i10) {
        this.f12354a = bVar;
        this.f12355b = c0Var;
        this.f12356c = c0Var2;
        this.f12357d = bool;
        this.f12358e = i10;
    }

    public final Boolean a() {
        return this.f12357d;
    }

    public final c0<b0.c> b() {
        return this.f12355b;
    }

    public final b0.e.d.a.b c() {
        return this.f12354a;
    }

    public final c0<b0.c> d() {
        return this.f12356c;
    }

    public final int e() {
        return this.f12358e;
    }

    public final boolean equals(Object obj) {
        c0<b0.c> c0Var;
        c0<b0.c> c0Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a)) {
            return false;
        }
        b0.e.d.a aVar = (b0.e.d.a) obj;
        if (!this.f12354a.equals(aVar.c()) || ((c0Var = this.f12355b) != null ? !c0Var.equals(aVar.b()) : aVar.b() != null) || ((c0Var2 = this.f12356c) != null ? !c0Var2.equals(aVar.d()) : aVar.d() != null) || ((bool = this.f12357d) != null ? !bool.equals(aVar.a()) : aVar.a() != null) || this.f12358e != aVar.e()) {
            return false;
        }
        return true;
    }

    public final a f() {
        return new a(this);
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = (this.f12354a.hashCode() ^ 1000003) * 1000003;
        c0<b0.c> c0Var = this.f12355b;
        int i12 = 0;
        if (c0Var == null) {
            i10 = 0;
        } else {
            i10 = c0Var.hashCode();
        }
        int i13 = (hashCode ^ i10) * 1000003;
        c0<b0.c> c0Var2 = this.f12356c;
        if (c0Var2 == null) {
            i11 = 0;
        } else {
            i11 = c0Var2.hashCode();
        }
        int i14 = (i13 ^ i11) * 1000003;
        Boolean bool = this.f12357d;
        if (bool != null) {
            i12 = bool.hashCode();
        }
        return ((i14 ^ i12) * 1000003) ^ this.f12358e;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("Application{execution=");
        q10.append(this.f12354a);
        q10.append(", customAttributes=");
        q10.append(this.f12355b);
        q10.append(", internalKeys=");
        q10.append(this.f12356c);
        q10.append(", background=");
        q10.append(this.f12357d);
        q10.append(", uiOrientation=");
        return v.e(q10, this.f12358e, "}");
    }
}
