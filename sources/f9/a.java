package f9;

import a9.a;
import e9.e;
import java.security.GeneralSecurityException;

/* compiled from: ChunkedAesCmacImpl */
public final class a implements e {
    public a() {
        if (!a.C0003a.f116a.b()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
    }
}
