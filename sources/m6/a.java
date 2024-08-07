package m6;

import v.v;

/* compiled from: AutoValue_EventStoreConfig */
public final class a extends e {

    /* renamed from: b  reason: collision with root package name */
    public final long f13142b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13143c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13144d;

    /* renamed from: e  reason: collision with root package name */
    public final long f13145e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13146f;

    public a(long j10, int i10, int i11, long j11, int i12) {
        this.f13142b = j10;
        this.f13143c = i10;
        this.f13144d = i11;
        this.f13145e = j11;
        this.f13146f = i12;
    }

    public final int a() {
        return this.f13144d;
    }

    public final long b() {
        return this.f13145e;
    }

    public final int c() {
        return this.f13143c;
    }

    public final int d() {
        return this.f13146f;
    }

    public final long e() {
        return this.f13142b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f13142b == eVar.e() && this.f13143c == eVar.c() && this.f13144d == eVar.a() && this.f13145e == eVar.b() && this.f13146f == eVar.d()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f13142b;
        long j11 = this.f13145e;
        return ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f13143c) * 1000003) ^ this.f13144d) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f13146f;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("EventStoreConfig{maxStorageSizeInBytes=");
        q10.append(this.f13142b);
        q10.append(", loadBatchSize=");
        q10.append(this.f13143c);
        q10.append(", criticalSectionEnterTimeoutMs=");
        q10.append(this.f13144d);
        q10.append(", eventCleanUpAge=");
        q10.append(this.f13145e);
        q10.append(", maxBlobByteSizePerRow=");
        return v.e(q10, this.f13146f, "}");
    }
}
