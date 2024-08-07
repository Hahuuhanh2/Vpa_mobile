package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import c0.i0;
import c0.q0;
import ca.b;
import ca.m;
import ca.r;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kh.h;
import r9.a;
import ub.d;
import ub.f;
import ub.g;
import v.g0;
import xa.c;
import xa.e;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static /* synthetic */ String a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || Build.VERSION.SDK_INT < 24) {
            return "";
        }
        return String.valueOf(applicationInfo.minSdkVersion);
    }

    public static String b(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public final List<b<?>> getComponents() {
        String str;
        Class<g> cls = g.class;
        ArrayList arrayList = new ArrayList();
        b.a<g> b10 = b.b(cls);
        b10.a(new m(2, 0, d.class));
        b10.f4619f = new h(2);
        arrayList.add(b10.b());
        r rVar = new r(a.class, Executor.class);
        b.a aVar = new b.a(xa.b.class, new Class[]{xa.d.class, e.class});
        aVar.a(m.b(Context.class));
        aVar.a(m.b(m9.d.class));
        aVar.a(new m(2, 0, c.class));
        aVar.a(m.c(cls));
        aVar.a(new m((r<?>) rVar, 1, 0));
        aVar.f4619f = new q0(rVar, 1);
        arrayList.add(aVar.b());
        arrayList.add(f.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(f.a("fire-core", "20.4.2"));
        arrayList.add(f.a("device-name", b(Build.PRODUCT)));
        arrayList.add(f.a("device-model", b(Build.DEVICE)));
        arrayList.add(f.a("device-brand", b(Build.BRAND)));
        arrayList.add(f.b("android-target-sdk", new h(23)));
        arrayList.add(f.b("android-min-sdk", new g0(17)));
        arrayList.add(f.b("android-platform", new i0(19)));
        arrayList.add(f.b("android-installer", new h(24)));
        try {
            str = ek.b.f20096e.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(f.a("kotlin", str));
        }
        return arrayList;
    }
}
