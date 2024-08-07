package com.airbnb.lottie;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import g4.g;
import j7.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import l4.q;
import ll.w;
import m4.c;
import m4.d;
import n4.g;

/* compiled from: LottieCompositionFactory */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f4876a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f4877b = {80, 75, 3, 4};

    public static i0<i> a(String str, Callable<h0<i>> callable) {
        i iVar;
        Throwable th2;
        V v2;
        if (str == null) {
            iVar = null;
        } else {
            iVar = g.f10362b.f10363a.get(str);
        }
        if (iVar != null) {
            return new i0<>(new k(iVar, 0), false);
        }
        if (str != null) {
            HashMap hashMap = f4876a;
            if (hashMap.containsKey(str)) {
                return (i0) hashMap.get(str);
            }
        }
        i0<i> i0Var = new i0<>(callable, false);
        if (str != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            l lVar = new l(str, atomicBoolean);
            synchronized (i0Var) {
                h0<T> h0Var = i0Var.f4851d;
                if (!(h0Var == null || (v2 = h0Var.f4830a) == null)) {
                    lVar.onResult(v2);
                }
                i0Var.f4848a.add(lVar);
            }
            m mVar = new m(str, atomicBoolean);
            synchronized (i0Var) {
                h0<T> h0Var2 = i0Var.f4851d;
                if (!(h0Var2 == null || (th2 = h0Var2.f4831b) == null)) {
                    mVar.onResult(th2);
                }
                i0Var.f4849b.add(mVar);
            }
            if (!atomicBoolean.get()) {
                f4876a.put(str, i0Var);
            }
        }
        return i0Var;
    }

    public static h0<i> b(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip")) {
                if (!str.endsWith(".lottie")) {
                    return c(context.getAssets().open(str), str2);
                }
            }
            return f(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e10) {
            return new h0<>((Throwable) e10);
        }
    }

    public static h0<i> c(InputStream inputStream, String str) {
        try {
            w wVar = new w(a.w0(inputStream));
            String[] strArr = c.f13119e;
            return d(new d(wVar), str, true);
        } finally {
            n4.g.b(inputStream);
        }
    }

    public static h0 d(d dVar, String str, boolean z10) {
        try {
            i a10 = q.a(dVar);
            if (str != null) {
                g.f10362b.f10363a.put(str, a10);
            }
            h0 h0Var = new h0(a10);
            if (z10) {
                n4.g.b(dVar);
            }
            return h0Var;
        } catch (Exception e10) {
            h0 h0Var2 = new h0((Throwable) e10);
            if (z10) {
                n4.g.b(dVar);
            }
            return h0Var2;
        } catch (Throwable th2) {
            if (z10) {
                n4.g.b(dVar);
            }
            throw th2;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.airbnb.lottie.h0 e(int r5, android.content.Context r6, java.lang.String r7) {
        /*
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ NotFoundException -> 0x0058 }
            java.io.InputStream r5 = r6.openRawResource(r5)     // Catch:{ NotFoundException -> 0x0058 }
            ll.q r5 = j7.a.w0(r5)     // Catch:{ NotFoundException -> 0x0058 }
            ll.w r6 = new ll.w     // Catch:{ NotFoundException -> 0x0058 }
            r6.<init>(r5)     // Catch:{ NotFoundException -> 0x0058 }
            ll.w r5 = r6.h()     // Catch:{ NoSuchMethodError -> 0x0037, Exception -> 0x002f }
            byte[] r0 = f4877b     // Catch:{ NoSuchMethodError -> 0x0037, Exception -> 0x002f }
            int r1 = r0.length     // Catch:{ NoSuchMethodError -> 0x0037, Exception -> 0x002f }
            r2 = 0
        L_0x0019:
            if (r2 >= r1) goto L_0x0029
            byte r3 = r0[r2]     // Catch:{ NoSuchMethodError -> 0x0037, Exception -> 0x002f }
            byte r4 = r5.readByte()     // Catch:{ NoSuchMethodError -> 0x0037, Exception -> 0x002f }
            if (r4 == r3) goto L_0x0026
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ NoSuchMethodError -> 0x0037, Exception -> 0x002f }
            goto L_0x0039
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x0019
        L_0x0029:
            r5.close()     // Catch:{ NoSuchMethodError -> 0x0037, Exception -> 0x002f }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ NoSuchMethodError -> 0x0037, Exception -> 0x002f }
            goto L_0x0039
        L_0x002f:
            n4.b r5 = n4.c.f13501a     // Catch:{ NotFoundException -> 0x0058 }
            r5.getClass()     // Catch:{ NotFoundException -> 0x0058 }
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ NotFoundException -> 0x0058 }
            goto L_0x0039
        L_0x0037:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ NotFoundException -> 0x0058 }
        L_0x0039:
            boolean r5 = r5.booleanValue()     // Catch:{ NotFoundException -> 0x0058 }
            if (r5 == 0) goto L_0x004e
            java.util.zip.ZipInputStream r5 = new java.util.zip.ZipInputStream     // Catch:{ NotFoundException -> 0x0058 }
            ll.w$a r0 = new ll.w$a     // Catch:{ NotFoundException -> 0x0058 }
            r0.<init>(r6)     // Catch:{ NotFoundException -> 0x0058 }
            r5.<init>(r0)     // Catch:{ NotFoundException -> 0x0058 }
            com.airbnb.lottie.h0 r5 = f(r5, r7)     // Catch:{ NotFoundException -> 0x0058 }
            return r5
        L_0x004e:
            ll.w$a r5 = new ll.w$a     // Catch:{ NotFoundException -> 0x0058 }
            r5.<init>(r6)     // Catch:{ NotFoundException -> 0x0058 }
            com.airbnb.lottie.h0 r5 = c(r5, r7)     // Catch:{ NotFoundException -> 0x0058 }
            return r5
        L_0x0058:
            r5 = move-exception
            com.airbnb.lottie.h0 r6 = new com.airbnb.lottie.h0
            r6.<init>((java.lang.Throwable) r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p.e(int, android.content.Context, java.lang.String):com.airbnb.lottie.h0");
    }

    public static h0<i> f(ZipInputStream zipInputStream, String str) {
        try {
            return g(zipInputStream, str);
        } finally {
            n4.g.b(zipInputStream);
        }
    }

    public static h0<i> g(ZipInputStream zipInputStream, String str) {
        d0 d0Var;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            i iVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    w wVar = new w(a.w0(zipInputStream));
                    String[] strArr = c.f13119e;
                    iVar = (i) d(new d(wVar), (String) null, false).f4830a;
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg")) {
                        if (!name.contains(".jpeg")) {
                            zipInputStream.closeEntry();
                        }
                    }
                    String[] split = name.split("/");
                    hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (iVar == null) {
                return new h0<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                Iterator<d0> it = iVar.f4835d.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        d0Var = null;
                        break;
                    }
                    d0Var = it.next();
                    if (d0Var.f4796c.equals(str2)) {
                        break;
                    }
                }
                if (d0Var != null) {
                    Bitmap bitmap = (Bitmap) entry.getValue();
                    int i10 = d0Var.f4794a;
                    int i11 = d0Var.f4795b;
                    g.a aVar = n4.g.f13513a;
                    if (!(bitmap.getWidth() == i10 && bitmap.getHeight() == i11)) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
                        bitmap.recycle();
                        bitmap = createScaledBitmap;
                    }
                    d0Var.f4797d = bitmap;
                }
            }
            for (Map.Entry next : iVar.f4835d.entrySet()) {
                if (((d0) next.getValue()).f4797d == null) {
                    StringBuilder q10 = android.support.v4.media.a.q("There is no image for ");
                    q10.append(((d0) next.getValue()).f4796c);
                    return new h0<>((Throwable) new IllegalStateException(q10.toString()));
                }
            }
            if (str != null) {
                g4.g.f10362b.f10363a.put(str, iVar);
            }
            return new h0<>(iVar);
        } catch (IOException e10) {
            return new h0<>((Throwable) e10);
        }
    }

    public static String h(Context context, int i10) {
        boolean z10;
        String str;
        StringBuilder q10 = android.support.v4.media.a.q("rawRes");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        q10.append(str);
        q10.append(i10);
        return q10.toString();
    }
}
