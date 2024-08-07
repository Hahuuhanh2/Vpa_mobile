package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import m9.b;
import s8.a0;
import s8.e;
import s8.m;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class aj {

    /* renamed from: a  reason: collision with root package name */
    public final e f7205a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final a0 f7206b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final String f7207c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final at f7208d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final k f7209e;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aj(android.content.Context r7, s8.a0 r8, com.google.android.play.core.integrity.at r9, com.google.android.play.core.integrity.k r10) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.String r0 = r7.getPackageName()
            r6.f7207c = r0
            r6.f7206b = r8
            r6.f7208d = r9
            r6.f7209e = r10
            s8.a0 r9 = s8.f.f14686a
            java.lang.String r9 = "com.android.vending"
            r10 = 0
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0034 }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r9, r10)     // Catch:{ NameNotFoundException -> 0x0034 }
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x0034 }
            if (r0 == 0) goto L_0x0034
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0034 }
            r1 = 64
            android.content.pm.PackageInfo r9 = r0.getPackageInfo(r9, r1)     // Catch:{ NameNotFoundException -> 0x0034 }
            android.content.pm.Signature[] r9 = r9.signatures     // Catch:{ NameNotFoundException -> 0x0034 }
            boolean r9 = s8.f.a(r9)
            if (r9 == 0) goto L_0x0034
            r9 = 1
            goto L_0x0035
        L_0x0034:
            r9 = r10
        L_0x0035:
            if (r9 != 0) goto L_0x0050
            java.lang.Object[] r7 = new java.lang.Object[r10]
            r8.getClass()
            r9 = 6
            java.lang.String r10 = "PlayCore"
            boolean r9 = android.util.Log.isLoggable(r10, r9)
            if (r9 == 0) goto L_0x004c
            java.lang.String r8 = r8.f14658a
            java.lang.String r9 = "Phonesky is not installed."
            s8.a0.c(r8, r9, r7)
        L_0x004c:
            r7 = 0
            r6.f7205a = r7
            return
        L_0x0050:
            s8.e r9 = new s8.e
            android.content.Intent r4 = com.google.android.play.core.integrity.ak.f7210a
            com.google.android.play.core.integrity.ae r5 = com.google.android.play.core.integrity.ae.f7190a
            java.lang.String r3 = "IntegrityService"
            r0 = r9
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f7205a = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.aj.<init>(android.content.Context, s8.a0, com.google.android.play.core.integrity.at, com.google.android.play.core.integrity.k):void");
    }

    public static Bundle a(aj ajVar, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f7207c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new m(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList(b.a(arrayList)));
        return bundle;
    }

    public final Task b(Activity activity, Bundle bundle) {
        if (this.f7205a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, (Throwable) null));
        }
        int i10 = bundle.getInt("dialog.intent.type");
        this.f7206b.b("requestAndShowDialog(%s, %s)", this.f7207c, Integer.valueOf(i10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f7205a.c(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i10), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f7205a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, (Throwable) null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
                ao aoVar = (ao) integrityTokenRequest;
            }
            this.f7206b.b("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f7205a.c(new af(this, taskCompletionSource, decode, cloudProjectNumber, (Parcelable) null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e10) {
            return Tasks.forException(new IntegrityServiceException(-13, e10));
        }
    }
}
