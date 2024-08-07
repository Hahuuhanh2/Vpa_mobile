package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.q;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: j$.time.chrono.k  reason: case insensitive filesystem */
final class C0344k implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f18071e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* renamed from: a  reason: collision with root package name */
    private final o f18072a;

    /* renamed from: b  reason: collision with root package name */
    final int f18073b;

    /* renamed from: c  reason: collision with root package name */
    final int f18074c;

    /* renamed from: d  reason: collision with root package name */
    final int f18075d;

    static {
        Collections.unmodifiableList(Arrays.asList(new q[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS}));
    }

    C0344k(o oVar, int i10, int i11, int i12) {
        this.f18072a = oVar;
        this.f18073b = i10;
        this.f18074c = i11;
        this.f18075d = i12;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void a(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f18072a.l());
        dataOutput.writeInt(this.f18073b);
        dataOutput.writeInt(this.f18074c);
        dataOutput.writeInt(this.f18075d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0344k)) {
            return false;
        }
        C0344k kVar = (C0344k) obj;
        if (this.f18073b == kVar.f18073b && this.f18074c == kVar.f18074c && this.f18075d == kVar.f18075d) {
            if (((C0337d) this.f18072a).equals(kVar.f18072a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.f18075d, 16) + (Integer.rotateLeft(this.f18074c, 8) + this.f18073b)) ^ ((C0337d) this.f18072a).hashCode();
    }

    public final String toString() {
        if (this.f18073b == 0 && this.f18074c == 0 && this.f18075d == 0) {
            return ((C0337d) this.f18072a).l() + " P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((C0337d) this.f18072a).l());
        sb2.append(' ');
        sb2.append('P');
        int i10 = this.f18073b;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('Y');
        }
        int i11 = this.f18074c;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        int i12 = this.f18075d;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public Object writeReplace() {
        return new H((byte) 9, this);
    }
}
