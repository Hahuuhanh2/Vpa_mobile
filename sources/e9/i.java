package e9;

import i3.y;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import v.v;

/* compiled from: HmacParameters */
public final class i extends y {

    /* renamed from: c  reason: collision with root package name */
    public final int f9295c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9296d;

    /* renamed from: e  reason: collision with root package name */
    public final c f9297e;

    /* renamed from: f  reason: collision with root package name */
    public final b f9298f;

    /* compiled from: HmacParameters */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f9299a = null;

        /* renamed from: b  reason: collision with root package name */
        public Integer f9300b = null;

        /* renamed from: c  reason: collision with root package name */
        public b f9301c = null;

        /* renamed from: d  reason: collision with root package name */
        public c f9302d = c.f9312e;

        public final i a() {
            Integer num = this.f9299a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            } else if (this.f9300b == null) {
                throw new GeneralSecurityException("tag size is not set");
            } else if (this.f9301c == null) {
                throw new GeneralSecurityException("hash type is not set");
            } else if (this.f9302d == null) {
                throw new GeneralSecurityException("variant is not set");
            } else if (num.intValue() >= 16) {
                int intValue = this.f9300b.intValue();
                b bVar = this.f9301c;
                if (intValue >= 10) {
                    if (bVar == b.f9303b) {
                        if (intValue > 20) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[]{Integer.valueOf(intValue)}));
                        }
                    } else if (bVar == b.f9304c) {
                        if (intValue > 28) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[]{Integer.valueOf(intValue)}));
                        }
                    } else if (bVar == b.f9305d) {
                        if (intValue > 32) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[]{Integer.valueOf(intValue)}));
                        }
                    } else if (bVar == b.f9306e) {
                        if (intValue > 48) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[]{Integer.valueOf(intValue)}));
                        }
                    } else if (bVar != b.f9307f) {
                        throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                    } else if (intValue > 64) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[]{Integer.valueOf(intValue)}));
                    }
                    return new i(this.f9299a.intValue(), this.f9300b.intValue(), this.f9302d, this.f9301c);
                }
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{Integer.valueOf(intValue)}));
            } else {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", new Object[]{this.f9299a}));
            }
        }
    }

    /* compiled from: HmacParameters */
    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static final b f9303b = new b("SHA1");

        /* renamed from: c  reason: collision with root package name */
        public static final b f9304c = new b("SHA224");

        /* renamed from: d  reason: collision with root package name */
        public static final b f9305d = new b("SHA256");

        /* renamed from: e  reason: collision with root package name */
        public static final b f9306e = new b("SHA384");

        /* renamed from: f  reason: collision with root package name */
        public static final b f9307f = new b("SHA512");

        /* renamed from: a  reason: collision with root package name */
        public final String f9308a;

        public b(String str) {
            this.f9308a = str;
        }

        public final String toString() {
            return this.f9308a;
        }
    }

    /* compiled from: HmacParameters */
    public static final class c {

        /* renamed from: b  reason: collision with root package name */
        public static final c f9309b = new c("TINK");

        /* renamed from: c  reason: collision with root package name */
        public static final c f9310c = new c("CRUNCHY");

        /* renamed from: d  reason: collision with root package name */
        public static final c f9311d = new c("LEGACY");

        /* renamed from: e  reason: collision with root package name */
        public static final c f9312e = new c("NO_PREFIX");

        /* renamed from: a  reason: collision with root package name */
        public final String f9313a;

        public c(String str) {
            this.f9313a = str;
        }

        public final String toString() {
            return this.f9313a;
        }
    }

    public i(int i10, int i11, c cVar, b bVar) {
        this.f9295c = i10;
        this.f9296d = i11;
        this.f9297e = cVar;
        this.f9298f = bVar;
    }

    public final int K() {
        c cVar = this.f9297e;
        if (cVar == c.f9312e) {
            return this.f9296d;
        }
        if (cVar == c.f9309b) {
            return this.f9296d + 5;
        }
        if (cVar == c.f9310c) {
            return this.f9296d + 5;
        }
        if (cVar == c.f9311d) {
            return this.f9296d + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (iVar.f9295c == this.f9295c && iVar.K() == K() && iVar.f9297e == this.f9297e && iVar.f9298f == this.f9298f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f9295c), Integer.valueOf(this.f9296d), this.f9297e, this.f9298f});
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("HMAC Parameters (variant: ");
        q10.append(this.f9297e);
        q10.append(", hashType: ");
        q10.append(this.f9298f);
        q10.append(", ");
        q10.append(this.f9296d);
        q10.append("-byte tags, and ");
        return v.e(q10, this.f9295c, "-byte key)");
    }
}
