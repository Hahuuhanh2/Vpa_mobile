package com.google.mlkit.common.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import c0.i0;
import ca.b;
import ca.e;
import ca.g;
import ca.k;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import lc.h;
import y6.j;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public class MlKitInitProvider extends ContentProvider {
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        j.h("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.", !providerInfo.authority.equals("com.google.mlkit.common.mlkitinitprovider"));
        super.attachInfo(context, providerInfo);
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        boolean z10;
        Context context = getContext();
        if (context == null) {
            return false;
        }
        synchronized (h.f12913b) {
            if (h.f12914c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            j.h("MlKitContext is already initialized", z10);
            h hVar = new h();
            h.f12914c = hVar;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList a10 = new e(context, new e.a(MlKitComponentDiscoveryService.class)).a();
            Executor executor = TaskExecutors.MAIN_THREAD;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            i0 i0Var = g.f4625h;
            arrayList.addAll(a10);
            arrayList2.add(b.c(context, Context.class, new Class[0]));
            arrayList2.add(b.c(hVar, h.class, new Class[0]));
            k kVar = new k(executor, arrayList, arrayList2, i0Var);
            hVar.f12915a = kVar;
            kVar.h(true);
        }
        return false;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
