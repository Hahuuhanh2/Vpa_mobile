package e9;

import i3.y;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import v.v;

/* compiled from: AesCmacParameters */
public final class c extends y {

    /* renamed from: c  reason: collision with root package name */
    public final int f9272c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9273d;

    /* renamed from: e  reason: collision with root package name */
    public final b f9274e;

    /* compiled from: AesCmacParameters */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f9275a = null;

        /* renamed from: b  reason: collision with root package name */
        public Integer f9276b = null;

        /* renamed from: c  reason: collision with root package name */
        public b f9277c = b.f9281e;

        public final c a() {
            Integer num = this.f9275a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            } else if (this.f9276b == null) {
                throw new GeneralSecurityException("tag size not set");
            } else if (this.f9277c != null) {
                return new c(num.intValue(), this.f9276b.intValue(), this.f9277c);
            } else {
                throw new GeneralSecurityException("variant not set");
            }
        }

        public final void b(int i10) {
            if (i10 == 16 || i10 == 32) {
                this.f9275a = Integer.valueOf(i10);
            } else {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(i10 * 8)}));
            }
        }

        public final void c(int i10) {
            if (i10 < 10 || 16 < i10) {
                throw new GeneralSecurityException(android.support.v4.media.a.m("Invalid tag size for AesCmacParameters: ", i10));
            }
            this.f9276b = Integer.valueOf(i10);
        }
    }

    /* compiled from: AesCmacParameters */
    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static final b f9278b = new b("TINK");

        /* renamed from: c  reason: collision with root package name */
        public static final b f9279c = new b("CRUNCHY");

        /* renamed from: d  reason: collision with root package name */
        public static final b f9280d = new b("LEGACY");

        /* renamed from: e  reason: collision with root package name */
        public static final b f9281e = new b("NO_PREFIX");

        /* renamed from: a  reason: collision with root package name */
        public final String f9282a;

        public b(String str) {
            this.f9282a = str;
        }

        public final String toString() {
            return this.f9282a;
        }
    }

    public c(int i10, int i11, b bVar) {
        this.f9272c = i10;
        this.f9273d = i11;
        this.f9274e = bVar;
    }

    public final int K() {
        b bVar = this.f9274e;
        if (bVar == b.f9281e) {
            return this.f9273d;
        }
        if (bVar == b.f9278b) {
            return this.f9273d + 5;
        }
        if (bVar == b.f9279c) {
            return this.f9273d + 5;
        }
        if (bVar == b.f9280d) {
            return this.f9273d + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (cVar.f9272c == this.f9272c && cVar.K() == K() && cVar.f9274e == this.f9274e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f9272c), Integer.valueOf(this.f9273d), this.f9274e});
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("AES-CMAC Parameters (variant: ");
        q10.append(this.f9274e);
        q10.append(", ");
        q10.append(this.f9273d);
        q10.append("-byte tags, and ");
        return v.e(q10, this.f9272c, "-byte key)");
    }
}
