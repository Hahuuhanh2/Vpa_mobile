package j9;

import com.google.crypto.tink.shaded.protobuf.n;

/* compiled from: RawMessageInfo */
public final class x implements o {

    /* renamed from: a  reason: collision with root package name */
    public final com.google.crypto.tink.shaded.protobuf.x f11794a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11795b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f11796c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11797d;

    public x(n nVar, String str, Object[] objArr) {
        this.f11794a = nVar;
        this.f11795b = str;
        this.f11796c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f11797d = charAt;
            return;
        }
        char c10 = charAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 >= 55296) {
                c10 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            } else {
                this.f11797d = c10 | (charAt2 << i11);
                return;
            }
        }
    }

    public final boolean a() {
        if ((this.f11797d & 2) == 2) {
            return true;
        }
        return false;
    }

    public final com.google.crypto.tink.shaded.protobuf.x b() {
        return this.f11794a;
    }

    public final int c() {
        if ((this.f11797d & 1) == 1) {
            return 1;
        }
        return 2;
    }

    public final Object[] d() {
        return this.f11796c;
    }

    public final String e() {
        return this.f11795b;
    }
}
