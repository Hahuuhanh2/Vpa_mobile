package s7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzc;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import h7.d;
import h7.i;
import j7.c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import y6.j;

/* compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
public final class a {

    /* renamed from: n  reason: collision with root package name */
    public static final long f14639n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o  reason: collision with root package name */
    public static volatile ScheduledExecutorService f14640o = null;

    /* renamed from: p  reason: collision with root package name */
    public static final Object f14641p = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f14642a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final PowerManager.WakeLock f14643b;

    /* renamed from: c  reason: collision with root package name */
    public int f14644c = 0;

    /* renamed from: d  reason: collision with root package name */
    public ScheduledFuture f14645d;

    /* renamed from: e  reason: collision with root package name */
    public long f14646e;

    /* renamed from: f  reason: collision with root package name */
    public final HashSet f14647f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    public boolean f14648g = true;

    /* renamed from: h  reason: collision with root package name */
    public zzb f14649h;

    /* renamed from: i  reason: collision with root package name */
    public d f14650i = d.f10614e;

    /* renamed from: j  reason: collision with root package name */
    public final String f14651j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap f14652k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    public AtomicInteger f14653l = new AtomicInteger(0);

    /* renamed from: m  reason: collision with root package name */
    public final ScheduledExecutorService f14654m;

    public a(Context context) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        String packageName = context.getPackageName();
        j.d("WakeLock: wakeLockName must not be empty", "wake:com.google.firebase.iid.WakeLockHolder");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f14649h = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            if ("wake:com.google.firebase.iid.WakeLockHolder".length() != 0) {
                str = "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
            } else {
                str = new String("*gcore*:");
            }
            this.f14651j = str;
        } else {
            this.f14651j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f14643b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            Method method = h7.j.f10620a;
            synchronized (h7.j.class) {
                Boolean bool = h7.j.f10622c;
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    if (k1.a.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    Boolean valueOf = Boolean.valueOf(z12);
                    h7.j.f10622c = valueOf;
                    z10 = valueOf.booleanValue();
                }
            }
            if (z10) {
                int i10 = i.f10619a;
                if (packageName == null || packageName.trim().isEmpty()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                packageName = z11 ? context.getPackageName() : packageName;
                if (!(context.getPackageManager() == null || packageName == null)) {
                    try {
                        ApplicationInfo applicationInfo = c.a(context).f11719a.getPackageManager().getApplicationInfo(packageName, 0);
                        if (applicationInfo == null) {
                            "Could not get applicationInfo from package: ".concat(packageName);
                        } else {
                            int i11 = applicationInfo.uid;
                            workSource = new WorkSource();
                            Method method2 = h7.j.f10621b;
                            if (method2 != null) {
                                try {
                                    method2.invoke(workSource, new Object[]{Integer.valueOf(i11), packageName});
                                } catch (Exception e10) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                                }
                            } else {
                                Method method3 = h7.j.f10620a;
                                if (method3 != null) {
                                    try {
                                        method3.invoke(workSource, new Object[]{Integer.valueOf(i11)});
                                    } catch (Exception e11) {
                                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
                                    }
                                }
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        "Could not find package: ".concat(packageName);
                    }
                }
                if (workSource != null) {
                    try {
                        this.f14643b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e12) {
                        Log.wtf("WakeLock", e12.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f14640o;
            if (scheduledExecutorService == null) {
                synchronized (f14641p) {
                    scheduledExecutorService = f14640o;
                    if (scheduledExecutorService == null) {
                        zzh.zza();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f14640o = scheduledExecutorService;
                    }
                }
            }
            this.f14654m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("expected a non-null reference", 0, 29);
        throw new zzi(sb2.toString());
    }

    public final void a(long j10) {
        this.f14653l.incrementAndGet();
        long j11 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f14639n), 1);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f14642a) {
            try {
                if (!b()) {
                    this.f14649h = zzb.zza(false, (zzc) null);
                    this.f14643b.acquire();
                    this.f14650i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f14644c++;
                if (this.f14648g) {
                    TextUtils.isEmpty((CharSequence) null);
                }
                b bVar = (b) this.f14652k.get((Object) null);
                if (bVar == null) {
                    bVar = new b(0);
                    this.f14652k.put((Object) null, bVar);
                }
                bVar.f14655a++;
                this.f14650i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j11 = elapsedRealtime + max;
                }
                if (j11 > this.f14646e) {
                    this.f14646e = j11;
                    ScheduledFuture scheduledFuture = this.f14645d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f14645d = this.f14654m.schedule(new t6.j(this, 2), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f14642a) {
            if (this.f14644c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f14653l.decrementAndGet() < 0) {
            String.valueOf(this.f14651j).concat(" release without a matched acquire!");
        }
        synchronized (this.f14642a) {
            try {
                if (this.f14648g) {
                    TextUtils.isEmpty((CharSequence) null);
                }
                if (this.f14652k.containsKey((Object) null)) {
                    b bVar = (b) this.f14652k.get((Object) null);
                    if (bVar != null) {
                        int i10 = bVar.f14655a - 1;
                        bVar.f14655a = i10;
                        if (i10 == 0) {
                            this.f14652k.remove((Object) null);
                        }
                    }
                } else {
                    String.valueOf(this.f14651j).concat(" counter does not exist");
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        if (!this.f14647f.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f14647f);
            this.f14647f.clear();
            if (arrayList.size() > 0) {
                c cVar = (c) arrayList.get(0);
                throw null;
            }
        }
    }

    public final void e() {
        synchronized (this.f14642a) {
            if (b()) {
                if (this.f14648g) {
                    int i10 = this.f14644c - 1;
                    this.f14644c = i10;
                    if (i10 > 0) {
                        return;
                    }
                } else {
                    this.f14644c = 0;
                }
                d();
                for (b bVar : this.f14652k.values()) {
                    bVar.f14655a = 0;
                }
                this.f14652k.clear();
                ScheduledFuture scheduledFuture = this.f14645d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.f14645d = null;
                    this.f14646e = 0;
                }
                if (this.f14643b.isHeld()) {
                    try {
                        this.f14643b.release();
                        if (this.f14649h != null) {
                            this.f14649h = null;
                        }
                    } catch (RuntimeException e10) {
                        if (e10.getClass().equals(RuntimeException.class)) {
                            String.valueOf(this.f14651j).concat(" failed to release!");
                            if (this.f14649h != null) {
                                this.f14649h = null;
                            }
                            return;
                        }
                        throw e10;
                    } catch (Throwable th2) {
                        if (this.f14649h != null) {
                            this.f14649h = null;
                        }
                        throw th2;
                    }
                } else {
                    String.valueOf(this.f14651j).concat(" should be held!");
                }
            }
        }
    }
}
