package fb;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import h7.g;
import java.util.List;
import m9.d;

/* compiled from: Metadata */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10158a;

    /* renamed from: b  reason: collision with root package name */
    public String f10159b;

    /* renamed from: c  reason: collision with root package name */
    public String f10160c;

    /* renamed from: d  reason: collision with root package name */
    public int f10161d;

    /* renamed from: e  reason: collision with root package name */
    public int f10162e = 0;

    public q(Context context) {
        this.f10158a = context;
    }

    public static String a(d dVar) {
        dVar.a();
        String str = dVar.f13220c.f13235e;
        if (str != null) {
            return str;
        }
        dVar.a();
        String str2 = dVar.f13220c.f13232b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final boolean b() {
        int i10;
        synchronized (this) {
            i10 = this.f10162e;
            if (i10 == 0) {
                PackageManager packageManager = this.f10158a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    i10 = 0;
                } else {
                    if (!g.a()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f10162e = 1;
                            i10 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        if (g.a()) {
                            this.f10162e = 2;
                        } else {
                            this.f10162e = 1;
                        }
                        i10 = this.f10162e;
                    } else {
                        this.f10162e = 2;
                        i10 = 2;
                    }
                }
            }
        }
        if (i10 != 0) {
            return true;
        }
        return false;
    }

    public final synchronized void c() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.f10158a.getPackageManager().getPackageInfo(this.f10158a.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.f10159b = Integer.toString(packageInfo.versionCode);
            this.f10160c = packageInfo.versionName;
        }
    }
}
