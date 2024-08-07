package ba;

import a7.a;
import android.content.Context;
import android.content.SharedPreferences;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f4135a;

    /* renamed from: b  reason: collision with root package name */
    public final a f4136b = new a("StorageHelpers", new String[0]);

    public v(Context context, String str) {
        j.f(context);
        j.c(str);
        this.f4135a = context.getApplicationContext().getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", new Object[]{str}), 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r15v6, types: [com.google.firebase.auth.TotpMultiFactorInfo] */
    /* JADX WARNING: type inference failed for: r15v7, types: [com.google.firebase.auth.PhoneMultiFactorInfo] */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c6 A[SYNTHETIC, Splitter:B:36:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016e A[ExcHandler: zzzr | ArrayIndexOutOfBoundsException | IllegalArgumentException (e java.lang.Throwable), Splitter:B:1:0x0009] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.firebase.auth.internal.zzx a(org.json.JSONObject r27) {
        /*
            r26 = this;
            r0 = r27
            java.lang.String r1 = "userMultiFactorInfo"
            java.lang.String r2 = "userMetadata"
            r3 = 0
            java.lang.String r4 = "cachedTokenState"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            java.lang.String r5 = "applicationName"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            java.lang.String r6 = "anonymous"
            boolean r6 = r0.getBoolean(r6)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            java.lang.String r7 = "2"
            java.lang.String r8 = "version"
            java.lang.String r8 = r0.getString(r8)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            if (r8 == 0) goto L_0x0024
            r7 = r8
        L_0x0024:
            java.lang.String r8 = "userInfos"
            org.json.JSONArray r8 = r0.getJSONArray(r8)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            int r9 = r8.length()     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            if (r9 != 0) goto L_0x0031
            return r3
        L_0x0031:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            r10.<init>(r9)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            r12 = 0
        L_0x0037:
            java.lang.String r13 = "phoneNumber"
            java.lang.String r14 = "displayName"
            if (r12 >= r9) goto L_0x0086
            java.lang.String r15 = r8.getString(r12)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            r11.<init>(r15)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            java.lang.String r15 = "userId"
            java.lang.String r18 = r11.optString(r15)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            java.lang.String r15 = "providerId"
            java.lang.String r19 = r11.optString(r15)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            java.lang.String r15 = "email"
            java.lang.String r20 = r11.optString(r15)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            java.lang.String r21 = r11.optString(r13)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            java.lang.String r22 = r11.optString(r14)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            java.lang.String r13 = "photoUrl"
            java.lang.String r23 = r11.optString(r13)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            java.lang.String r13 = "isEmailVerified"
            boolean r24 = r11.optBoolean(r13)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            java.lang.String r13 = "rawUserInfo"
            java.lang.String r25 = r11.optString(r13)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            com.google.firebase.auth.internal.zzt r11 = new com.google.firebase.auth.internal.zzt     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            r17 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ JSONException -> 0x007f, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            r10.add(r11)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            int r12 = r12 + 1
            goto L_0x0037
        L_0x007f:
            r0 = move-exception
            com.google.android.gms.internal.firebase-auth-api.zzzr r1 = new com.google.android.gms.internal.firebase-auth-api.zzzr     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            throw r1     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
        L_0x0086:
            m9.d r5 = m9.d.e(r5)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            com.google.firebase.auth.internal.zzx r8 = new com.google.firebase.auth.internal.zzx     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            r8.<init>(r5, r10)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            if (r5 != 0) goto L_0x009c
            com.google.android.gms.internal.firebase-auth-api.zzahb r4 = com.google.android.gms.internal.p001firebaseauthapi.zzahb.zzd(r4)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            r8.Y0(r4)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
        L_0x009c:
            if (r6 != 0) goto L_0x00a2
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            r8.f7551o = r4     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
        L_0x00a2:
            r8.f7550n = r7     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            boolean r4 = r0.has(r2)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            if (r4 == 0) goto L_0x00c8
            org.json.JSONObject r2 = r0.getJSONObject(r2)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            if (r2 != 0) goto L_0x00b1
            goto L_0x00c3
        L_0x00b1:
            java.lang.String r4 = "lastSignInTimestamp"
            long r4 = r2.getLong(r4)     // Catch:{ JSONException -> 0x00c3, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            java.lang.String r6 = "creationTimestamp"
            long r6 = r2.getLong(r6)     // Catch:{ JSONException -> 0x00c3, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            com.google.firebase.auth.internal.zzz r2 = new com.google.firebase.auth.internal.zzz     // Catch:{ JSONException -> 0x00c3, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            r2.<init>(r4, r6)     // Catch:{ JSONException -> 0x00c3, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            goto L_0x00c4
        L_0x00c3:
            r2 = r3
        L_0x00c4:
            if (r2 == 0) goto L_0x00c8
            r8.f7552p = r2     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
        L_0x00c8:
            boolean r2 = r0.has(r1)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            if (r2 == 0) goto L_0x016d
            org.json.JSONArray r0 = r0.getJSONArray(r1)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            if (r0 == 0) goto L_0x016d
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            r1.<init>()     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            r11 = 0
        L_0x00da:
            int r2 = r0.length()     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            if (r11 >= r2) goto L_0x016a
            java.lang.String r2 = r0.getString(r11)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            r4.<init>(r2)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            java.lang.String r2 = "factorIdKey"
            java.lang.String r2 = r4.optString(r2)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            java.lang.String r5 = "phone"
            boolean r5 = r5.equals(r2)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            java.lang.String r6 = "uid"
            java.lang.String r7 = "enrollmentTimestamp"
            if (r5 == 0) goto L_0x0120
            boolean r2 = r4.has(r7)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            if (r2 == 0) goto L_0x0118
            java.lang.String r18 = r4.optString(r6)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            java.lang.String r19 = r4.optString(r14)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            long r16 = r4.optLong(r7)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            java.lang.String r20 = r4.optString(r13)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            com.google.firebase.auth.PhoneMultiFactorInfo r2 = new com.google.firebase.auth.PhoneMultiFactorInfo     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            r15 = r2
            r15.<init>(r16, r18, r19, r20)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            goto L_0x0154
        L_0x0118:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            java.lang.String r1 = "An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance."
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            throw r0     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
        L_0x0120:
            java.lang.String r5 = "totp"
            if (r2 == r5) goto L_0x012f
            if (r2 == 0) goto L_0x012d
            boolean r2 = r2.equals(r5)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            if (r2 == 0) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r2 = r3
            goto L_0x0154
        L_0x012f:
            boolean r2 = r4.has(r7)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            if (r2 == 0) goto L_0x0162
            long r18 = r4.optLong(r7)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            java.lang.String r2 = "totpInfo"
            java.lang.Object r2 = r4.opt(r2)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            if (r2 == 0) goto L_0x015a
            com.google.android.gms.internal.firebase-auth-api.zzaia r20 = new com.google.android.gms.internal.firebase-auth-api.zzaia     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            r20.<init>()     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            java.lang.String r16 = r4.optString(r6)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            java.lang.String r17 = r4.optString(r14)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            com.google.firebase.auth.TotpMultiFactorInfo r2 = new com.google.firebase.auth.TotpMultiFactorInfo     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            r15 = r2
            r15.<init>(r16, r17, r18, r20)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
        L_0x0154:
            r1.add(r2)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            int r11 = r11 + 1
            goto L_0x00da
        L_0x015a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            java.lang.String r1 = "A totpInfo is required to build a TotpMultiFactorInfo instance."
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            throw r0     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
        L_0x0162:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            java.lang.String r1 = "An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance."
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
            throw r0     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
        L_0x016a:
            r8.Z0(r1)     // Catch:{ JSONException -> 0x0174, ArrayIndexOutOfBoundsException -> 0x0172, IllegalArgumentException -> 0x0170, zzzr -> 0x016e }
        L_0x016d:
            return r8
        L_0x016e:
            r0 = move-exception
            goto L_0x0175
        L_0x0170:
            r0 = move-exception
            goto L_0x0175
        L_0x0172:
            r0 = move-exception
            goto L_0x0175
        L_0x0174:
            r0 = move-exception
        L_0x0175:
            r1 = r26
            a7.a r2 = r1.f4136b
            java.lang.String r2 = r2.f107a
            android.util.Log.wtf(r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.v.a(org.json.JSONObject):com.google.firebase.auth.internal.zzx");
    }
}
