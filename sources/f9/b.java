package f9;

import a9.a;
import e9.e;
import java.security.GeneralSecurityException;

/* compiled from: ChunkedHmacImpl */
public final class b implements e {
    public b() {
        if (!a.C0003a.f117b.b()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
    }
}
