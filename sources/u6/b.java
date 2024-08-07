package u6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.media.a;
import android.text.TextUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import h7.d;
import j7.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f15289a = 12451000;

    /* renamed from: b  reason: collision with root package name */
    public static final b f15290b = new b();

    static {
        AtomicBoolean atomicBoolean = d.f15292a;
    }

    public Intent a(int i10, Context context, String str) {
        if (i10 == 1 || i10 == 2) {
            if (context == null || !d.c(context)) {
                StringBuilder q10 = a.q("gcore_");
                q10.append(f15289a);
                q10.append("-");
                if (!TextUtils.isEmpty(str)) {
                    q10.append(str);
                }
                q10.append("-");
                if (context != null) {
                    q10.append(context.getPackageName());
                }
                q10.append("-");
                if (context != null) {
                    try {
                        q10.append(c.a(context).a(0, context.getPackageName()).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                String sb2 = q10.toString();
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                if (!TextUtils.isEmpty(sb2)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(524288);
                return intent;
            }
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else if (i10 != 3) {
            return null;
        } else {
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(fromParts);
            return intent3;
        }
    }

    @ResultIgnorabilityUnspecified
    public int b(Context context) {
        return c(context, f15289a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:132:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0199 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x019a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int c(android.content.Context r12, int r13) {
        /*
            r11 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = u6.d.f15292a
            android.content.res.Resources r0 = r12.getResources()     // Catch:{ all -> 0x000b }
            int r1 = com.google.android.gms.common.R$string.common_google_play_services_unknown_issue     // Catch:{ all -> 0x000b }
            r0.getString(r1)     // Catch:{ all -> 0x000b }
        L_0x000b:
            java.lang.String r0 = r12.getPackageName()
            java.lang.String r1 = "com.google.android.gms"
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0077
            java.util.concurrent.atomic.AtomicBoolean r0 = u6.d.f15293b
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0021
            goto L_0x0077
        L_0x0021:
            java.lang.Object r0 = y6.h0.f17560a
            monitor-enter(r0)
            boolean r2 = y6.h0.f17561b     // Catch:{ all -> 0x0054 }
            if (r2 == 0) goto L_0x002a
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            goto L_0x005f
        L_0x002a:
            y6.h0.f17561b = r1     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = r12.getPackageName()     // Catch:{ all -> 0x0054 }
            j7.b r3 = j7.c.a(r12)     // Catch:{ all -> 0x0054 }
            r4 = 128(0x80, float:1.794E-43)
            android.content.Context r3 = r3.f11719a     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x0056 }
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0056 }
            if (r2 != 0) goto L_0x0046
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            goto L_0x005f
        L_0x0046:
            java.lang.String r3 = "com.google.app.id"
            r2.getString(r3)     // Catch:{ NameNotFoundException -> 0x0056 }
            java.lang.String r3 = "com.google.android.gms.version"
            int r2 = r2.getInt(r3)     // Catch:{ NameNotFoundException -> 0x0056 }
            y6.h0.f17562c = r2     // Catch:{ NameNotFoundException -> 0x0056 }
            goto L_0x005e
        L_0x0054:
            r12 = move-exception
            goto L_0x0075
        L_0x0056:
            r2 = move-exception
            java.lang.String r3 = "MetadataValueReader"
            java.lang.String r4 = "This should never happen."
            android.util.Log.wtf(r3, r4, r2)     // Catch:{ all -> 0x0054 }
        L_0x005e:
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
        L_0x005f:
            int r0 = y6.h0.f17562c
            if (r0 == 0) goto L_0x006f
            r2 = 12451000(0xbdfcb8, float:1.7447567E-38)
            if (r0 != r2) goto L_0x0069
            goto L_0x0077
        L_0x0069:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r12 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r12.<init>(r0)
            throw r12
        L_0x006f:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r12 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r12.<init>()
            throw r12
        L_0x0075:
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            throw r12
        L_0x0077:
            boolean r0 = h7.d.c(r12)
            r2 = 0
            if (r0 != 0) goto L_0x00ae
            java.lang.Boolean r0 = h7.d.f10612c
            if (r0 != 0) goto L_0x00a4
            android.content.pm.PackageManager r0 = r12.getPackageManager()
            java.lang.String r3 = "android.hardware.type.iot"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 != 0) goto L_0x009d
            android.content.pm.PackageManager r0 = r12.getPackageManager()
            java.lang.String r3 = "android.hardware.type.embedded"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 == 0) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            r0 = r2
            goto L_0x009e
        L_0x009d:
            r0 = r1
        L_0x009e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            h7.d.f10612c = r0
        L_0x00a4:
            java.lang.Boolean r0 = h7.d.f10612c
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00ae
            r0 = r1
            goto L_0x00af
        L_0x00ae:
            r0 = r2
        L_0x00af:
            if (r13 < 0) goto L_0x00b3
            r3 = r1
            goto L_0x00b4
        L_0x00b3:
            r3 = r2
        L_0x00b4:
            if (r3 == 0) goto L_0x019b
            java.lang.String r3 = r12.getPackageName()
            android.content.pm.PackageManager r4 = r12.getPackageManager()
            r5 = 9
            if (r0 == 0) goto L_0x00d6
            java.lang.String r6 = "com.android.vending"
            r7 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r6 = r4.getPackageInfo(r6, r7)     // Catch:{ NameNotFoundException -> 0x00cb }
            goto L_0x00d7
        L_0x00cb:
            java.lang.String r13 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires the Google Play Store, but it is missing."
            r13.concat(r0)
            goto L_0x018a
        L_0x00d6:
            r6 = 0
        L_0x00d7:
            java.lang.String r7 = "com.google.android.gms"
            r8 = 64
            android.content.pm.PackageInfo r7 = r4.getPackageInfo(r7, r8)     // Catch:{ NameNotFoundException -> 0x0180 }
            java.lang.Class<u6.e> r8 = u6.e.class
            monitor-enter(r8)
            u6.e r9 = u6.e.f15294a     // Catch:{ all -> 0x017d }
            if (r9 != 0) goto L_0x0103
            u6.l r9 = u6.q.f15306a     // Catch:{ all -> 0x017d }
            java.lang.Class<u6.q> r9 = u6.q.class
            monitor-enter(r9)     // Catch:{ all -> 0x017d }
            android.content.Context r10 = u6.q.f15308c     // Catch:{ all -> 0x0100 }
            if (r10 != 0) goto L_0x00f7
            android.content.Context r10 = r12.getApplicationContext()     // Catch:{ all -> 0x0100 }
            u6.q.f15308c = r10     // Catch:{ all -> 0x0100 }
            monitor-exit(r9)     // Catch:{ all -> 0x017d }
            goto L_0x00f8
        L_0x00f7:
            monitor-exit(r9)     // Catch:{ all -> 0x017d }
        L_0x00f8:
            u6.e r9 = new u6.e     // Catch:{ all -> 0x017d }
            r9.<init>(r12)     // Catch:{ all -> 0x017d }
            u6.e.f15294a = r9     // Catch:{ all -> 0x017d }
            goto L_0x0103
        L_0x0100:
            r12 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x017d }
            throw r12     // Catch:{ all -> 0x017d }
        L_0x0103:
            monitor-exit(r8)     // Catch:{ all -> 0x017d }
            boolean r8 = u6.e.b(r7)
            if (r8 != 0) goto L_0x0115
            java.lang.String r13 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires Google Play services, but their signature is invalid."
            r13.concat(r0)
            goto L_0x018a
        L_0x0115:
            if (r0 == 0) goto L_0x012b
            y6.j.f(r6)
            boolean r8 = u6.e.b(r6)
            if (r8 != 0) goto L_0x012b
            java.lang.String r13 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires Google Play Store, but its signature is invalid."
            r13.concat(r0)
            goto L_0x018a
        L_0x012b:
            if (r0 == 0) goto L_0x0147
            if (r6 == 0) goto L_0x0147
            android.content.pm.Signature[] r0 = r6.signatures
            r0 = r0[r2]
            android.content.pm.Signature[] r6 = r7.signatures
            r6 = r6[r2]
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0147
            java.lang.String r13 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            r13.concat(r0)
            goto L_0x018a
        L_0x0147:
            int r0 = r7.versionCode
            r5 = -1
            if (r0 != r5) goto L_0x014e
            r0 = r5
            goto L_0x0150
        L_0x014e:
            int r0 = r0 / 1000
        L_0x0150:
            if (r13 != r5) goto L_0x0153
            goto L_0x0155
        L_0x0153:
            int r5 = r13 / 1000
        L_0x0155:
            if (r0 >= r5) goto L_0x0159
            r5 = 2
            goto L_0x018a
        L_0x0159:
            android.content.pm.ApplicationInfo r13 = r7.applicationInfo
            if (r13 != 0) goto L_0x0175
            java.lang.String r13 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r13 = r4.getApplicationInfo(r13, r2)     // Catch:{ NameNotFoundException -> 0x0164 }
            goto L_0x0175
        L_0x0164:
            r13 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r3 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r4 = "GooglePlayServicesUtil"
            java.lang.String r0 = r0.concat(r3)
            android.util.Log.wtf(r4, r0, r13)
            goto L_0x0189
        L_0x0175:
            boolean r13 = r13.enabled
            if (r13 != 0) goto L_0x017b
            r5 = 3
            goto L_0x018a
        L_0x017b:
            r5 = r2
            goto L_0x018a
        L_0x017d:
            r12 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x017d }
            throw r12
        L_0x0180:
            java.lang.String r13 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires Google Play services, but they are missing."
            r13.concat(r0)
        L_0x0189:
            r5 = r1
        L_0x018a:
            r13 = 18
            if (r5 != r13) goto L_0x018f
            goto L_0x0197
        L_0x018f:
            if (r5 != r1) goto L_0x0196
            boolean r1 = u6.d.a(r12)
            goto L_0x0197
        L_0x0196:
            r1 = r2
        L_0x0197:
            if (r1 == 0) goto L_0x019a
            return r13
        L_0x019a:
            return r5
        L_0x019b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.b.c(android.content.Context, int):int");
    }
}
