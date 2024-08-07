package fb;

import ab.c;
import ab.f;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import m9.d;
import t6.a;
import t6.p;
import t6.q;
import t6.r;
import t6.t;
import ub.g;
import v.v;
import xa.e;
import y0.h;
import za.b;

/* compiled from: GmsRpc */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final d f10149a;

    /* renamed from: b  reason: collision with root package name */
    public final q f10150b;

    /* renamed from: c  reason: collision with root package name */
    public final a f10151c;

    /* renamed from: d  reason: collision with root package name */
    public final b<g> f10152d;

    /* renamed from: e  reason: collision with root package name */
    public final b<e> f10153e;

    /* renamed from: f  reason: collision with root package name */
    public final c f10154f;

    public n(d dVar, q qVar, b<g> bVar, b<e> bVar2, c cVar) {
        dVar.a();
        a aVar = new a(dVar.f13218a);
        this.f10149a = dVar;
        this.f10150b = qVar;
        this.f10151c = aVar;
        this.f10152d = bVar;
        this.f10153e = bVar2;
        this.f10154f = cVar;
    }

    public final Task<String> a(Task<Bundle> task) {
        return task.continueWith(new w2.b(5), new ca.a(this, 19));
    }

    public final void b(String str, String str2, Bundle bundle) {
        int i10;
        String str3;
        String str4;
        String str5;
        int b10;
        PackageInfo packageInfo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        d dVar = this.f10149a;
        dVar.a();
        bundle.putString("gmp_app_id", dVar.f13220c.f13232b);
        q qVar = this.f10150b;
        synchronized (qVar) {
            if (qVar.f10161d == 0) {
                try {
                    packageInfo = qVar.f10158a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                } catch (PackageManager.NameNotFoundException e10) {
                    e10.toString();
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    qVar.f10161d = packageInfo.versionCode;
                }
            }
            i10 = qVar.f10161d;
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        q qVar2 = this.f10150b;
        synchronized (qVar2) {
            if (qVar2.f10159b == null) {
                qVar2.c();
            }
            str3 = qVar2.f10159b;
        }
        bundle.putString("app_ver", str3);
        q qVar3 = this.f10150b;
        synchronized (qVar3) {
            if (qVar3.f10160c == null) {
                qVar3.c();
            }
            str4 = qVar3.f10160c;
        }
        bundle.putString("app_ver_name", str4);
        d dVar2 = this.f10149a;
        dVar2.a();
        try {
            str5 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(dVar2.f13219b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str5 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str5);
        try {
            String a10 = ((f) Tasks.await(this.f10154f.a())).a();
            if (!TextUtils.isEmpty(a10)) {
                bundle.putString("Goog-Firebase-Installations-Auth", a10);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString("appid", (String) Tasks.await(this.f10154f.getId()));
        bundle.putString("cliv", "fcm-23.2.1");
        e eVar = this.f10153e.get();
        g gVar = this.f10152d.get();
        if (eVar != null && gVar != null && (b10 = eVar.b()) != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(v.g(b10)));
            bundle.putString("Firebase-Client", gVar.a());
        }
    }

    public final Task<Bundle> c(String str, String str2, Bundle bundle) {
        int i10;
        int i11;
        PackageInfo packageInfo;
        try {
            b(str, str2, bundle);
            a aVar = this.f10151c;
            r rVar = aVar.f14840c;
            synchronized (rVar) {
                if (rVar.f14879b == 0) {
                    try {
                        packageInfo = j7.c.a(rVar.f14878a).a(0, "com.google.android.gms");
                    } catch (PackageManager.NameNotFoundException e10) {
                        new StringBuilder(String.valueOf(e10).length() + 23);
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        rVar.f14879b = packageInfo.versionCode;
                    }
                }
                i10 = rVar.f14879b;
            }
            if (i10 >= 12000000) {
                q a10 = q.a(aVar.f14839b);
                synchronized (a10) {
                    i11 = a10.f14877d;
                    a10.f14877d = i11 + 1;
                }
                return a10.b(new p(i11, bundle)).continueWith(t.f14884a, a.a.f3c);
            } else if (aVar.f14840c.a() != 0) {
                return aVar.a(bundle).continueWithTask(t.f14884a, new h((Object) aVar, (Object) bundle));
            } else {
                return Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
        } catch (InterruptedException | ExecutionException e11) {
            return Tasks.forException(e11);
        }
    }
}
