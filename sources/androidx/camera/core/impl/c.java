package androidx.camera.core.impl;

import android.support.v4.media.a;
import androidx.camera.core.impl.i;

/* compiled from: AutoValue_Config_Option */
public final class c<T> extends i.a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f1331a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<T> f1332b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f1333c;

    public c(String str, Class<T> cls, Object obj) {
        if (str != null) {
            this.f1331a = str;
            if (cls != null) {
                this.f1332b = cls;
                this.f1333c = obj;
                return;
            }
            throw new NullPointerException("Null valueClass");
        }
        throw new NullPointerException("Null id");
    }

    public final String b() {
        return this.f1331a;
    }

    public final Object c() {
        return this.f1333c;
    }

    public final Class<T> d() {
        return this.f1332b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i.a)) {
            return false;
        }
        i.a aVar = (i.a) obj;
        if (this.f1331a.equals(aVar.b()) && this.f1332b.equals(aVar.d())) {
            Object obj2 = this.f1333c;
            if (obj2 == null) {
                if (aVar.c() == null) {
                    return true;
                }
            } else if (obj2.equals(aVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((this.f1331a.hashCode() ^ 1000003) * 1000003) ^ this.f1332b.hashCode()) * 1000003;
        Object obj = this.f1333c;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        StringBuilder q10 = a.q("Option{id=");
        q10.append(this.f1331a);
        q10.append(", valueClass=");
        q10.append(this.f1332b);
        q10.append(", token=");
        q10.append(this.f1333c);
        q10.append("}");
        return q10.toString();
    }
}
