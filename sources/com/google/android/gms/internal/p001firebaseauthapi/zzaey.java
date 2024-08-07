package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaey  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzaey implements zzaep {
    private final zzaez zza;
    private final TaskCompletionSource zzb;

    public zzaey(zzaez zzaez, TaskCompletionSource taskCompletionSource) {
        this.zza = zzaez;
        this.zzb = taskCompletionSource;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [com.google.firebase.auth.FirebaseUser] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(java.lang.Object r14, com.google.android.gms.common.api.Status r15) {
        /*
            r13 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r13.zzb
            java.lang.String r1 = "completion source cannot be null"
            y6.j.g(r0, r1)
            if (r15 == 0) goto L_0x0133
            com.google.android.gms.internal.firebase-auth-api.zzaez r14 = r13.zza
            com.google.android.gms.internal.firebase-auth-api.zzaaf r0 = r14.zzw
            if (r0 == 0) goto L_0x0117
            com.google.android.gms.tasks.TaskCompletionSource r15 = r13.zzb
            m9.d r14 = r14.zzg
            com.google.firebase.auth.FirebaseAuth r14 = com.google.firebase.auth.FirebaseAuth.getInstance(r14)
            com.google.android.gms.internal.firebase-auth-api.zzaez r0 = r13.zza
            com.google.android.gms.internal.firebase-auth-api.zzaaf r1 = r0.zzw
            java.lang.String r0 = r0.zza()
            java.lang.String r2 = "reauthenticateWithCredential"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0038
            com.google.android.gms.internal.firebase-auth-api.zzaez r0 = r13.zza
            java.lang.String r0 = r0.zza()
            java.lang.String r2 = "reauthenticateWithCredentialWithData"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r0 = 0
            goto L_0x003c
        L_0x0038:
            com.google.android.gms.internal.firebase-auth-api.zzaez r0 = r13.zza
            com.google.firebase.auth.FirebaseUser r0 = r0.zzh
        L_0x003c:
            android.util.SparseArray r2 = com.google.android.gms.internal.p001firebaseauthapi.zzadz.zza
            r14.getClass()
            r1.getClass()
            android.util.SparseArray r2 = com.google.android.gms.internal.p001firebaseauthapi.zzadz.zza
            r3 = 17078(0x42b6, float:2.3931E-41)
            java.lang.Object r2 = r2.get(r3)
            android.util.Pair r2 = (android.util.Pair) r2
            com.google.firebase.auth.FirebaseAuthMultiFactorException r3 = new com.google.firebase.auth.FirebaseAuthMultiFactorException
            java.lang.Object r4 = r2.first
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.second
            java.lang.String r2 = (java.lang.String) r2
            java.util.List r5 = r1.zzc()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0065:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x007b
            java.lang.Object r6 = r5.next()
            com.google.firebase.auth.MultiFactorInfo r6 = (com.google.firebase.auth.MultiFactorInfo) r6
            boolean r8 = r6 instanceof com.google.firebase.auth.PhoneMultiFactorInfo
            if (r8 == 0) goto L_0x0065
            com.google.firebase.auth.PhoneMultiFactorInfo r6 = (com.google.firebase.auth.PhoneMultiFactorInfo) r6
            r7.add(r6)
            goto L_0x0065
        L_0x007b:
            java.util.List r5 = r1.zzc()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0088:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x009e
            java.lang.Object r6 = r5.next()
            com.google.firebase.auth.MultiFactorInfo r6 = (com.google.firebase.auth.MultiFactorInfo) r6
            boolean r8 = r6 instanceof com.google.firebase.auth.TotpMultiFactorInfo
            if (r8 == 0) goto L_0x0088
            com.google.firebase.auth.TotpMultiFactorInfo r6 = (com.google.firebase.auth.TotpMultiFactorInfo) r6
            r12.add(r6)
            goto L_0x0088
        L_0x009e:
            java.util.List r5 = r1.zzc()
            java.lang.String r6 = r1.zzb()
            y6.j.f(r5)
            y6.j.c(r6)
            com.google.firebase.auth.internal.zzag r8 = new com.google.firebase.auth.internal.zzag
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r8.f7525c = r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r8.f7526d = r9
            java.util.Iterator r5 = r5.iterator()
        L_0x00c3:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x00fb
            java.lang.Object r9 = r5.next()
            com.google.firebase.auth.MultiFactorInfo r9 = (com.google.firebase.auth.MultiFactorInfo) r9
            boolean r10 = r9 instanceof com.google.firebase.auth.PhoneMultiFactorInfo
            if (r10 == 0) goto L_0x00db
            java.util.List r10 = r8.f7525c
            com.google.firebase.auth.PhoneMultiFactorInfo r9 = (com.google.firebase.auth.PhoneMultiFactorInfo) r9
            r10.add(r9)
            goto L_0x00c3
        L_0x00db:
            boolean r10 = r9 instanceof com.google.firebase.auth.TotpMultiFactorInfo
            if (r10 == 0) goto L_0x00e7
            java.util.List r10 = r8.f7526d
            com.google.firebase.auth.TotpMultiFactorInfo r9 = (com.google.firebase.auth.TotpMultiFactorInfo) r9
            r10.add(r9)
            goto L_0x00c3
        L_0x00e7:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = r9.P0()
            java.lang.String r15 = java.lang.String.valueOf(r15)
            java.lang.String r0 = "MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: "
            java.lang.String r15 = r0.concat(r15)
            r14.<init>(r15)
            throw r14
        L_0x00fb:
            r8.f7524b = r6
            com.google.firebase.auth.internal.zzae r6 = new com.google.firebase.auth.internal.zzae
            m9.d r14 = r14.f7471a
            r14.a()
            java.lang.String r9 = r14.f13219b
            com.google.firebase.auth.zze r10 = r1.zza()
            r11 = r0
            com.google.firebase.auth.internal.zzx r11 = (com.google.firebase.auth.internal.zzx) r11
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r3.<init>(r4, r2)
            r15.setException(r3)
            return
        L_0x0117:
            com.google.firebase.auth.AuthCredential r0 = r14.zzt
            if (r0 == 0) goto L_0x0129
            com.google.android.gms.tasks.TaskCompletionSource r1 = r13.zzb
            java.lang.String r2 = r14.zzu
            java.lang.String r14 = r14.zzv
            com.google.firebase.FirebaseException r14 = com.google.android.gms.internal.p001firebaseauthapi.zzadz.zzb(r15, r0, r2, r14)
            r1.setException(r14)
            return
        L_0x0129:
            com.google.android.gms.tasks.TaskCompletionSource r14 = r13.zzb
            com.google.firebase.FirebaseException r15 = com.google.android.gms.internal.p001firebaseauthapi.zzadz.zza(r15)
            r14.setException(r15)
            return
        L_0x0133:
            com.google.android.gms.tasks.TaskCompletionSource r15 = r13.zzb
            r15.setResult(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzaey.zza(java.lang.Object, com.google.android.gms.common.api.Status):void");
    }
}
