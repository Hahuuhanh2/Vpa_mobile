package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
import k7.b;
import l7.d;
import l7.e;
import l7.f;
import l7.g;
import y6.i;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class DynamiteModule {

    /* renamed from: b  reason: collision with root package name */
    public static final b f5524b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final c f5525c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final d f5526d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final e f5527e = new e();

    /* renamed from: f  reason: collision with root package name */
    public static Boolean f5528f = null;

    /* renamed from: g  reason: collision with root package name */
    public static String f5529g = null;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f5530h = false;

    /* renamed from: i  reason: collision with root package name */
    public static int f5531i = -1;

    /* renamed from: j  reason: collision with root package name */
    public static Boolean f5532j;

    /* renamed from: k  reason: collision with root package name */
    public static final ThreadLocal f5533k = new ThreadLocal();

    /* renamed from: l  reason: collision with root package name */
    public static final d f5534l = new d();

    /* renamed from: m  reason: collision with root package name */
    public static final a f5535m = new a();

    /* renamed from: n  reason: collision with root package name */
    public static f f5536n;

    /* renamed from: o  reason: collision with root package name */
    public static g f5537o;

    /* renamed from: a  reason: collision with root package name */
    public final Context f5538a;

    @DynamiteApi
    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    public interface a {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
        public interface C0060a {
            int a(Context context, String str, boolean z10);

            int b(Context context, String str);
        }

        /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public int f5539a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f5540b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f5541c = 0;
        }

        b a(Context context, String str, C0060a aVar);
    }

    public DynamiteModule(Context context) {
        this.f5538a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (i.a(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String.valueOf(declaredField.get((Object) null));
            return 0;
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e10) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage()));
            return 0;
        }
    }

    @ResultIgnorabilityUnspecified
    public static DynamiteModule c(Context context, a aVar, String str) {
        DynamiteModule dynamiteModule;
        int i10;
        Boolean bool;
        DynamiteModule dynamiteModule2;
        k7.a aVar2;
        g gVar;
        boolean z10;
        Boolean valueOf;
        k7.a aVar3;
        Context context2 = context;
        a aVar4 = aVar;
        String str2 = str;
        Class<DynamiteModule> cls = DynamiteModule.class;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = f5533k;
            e eVar = (e) threadLocal.get();
            e eVar2 = new e(0);
            threadLocal.set(eVar2);
            d dVar = f5534l;
            long longValue = ((Long) dVar.get()).longValue();
            try {
                dVar.set(Long.valueOf(SystemClock.elapsedRealtime()));
                a.b a10 = aVar4.a(context2, str2, f5535m);
                int i11 = a10.f5539a;
                int i12 = a10.f5541c;
                if (i12 != 0) {
                    if (i12 == -1) {
                        if (i11 != 0) {
                            i12 = -1;
                        }
                    }
                    if (!(i12 == 1 && a10.f5540b == 0)) {
                        if (i12 == -1) {
                            "Selected local version of ".concat(String.valueOf(str));
                            dynamiteModule = new DynamiteModule(applicationContext);
                        } else if (i12 == 1) {
                            try {
                                int i13 = a10.f5540b;
                                synchronized (cls) {
                                    if (g(context)) {
                                        bool = f5528f;
                                    } else {
                                        throw new LoadingException("Remote loading disabled");
                                    }
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        synchronized (cls) {
                                            gVar = f5537o;
                                        }
                                        if (gVar != null) {
                                            e eVar3 = (e) threadLocal.get();
                                            if (eVar3 == null || eVar3.f12771a == null) {
                                                throw new LoadingException("No result cursor");
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor = eVar3.f12771a;
                                            new b((Object) null);
                                            synchronized (cls) {
                                                if (f5531i >= 2) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                valueOf = Boolean.valueOf(z10);
                                            }
                                            if (valueOf.booleanValue()) {
                                                aVar3 = gVar.o(new b(applicationContext2), str2, i13, new b(cursor));
                                            } else {
                                                aVar3 = gVar.m(new b(applicationContext2), str2, i13, new b(cursor));
                                            }
                                            Context context3 = (Context) b.o(aVar3);
                                            if (context3 != null) {
                                                dynamiteModule2 = new DynamiteModule(context3);
                                            } else {
                                                throw new LoadingException("Failed to get module context");
                                            }
                                        } else {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.");
                                        }
                                    } else {
                                        f h10 = h(context);
                                        if (h10 != null) {
                                            Parcel zzB = h10.zzB(6, h10.zza());
                                            int readInt = zzB.readInt();
                                            zzB.recycle();
                                            if (readInt >= 3) {
                                                e eVar4 = (e) threadLocal.get();
                                                if (eVar4 != null) {
                                                    aVar2 = h10.o(new b(context2), str2, i13, new b(eVar4.f12771a));
                                                } else {
                                                    throw new LoadingException("No cached result cursor holder");
                                                }
                                            } else if (readInt == 2) {
                                                aVar2 = h10.r(new b(context2), str2, i13);
                                            } else {
                                                aVar2 = h10.m(new b(context2), str2, i13);
                                            }
                                            Object o10 = b.o(aVar2);
                                            if (o10 != null) {
                                                dynamiteModule2 = new DynamiteModule((Context) o10);
                                            } else {
                                                throw new LoadingException("Failed to load remote module.");
                                            }
                                        } else {
                                            throw new LoadingException("Failed to create IDynamiteLoader.");
                                        }
                                    }
                                    dynamiteModule = dynamiteModule2;
                                } else {
                                    throw new LoadingException("Failed to determine which loading route to use.");
                                }
                            } catch (RemoteException e10) {
                                throw new LoadingException("Failed to load remote module.", e10);
                            } catch (LoadingException e11) {
                                throw e11;
                            } catch (LoadingException e12) {
                                e12.getMessage();
                                int i14 = a10.f5539a;
                                if (i14 == 0 || aVar4.a(context2, str2, new f(i14)).f5541c != -1) {
                                    throw new LoadingException("Remote load failed. No local fallback found.", e12);
                                }
                                "Selected local version of ".concat(String.valueOf(str));
                                dynamiteModule = new DynamiteModule(applicationContext);
                            } catch (Throwable th2) {
                                throw new LoadingException("Failed to load remote module.", th2);
                            }
                        } else {
                            throw new LoadingException("VersionPolicy returned invalid code:" + i12);
                        }
                        if (i10 != 0) {
                            f5534l.set(Long.valueOf(longValue));
                        }
                        return dynamiteModule;
                    }
                }
                throw new LoadingException("No acceptable module " + str2 + " found. Local version is " + a10.f5539a + " and remote version is " + a10.f5540b + ".");
            } finally {
                if (longValue == 0) {
                    f5534l.remove();
                } else {
                    f5534l.set(Long.valueOf(longValue));
                }
                Cursor cursor2 = eVar2.f12771a;
                if (cursor2 != null) {
                    cursor2.close();
                }
                f5533k.set(eVar);
            }
        } else {
            throw new LoadingException("null application Context");
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0056=Splitter:B:30:0x0056, B:49:0x009a=Splitter:B:49:0x009a, B:17:0x003c=Splitter:B:17:0x003c} */
    public static int d(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x01ae }
            java.lang.Boolean r1 = f5528f     // Catch:{ all -> 0x01ab }
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x00c1
            android.content.Context r1 = r11.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r5 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r5 = r5.getName()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class r1 = r1.loadClass(r5)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.String r5 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r5)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Class r5 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            monitor-enter(r5)     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
            java.lang.Object r6 = r1.get(r2)     // Catch:{ all -> 0x00b2 }
            java.lang.ClassLoader r6 = (java.lang.ClassLoader) r6     // Catch:{ all -> 0x00b2 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            if (r6 != r7) goto L_0x0037
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x0037:
            if (r6 == 0) goto L_0x0040
            f(r6)     // Catch:{ LoadingException -> 0x003c }
        L_0x003c:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x0040:
            boolean r6 = g(r11)     // Catch:{ all -> 0x00b2 }
            if (r6 != 0) goto L_0x0049
            monitor-exit(r5)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x01ab }
            return r4
        L_0x0049:
            boolean r6 = f5530h     // Catch:{ all -> 0x00b2 }
            if (r6 != 0) goto L_0x00a7
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b2 }
            boolean r7 = r6.equals(r2)     // Catch:{ all -> 0x00b2 }
            if (r7 == 0) goto L_0x0056
            goto L_0x00a7
        L_0x0056:
            int r7 = e(r11, r12, r13, r3)     // Catch:{ LoadingException -> 0x009d }
            java.lang.String r8 = f5529g     // Catch:{ LoadingException -> 0x009d }
            if (r8 == 0) goto L_0x009a
            boolean r8 = r8.isEmpty()     // Catch:{ LoadingException -> 0x009d }
            if (r8 == 0) goto L_0x0065
            goto L_0x009a
        L_0x0065:
            java.lang.ClassLoader r8 = l7.b.a()     // Catch:{ LoadingException -> 0x009d }
            if (r8 == 0) goto L_0x006c
            goto L_0x008f
        L_0x006c:
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ LoadingException -> 0x009d }
            r9 = 29
            if (r8 < r9) goto L_0x0081
            dalvik.system.DelegateLastClassLoader r8 = new dalvik.system.DelegateLastClassLoader     // Catch:{ LoadingException -> 0x009d }
            java.lang.String r9 = f5529g     // Catch:{ LoadingException -> 0x009d }
            y6.j.f(r9)     // Catch:{ LoadingException -> 0x009d }
            java.lang.ClassLoader r10 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009d }
            r8.<init>(r9, r10)     // Catch:{ LoadingException -> 0x009d }
            goto L_0x008f
        L_0x0081:
            l7.c r8 = new l7.c     // Catch:{ LoadingException -> 0x009d }
            java.lang.String r9 = f5529g     // Catch:{ LoadingException -> 0x009d }
            y6.j.f(r9)     // Catch:{ LoadingException -> 0x009d }
            java.lang.ClassLoader r10 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009d }
            r8.<init>(r10, r9)     // Catch:{ LoadingException -> 0x009d }
        L_0x008f:
            f(r8)     // Catch:{ LoadingException -> 0x009d }
            r1.set(r2, r8)     // Catch:{ LoadingException -> 0x009d }
            f5528f = r6     // Catch:{ LoadingException -> 0x009d }
            monitor-exit(r5)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x01ab }
            return r7
        L_0x009a:
            monitor-exit(r5)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x01ab }
            return r7
        L_0x009d:
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            r1.set(r2, r6)     // Catch:{ all -> 0x00b2 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x00a7:
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b2 }
            r1.set(r2, r6)     // Catch:{ all -> 0x00b2 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b2 }
        L_0x00b0:
            monitor-exit(r5)     // Catch:{ all -> 0x00b2 }
            goto L_0x00bf
        L_0x00b2:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b2 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00b9, IllegalAccessException -> 0x00b7, NoSuchFieldException -> 0x00b5 }
        L_0x00b5:
            r1 = move-exception
            goto L_0x00ba
        L_0x00b7:
            r1 = move-exception
            goto L_0x00ba
        L_0x00b9:
            r1 = move-exception
        L_0x00ba:
            r1.toString()     // Catch:{ all -> 0x01ab }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01ab }
        L_0x00bf:
            f5528f = r1     // Catch:{ all -> 0x01ab }
        L_0x00c1:
            monitor-exit(r0)     // Catch:{ all -> 0x01ab }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x01ae }
            if (r0 == 0) goto L_0x00d2
            int r11 = e(r11, r12, r13, r4)     // Catch:{ LoadingException -> 0x00cd }
            return r11
        L_0x00cd:
            r12 = move-exception
            r12.getMessage()     // Catch:{ all -> 0x01ae }
            return r4
        L_0x00d2:
            l7.f r5 = h(r11)     // Catch:{ all -> 0x01ae }
            if (r5 != 0) goto L_0x00da
            goto L_0x01a3
        L_0x00da:
            android.os.Parcel r0 = r5.zza()     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            r1 = 6
            android.os.Parcel r0 = r5.zzB(r1, r0)     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            r0.recycle()     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            r0 = 3
            if (r1 < r0) goto L_0x0157
            java.lang.ThreadLocal r0 = f5533k     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            java.lang.Object r1 = r0.get()     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            l7.e r1 = (l7.e) r1     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            if (r1 == 0) goto L_0x0101
            android.database.Cursor r1 = r1.f12771a     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            if (r1 == 0) goto L_0x0101
            int r4 = r1.getInt(r4)     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            goto L_0x01a3
        L_0x0101:
            k7.b r6 = new k7.b     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            r6.<init>(r11)     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            l7.d r1 = f5534l     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            java.lang.Object r1 = r1.get()     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            long r9 = r1.longValue()     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            r7 = r12
            r8 = r13
            k7.a r12 = r5.x(r6, r7, r8, r9)     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            java.lang.Object r12 = k7.b.o(r12)     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            android.database.Cursor r12 = (android.database.Cursor) r12     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            if (r12 == 0) goto L_0x014d
            boolean r13 = r12.moveToFirst()     // Catch:{ RemoteException -> 0x014a, all -> 0x0147 }
            if (r13 != 0) goto L_0x0127
            goto L_0x014d
        L_0x0127:
            int r13 = r12.getInt(r4)     // Catch:{ RemoteException -> 0x014a, all -> 0x0147 }
            if (r13 <= 0) goto L_0x0140
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x014a, all -> 0x0147 }
            l7.e r0 = (l7.e) r0     // Catch:{ RemoteException -> 0x014a, all -> 0x0147 }
            if (r0 == 0) goto L_0x013c
            android.database.Cursor r1 = r0.f12771a     // Catch:{ RemoteException -> 0x014a, all -> 0x0147 }
            if (r1 != 0) goto L_0x013c
            r0.f12771a = r12     // Catch:{ RemoteException -> 0x014a, all -> 0x0147 }
            goto L_0x013d
        L_0x013c:
            r3 = r4
        L_0x013d:
            if (r3 == 0) goto L_0x0140
            goto L_0x0141
        L_0x0140:
            r2 = r12
        L_0x0141:
            if (r2 == 0) goto L_0x0196
            r2.close()     // Catch:{ all -> 0x01ae }
            goto L_0x0196
        L_0x0147:
            r13 = move-exception
            r2 = r12
            goto L_0x01a5
        L_0x014a:
            r13 = move-exception
            r2 = r12
            goto L_0x019b
        L_0x014d:
            if (r12 == 0) goto L_0x01a3
            r12.close()     // Catch:{ all -> 0x01ae }
            goto L_0x01a3
        L_0x0153:
            r12 = move-exception
            goto L_0x0198
        L_0x0155:
            r12 = move-exception
            goto L_0x019a
        L_0x0157:
            r3 = 2
            if (r1 != r3) goto L_0x0179
            k7.b r0 = new k7.b     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            r0.<init>(r11)     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            android.os.Parcel r1 = r5.zza()     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            com.google.android.gms.internal.common.zzc.zze(r1, r0)     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            r1.writeString(r12)     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            r1.writeInt(r13)     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            r12 = 5
            android.os.Parcel r12 = r5.zzB(r12, r1)     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            int r13 = r12.readInt()     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            r12.recycle()     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            goto L_0x0196
        L_0x0179:
            k7.b r1 = new k7.b     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            r1.<init>(r11)     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            android.os.Parcel r3 = r5.zza()     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            com.google.android.gms.internal.common.zzc.zze(r3, r1)     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            r3.writeString(r12)     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            r3.writeInt(r13)     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            android.os.Parcel r12 = r5.zzB(r0, r3)     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            int r13 = r12.readInt()     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
            r12.recycle()     // Catch:{ RemoteException -> 0x0155, all -> 0x0153 }
        L_0x0196:
            r4 = r13
            goto L_0x01a3
        L_0x0198:
            r13 = r12
            goto L_0x01a5
        L_0x019a:
            r13 = r12
        L_0x019b:
            r13.getMessage()     // Catch:{ all -> 0x01a4 }
            if (r2 == 0) goto L_0x01a3
            r2.close()     // Catch:{ all -> 0x01ae }
        L_0x01a3:
            return r4
        L_0x01a4:
            r13 = move-exception
        L_0x01a5:
            if (r2 == 0) goto L_0x01aa
            r2.close()     // Catch:{ all -> 0x01ae }
        L_0x01aa:
            throw r13     // Catch:{ all -> 0x01ae }
        L_0x01ab:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01ab }
            throw r12     // Catch:{ all -> 0x01ae }
        L_0x01ae:
            r12 = move-exception
            y6.j.f(r11)     // Catch:{ Exception -> 0x01b2 }
        L_0x01b2:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.d(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cd A[Catch:{ all -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ce A[Catch:{ all -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int e(android.content.Context r8, java.lang.String r9, boolean r10, boolean r11) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            l7.d r8 = f5534l     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            java.lang.Object r8 = r8.get()     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            long r2 = r8.longValue()     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            java.lang.String r8 = "api_force_staging"
            java.lang.String r4 = "api"
            r7 = 1
            if (r7 == r10) goto L_0x0019
            r8 = r4
        L_0x0019:
            android.net.Uri$Builder r10 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            r10.<init>()     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r10 = r10.scheme(r4)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r10 = r10.authority(r4)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            android.net.Uri$Builder r8 = r10.path(r8)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            android.net.Uri$Builder r8 = r8.appendPath(r9)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            java.lang.String r9 = "requestStartTime"
            java.lang.String r10 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            android.net.Uri$Builder r8 = r8.appendQueryParameter(r9, r10)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            android.net.Uri r2 = r8.build()     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00c6, all -> 0x00c4 }
            if (r8 == 0) goto L_0x00b6
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x00c1, all -> 0x00be }
            if (r9 == 0) goto L_0x00b6
            r9 = 0
            int r10 = r8.getInt(r9)     // Catch:{ Exception -> 0x00c1, all -> 0x00be }
            if (r10 <= 0) goto L_0x00a0
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x00c1, all -> 0x00be }
            r2 = 2
            java.lang.String r2 = r8.getString(r2)     // Catch:{ all -> 0x009d }
            f5529g = r2     // Catch:{ all -> 0x009d }
            java.lang.String r2 = "loaderVersion"
            int r2 = r8.getColumnIndex(r2)     // Catch:{ all -> 0x009d }
            if (r2 < 0) goto L_0x006f
            int r2 = r8.getInt(r2)     // Catch:{ all -> 0x009d }
            f5531i = r2     // Catch:{ all -> 0x009d }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r8.getColumnIndex(r2)     // Catch:{ all -> 0x009d }
            if (r2 < 0) goto L_0x0083
            int r2 = r8.getInt(r2)     // Catch:{ all -> 0x009d }
            if (r2 == 0) goto L_0x007f
            r2 = r7
            goto L_0x0080
        L_0x007f:
            r2 = r9
        L_0x0080:
            f5530h = r2     // Catch:{ all -> 0x009d }
            goto L_0x0084
        L_0x0083:
            r2 = r9
        L_0x0084:
            monitor-exit(r1)     // Catch:{ all -> 0x009d }
            java.lang.ThreadLocal r1 = f5533k     // Catch:{ Exception -> 0x00c1, all -> 0x00be }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00c1, all -> 0x00be }
            l7.e r1 = (l7.e) r1     // Catch:{ Exception -> 0x00c1, all -> 0x00be }
            if (r1 == 0) goto L_0x0096
            android.database.Cursor r3 = r1.f12771a     // Catch:{ Exception -> 0x00c1, all -> 0x00be }
            if (r3 != 0) goto L_0x0096
            r1.f12771a = r8     // Catch:{ Exception -> 0x00c1, all -> 0x00be }
            goto L_0x0097
        L_0x0096:
            r7 = r9
        L_0x0097:
            if (r7 == 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r0 = r8
        L_0x009b:
            r9 = r2
            goto L_0x00a1
        L_0x009d:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x009d }
            throw r9     // Catch:{ Exception -> 0x00c1, all -> 0x00be }
        L_0x00a0:
            r0 = r8
        L_0x00a1:
            if (r11 == 0) goto L_0x00b0
            if (r9 != 0) goto L_0x00a6
            goto L_0x00b0
        L_0x00a6:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r8 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x00ae }
            java.lang.String r9 = "forcing fallback to container DynamiteLoader impl"
            r8.<init>(r9)     // Catch:{ Exception -> 0x00ae }
            throw r8     // Catch:{ Exception -> 0x00ae }
        L_0x00ae:
            r9 = move-exception
            goto L_0x00c8
        L_0x00b0:
            if (r0 == 0) goto L_0x00b5
            r0.close()
        L_0x00b5:
            return r10
        L_0x00b6:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r9 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x00c1, all -> 0x00be }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>(r10)     // Catch:{ Exception -> 0x00c1, all -> 0x00be }
            throw r9     // Catch:{ Exception -> 0x00c1, all -> 0x00be }
        L_0x00be:
            r9 = move-exception
            r0 = r8
            goto L_0x00ea
        L_0x00c1:
            r9 = move-exception
            r0 = r8
            goto L_0x00c8
        L_0x00c4:
            r8 = move-exception
            goto L_0x00eb
        L_0x00c6:
            r8 = move-exception
            r9 = r8
        L_0x00c8:
            boolean r8 = r9 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x00e9 }
            if (r8 == 0) goto L_0x00ce
            throw r9     // Catch:{ all -> 0x00e9 }
        L_0x00ce:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r8 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00e9 }
            java.lang.String r10 = r9.getMessage()     // Catch:{ all -> 0x00e9 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e9 }
            r11.<init>()     // Catch:{ all -> 0x00e9 }
            java.lang.String r1 = "V2 version check failed: "
            r11.append(r1)     // Catch:{ all -> 0x00e9 }
            r11.append(r10)     // Catch:{ all -> 0x00e9 }
            java.lang.String r10 = r11.toString()     // Catch:{ all -> 0x00e9 }
            r8.<init>(r10, r9)     // Catch:{ all -> 0x00e9 }
            throw r8     // Catch:{ all -> 0x00e9 }
        L_0x00e9:
            r9 = move-exception
        L_0x00ea:
            r8 = r9
        L_0x00eb:
            if (r0 == 0) goto L_0x00f0
            r0.close()
        L_0x00f0:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void f(java.lang.ClassLoader r2) {
        /*
            java.lang.String r0 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"
            java.lang.Class r2 = r2.loadClass(r0)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r1)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.Object r2 = r2.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            if (r2 != 0) goto L_0x0019
            r2 = 0
            goto L_0x002d
        L_0x0019:
            java.lang.String r0 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            boolean r1 = r0 instanceof l7.g     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            if (r1 == 0) goto L_0x0027
            r2 = r0
            l7.g r2 = (l7.g) r2     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            goto L_0x002d
        L_0x0027:
            l7.g r0 = new l7.g     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            r0.<init>(r2)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            r2 = r0
        L_0x002d:
            f5537o = r2     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            return
        L_0x0030:
            r2 = move-exception
            goto L_0x0039
        L_0x0032:
            r2 = move-exception
            goto L_0x0039
        L_0x0034:
            r2 = move-exception
            goto L_0x0039
        L_0x0036:
            r2 = move-exception
            goto L_0x0039
        L_0x0038:
            r2 = move-exception
        L_0x0039:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String r1 = "Failed to instantiate dynamite loader"
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(java.lang.ClassLoader):void");
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Object) null) || bool.equals(f5532j)) {
            return true;
        }
        boolean z10 = false;
        if (f5532j == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (u6.b.f15290b.c(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f5532j = valueOf;
            z10 = valueOf.booleanValue();
            if (z10 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f5530h = true;
            }
        }
        return z10;
    }

    public static f h(Context context) {
        f fVar;
        synchronized (DynamiteModule.class) {
            f fVar2 = f5536n;
            if (fVar2 != null) {
                return fVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    fVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof f) {
                        fVar = (f) queryLocalInterface;
                    } else {
                        fVar = new f(iBinder);
                    }
                }
                if (fVar != null) {
                    f5536n = fVar;
                    return fVar;
                }
            } catch (Exception e10) {
                e10.getMessage();
            }
        }
        return null;
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f5538a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new LoadingException("Failed to instantiate module class: ".concat(str), e10);
        }
    }
}
