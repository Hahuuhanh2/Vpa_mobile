package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzdr {
    public static final void zza(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.connect();
        } catch (SocketTimeoutException e10) {
            throw new zzbj(zzbh.zzc, zzbg.zzad, e10.getMessage());
        } catch (IOException e11) {
            throw new zzbj(zzbh.zzc, zzbg.zzae, e11.getMessage());
        } catch (Exception e12) {
            throw new zzbj(zzbh.zzc, zzbg.zzak, e12.getMessage());
        }
    }

    public static final zzbj zzb(int i10) {
        if (i10 == 403) {
            return new zzbj(zzbh.zzi, zzbg.zzJ, (String) null);
        }
        if (i10 == 404) {
            return new zzbj(zzbh.zzc, zzbg.zzi, (String) null);
        }
        if (i10 != 503) {
            return new zzbj(zzbh.zzb, zzbg.zzK, (String) null);
        }
        return new zzbj(zzbh.zzi, zzbg.zzJ, (String) null);
    }

    public static final InputStream zzc(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException e10) {
            throw new zzbj(zzbh.zzc, zzbg.zzaf, e10.getMessage());
        } catch (Exception e11) {
            throw new zzbj(zzbh.zzc, zzbg.zzal, e11.getMessage());
        }
    }

    public static final OutputStream zzd(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getOutputStream();
        } catch (IOException e10) {
            throw new zzbj(zzbh.zzc, zzbg.zzaf, e10.getMessage());
        } catch (Exception e11) {
            throw new zzbj(zzbh.zzc, zzbg.zzal, e11.getMessage());
        }
    }
}
