package j2;

import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.z;

/* compiled from: RawMessageInfo */
public final class t implements l {

    /* renamed from: a  reason: collision with root package name */
    public final z f11519a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11520b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f11521c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11522d;

    public t(n nVar, String str, Object[] objArr) {
        this.f11519a = nVar;
        this.f11520b = str;
        this.f11521c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f11522d = charAt;
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
                this.f11522d = c10 | (charAt2 << i11);
                return;
            }
        }
    }

    public final boolean a() {
        if ((this.f11522d & 2) == 2) {
            return true;
        }
        return false;
    }

    public final z b() {
        return this.f11519a;
    }

    public final int c() {
        if ((this.f11522d & 1) == 1) {
            return 1;
        }
        return 2;
    }

    public final Object[] d() {
        return this.f11521c;
    }

    public final String e() {
        return this.f11520b;
    }
}
