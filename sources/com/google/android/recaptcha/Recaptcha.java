package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzco;
import ik.d;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    /* renamed from: getClient-BWLJW6A$default  reason: not valid java name */
    public static /* synthetic */ Object m4getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j10, d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = 10000;
        }
        return recaptcha.m5getClientBWLJW6A(application, str, j10, dVar);
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzco.zzh(application, str, 10000);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: getClient-BWLJW6A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m5getClientBWLJW6A(android.app.Application r8, java.lang.String r9, long r10, ik.d<? super ek.f<? extends com.google.android.recaptcha.RecaptchaClient>> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.Recaptcha$getClient$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = (com.google.android.recaptcha.Recaptcha$getClient$1) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = new com.google.android.recaptcha.Recaptcha$getClient$1
            r0.<init>(r7, r12)
        L_0x0018:
            r6 = r0
            java.lang.Object r12 = r6.zza
            jk.a r0 = jk.a.COROUTINE_SUSPENDED
            int r1 = r6.zzc
            r2 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 != r2) goto L_0x0028
            p3.l0.Q0(r12)     // Catch:{ all -> 0x0045 }
            goto L_0x0042
        L_0x0028:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0030:
            p3.l0.Q0(r12)
            com.google.android.recaptcha.internal.zzco r12 = com.google.android.recaptcha.internal.zzco.zza     // Catch:{ all -> 0x0045 }
            r6.zzc = r2     // Catch:{ all -> 0x0045 }
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            java.lang.Object r12 = com.google.android.recaptcha.internal.zzco.zzg(r1, r2, r3, r5, r6)     // Catch:{ all -> 0x0045 }
            if (r12 != r0) goto L_0x0042
            return r0
        L_0x0042:
            com.google.android.recaptcha.internal.zzcx r12 = (com.google.android.recaptcha.internal.zzcx) r12     // Catch:{ all -> 0x0045 }
            goto L_0x004a
        L_0x0045:
            r8 = move-exception
            ek.f$a r12 = p3.l0.A(r8)
        L_0x004a:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.Recaptcha.m5getClientBWLJW6A(android.app.Application, java.lang.String, long, ik.d):java.lang.Object");
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j10) {
        return zzco.zzh(application, str, j10);
    }
}
