package j$.time;

import j$.time.zone.e;
import j$.time.zone.f;
import j$.time.zone.i;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

final class w extends ZoneId {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f18292d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* renamed from: b  reason: collision with root package name */
    private final String f18293b;

    /* renamed from: c  reason: collision with root package name */
    private final transient e f18294c;

    w(String str, e eVar) {
        this.f18293b = str;
        this.f18294c = eVar;
    }

    static w Z(String str, boolean z10) {
        if (str != null) {
            int length = str.length();
            if (length >= 2) {
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i10 == 0) && ((charAt < '0' || charAt > '9' || i10 == 0) && ((charAt != '~' || i10 == 0) && ((charAt != '.' || i10 == 0) && ((charAt != '_' || i10 == 0) && ((charAt != '+' || i10 == 0) && (charAt != '-' || i10 == 0))))))))) {
                        throw new e("Invalid ID for region-based ZoneId, invalid format: " + str);
                    }
                }
                e eVar = null;
                try {
                    eVar = i.b(str, true);
                } catch (f e10) {
                    if (z10) {
                        throw e10;
                    }
                }
                return new w(str, eVar);
            }
            throw new e("Invalid ID for region-based ZoneId, invalid format: " + str);
        }
        throw new NullPointerException("zoneId");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 7, this);
    }

    public final e U() {
        e eVar = this.f18294c;
        return eVar != null ? eVar : i.b(this.f18293b, false);
    }

    /* access modifiers changed from: package-private */
    public final void Y(DataOutput dataOutput) {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.f18293b);
    }

    /* access modifiers changed from: package-private */
    public final void a0(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f18293b);
    }

    public final String l() {
        return this.f18293b;
    }
}
