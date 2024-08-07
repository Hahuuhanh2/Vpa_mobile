package q6;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.internal.p000authapiphone.zzv;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public abstract class a extends b<a.d.c> {
    private static final a.g<zzv> zza;
    private static final a.C0058a<zzv, a.d.c> zzb;
    private static final com.google.android.gms.common.api.a<a.d.c> zzc;

    static {
        a.g<zzv> gVar = new a.g<>();
        zza = gVar;
        b bVar = new b();
        zzb = bVar;
        zzc = new com.google.android.gms.common.api.a<>("SmsRetriever.API", bVar, gVar);
    }

    public a(Context context) {
        super(context, zzc, null, b.a.f5354c);
    }

    public abstract Task<Void> startSmsRetriever();

    public abstract Task<Void> startSmsUserConsent(String str);

    public a(Activity activity) {
        super(activity, zzc, null, b.a.f5354c);
    }
}
