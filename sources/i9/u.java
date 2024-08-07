package i9;

import com.google.crypto.tink.shaded.protobuf.p;

/* compiled from: HashType */
public enum u implements p.a {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f11232a;

    /* access modifiers changed from: public */
    u(int i10) {
        this.f11232a = i10;
    }

    public static u b(int i10) {
        if (i10 == 0) {
            return UNKNOWN_HASH;
        }
        if (i10 == 1) {
            return SHA1;
        }
        if (i10 == 2) {
            return SHA384;
        }
        if (i10 == 3) {
            return SHA256;
        }
        if (i10 == 4) {
            return SHA512;
        }
        if (i10 != 5) {
            return null;
        }
        return SHA224;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f11232a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
