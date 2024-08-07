package pa;

import com.google.android.gms.tasks.SuccessContinuation;

/* compiled from: SettingsController */
public final class d implements SuccessContinuation<Void, Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f14121a;

    public d(e eVar) {
        this.f14121a = eVar;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060 A[Catch:{ IOException -> 0x0068 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.tasks.Task then(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.Void r11 = (java.lang.Void) r11
            pa.e r11 = r10.f14121a
            pa.i r1 = r11.f14127f
            pa.h r11 = r11.f14123b
            pa.b r1 = (pa.b) r1
            r1.getClass()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 0
            java.util.HashMap r6 = pa.b.c(r11)     // Catch:{ IOException -> 0x0068 }
            a.a r7 = r1.f14110b     // Catch:{ IOException -> 0x0068 }
            java.lang.String r1 = r1.f14109a     // Catch:{ IOException -> 0x0068 }
            r7.getClass()     // Catch:{ IOException -> 0x0068 }
            ma.a r7 = new ma.a     // Catch:{ IOException -> 0x0068 }
            r7.<init>(r1, r6)     // Catch:{ IOException -> 0x0068 }
            java.lang.String r1 = "User-Agent"
            java.lang.String r8 = "Crashlytics Android SDK/18.4.3"
            java.util.HashMap r9 = r7.f13240c     // Catch:{ IOException -> 0x0068 }
            r9.put(r1, r8)     // Catch:{ IOException -> 0x0068 }
            java.lang.String r1 = "X-CRASHLYTICS-DEVELOPER-TOKEN"
            java.lang.String r8 = "470fa2b4ae81cd56ecbcda9735803434cec591fa"
            java.util.HashMap r9 = r7.f13240c     // Catch:{ IOException -> 0x0068 }
            r9.put(r1, r8)     // Catch:{ IOException -> 0x0068 }
            pa.b.a(r7, r11)     // Catch:{ IOException -> 0x0068 }
            android.util.Log.isLoggable(r0, r3)     // Catch:{ IOException -> 0x0068 }
            r6.toString()     // Catch:{ IOException -> 0x0068 }
            android.util.Log.isLoggable(r0, r4)     // Catch:{ IOException -> 0x0068 }
            v9.g r11 = r7.b()     // Catch:{ IOException -> 0x0068 }
            int r1 = r11.f16102a     // Catch:{ IOException -> 0x0068 }
            android.util.Log.isLoggable(r0, r4)     // Catch:{ IOException -> 0x0068 }
            r6 = 200(0xc8, float:2.8E-43)
            if (r1 == r6) goto L_0x005d
            r6 = 201(0xc9, float:2.82E-43)
            if (r1 == r6) goto L_0x005d
            r6 = 202(0xca, float:2.83E-43)
            if (r1 == r6) goto L_0x005d
            r6 = 203(0xcb, float:2.84E-43)
            if (r1 != r6) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r1 = r2
            goto L_0x005e
        L_0x005d:
            r1 = 1
        L_0x005e:
            if (r1 == 0) goto L_0x0068
            java.lang.String r11 = r11.f16103b     // Catch:{ IOException -> 0x0068 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{  }
            r1.<init>(r11)     // Catch:{  }
            goto L_0x0069
        L_0x0068:
            r1 = r5
        L_0x0069:
            if (r1 == 0) goto L_0x00dd
            pa.e r11 = r10.f14121a
            z.j r11 = r11.f14124c
            pa.c r11 = r11.a(r1)
            pa.e r6 = r10.f14121a
            k4.d r6 = r6.f14126e
            long r7 = r11.f14113c
            r6.getClass()
            android.util.Log.isLoggable(r0, r4)
            java.lang.String r4 = "expires_at"
            r1.put(r4, r7)     // Catch:{ Exception -> 0x00a0, all -> 0x009b }
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch:{ Exception -> 0x00a0, all -> 0x009b }
            java.lang.Object r6 = r6.f11972a     // Catch:{ Exception -> 0x00a0, all -> 0x009b }
            java.io.File r6 = (java.io.File) r6     // Catch:{ Exception -> 0x00a0, all -> 0x009b }
            r4.<init>(r6)     // Catch:{ Exception -> 0x00a0, all -> 0x009b }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x00a1, all -> 0x0098 }
            r4.write(r6)     // Catch:{ Exception -> 0x00a1, all -> 0x0098 }
            r4.flush()     // Catch:{ Exception -> 0x00a1, all -> 0x0098 }
            goto L_0x00a1
        L_0x0098:
            r11 = move-exception
            r5 = r4
            goto L_0x009c
        L_0x009b:
            r11 = move-exception
        L_0x009c:
            ia.h.b(r5)
            throw r11
        L_0x00a0:
            r4 = r5
        L_0x00a1:
            ia.h.b(r4)
            pa.e r4 = r10.f14121a
            r4.getClass()
            r1.toString()
            android.util.Log.isLoggable(r0, r3)
            pa.e r0 = r10.f14121a
            pa.h r1 = r0.f14123b
            java.lang.String r1 = r1.f14136f
            android.content.Context r0 = r0.f14122a
            java.lang.String r3 = "com.google.firebase.crashlytics"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r3, r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "existing_instance_identifier"
            r0.putString(r2, r1)
            r0.apply()
            pa.e r0 = r10.f14121a
            java.util.concurrent.atomic.AtomicReference<pa.c> r0 = r0.f14129h
            r0.set(r11)
            pa.e r0 = r10.f14121a
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.tasks.TaskCompletionSource<pa.c>> r0 = r0.f14130i
            java.lang.Object r0 = r0.get()
            com.google.android.gms.tasks.TaskCompletionSource r0 = (com.google.android.gms.tasks.TaskCompletionSource) r0
            r0.trySetResult(r11)
        L_0x00dd:
            com.google.android.gms.tasks.Task r11 = com.google.android.gms.tasks.Tasks.forResult(r5)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.d.then(java.lang.Object):com.google.android.gms.tasks.Task");
    }
}
