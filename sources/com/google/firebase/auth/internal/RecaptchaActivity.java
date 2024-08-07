package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import ba.a0;
import ba.e0;
import ba.f0;
import ba.g;
import ba.l;
import ba.z;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001firebaseauthapi.zzaeb;
import com.google.android.gms.internal.p001firebaseauthapi.zzaed;
import com.google.android.gms.internal.p001firebaseauthapi.zzaeo;
import com.google.android.gms.internal.p001firebaseauthapi.zzafx;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import m9.d;
import u2.a;
import w6.r;
import y6.j;
import za.b;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public class RecaptchaActivity extends FragmentActivity implements zzaed {
    public static long I;
    public static final a0 J = a0.f4099b;
    public boolean H = false;

    public final void I() {
        I = 0;
        this.H = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        a.a(this).c(intent);
        J.a(this);
        finish();
    }

    public final void J(Status status) {
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
        a.a(this).c(intent);
        J.a(this);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - I >= 30000) {
                I = currentTimeMillis;
                if (bundle != null) {
                    this.H = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
                    return;
                }
                return;
            }
            return;
        }
        "Could not do operation - unknown action: ".concat(String.valueOf(action));
        I();
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public final void onResume() {
        String string;
        boolean isEmpty;
        super.onResume();
        String str = null;
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                J(z.a(intent.getStringExtra("firebaseError")));
            } else if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
                I();
            } else {
                String stringExtra = intent.getStringExtra("link");
                e0 e0Var = e0.f4108a;
                Context applicationContext = getApplicationContext();
                String packageName = getPackageName();
                String stringExtra2 = intent.getStringExtra("eventId");
                synchronized (e0Var) {
                    j.c(packageName);
                    j.c(stringExtra2);
                    SharedPreferences b10 = e0.b(applicationContext, packageName);
                    String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{stringExtra2});
                    String string2 = b10.getString(format, (String) null);
                    String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{stringExtra2});
                    string = b10.getString(format2, (String) null);
                    SharedPreferences.Editor edit = b10.edit();
                    edit.remove(format);
                    edit.remove(format2);
                    edit.apply();
                    isEmpty = TextUtils.isEmpty(string2);
                }
                if (!isEmpty) {
                    str = string;
                }
                if (TextUtils.isEmpty(str)) {
                    J(g.a("Failed to find registration for this reCAPTCHA event"));
                }
                if (intent.getBooleanExtra("encryptionEnabled", true)) {
                    stringExtra = f0.a(getApplicationContext(), d.e(str).f()).b(stringExtra);
                }
                String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
                I = 0;
                this.H = false;
                Intent intent2 = new Intent();
                intent2.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
                intent2.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                if (!a.a(this).c(intent2)) {
                    SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                    edit2.putString("recaptchaToken", queryParameter);
                    edit2.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                    edit2.putLong("timestamp", System.currentTimeMillis());
                    edit2.commit();
                } else {
                    J.a(this);
                }
                finish();
            }
        } else if (!this.H) {
            Intent intent3 = getIntent();
            String packageName2 = getPackageName();
            try {
                String lowerCase = h7.d.a(h7.a.a(this, packageName2)).toLowerCase(Locale.US);
                d e10 = d.e(intent3.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                new zzaeb(packageName2, lowerCase, intent3, e10, this).executeOnExecutor(FirebaseAuth.getInstance(e10).f7488r, new Void[0]);
            } catch (PackageManager.NameNotFoundException e11) {
                e11.toString();
                zze(packageName2, (Status) null);
            }
            this.H = true;
        } else {
            I();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.H);
    }

    public final Context zza() {
        return getApplicationContext();
    }

    public final Uri.Builder zzb(Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        d e10 = d.e(stringExtra3);
        FirebaseAuth instance = FirebaseAuth.getInstance(e10);
        e0 e0Var = e0.f4108a;
        Context applicationContext = getApplicationContext();
        synchronized (e0Var) {
            j.c(str);
            j.c(uuid);
            SharedPreferences b10 = e0.b(applicationContext, str);
            e0.a(b10);
            SharedPreferences.Editor edit = b10.edit();
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{uuid}), "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{uuid}), stringExtra3);
            edit.apply();
        }
        String c10 = f0.a(getApplicationContext(), e10.f()).c();
        String str3 = null;
        if (TextUtils.isEmpty(c10)) {
            J(g.a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        synchronized (instance.f7477g) {
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            synchronized (instance.f7477g) {
            }
        } else {
            str3 = zzaeo.zza();
        }
        return new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", str3).appendQueryParameter("eventId", uuid).appendQueryParameter("v", "X".concat(String.valueOf(stringExtra2))).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", c10);
    }

    public final String zzc(String str) {
        return zzafx.zzb(str);
    }

    public final HttpURLConnection zzd(URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            zzaed.zza.a("Error generating connection", new Object[0]);
            return null;
        }
    }

    public final void zze(String str, Status status) {
        if (status == null) {
            I();
        } else {
            J(status);
        }
    }

    public final void zzf(Uri uri, String str, b bVar) {
        Task task;
        x9.a aVar = (x9.a) bVar.get();
        if (aVar != null) {
            task = aVar.a().continueWith(new l(uri, 1));
        } else {
            task = Tasks.forResult(uri);
        }
        task.addOnCompleteListener(new r(this, str, 2));
    }
}
