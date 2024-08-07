package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import androidx.fragment.app.FragmentActivity;
import ba.a0;
import ba.d0;
import ba.e0;
import ba.f0;
import ba.g;
import ba.l;
import ba.z;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001firebaseauthapi.zzaeb;
import com.google.android.gms.internal.p001firebaseauthapi.zzaec;
import com.google.android.gms.internal.p001firebaseauthapi.zzaed;
import com.google.android.gms.internal.p001firebaseauthapi.zzafx;
import com.google.android.gms.internal.p001firebaseauthapi.zzaic;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import m9.d;
import org.json.JSONException;
import org.json.JSONObject;
import u2.a;
import w6.r;
import y6.j;
import za.b;

@KeepName
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public class GenericIdpActivity extends FragmentActivity implements zzaed {
    public static long I;
    public static final a0 J = a0.f4099b;
    public boolean H = false;

    public final Uri.Builder I(Uri.Builder builder, Intent intent, String str, String str2) {
        String str3;
        String str4;
        String str5;
        Uri.Builder builder2 = builder;
        Intent intent2 = intent;
        String str6 = str;
        String stringExtra = intent2.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent2.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent2.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent2.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            str3 = null;
        } else {
            str3 = TextUtils.join(",", stringArrayListExtra);
        }
        Bundle bundleExtra = intent2.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            str4 = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String next : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(next);
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject.put(next, string);
                    }
                }
            } catch (JSONException unused) {
            }
            str4 = jSONObject.toString();
        }
        String uuid = UUID.randomUUID().toString();
        String zza = zzaec.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent2.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        e0 e0Var = e0.f4108a;
        Context applicationContext = getApplicationContext();
        synchronized (e0Var) {
            j.c(str);
            j.c(uuid);
            j.c(zza);
            j.c(stringExtra4);
            SharedPreferences b10 = e0.b(applicationContext, str6);
            e0.a(b10);
            SharedPreferences.Editor edit = b10.edit();
            str5 = str4;
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", new Object[]{uuid}), zza);
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{uuid}), action);
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", new Object[]{uuid}), stringExtra2);
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{uuid}), stringExtra4);
            edit.putString("com.google.firebase.auth.api.gms.config.tenant.id", stringExtra3);
            edit.apply();
        }
        String c10 = f0.a(getApplicationContext(), d.e(stringExtra4).f()).c();
        if (TextUtils.isEmpty(c10)) {
            K(g.a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        } else if (zza == null) {
            return null;
        } else {
            builder2.appendQueryParameter("eid", "p").appendQueryParameter("v", "X".concat(String.valueOf(stringExtra5))).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", zza).appendQueryParameter("eventId", uuid).appendQueryParameter("apn", str6).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", c10);
            if (!TextUtils.isEmpty(str3)) {
                builder2.appendQueryParameter("scopes", str3);
            }
            if (!TextUtils.isEmpty(str5)) {
                builder2.appendQueryParameter("customParameters", str5);
            }
            if (!TextUtils.isEmpty(stringExtra3)) {
                builder2.appendQueryParameter("tid", stringExtra3);
            }
            return builder2;
        }
    }

    public final void J() {
        I = 0;
        this.H = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!a.a(this).c(intent)) {
            a0 a0Var = J;
            Status a10 = g.a("WEB_CONTEXT_CANCELED");
            a0Var.getClass();
            a0.b(this, a10);
        } else {
            J.a(this);
        }
        finish();
    }

    public final void K(Status status) {
        I = 0;
        this.H = false;
        Intent intent = new Intent();
        HashMap hashMap = z.f4139a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!a.a(this).c(intent)) {
            a0 a0Var = J;
            Context applicationContext = getApplicationContext();
            a0Var.getClass();
            a0.b(applicationContext, status);
        } else {
            J.a(this);
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - I >= 30000) {
                I = currentTimeMillis;
                if (bundle != null) {
                    this.H = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
                    return;
                }
                return;
            }
            return;
        }
        "Could not do operation - unknown action: ".concat(String.valueOf(action));
        J();
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public final void onResume() {
        d0 d0Var;
        super.onResume();
        String str = null;
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                K(z.a(intent.getStringExtra("firebaseError")));
            } else if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
                J();
            } else {
                String stringExtra = intent.getStringExtra("link");
                String stringExtra2 = intent.getStringExtra("eventId");
                String packageName = getPackageName();
                boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
                synchronized (e0.f4108a) {
                    j.c(packageName);
                    j.c(stringExtra2);
                    SharedPreferences b10 = e0.b(this, packageName);
                    String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", new Object[]{stringExtra2});
                    String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{stringExtra2});
                    String format3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", new Object[]{stringExtra2});
                    String format4 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{stringExtra2});
                    String string = b10.getString(format, (String) null);
                    String string2 = b10.getString(format2, (String) null);
                    String string3 = b10.getString(format3, (String) null);
                    String string4 = b10.getString("com.google.firebase.auth.api.gms.config.tenant.id", (String) null);
                    String string5 = b10.getString(format4, (String) null);
                    SharedPreferences.Editor edit = b10.edit();
                    edit.remove(format);
                    edit.remove(format2);
                    edit.remove(format3);
                    edit.remove(format4);
                    edit.apply();
                    if (string == null || string2 == null || string3 == null) {
                        d0Var = null;
                    } else {
                        d0Var = new d0(string, string2, string3, string4, string5);
                    }
                }
                if (d0Var == null) {
                    J();
                }
                if (booleanExtra) {
                    stringExtra = f0.a(getApplicationContext(), d.e(d0Var.f4107e).f()).b(stringExtra);
                }
                zzaic zzaic = new zzaic(d0Var, stringExtra);
                String str2 = d0Var.f4106d;
                String str3 = d0Var.f4104b;
                zzaic.zzf(str2);
                if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str3) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str3) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str3)) {
                    I = 0;
                    this.H = false;
                    Intent intent2 = new Intent();
                    Parcel obtain = Parcel.obtain();
                    zzaic.writeToParcel(obtain, 0);
                    byte[] marshall = obtain.marshall();
                    obtain.recycle();
                    intent2.putExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", marshall);
                    intent2.putExtra("com.google.firebase.auth.internal.OPERATION", str3);
                    intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                    if (!a.a(this).c(intent2)) {
                        SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                        Parcel obtain2 = Parcel.obtain();
                        zzaic.writeToParcel(obtain2, 0);
                        byte[] marshall2 = obtain2.marshall();
                        obtain2.recycle();
                        if (marshall2 != null) {
                            str = Base64.encodeToString(marshall2, 10);
                        }
                        edit2.putString("verifyAssertionRequest", str);
                        edit2.putString("operation", str3);
                        edit2.putString("tenantId", str2);
                        edit2.putLong("timestamp", System.currentTimeMillis());
                        edit2.commit();
                    } else {
                        J.a(this);
                    }
                    finish();
                    return;
                }
                "unsupported operation: ".concat(str3);
                J();
            }
        } else if (!this.H) {
            String packageName2 = getPackageName();
            try {
                String lowerCase = h7.d.a(h7.a.a(this, packageName2)).toLowerCase(Locale.US);
                d e10 = d.e(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth instance = FirebaseAuth.getInstance(e10);
                if (!zzafx.zzg(e10)) {
                    new zzaeb(packageName2, lowerCase, getIntent(), e10, this).executeOnExecutor(instance.f7488r, new Void[0]);
                } else {
                    e10.a();
                    zzf(I(Uri.parse(zzafx.zza(e10.f13220c.f13231a)).buildUpon(), getIntent(), packageName2, lowerCase).build(), packageName2, instance.f7485o);
                }
            } catch (PackageManager.NameNotFoundException e11) {
                e11.toString();
                zze(packageName2, (Status) null);
            }
            this.H = true;
        } else {
            J();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.H);
    }

    public final Context zza() {
        return getApplicationContext();
    }

    public final Uri.Builder zzb(Intent intent, String str, String str2) {
        return I(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    public final String zzc(String str) {
        return zzafx.zzb(str);
    }

    public final HttpURLConnection zzd(URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            return null;
        }
    }

    public final void zze(String str, Status status) {
        if (status == null) {
            J();
        } else {
            K(status);
        }
    }

    public final void zzf(Uri uri, String str, b bVar) {
        Task task;
        x9.a aVar = (x9.a) bVar.get();
        if (aVar != null) {
            task = aVar.a().continueWith(new l(uri, 0));
        } else {
            task = Tasks.forResult(uri);
        }
        task.addOnCompleteListener(new r(this, str, 1));
    }
}
