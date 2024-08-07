package i9;

import com.google.crypto.tink.shaded.protobuf.p;

/* compiled from: KeyStatusType */
public enum z implements p.a {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f11247a;

    /* access modifiers changed from: public */
    z(int i10) {
        this.f11247a = i10;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f11247a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
