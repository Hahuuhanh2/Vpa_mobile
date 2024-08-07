package androidx.camera.core.impl;

import androidx.camera.core.impl.u;
import c0.x;
import f0.b0;
import java.util.List;

/* compiled from: AutoValue_SessionConfig_OutputConfig */
public final class d extends u.e {

    /* renamed from: a  reason: collision with root package name */
    public final DeferrableSurface f1334a;

    /* renamed from: b  reason: collision with root package name */
    public final List<DeferrableSurface> f1335b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1336c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1337d;

    /* renamed from: e  reason: collision with root package name */
    public final x f1338e;

    /* compiled from: AutoValue_SessionConfig_OutputConfig */
    public static final class a extends u.e.a {

        /* renamed from: a  reason: collision with root package name */
        public DeferrableSurface f1339a;

        /* renamed from: b  reason: collision with root package name */
        public List<DeferrableSurface> f1340b;

        /* renamed from: c  reason: collision with root package name */
        public String f1341c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f1342d;

        /* renamed from: e  reason: collision with root package name */
        public x f1343e;

        public final d a() {
            String str;
            if (this.f1339a == null) {
                str = " surface";
            } else {
                str = "";
            }
            if (this.f1340b == null) {
                str = b0.r(str, " sharedSurfaces");
            }
            if (this.f1342d == null) {
                str = b0.r(str, " surfaceGroupId");
            }
            if (this.f1343e == null) {
                str = b0.r(str, " dynamicRange");
            }
            if (str.isEmpty()) {
                return new d(this.f1339a, this.f1340b, this.f1341c, this.f1342d.intValue(), this.f1343e);
            }
            throw new IllegalStateException(b0.r("Missing required properties:", str));
        }

        public final a b(x xVar) {
            if (xVar != null) {
                this.f1343e = xVar;
                return this;
            }
            throw new NullPointerException("Null dynamicRange");
        }
    }

    public d(DeferrableSurface deferrableSurface, List list, String str, int i10, x xVar) {
        this.f1334a = deferrableSurface;
        this.f1335b = list;
        this.f1336c = str;
        this.f1337d = i10;
        this.f1338e = xVar;
    }

    public final x b() {
        return this.f1338e;
    }

    public final String c() {
        return this.f1336c;
    }

    public final List<DeferrableSurface> d() {
        return this.f1335b;
    }

    public final DeferrableSurface e() {
        return this.f1334a;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u.e)) {
            return false;
        }
        u.e eVar = (u.e) obj;
        if (!this.f1334a.equals(eVar.e()) || !this.f1335b.equals(eVar.d()) || ((str = this.f1336c) != null ? !str.equals(eVar.c()) : eVar.c() != null) || this.f1337d != eVar.f() || !this.f1338e.equals(eVar.b())) {
            return false;
        }
        return true;
    }

    public final int f() {
        return this.f1337d;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((this.f1334a.hashCode() ^ 1000003) * 1000003) ^ this.f1335b.hashCode()) * 1000003;
        String str = this.f1336c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return ((((hashCode ^ i10) * 1000003) ^ this.f1337d) * 1000003) ^ this.f1338e.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("OutputConfig{surface=");
        q10.append(this.f1334a);
        q10.append(", sharedSurfaces=");
        q10.append(this.f1335b);
        q10.append(", physicalCameraId=");
        q10.append(this.f1336c);
        q10.append(", surfaceGroupId=");
        q10.append(this.f1337d);
        q10.append(", dynamicRange=");
        q10.append(this.f1338e);
        q10.append("}");
        return q10.toString();
    }
}
