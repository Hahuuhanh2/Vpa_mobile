package com.google.firebase.auth;

import androidx.annotation.Keep;
import ba.a0;
import ba.h;
import ba.u;
import ba.v;
import ba.x;
import com.google.android.gms.internal.p001firebaseauthapi.zzadv;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import m9.d;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public abstract class FirebaseAuth implements ba.b {

    /* renamed from: a  reason: collision with root package name */
    public final d f7471a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f7472b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList f7473c = new CopyOnWriteArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final CopyOnWriteArrayList f7474d = new CopyOnWriteArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final zzadv f7475e;

    /* renamed from: f  reason: collision with root package name */
    public FirebaseUser f7476f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f7477g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public final Object f7478h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public String f7479i;

    /* renamed from: j  reason: collision with root package name */
    public u f7480j;

    /* renamed from: k  reason: collision with root package name */
    public final RecaptchaAction f7481k = RecaptchaAction.custom("getOobCode");

    /* renamed from: l  reason: collision with root package name */
    public final RecaptchaAction f7482l = RecaptchaAction.custom("signInWithPassword");

    /* renamed from: m  reason: collision with root package name */
    public final v f7483m;

    /* renamed from: n  reason: collision with root package name */
    public final a0 f7484n;

    /* renamed from: o  reason: collision with root package name */
    public final za.b f7485o;

    /* renamed from: p  reason: collision with root package name */
    public final za.b f7486p;

    /* renamed from: q  reason: collision with root package name */
    public x f7487q;

    /* renamed from: r  reason: collision with root package name */
    public final Executor f7488r;

    /* renamed from: s  reason: collision with root package name */
    public final Executor f7489s;

    /* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
    public interface a {
        void a();
    }

    /* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
    public interface b {
        void a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FirebaseAuth(m9.d r9, za.b r10, za.b r11, @r9.b java.util.concurrent.Executor r12, @r9.c java.util.concurrent.ScheduledExecutorService r13, @r9.d java.util.concurrent.Executor r14) {
        /*
            r8 = this;
            com.google.android.gms.internal.firebase-auth-api.zzadv r0 = new com.google.android.gms.internal.firebase-auth-api.zzadv
            r0.<init>(r9, r12, r13)
            ba.v r13 = new ba.v
            r9.a()
            android.content.Context r1 = r9.f13218a
            java.lang.String r2 = r9.f()
            r13.<init>(r1, r2)
            ba.a0 r1 = ba.a0.f4099b
            ba.b0 r2 = ba.b0.f4101a
            r8.<init>()
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r8.f7472b = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r8.f7473c = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r8.f7474d = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r8.f7477g = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r8.f7478h = r3
            java.lang.String r3 = "getOobCode"
            com.google.android.recaptcha.RecaptchaAction r3 = com.google.android.recaptcha.RecaptchaAction.custom(r3)
            r8.f7481k = r3
            java.lang.String r3 = "signInWithPassword"
            com.google.android.recaptcha.RecaptchaAction r3 = com.google.android.recaptcha.RecaptchaAction.custom(r3)
            r8.f7482l = r3
            java.lang.String r3 = "signUpPassword"
            com.google.android.recaptcha.RecaptchaAction.custom(r3)
            r8.f7471a = r9
            r8.f7475e = r0
            r8.f7483m = r13
            y6.j.f(r1)
            r8.f7484n = r1
            y6.j.f(r2)
            r8.f7485o = r10
            r8.f7486p = r11
            r8.f7488r = r12
            r8.f7489s = r14
            java.lang.String r9 = "type"
            android.content.SharedPreferences r10 = r13.f4135a
            java.lang.String r11 = "com.google.firebase.auth.FIREBASE_USER"
            r12 = 0
            java.lang.String r10 = r10.getString(r11, r12)
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 == 0) goto L_0x007a
            goto L_0x0096
        L_0x007a:
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x0096 }
            r11.<init>(r10)     // Catch:{ Exception -> 0x0096 }
            boolean r10 = r11.has(r9)     // Catch:{ Exception -> 0x0096 }
            if (r10 == 0) goto L_0x0096
            java.lang.String r9 = r11.optString(r9)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r10 = "com.google.firebase.auth.internal.DefaultFirebaseUser"
            boolean r9 = r10.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x0096 }
            if (r9 == 0) goto L_0x0096
            com.google.firebase.auth.internal.zzx r9 = r13.a(r11)     // Catch:{ Exception -> 0x0096 }
            goto L_0x0097
        L_0x0096:
            r9 = r12
        L_0x0097:
            r8.f7476f = r9
            r10 = 0
            r11 = 1
            if (r9 == 0) goto L_0x00c5
            ba.v r13 = r8.f7483m
            r13.getClass()
            java.lang.Object[] r14 = new java.lang.Object[r11]
            com.google.firebase.auth.internal.zzt r9 = r9.f7545b
            java.lang.String r9 = r9.f7536a
            r14[r10] = r9
            java.lang.String r9 = "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"
            java.lang.String r9 = java.lang.String.format(r9, r14)
            android.content.SharedPreferences r13 = r13.f4135a
            java.lang.String r9 = r13.getString(r9, r12)
            if (r9 == 0) goto L_0x00bd
            com.google.android.gms.internal.firebase-auth-api.zzahb r9 = com.google.android.gms.internal.p001firebaseauthapi.zzahb.zzd(r9)
            goto L_0x00be
        L_0x00bd:
            r9 = r12
        L_0x00be:
            if (r9 == 0) goto L_0x00c5
            com.google.firebase.auth.FirebaseUser r13 = r8.f7476f
            c(r8, r13, r9, r10, r10)
        L_0x00c5:
            ba.a0 r9 = r8.f7484n
            ba.p r9 = r9.f4100a
            r9.getClass()
            m9.d r9 = r8.f7471a
            r9.a()
            android.content.Context r9 = r9.f13218a
            java.lang.String r13 = "com.google.firebase.auth.internal.ProcessDeathHelper"
            android.content.SharedPreferences r9 = r9.getSharedPreferences(r13, r10)
            java.lang.String r13 = "firebaseAppName"
            java.lang.String r14 = ""
            java.lang.String r13 = r9.getString(r13, r14)
            m9.d r14 = r8.f7471a
            r14.a()
            java.lang.String r14 = r14.f13219b
            boolean r13 = r14.equals(r13)
            if (r13 != 0) goto L_0x00f0
            goto L_0x035b
        L_0x00f0:
            java.lang.String r13 = "verifyAssertionRequest"
            boolean r13 = r9.contains(r13)
            r14 = -1
            r0 = 0
            if (r13 == 0) goto L_0x02ff
            java.lang.String r13 = "verifyAssertionRequest"
            java.lang.String r2 = ""
            java.lang.String r13 = r9.getString(r13, r2)
            android.os.Parcelable$Creator<com.google.android.gms.internal.firebase-auth-api.zzaic> r2 = com.google.android.gms.internal.p001firebaseauthapi.zzaic.CREATOR
            if (r13 != 0) goto L_0x0109
            r13 = r12
            goto L_0x010f
        L_0x0109:
            r3 = 10
            byte[] r13 = android.util.Base64.decode(r13, r3)
        L_0x010f:
            y6.j.f(r2)
            android.os.Parcel r3 = android.os.Parcel.obtain()
            int r4 = r13.length
            r3.unmarshall(r13, r10, r4)
            r3.setDataPosition(r10)
            java.lang.Object r13 = r2.createFromParcel(r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r13 = (com.google.android.gms.common.internal.safeparcel.SafeParcelable) r13
            r3.recycle()
            com.google.android.gms.internal.firebase-auth-api.zzaic r13 = (com.google.android.gms.internal.p001firebaseauthapi.zzaic) r13
            java.lang.String r2 = "operation"
            java.lang.String r3 = ""
            java.lang.String r2 = r9.getString(r2, r3)
            java.lang.String r3 = "tenantId"
            java.lang.String r3 = r9.getString(r3, r12)
            java.lang.String r4 = "firebaseUserUid"
            java.lang.String r5 = ""
            java.lang.String r4 = r9.getString(r4, r5)
            java.lang.String r5 = "timestamp"
            r9.getLong(r5, r0)
            if (r3 == 0) goto L_0x0155
            y6.j.c(r3)
            java.lang.Object r0 = r8.f7478h
            monitor-enter(r0)
            r8.f7479i = r3     // Catch:{ all -> 0x0152 }
            monitor-exit(r0)     // Catch:{ all -> 0x0152 }
            r13.zzf(r3)
            goto L_0x0155
        L_0x0152:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0152 }
            throw r9
        L_0x0155:
            int r0 = r2.hashCode()
            r1 = -98509410(0xfffffffffa20dd9e, float:-2.088156E35)
            r3 = 2
            if (r0 == r1) goto L_0x017e
            r1 = 175006864(0xa6e6490, float:1.1478197E-32)
            if (r0 == r1) goto L_0x0174
            r1 = 1450464913(0x56745691, float:6.7163159E13)
            if (r0 == r1) goto L_0x016a
            goto L_0x0187
        L_0x016a:
            java.lang.String r0 = "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0187
            r14 = r10
            goto L_0x0187
        L_0x0174:
            java.lang.String r0 = "com.google.firebase.auth.internal.NONGMSCORE_LINK"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0187
            r14 = r11
            goto L_0x0187
        L_0x017e:
            java.lang.String r0 = "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0187
            r14 = r3
        L_0x0187:
            r0 = 17072(0x42b0, float:2.3923E-41)
            if (r14 == 0) goto L_0x026d
            if (r14 == r11) goto L_0x0246
            if (r14 == r3) goto L_0x0191
            goto L_0x02fb
        L_0x0191:
            com.google.firebase.auth.FirebaseUser r14 = r8.f7476f
            java.lang.String r14 = r14.S0()
            boolean r14 = r14.equals(r4)
            if (r14 == 0) goto L_0x02fb
            com.google.firebase.auth.FirebaseUser r14 = r8.f7476f
            com.google.firebase.auth.zze r13 = com.google.firebase.auth.zze.R0(r13)
            y6.j.f(r14)
            com.google.firebase.auth.AuthCredential r4 = r13.Q0()
            boolean r13 = r4 instanceof com.google.firebase.auth.EmailAuthCredential
            if (r13 == 0) goto L_0x021c
            com.google.firebase.auth.EmailAuthCredential r4 = (com.google.firebase.auth.EmailAuthCredential) r4
            java.lang.String r13 = r4.f7466b
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            java.lang.String r1 = "password"
            if (r13 != 0) goto L_0x01bc
            r13 = r1
            goto L_0x01be
        L_0x01bc:
            java.lang.String r13 = "emailLink"
        L_0x01be:
            boolean r13 = r1.equals(r13)
            if (r13 == 0) goto L_0x01e0
            java.lang.String r3 = r4.f7465a
            java.lang.String r6 = r4.f7466b
            y6.j.c(r6)
            java.lang.String r10 = r14.R0()
            r4 = 1
            aa.y r11 = new aa.y
            r1 = r11
            r2 = r8
            r5 = r14
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.google.android.recaptcha.RecaptchaAction r12 = r8.f7482l
            r11.b(r8, r10, r12)
            goto L_0x02fb
        L_0x01e0:
            java.lang.String r13 = r4.f7467c
            y6.j.c(r13)
            int r1 = aa.a.f119c
            y6.j.c(r13)
            aa.a r1 = new aa.a     // Catch:{ IllegalArgumentException -> 0x01f0 }
            r1.<init>(r13)     // Catch:{ IllegalArgumentException -> 0x01f0 }
            goto L_0x01f1
        L_0x01f0:
            r1 = r12
        L_0x01f1:
            if (r1 == 0) goto L_0x01fe
            java.lang.String r13 = r8.f7479i
            java.lang.String r1 = r1.f121b
            boolean r13 = android.text.TextUtils.equals(r13, r1)
            if (r13 != 0) goto L_0x01fe
            r10 = r11
        L_0x01fe:
            if (r10 == 0) goto L_0x020e
            com.google.android.gms.common.api.Status r10 = new com.google.android.gms.common.api.Status
            r10.<init>(r0, r12, r12, r12)
            com.google.firebase.FirebaseException r10 = com.google.android.gms.internal.p001firebaseauthapi.zzadz.zza(r10)
            com.google.android.gms.tasks.Tasks.forException(r10)
            goto L_0x02fb
        L_0x020e:
            aa.g r10 = new aa.g
            r10.<init>(r8, r11, r14, r4)
            java.lang.String r11 = r8.f7479i
            com.google.android.recaptcha.RecaptchaAction r12 = r8.f7481k
            r10.b(r8, r11, r12)
            goto L_0x02fb
        L_0x021c:
            boolean r10 = r4 instanceof com.google.firebase.auth.PhoneAuthCredential
            if (r10 == 0) goto L_0x0233
            com.google.android.gms.internal.firebase-auth-api.zzadv r1 = r8.f7475e
            m9.d r2 = r8.f7471a
            com.google.firebase.auth.PhoneAuthCredential r4 = (com.google.firebase.auth.PhoneAuthCredential) r4
            java.lang.String r5 = r8.f7479i
            aa.i r6 = new aa.i
            r6.<init>(r8)
            r3 = r14
            r1.zzv(r2, r3, r4, r5, r6)
            goto L_0x02fb
        L_0x0233:
            com.google.android.gms.internal.firebase-auth-api.zzadv r1 = r8.f7475e
            m9.d r2 = r8.f7471a
            java.lang.String r5 = r14.R0()
            aa.i r6 = new aa.i
            r6.<init>(r8)
            r3 = r14
            r1.zzp(r2, r3, r4, r5, r6)
            goto L_0x02fb
        L_0x0246:
            com.google.firebase.auth.FirebaseUser r10 = r8.f7476f
            java.lang.String r10 = r10.S0()
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L_0x02fb
            com.google.firebase.auth.FirebaseUser r10 = r8.f7476f
            com.google.firebase.auth.zze r11 = com.google.firebase.auth.zze.R0(r13)
            y6.j.f(r10)
            com.google.firebase.auth.AuthCredential r11 = r11.Q0()
            aa.i r12 = new aa.i
            r12.<init>(r8)
            com.google.android.gms.internal.firebase-auth-api.zzadv r13 = r8.f7475e
            m9.d r14 = r8.f7471a
            r13.zzn(r14, r10, r11, r12)
            goto L_0x02fb
        L_0x026d:
            com.google.firebase.auth.zze r13 = com.google.firebase.auth.zze.R0(r13)
            com.google.firebase.auth.AuthCredential r13 = r13.Q0()
            boolean r14 = r13 instanceof com.google.firebase.auth.EmailAuthCredential
            if (r14 == 0) goto L_0x02d8
            com.google.firebase.auth.EmailAuthCredential r13 = (com.google.firebase.auth.EmailAuthCredential) r13
            java.lang.String r14 = r13.f7467c
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            r14 = r14 ^ r11
            if (r14 != 0) goto L_0x029d
            java.lang.String r3 = r13.f7465a
            java.lang.String r6 = r13.f7466b
            y6.j.f(r6)
            java.lang.String r10 = r8.f7479i
            r5 = 0
            r4 = 0
            aa.y r11 = new aa.y
            r1 = r11
            r2 = r8
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.google.android.recaptcha.RecaptchaAction r12 = r8.f7482l
            r11.b(r8, r10, r12)
            goto L_0x02fb
        L_0x029d:
            java.lang.String r14 = r13.f7467c
            y6.j.c(r14)
            int r1 = aa.a.f119c
            y6.j.c(r14)
            aa.a r1 = new aa.a     // Catch:{ IllegalArgumentException -> 0x02ad }
            r1.<init>(r14)     // Catch:{ IllegalArgumentException -> 0x02ad }
            goto L_0x02ae
        L_0x02ad:
            r1 = r12
        L_0x02ae:
            if (r1 == 0) goto L_0x02bb
            java.lang.String r14 = r8.f7479i
            java.lang.String r1 = r1.f121b
            boolean r14 = android.text.TextUtils.equals(r14, r1)
            if (r14 != 0) goto L_0x02bb
            goto L_0x02bc
        L_0x02bb:
            r11 = r10
        L_0x02bc:
            if (r11 == 0) goto L_0x02cb
            com.google.android.gms.common.api.Status r10 = new com.google.android.gms.common.api.Status
            r10.<init>(r0, r12, r12, r12)
            com.google.firebase.FirebaseException r10 = com.google.android.gms.internal.p001firebaseauthapi.zzadz.zza(r10)
            com.google.android.gms.tasks.Tasks.forException(r10)
            goto L_0x02fb
        L_0x02cb:
            aa.g r11 = new aa.g
            r11.<init>(r8, r10, r12, r13)
            java.lang.String r10 = r8.f7479i
            com.google.android.recaptcha.RecaptchaAction r12 = r8.f7481k
            r11.b(r8, r10, r12)
            goto L_0x02fb
        L_0x02d8:
            boolean r10 = r13 instanceof com.google.firebase.auth.PhoneAuthCredential
            if (r10 == 0) goto L_0x02ed
            com.google.firebase.auth.PhoneAuthCredential r13 = (com.google.firebase.auth.PhoneAuthCredential) r13
            com.google.android.gms.internal.firebase-auth-api.zzadv r10 = r8.f7475e
            m9.d r11 = r8.f7471a
            java.lang.String r12 = r8.f7479i
            aa.h r14 = new aa.h
            r14.<init>(r8)
            r10.zzG(r11, r13, r12, r14)
            goto L_0x02fb
        L_0x02ed:
            com.google.android.gms.internal.firebase-auth-api.zzadv r10 = r8.f7475e
            m9.d r11 = r8.f7471a
            java.lang.String r12 = r8.f7479i
            aa.h r14 = new aa.h
            r14.<init>(r8)
            r10.zzC(r11, r13, r12, r14)
        L_0x02fb:
            ba.p.a(r9)
            goto L_0x035b
        L_0x02ff:
            java.lang.String r10 = "recaptchaToken"
            boolean r10 = r9.contains(r10)
            if (r10 == 0) goto L_0x032f
            java.lang.String r10 = "recaptchaToken"
            java.lang.String r11 = ""
            java.lang.String r10 = r9.getString(r10, r11)
            java.lang.String r11 = "operation"
            java.lang.String r12 = ""
            java.lang.String r11 = r9.getString(r11, r12)
            java.lang.String r12 = "timestamp"
            r9.getLong(r12, r0)
            r11.getClass()
            java.lang.String r12 = "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0328
            goto L_0x032b
        L_0x0328:
            com.google.android.gms.tasks.Tasks.forResult(r10)
        L_0x032b:
            ba.p.a(r9)
            goto L_0x035b
        L_0x032f:
            java.lang.String r10 = "statusCode"
            boolean r10 = r9.contains(r10)
            if (r10 == 0) goto L_0x035b
            java.lang.String r10 = "statusCode"
            r11 = 17062(0x42a6, float:2.3909E-41)
            int r10 = r9.getInt(r10, r11)
            java.lang.String r11 = "statusMessage"
            java.lang.String r13 = ""
            java.lang.String r11 = r9.getString(r11, r13)
            com.google.android.gms.common.api.Status r13 = new com.google.android.gms.common.api.Status
            r13.<init>(r10, r11, r12, r12)
            java.lang.String r10 = "timestamp"
            r9.getLong(r10, r0)
            ba.p.a(r9)
            com.google.firebase.FirebaseException r9 = com.google.android.gms.internal.p001firebaseauthapi.zzadz.zza(r13)
            com.google.android.gms.tasks.Tasks.forException(r9)
        L_0x035b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.<init>(m9.d, za.b, za.b, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService, java.util.concurrent.Executor):void");
    }

    public static void b(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        String str;
        if (firebaseUser != null) {
            firebaseUser.S0();
        }
        if (firebaseUser != null) {
            str = firebaseUser.zze();
        } else {
            str = null;
        }
        firebaseAuth.f7489s.execute(new a(firebaseAuth, new eb.b(str)));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:83|84|85|86|87|88) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0212 */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(com.google.firebase.auth.FirebaseAuth r17, com.google.firebase.auth.FirebaseUser r18, com.google.android.gms.internal.p001firebaseauthapi.zzahb r19, boolean r20, boolean r21) {
        /*
            r0 = r17
            y6.j.f(r18)
            y6.j.f(r19)
            com.google.firebase.auth.FirebaseUser r1 = r0.f7476f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0020
            java.lang.String r1 = r18.S0()
            com.google.firebase.auth.FirebaseUser r4 = r0.f7476f
            java.lang.String r4 = r4.S0()
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0020
            r1 = r2
            goto L_0x0021
        L_0x0020:
            r1 = r3
        L_0x0021:
            if (r1 != 0) goto L_0x0027
            if (r21 != 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            return
        L_0x0027:
            com.google.firebase.auth.FirebaseUser r4 = r0.f7476f
            if (r4 != 0) goto L_0x002e
            r1 = r2
            r4 = r1
            goto L_0x0047
        L_0x002e:
            com.google.android.gms.internal.firebase-auth-api.zzahb r4 = r4.W0()
            java.lang.String r4 = r4.zze()
            java.lang.String r5 = r19.zze()
            boolean r4 = r4.equals(r5)
            r4 = r4 ^ r2
            if (r1 == 0) goto L_0x0045
            if (r4 != 0) goto L_0x0045
            r4 = r3
            goto L_0x0046
        L_0x0045:
            r4 = r2
        L_0x0046:
            r1 = r1 ^ r2
        L_0x0047:
            com.google.firebase.auth.FirebaseUser r5 = r0.f7476f
            r6 = 0
            if (r5 == 0) goto L_0x00bd
            java.lang.String r5 = r18.S0()
            com.google.firebase.auth.FirebaseUser r7 = r0.f7476f
            if (r7 != 0) goto L_0x0056
            r7 = r6
            goto L_0x005a
        L_0x0056:
            java.lang.String r7 = r7.S0()
        L_0x005a:
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x0061
            goto L_0x00bd
        L_0x0061:
            com.google.firebase.auth.FirebaseUser r5 = r0.f7476f
            java.util.List r7 = r18.Q0()
            r5.V0(r7)
            boolean r5 = r18.T0()
            if (r5 != 0) goto L_0x0075
            com.google.firebase.auth.FirebaseUser r5 = r0.f7476f
            r5.U0()
        L_0x0075:
            ba.d r5 = r18.P0()
            com.google.firebase.auth.internal.zzx r5 = r5.f4102a
            com.google.firebase.auth.internal.zzbd r5 = r5.f7555s
            if (r5 == 0) goto L_0x00b0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r8 = r5.f7528a
            java.util.Iterator r8 = r8.iterator()
        L_0x008a:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x009a
            java.lang.Object r9 = r8.next()
            com.google.firebase.auth.PhoneMultiFactorInfo r9 = (com.google.firebase.auth.PhoneMultiFactorInfo) r9
            r7.add(r9)
            goto L_0x008a
        L_0x009a:
            java.util.List r5 = r5.f7529b
            java.util.Iterator r5 = r5.iterator()
        L_0x00a0:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x00b5
            java.lang.Object r8 = r5.next()
            com.google.firebase.auth.TotpMultiFactorInfo r8 = (com.google.firebase.auth.TotpMultiFactorInfo) r8
            r7.add(r8)
            goto L_0x00a0
        L_0x00b0:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00b5:
            com.google.firebase.auth.FirebaseUser r5 = r0.f7476f
            r5.Z0(r7)
            r5 = r18
            goto L_0x00c1
        L_0x00bd:
            r5 = r18
            r0.f7476f = r5
        L_0x00c1:
            if (r20 == 0) goto L_0x02a7
            ba.v r7 = r0.f7483m
            com.google.firebase.auth.FirebaseUser r8 = r0.f7476f
            r7.getClass()
            y6.j.f(r8)
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.Class<com.google.firebase.auth.internal.zzx> r10 = com.google.firebase.auth.internal.zzx.class
            java.lang.Class r11 = r8.getClass()
            boolean r10 = r10.isAssignableFrom(r11)
            if (r10 == 0) goto L_0x0292
            com.google.firebase.auth.internal.zzx r8 = (com.google.firebase.auth.internal.zzx) r8
            java.lang.String r6 = "cachedTokenState"
            java.lang.String r10 = r8.zzf()     // Catch:{ Exception -> 0x027b }
            r9.put(r6, r10)     // Catch:{ Exception -> 0x027b }
            java.lang.String r6 = "applicationName"
            java.lang.String r10 = r8.f7546c     // Catch:{ Exception -> 0x027b }
            m9.d r10 = m9.d.e(r10)     // Catch:{ Exception -> 0x027b }
            r10.a()     // Catch:{ Exception -> 0x027b }
            java.lang.String r10 = r10.f13219b     // Catch:{ Exception -> 0x027b }
            r9.put(r6, r10)     // Catch:{ Exception -> 0x027b }
            java.lang.String r6 = "type"
            java.lang.String r10 = "com.google.firebase.auth.internal.DefaultFirebaseUser"
            r9.put(r6, r10)     // Catch:{ Exception -> 0x027b }
            java.util.List r6 = r8.f7548e     // Catch:{ Exception -> 0x027b }
            if (r6 == 0) goto L_0x01e9
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Exception -> 0x027b }
            r6.<init>()     // Catch:{ Exception -> 0x027b }
            java.util.List r10 = r8.f7548e     // Catch:{ Exception -> 0x027b }
            int r11 = r10.size()     // Catch:{ Exception -> 0x027b }
            int r12 = r10.size()     // Catch:{ Exception -> 0x027b }
            r13 = 2
            r14 = 30
            if (r12 <= r14) goto L_0x0132
            a7.a r11 = r7.f4136b     // Catch:{ Exception -> 0x027b }
            java.lang.String r12 = "Provider user info list size larger than max size, truncating list to %d. Actual list size: %d"
            java.lang.Object[] r15 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x027b }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x027b }
            r15[r3] = r16     // Catch:{ Exception -> 0x027b }
            int r16 = r10.size()     // Catch:{ Exception -> 0x027b }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x027b }
            r15[r2] = r16     // Catch:{ Exception -> 0x027b }
            r11.a(r12, r15)     // Catch:{ Exception -> 0x027b }
            r11 = r14
        L_0x0132:
            r12 = r3
            r14 = r12
        L_0x0134:
            java.lang.String r15 = "firebase"
            if (r12 >= r11) goto L_0x0159
            java.lang.Object r16 = r10.get(r12)     // Catch:{ Exception -> 0x027b }
            r2 = r16
            com.google.firebase.auth.internal.zzt r2 = (com.google.firebase.auth.internal.zzt) r2     // Catch:{ Exception -> 0x027b }
            java.lang.String r3 = r2.f7537b     // Catch:{ Exception -> 0x027b }
            boolean r3 = r3.equals(r15)     // Catch:{ Exception -> 0x027b }
            r14 = r14 | r3
            int r3 = r11 + -1
            if (r12 != r3) goto L_0x014d
            if (r14 == 0) goto L_0x0159
        L_0x014d:
            java.lang.String r2 = r2.zzb()     // Catch:{ Exception -> 0x027b }
            r6.put(r2)     // Catch:{ Exception -> 0x027b }
            int r12 = r12 + 1
            r2 = 1
            r3 = 0
            goto L_0x0134
        L_0x0159:
            if (r14 != 0) goto L_0x01e4
            int r2 = r11 + -1
        L_0x015d:
            int r3 = r10.size()     // Catch:{ Exception -> 0x027b }
            if (r2 >= r3) goto L_0x018d
            if (r2 < 0) goto L_0x018d
            java.lang.Object r3 = r10.get(r2)     // Catch:{ Exception -> 0x027b }
            com.google.firebase.auth.internal.zzt r3 = (com.google.firebase.auth.internal.zzt) r3     // Catch:{ Exception -> 0x027b }
            java.lang.String r12 = r3.f7537b     // Catch:{ Exception -> 0x027b }
            boolean r12 = r12.equals(r15)     // Catch:{ Exception -> 0x027b }
            if (r12 == 0) goto L_0x017b
            java.lang.String r2 = r3.zzb()     // Catch:{ Exception -> 0x027b }
            r6.put(r2)     // Catch:{ Exception -> 0x027b }
            goto L_0x01e4
        L_0x017b:
            int r12 = r10.size()     // Catch:{ Exception -> 0x027b }
            int r12 = r12 + -1
            if (r2 != r12) goto L_0x018a
            java.lang.String r3 = r3.zzb()     // Catch:{ Exception -> 0x027b }
            r6.put(r3)     // Catch:{ Exception -> 0x027b }
        L_0x018a:
            int r2 = r2 + 1
            goto L_0x015d
        L_0x018d:
            a7.a r2 = r7.f4136b     // Catch:{ Exception -> 0x027b }
            java.lang.String r3 = "Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d"
            java.lang.Object[] r12 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x027b }
            int r13 = r10.size()     // Catch:{ Exception -> 0x027b }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x027b }
            r14 = 0
            r12[r14] = r13     // Catch:{ Exception -> 0x027b }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x027b }
            r13 = 1
            r12[r13] = r11     // Catch:{ Exception -> 0x027b }
            r2.a(r3, r12)     // Catch:{ Exception -> 0x027b }
            int r2 = r10.size()     // Catch:{ Exception -> 0x027b }
            r3 = 5
            if (r2 >= r3) goto L_0x01e4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x027b }
            java.lang.String r3 = "Provider user info list:\n"
            r2.<init>(r3)     // Catch:{ Exception -> 0x027b }
            java.util.Iterator r3 = r10.iterator()     // Catch:{ Exception -> 0x027b }
        L_0x01ba:
            boolean r10 = r3.hasNext()     // Catch:{ Exception -> 0x027b }
            if (r10 == 0) goto L_0x01d8
            java.lang.Object r10 = r3.next()     // Catch:{ Exception -> 0x027b }
            com.google.firebase.auth.internal.zzt r10 = (com.google.firebase.auth.internal.zzt) r10     // Catch:{ Exception -> 0x027b }
            java.lang.String r11 = "Provider - %s\n"
            r12 = 1
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x027b }
            java.lang.String r10 = r10.f7537b     // Catch:{ Exception -> 0x027b }
            r12 = 0
            r13[r12] = r10     // Catch:{ Exception -> 0x027b }
            java.lang.String r10 = java.lang.String.format(r11, r13)     // Catch:{ Exception -> 0x027b }
            r2.append(r10)     // Catch:{ Exception -> 0x027b }
            goto L_0x01ba
        L_0x01d8:
            a7.a r3 = r7.f4136b     // Catch:{ Exception -> 0x027b }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x027b }
            r10 = 0
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x027b }
            r3.a(r2, r11)     // Catch:{ Exception -> 0x027b }
        L_0x01e4:
            java.lang.String r2 = "userInfos"
            r9.put(r2, r6)     // Catch:{ Exception -> 0x027b }
        L_0x01e9:
            java.lang.String r2 = "anonymous"
            boolean r3 = r8.T0()     // Catch:{ Exception -> 0x027b }
            r9.put(r2, r3)     // Catch:{ Exception -> 0x027b }
            java.lang.String r2 = "version"
            java.lang.String r3 = "2"
            r9.put(r2, r3)     // Catch:{ Exception -> 0x027b }
            com.google.firebase.auth.internal.zzz r2 = r8.f7552p     // Catch:{ Exception -> 0x027b }
            if (r2 == 0) goto L_0x0215
            java.lang.String r3 = "userMetadata"
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x027b }
            r6.<init>()     // Catch:{ Exception -> 0x027b }
            java.lang.String r10 = "lastSignInTimestamp"
            long r11 = r2.f7556a     // Catch:{ JSONException -> 0x0212 }
            r6.put(r10, r11)     // Catch:{ JSONException -> 0x0212 }
            java.lang.String r10 = "creationTimestamp"
            long r11 = r2.f7557b     // Catch:{ JSONException -> 0x0212 }
            r6.put(r10, r11)     // Catch:{ JSONException -> 0x0212 }
        L_0x0212:
            r9.put(r3, r6)     // Catch:{ Exception -> 0x027b }
        L_0x0215:
            com.google.firebase.auth.internal.zzbd r2 = r8.f7555s     // Catch:{ Exception -> 0x027b }
            if (r2 == 0) goto L_0x024a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x027b }
            r3.<init>()     // Catch:{ Exception -> 0x027b }
            java.util.List r6 = r2.f7528a     // Catch:{ Exception -> 0x027b }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x027b }
        L_0x0224:
            boolean r8 = r6.hasNext()     // Catch:{ Exception -> 0x027b }
            if (r8 == 0) goto L_0x0234
            java.lang.Object r8 = r6.next()     // Catch:{ Exception -> 0x027b }
            com.google.firebase.auth.PhoneMultiFactorInfo r8 = (com.google.firebase.auth.PhoneMultiFactorInfo) r8     // Catch:{ Exception -> 0x027b }
            r3.add(r8)     // Catch:{ Exception -> 0x027b }
            goto L_0x0224
        L_0x0234:
            java.util.List r2 = r2.f7529b     // Catch:{ Exception -> 0x027b }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x027b }
        L_0x023a:
            boolean r6 = r2.hasNext()     // Catch:{ Exception -> 0x027b }
            if (r6 == 0) goto L_0x024f
            java.lang.Object r6 = r2.next()     // Catch:{ Exception -> 0x027b }
            com.google.firebase.auth.TotpMultiFactorInfo r6 = (com.google.firebase.auth.TotpMultiFactorInfo) r6     // Catch:{ Exception -> 0x027b }
            r3.add(r6)     // Catch:{ Exception -> 0x027b }
            goto L_0x023a
        L_0x024a:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x027b }
            r3.<init>()     // Catch:{ Exception -> 0x027b }
        L_0x024f:
            boolean r2 = r3.isEmpty()     // Catch:{ Exception -> 0x027b }
            if (r2 != 0) goto L_0x0276
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x027b }
            r2.<init>()     // Catch:{ Exception -> 0x027b }
            r6 = 0
        L_0x025b:
            int r8 = r3.size()     // Catch:{ Exception -> 0x027b }
            if (r6 >= r8) goto L_0x0271
            java.lang.Object r8 = r3.get(r6)     // Catch:{ Exception -> 0x027b }
            com.google.firebase.auth.MultiFactorInfo r8 = (com.google.firebase.auth.MultiFactorInfo) r8     // Catch:{ Exception -> 0x027b }
            org.json.JSONObject r8 = r8.Q0()     // Catch:{ Exception -> 0x027b }
            r2.put(r8)     // Catch:{ Exception -> 0x027b }
            int r6 = r6 + 1
            goto L_0x025b
        L_0x0271:
            java.lang.String r3 = "userMultiFactorInfo"
            r9.put(r3, r2)     // Catch:{ Exception -> 0x027b }
        L_0x0276:
            java.lang.String r6 = r9.toString()     // Catch:{ Exception -> 0x027b }
            goto L_0x0292
        L_0x027b:
            r0 = move-exception
            a7.a r1 = r7.f4136b
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r1.f107a
            java.lang.String r4 = "Failed to turn object into JSON"
            java.lang.String r1 = r1.a(r4, r2)
            android.util.Log.wtf(r3, r1, r0)
            com.google.android.gms.internal.firebase-auth-api.zzzr r1 = new com.google.android.gms.internal.firebase-auth-api.zzzr
            r1.<init>(r0)
            throw r1
        L_0x0292:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L_0x02a7
            android.content.SharedPreferences r2 = r7.f4135a
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r3 = "com.google.firebase.auth.FIREBASE_USER"
            android.content.SharedPreferences$Editor r2 = r2.putString(r3, r6)
            r2.apply()
        L_0x02a7:
            if (r4 == 0) goto L_0x02b8
            com.google.firebase.auth.FirebaseUser r2 = r0.f7476f
            r3 = r19
            if (r2 == 0) goto L_0x02b2
            r2.Y0(r3)
        L_0x02b2:
            com.google.firebase.auth.FirebaseUser r2 = r0.f7476f
            b(r0, r2)
            goto L_0x02ba
        L_0x02b8:
            r3 = r19
        L_0x02ba:
            if (r1 == 0) goto L_0x02cd
            com.google.firebase.auth.FirebaseUser r1 = r0.f7476f
            if (r1 == 0) goto L_0x02c3
            r1.S0()
        L_0x02c3:
            java.util.concurrent.Executor r1 = r0.f7489s
            com.google.firebase.auth.b r2 = new com.google.firebase.auth.b
            r2.<init>(r0)
            r1.execute(r2)
        L_0x02cd:
            if (r20 == 0) goto L_0x02f5
            ba.v r1 = r0.f7483m
            r1.getClass()
            android.content.SharedPreferences r1 = r1.f4135a
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = r18.S0()
            r5 = 0
            r2[r5] = r4
            java.lang.String r4 = "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.String r3 = r19.zzh()
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r3)
            r1.apply()
        L_0x02f5:
            com.google.firebase.auth.FirebaseUser r1 = r0.f7476f
            if (r1 == 0) goto L_0x0331
            ba.x r2 = r0.f7487q
            if (r2 != 0) goto L_0x0309
            m9.d r2 = r0.f7471a
            y6.j.f(r2)
            ba.x r3 = new ba.x
            r3.<init>(r2)
            r0.f7487q = r3
        L_0x0309:
            ba.x r0 = r0.f7487q
            com.google.android.gms.internal.firebase-auth-api.zzahb r1 = r1.W0()
            r0.getClass()
            if (r1 != 0) goto L_0x0315
            goto L_0x0331
        L_0x0315:
            long r2 = r1.zzb()
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0321
            r2 = 3600(0xe10, double:1.7786E-320)
        L_0x0321:
            long r4 = r1.zzc()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r6
            long r2 = r2 + r4
            ba.h r0 = r0.f4138a
            r0.f4113a = r2
            r1 = -1
            r0.f4114b = r1
        L_0x0331:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.c(com.google.firebase.auth.FirebaseAuth, com.google.firebase.auth.FirebaseUser, com.google.android.gms.internal.firebase-auth-api.zzahb, boolean, boolean):void");
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) d.d().b(FirebaseAuth.class);
    }

    public final void a() {
        j.f(this.f7483m);
        FirebaseUser firebaseUser = this.f7476f;
        if (firebaseUser != null) {
            v vVar = this.f7483m;
            vVar.f4135a.edit().remove(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{firebaseUser.S0()})).apply();
            this.f7476f = null;
        }
        this.f7483m.f4135a.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        b(this, (FirebaseUser) null);
        this.f7489s.execute(new b(this));
        x xVar = this.f7487q;
        if (xVar != null) {
            h hVar = xVar.f4138a;
            hVar.f4115c.removeCallbacks(hVar.f4116d);
        }
    }

    @Keep
    public static FirebaseAuth getInstance(d dVar) {
        return (FirebaseAuth) dVar.b(FirebaseAuth.class);
    }
}
