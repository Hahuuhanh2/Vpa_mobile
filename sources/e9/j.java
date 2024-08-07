package e9;

import d9.a;
import d9.c;
import d9.k;
import d9.m;
import d9.w;
import e9.i;
import i9.i0;
import i9.u;
import java.security.GeneralSecurityException;
import kh.h;

/* compiled from: HmacProtoSerialization */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final m f9314a = new m(i.class);

    /* renamed from: b  reason: collision with root package name */
    public static final k f9315b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f9316c = new c(g.class);

    /* renamed from: d  reason: collision with root package name */
    public static final a f9317d;

    static {
        l9.a b10 = w.b("type.googleapis.com/google.crypto.tink.HmacKey");
        f9315b = new k(b10);
        f9317d = new a(new h(22), b10);
    }

    public static i.b a(u uVar) {
        int ordinal = uVar.ordinal();
        if (ordinal == 1) {
            return i.b.f9303b;
        }
        if (ordinal == 2) {
            return i.b.f9306e;
        }
        if (ordinal == 3) {
            return i.b.f9305d;
        }
        if (ordinal == 4) {
            return i.b.f9307f;
        }
        if (ordinal == 5) {
            return i.b.f9304c;
        }
        StringBuilder q10 = android.support.v4.media.a.q("Unable to parse HashType: ");
        q10.append(uVar.a());
        throw new GeneralSecurityException(q10.toString());
    }

    public static i.c b(i0 i0Var) {
        int ordinal = i0Var.ordinal();
        if (ordinal == 1) {
            return i.c.f9309b;
        }
        if (ordinal == 2) {
            return i.c.f9311d;
        }
        if (ordinal == 3) {
            return i.c.f9312e;
        }
        if (ordinal == 4) {
            return i.c.f9310c;
        }
        StringBuilder q10 = android.support.v4.media.a.q("Unable to parse OutputPrefixType: ");
        q10.append(i0Var.a());
        throw new GeneralSecurityException(q10.toString());
    }
}
