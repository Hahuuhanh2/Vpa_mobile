package ba;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.internal.p001firebaseauthapi.zzbf;
import com.google.android.gms.internal.p001firebaseauthapi.zzbk;
import com.google.android.gms.internal.p001firebaseauthapi.zzca;
import com.google.android.gms.internal.p001firebaseauthapi.zzla;
import com.google.android.gms.internal.p001firebaseauthapi.zzlf;
import com.google.android.gms.internal.p001firebaseauthapi.zzmh;
import com.google.android.gms.internal.p001firebaseauthapi.zzmj;
import com.google.android.gms.internal.p001firebaseauthapi.zzos;
import com.google.android.gms.internal.p001firebaseauthapi.zzq;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class f0 {

    /* renamed from: c  reason: collision with root package name */
    public static f0 f4109c;

    /* renamed from: a  reason: collision with root package name */
    public final String f4110a;

    /* renamed from: b  reason: collision with root package name */
    public final zzmj f4111b;

    public f0(Context context, String str) {
        zzmj zzmj;
        this.f4110a = str;
        try {
            zzla.zza();
            zzmh zzmh = new zzmh();
            zzmh.zzf(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", new Object[]{str}));
            zzmh.zzd(zzlf.zza);
            zzmh.zze(String.format("android-keystore://firebear_master_key_id.%s", new Object[]{str}));
            zzmj = zzmh.zzg();
        } catch (IOException | GeneralSecurityException e10) {
            "Exception encountered during crypto setup:\n".concat(String.valueOf(e10.getMessage()));
            zzmj = null;
        }
        this.f4111b = zzmj;
    }

    public static f0 a(Context context, String str) {
        f0 f0Var = f4109c;
        if (f0Var == null || !zzq.zza(f0Var.f4110a, str)) {
            f4109c = new f0(context, str);
        }
        return f4109c;
    }

    public final String b(String str) {
        String str2;
        zzmj zzmj = this.f4111b;
        if (zzmj != null) {
            try {
                synchronized (zzmj) {
                    str2 = new String(((zzbk) this.f4111b.zza().zze(zzos.zza(), zzbk.class)).zza(Base64.decode(str, 8), (byte[]) null), "UTF-8");
                }
                return str2;
            } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
                "Exception encountered while decrypting bytes:\n".concat(String.valueOf(e10.getMessage()));
            }
        }
        return null;
    }

    public final String c() {
        if (this.f4111b == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzca zza = zzbf.zza(byteArrayOutputStream);
        try {
            synchronized (this.f4111b) {
                this.f4111b.zza().zzb().zzg(zza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e10) {
            "Exception encountered when attempting to get Public Key:\n".concat(String.valueOf(e10.getMessage()));
            return null;
        }
    }
}
