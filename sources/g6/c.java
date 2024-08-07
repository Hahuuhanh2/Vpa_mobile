package g6;

import android.content.Context;
import o6.a;

/* compiled from: AutoValue_CreationContext */
public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10377a;

    /* renamed from: b  reason: collision with root package name */
    public final a f10378b;

    /* renamed from: c  reason: collision with root package name */
    public final a f10379c;

    /* renamed from: d  reason: collision with root package name */
    public final String f10380d;

    public c(Context context, a aVar, a aVar2, String str) {
        if (context != null) {
            this.f10377a = context;
            if (aVar != null) {
                this.f10378b = aVar;
                if (aVar2 != null) {
                    this.f10379c = aVar2;
                    if (str != null) {
                        this.f10380d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final Context a() {
        return this.f10377a;
    }

    public final String b() {
        return this.f10380d;
    }

    public final a c() {
        return this.f10379c;
    }

    public final a d() {
        return this.f10378b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f10377a.equals(hVar.a()) || !this.f10378b.equals(hVar.d()) || !this.f10379c.equals(hVar.c()) || !this.f10380d.equals(hVar.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((this.f10377a.hashCode() ^ 1000003) * 1000003) ^ this.f10378b.hashCode()) * 1000003) ^ this.f10379c.hashCode()) * 1000003) ^ this.f10380d.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("CreationContext{applicationContext=");
        q10.append(this.f10377a);
        q10.append(", wallClock=");
        q10.append(this.f10378b);
        q10.append(", monotonicClock=");
        q10.append(this.f10379c);
        q10.append(", backendName=");
        return android.support.v4.media.a.o(q10, this.f10380d, "}");
    }
}
