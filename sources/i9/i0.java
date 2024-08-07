package i9;

import com.google.crypto.tink.shaded.protobuf.p;

/* compiled from: OutputPrefixType */
public enum i0 implements p.a {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f11223a;

    /* access modifiers changed from: public */
    i0(int i10) {
        this.f11223a = i10;
    }

    public static i0 b(int i10) {
        if (i10 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i10 == 1) {
            return TINK;
        }
        if (i10 == 2) {
            return LEGACY;
        }
        if (i10 == 3) {
            return RAW;
        }
        if (i10 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f11223a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
