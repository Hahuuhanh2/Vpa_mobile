package tc;

import com.google.protobuf.i;
import com.google.protobuf.u;

/* compiled from: RawMessageInfo */
public final class w implements n {

    /* renamed from: a  reason: collision with root package name */
    public final u f15016a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15017b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f15018c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15019d;

    public w(i iVar, String str, Object[] objArr) {
        this.f15016a = iVar;
        this.f15017b = str;
        this.f15018c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f15019d = charAt;
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
                this.f15019d = c10 | (charAt2 << i11);
                return;
            }
        }
    }

    public final boolean a() {
        if ((this.f15019d & 2) == 2) {
            return true;
        }
        return false;
    }

    public final u b() {
        return this.f15016a;
    }

    public final int c() {
        if ((this.f15019d & 1) == 1) {
            return 1;
        }
        return 2;
    }

    public final Object[] d() {
        return this.f15018c;
    }

    public final String e() {
        return this.f15017b;
    }
}
