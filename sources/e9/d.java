package e9;

import d9.a;
import d9.c;
import d9.k;
import d9.m;
import d9.w;
import e9.c;
import i9.i0;
import java.security.GeneralSecurityException;
import v.g0;

/* compiled from: AesCmacProtoSerialization */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final m f9283a = new m(c.class);

    /* renamed from: b  reason: collision with root package name */
    public static final k f9284b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f9285c = new c(a.class);

    /* renamed from: d  reason: collision with root package name */
    public static final a f9286d;

    static {
        l9.a b10 = w.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f9284b = new k(b10);
        f9286d = new a(new g0(15), b10);
    }

    public static c.b a(i0 i0Var) {
        int ordinal = i0Var.ordinal();
        if (ordinal == 1) {
            return c.b.f9278b;
        }
        if (ordinal == 2) {
            return c.b.f9280d;
        }
        if (ordinal == 3) {
            return c.b.f9281e;
        }
        if (ordinal == 4) {
            return c.b.f9279c;
        }
        StringBuilder q10 = android.support.v4.media.a.q("Unable to parse OutputPrefixType: ");
        q10.append(i0Var.a());
        throw new GeneralSecurityException(q10.toString());
    }
}
