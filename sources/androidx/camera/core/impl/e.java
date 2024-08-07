package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.v;
import c0.x;
import f0.b0;

/* compiled from: AutoValue_StreamSpec */
public final class e extends v {

    /* renamed from: b  reason: collision with root package name */
    public final Size f1344b;

    /* renamed from: c  reason: collision with root package name */
    public final x f1345c;

    /* renamed from: d  reason: collision with root package name */
    public final Range<Integer> f1346d;

    /* renamed from: e  reason: collision with root package name */
    public final i f1347e;

    /* compiled from: AutoValue_StreamSpec */
    public static final class a extends v.a {

        /* renamed from: a  reason: collision with root package name */
        public Size f1348a;

        /* renamed from: b  reason: collision with root package name */
        public x f1349b;

        /* renamed from: c  reason: collision with root package name */
        public Range<Integer> f1350c;

        /* renamed from: d  reason: collision with root package name */
        public i f1351d;

        public a() {
        }

        public final e a() {
            String str;
            if (this.f1348a == null) {
                str = " resolution";
            } else {
                str = "";
            }
            if (this.f1349b == null) {
                str = b0.r(str, " dynamicRange");
            }
            if (this.f1350c == null) {
                str = b0.r(str, " expectedFrameRateRange");
            }
            if (str.isEmpty()) {
                return new e(this.f1348a, this.f1349b, this.f1350c, this.f1351d);
            }
            throw new IllegalStateException(b0.r("Missing required properties:", str));
        }

        public final a b(u.a aVar) {
            this.f1351d = aVar;
            return this;
        }

        public a(v vVar) {
            this.f1348a = vVar.d();
            this.f1349b = vVar.a();
            this.f1350c = vVar.b();
            this.f1351d = vVar.c();
        }
    }

    public e(Size size, x xVar, Range range, i iVar) {
        this.f1344b = size;
        this.f1345c = xVar;
        this.f1346d = range;
        this.f1347e = iVar;
    }

    public final x a() {
        return this.f1345c;
    }

    public final Range<Integer> b() {
        return this.f1346d;
    }

    public final i c() {
        return this.f1347e;
    }

    public final Size d() {
        return this.f1344b;
    }

    public final a e() {
        return new a(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f1344b.equals(vVar.d()) && this.f1345c.equals(vVar.a()) && this.f1346d.equals(vVar.b())) {
            i iVar = this.f1347e;
            if (iVar == null) {
                if (vVar.c() == null) {
                    return true;
                }
            } else if (iVar.equals(vVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f1344b.hashCode() ^ 1000003) * 1000003) ^ this.f1345c.hashCode()) * 1000003) ^ this.f1346d.hashCode()) * 1000003;
        i iVar = this.f1347e;
        if (iVar == null) {
            i10 = 0;
        } else {
            i10 = iVar.hashCode();
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("StreamSpec{resolution=");
        q10.append(this.f1344b);
        q10.append(", dynamicRange=");
        q10.append(this.f1345c);
        q10.append(", expectedFrameRateRange=");
        q10.append(this.f1346d);
        q10.append(", implementationOptions=");
        q10.append(this.f1347e);
        q10.append("}");
        return q10.toString();
    }
}
