package f6;

import c6.d;
import f0.b0;
import f6.s;
import java.util.Arrays;

/* compiled from: AutoValue_TransportContext */
public final class j extends s {

    /* renamed from: a  reason: collision with root package name */
    public final String f10002a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f10003b;

    /* renamed from: c  reason: collision with root package name */
    public final d f10004c;

    /* compiled from: AutoValue_TransportContext */
    public static final class a extends s.a {

        /* renamed from: a  reason: collision with root package name */
        public String f10005a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f10006b;

        /* renamed from: c  reason: collision with root package name */
        public d f10007c;

        public final j a() {
            String str;
            if (this.f10005a == null) {
                str = " backendName";
            } else {
                str = "";
            }
            if (this.f10007c == null) {
                str = b0.r(str, " priority");
            }
            if (str.isEmpty()) {
                return new j(this.f10005a, this.f10006b, this.f10007c);
            }
            throw new IllegalStateException(b0.r("Missing required properties:", str));
        }

        public final a b(String str) {
            if (str != null) {
                this.f10005a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        public final a c(d dVar) {
            if (dVar != null) {
                this.f10007c = dVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    public j(String str, byte[] bArr, d dVar) {
        this.f10002a = str;
        this.f10003b = bArr;
        this.f10004c = dVar;
    }

    public final String b() {
        return this.f10002a;
    }

    public final byte[] c() {
        return this.f10003b;
    }

    public final d d() {
        return this.f10004c;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f10002a.equals(sVar.b())) {
            byte[] bArr2 = this.f10003b;
            if (sVar instanceof j) {
                bArr = ((j) sVar).f10003b;
            } else {
                bArr = sVar.c();
            }
            if (Arrays.equals(bArr2, bArr) && this.f10004c.equals(sVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10002a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f10003b)) * 1000003) ^ this.f10004c.hashCode();
    }
}
