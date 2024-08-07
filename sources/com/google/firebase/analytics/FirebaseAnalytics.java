package com.google.firebase.analytics;

import ab.b;
import ab.c;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n7.d;
import y6.j;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
public final class FirebaseAnalytics {

    /* renamed from: b  reason: collision with root package name */
    public static volatile FirebaseAnalytics f7453b;

    /* renamed from: a  reason: collision with root package name */
    public final zzdf f7454a;

    public FirebaseAnalytics(zzdf zzdf) {
        j.f(zzdf);
        this.f7454a = zzdf;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f7453b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f7453b == null) {
                    f7453b = new FirebaseAnalytics(zzdf.zza(context));
                }
            }
        }
        return f7453b;
    }

    @Keep
    public static d getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzdf zza = zzdf.zza(context, (String) null, (String) null, (String) null, bundle);
        if (zza == null) {
            return null;
        }
        return new z.j(zza, 10);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            Object obj = b.f143m;
            return (String) Tasks.await(((b) m9.d.d().b(c.class)).getId(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e10) {
            throw new IllegalStateException(e10.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e11) {
            throw new IllegalStateException(e11);
        }
    }

    @Deprecated
    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.f7454a.zza(activity, str, str2);
    }
}
