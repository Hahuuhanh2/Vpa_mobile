package com.airbnb.lottie;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import fb.e0;
import fb.v;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4853a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4854b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f4855c;

    public /* synthetic */ j(int i10, Object obj, Object obj2) {
        this.f4853a = i10;
        this.f4854b = obj;
        this.f4855c = obj2;
    }

    public final Object call() {
        String str;
        int i10;
        ComponentName componentName;
        switch (this.f4853a) {
            case 0:
                return p.c((InputStream) this.f4854b, (String) this.f4855c);
            default:
                Context context = (Context) this.f4854b;
                Object obj = fb.j.f10141c;
                v a10 = v.a();
                a10.getClass();
                Log.isLoggable("FirebaseMessaging", 3);
                a10.f10171d.offer((Intent) this.f4855c);
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(context.getPackageName());
                synchronized (a10) {
                    str = a10.f10168a;
                    if (str == null) {
                        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
                        if (resolveService != null) {
                            ServiceInfo serviceInfo = resolveService.serviceInfo;
                            if (serviceInfo != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName)) {
                                    String str2 = serviceInfo.name;
                                    if (str2 != null) {
                                        if (str2.startsWith(".")) {
                                            a10.f10168a = context.getPackageName() + serviceInfo.name;
                                        } else {
                                            a10.f10168a = serviceInfo.name;
                                        }
                                        str = a10.f10168a;
                                    }
                                }
                                str = null;
                            }
                        }
                        str = null;
                    }
                }
                if (str != null) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    intent.setClassName(context.getPackageName(), str);
                }
                try {
                    if (a10.c(context)) {
                        componentName = e0.b(context, intent);
                    } else {
                        componentName = context.startService(intent);
                    }
                    if (componentName == null) {
                        i10 = 404;
                    } else {
                        i10 = -1;
                    }
                } catch (SecurityException unused) {
                    i10 = 401;
                } catch (IllegalStateException e10) {
                    e10.toString();
                    i10 = 402;
                }
                return Integer.valueOf(i10);
        }
    }
}
