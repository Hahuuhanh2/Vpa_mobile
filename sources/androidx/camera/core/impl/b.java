package androidx.camera.core.impl;

import android.support.v4.media.a;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.y;
import c0.x;
import f0.d;
import f0.s0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AutoValue_AttachedSurfaceInfo */
public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public final s0 f1324a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1325b;

    /* renamed from: c  reason: collision with root package name */
    public final Size f1326c;

    /* renamed from: d  reason: collision with root package name */
    public final x f1327d;

    /* renamed from: e  reason: collision with root package name */
    public final List<y.b> f1328e;

    /* renamed from: f  reason: collision with root package name */
    public final i f1329f;

    /* renamed from: g  reason: collision with root package name */
    public final Range<Integer> f1330g;

    public b(d dVar, int i10, Size size, x xVar, ArrayList arrayList, i iVar, Range range) {
        if (dVar != null) {
            this.f1324a = dVar;
            this.f1325b = i10;
            if (size != null) {
                this.f1326c = size;
                if (xVar != null) {
                    this.f1327d = xVar;
                    this.f1328e = arrayList;
                    this.f1329f = iVar;
                    this.f1330g = range;
                    return;
                }
                throw new NullPointerException("Null dynamicRange");
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surfaceConfig");
    }

    public final List<y.b> a() {
        return this.f1328e;
    }

    public final x b() {
        return this.f1327d;
    }

    public final int c() {
        return this.f1325b;
    }

    public final i d() {
        return this.f1329f;
    }

    public final Size e() {
        return this.f1326c;
    }

    public final boolean equals(Object obj) {
        i iVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1324a.equals(aVar.f()) && this.f1325b == aVar.c() && this.f1326c.equals(aVar.e()) && this.f1327d.equals(aVar.b()) && this.f1328e.equals(aVar.a()) && ((iVar = this.f1329f) != null ? iVar.equals(aVar.d()) : aVar.d() == null)) {
            Range<Integer> range = this.f1330g;
            if (range == null) {
                if (aVar.g() == null) {
                    return true;
                }
            } else if (range.equals(aVar.g())) {
                return true;
            }
        }
        return false;
    }

    public final s0 f() {
        return this.f1324a;
    }

    public final Range<Integer> g() {
        return this.f1330g;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((((((this.f1324a.hashCode() ^ 1000003) * 1000003) ^ this.f1325b) * 1000003) ^ this.f1326c.hashCode()) * 1000003) ^ this.f1327d.hashCode()) * 1000003) ^ this.f1328e.hashCode()) * 1000003;
        i iVar = this.f1329f;
        int i11 = 0;
        if (iVar == null) {
            i10 = 0;
        } else {
            i10 = iVar.hashCode();
        }
        int i12 = (hashCode ^ i10) * 1000003;
        Range<Integer> range = this.f1330g;
        if (range != null) {
            i11 = range.hashCode();
        }
        return i12 ^ i11;
    }

    public final String toString() {
        StringBuilder q10 = a.q("AttachedSurfaceInfo{surfaceConfig=");
        q10.append(this.f1324a);
        q10.append(", imageFormat=");
        q10.append(this.f1325b);
        q10.append(", size=");
        q10.append(this.f1326c);
        q10.append(", dynamicRange=");
        q10.append(this.f1327d);
        q10.append(", captureTypes=");
        q10.append(this.f1328e);
        q10.append(", implementationOptions=");
        q10.append(this.f1329f);
        q10.append(", targetFrameRate=");
        q10.append(this.f1330g);
        q10.append("}");
        return q10.toString();
    }
}
