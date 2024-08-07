package u6;

import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import k7.a;
import k7.b;
import y6.b1;
import y6.e0;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public abstract class m extends b1 {

    /* renamed from: b  reason: collision with root package name */
    public final int f15301b;

    public m(byte[] bArr) {
        boolean z10;
        if (bArr.length == 25) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f15301b = Arrays.hashCode(bArr);
            return;
        }
        throw new IllegalArgumentException();
    }

    public static byte[] m(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        a zzd;
        if (obj != null && (obj instanceof e0)) {
            try {
                e0 e0Var = (e0) obj;
                if (e0Var.zzc() != this.f15301b || (zzd = e0Var.zzd()) == null) {
                    return false;
                }
                return Arrays.equals(o(), (byte[]) b.o(zzd));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15301b;
    }

    public abstract byte[] o();

    public final int zzc() {
        return this.f15301b;
    }

    public final a zzd() {
        return new b(o());
    }
}
