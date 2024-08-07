package o3;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Build;
import fk.t;
import java.util.Set;
import n0.l;
import sk.j;
import v.v;

/* compiled from: Constraints.kt */
public final class c {

    /* renamed from: i  reason: collision with root package name */
    public static final c f13665i = new c(1, false, false, false, false, -1, -1, t.f20215a);

    /* renamed from: a  reason: collision with root package name */
    public final int f13666a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13667b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f13668c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f13669d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f13670e;

    /* renamed from: f  reason: collision with root package name */
    public final long f13671f;

    /* renamed from: g  reason: collision with root package name */
    public final long f13672g;

    /* renamed from: h  reason: collision with root package name */
    public final Set<a> f13673h;

    /* compiled from: Constraints.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f13674a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f13675b;

        public a(boolean z10, Uri uri) {
            this.f13674a = uri;
            this.f13675b = z10;
        }

        public final boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            Class<a> cls2 = a.class;
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!j.a(cls2, cls)) {
                return false;
            }
            j.d(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            a aVar = (a) obj;
            if (j.a(this.f13674a, aVar.f13674a) && this.f13675b == aVar.f13675b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i10;
            int hashCode = this.f13674a.hashCode() * 31;
            if (this.f13675b) {
                i10 = 1231;
            } else {
                i10 = 1237;
            }
            return hashCode + i10;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [int, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(java.lang.Object r2, boolean r3, boolean r4, boolean r5, boolean r6, long r7, long r9, java.util.Set<o3.c.a> r11) {
        /*
            r1 = this;
            java.lang.String r0 = "requiredNetworkType"
            n0.l.o(r2, r0)
            java.lang.String r0 = "contentUriTriggers"
            sk.j.f(r11, r0)
            r1.<init>()
            r1.f13666a = r2
            r1.f13667b = r3
            r1.f13668c = r4
            r1.f13669d = r5
            r1.f13670e = r6
            r1.f13671f = r7
            r1.f13672g = r9
            r1.f13673h = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.c.<init>(int, boolean, boolean, boolean, boolean, long, long, java.util.Set):void");
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT < 24 || (!this.f13673h.isEmpty())) {
            return true;
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !j.a(c.class, obj.getClass())) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f13667b == cVar.f13667b && this.f13668c == cVar.f13668c && this.f13669d == cVar.f13669d && this.f13670e == cVar.f13670e && this.f13671f == cVar.f13671f && this.f13672g == cVar.f13672g && this.f13666a == cVar.f13666a) {
            return j.a(this.f13673h, cVar.f13673h);
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public final int hashCode() {
        long j10 = this.f13671f;
        long j11 = this.f13672g;
        return this.f13673h.hashCode() + (((((((((((((v.g(this.f13666a) * 31) + (this.f13667b ? 1 : 0)) * 31) + (this.f13668c ? 1 : 0)) * 31) + (this.f13669d ? 1 : 0)) * 31) + (this.f13670e ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }

    @SuppressLint({"NewApi"})
    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("Constraints{requiredNetworkType=");
        q10.append(l.s(this.f13666a));
        q10.append(", requiresCharging=");
        q10.append(this.f13667b);
        q10.append(", requiresDeviceIdle=");
        q10.append(this.f13668c);
        q10.append(", requiresBatteryNotLow=");
        q10.append(this.f13669d);
        q10.append(", requiresStorageNotLow=");
        q10.append(this.f13670e);
        q10.append(", contentTriggerUpdateDelayMillis=");
        q10.append(this.f13671f);
        q10.append(", contentTriggerMaxDelayMillis=");
        q10.append(this.f13672g);
        q10.append(", contentUriTriggers=");
        q10.append(this.f13673h);
        q10.append(", }");
        return q10.toString();
    }

    @SuppressLint({"NewApi"})
    public c(c cVar) {
        j.f(cVar, "other");
        this.f13667b = cVar.f13667b;
        this.f13668c = cVar.f13668c;
        this.f13666a = cVar.f13666a;
        this.f13669d = cVar.f13669d;
        this.f13670e = cVar.f13670e;
        this.f13673h = cVar.f13673h;
        this.f13671f = cVar.f13671f;
        this.f13672g = cVar.f13672g;
    }
}
