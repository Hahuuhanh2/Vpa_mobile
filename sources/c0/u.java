package c0;

import al.g0;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.c;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.y;
import c0.v;
import f0.o;
import f0.p;
import f0.s;
import g0.d;
import i0.f;
import io.github.g00fy2.quickie.QRScannerActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import s1.i;
import z0.b;

/* compiled from: CameraX */
public final class u {

    /* renamed from: l  reason: collision with root package name */
    public static final Object f4344l = new Object();

    /* renamed from: m  reason: collision with root package name */
    public static final SparseArray<Integer> f4345m = new SparseArray<>();

    /* renamed from: a  reason: collision with root package name */
    public final s f4346a = new s();

    /* renamed from: b  reason: collision with root package name */
    public final Object f4347b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final v f4348c;

    /* renamed from: d  reason: collision with root package name */
    public final Executor f4349d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f4350e;

    /* renamed from: f  reason: collision with root package name */
    public p f4351f;

    /* renamed from: g  reason: collision with root package name */
    public o f4352g;

    /* renamed from: h  reason: collision with root package name */
    public y f4353h;

    /* renamed from: i  reason: collision with root package name */
    public Context f4354i;

    /* renamed from: j  reason: collision with root package name */
    public final b.d f4355j;

    /* renamed from: k  reason: collision with root package name */
    public int f4356k;

    public u(QRScannerActivity qRScannerActivity) {
        v.b bVar;
        Object obj;
        Object obj2;
        b.d a10;
        int i10;
        String str;
        boolean z10 = true;
        this.f4356k = 1;
        f.c((Object) null);
        Application b10 = d.b(qRScannerActivity);
        if (b10 instanceof v.b) {
            bVar = (v.b) b10;
        } else {
            try {
                Context a11 = d.a(qRScannerActivity);
                Bundle bundle = a11.getPackageManager().getServiceInfo(new ComponentName(a11, MetadataHolderService.class), 640).metaData;
                if (bundle != null) {
                    str = bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER");
                } else {
                    str = null;
                }
                if (str == null) {
                    p0.b("CameraX");
                    bVar = null;
                } else {
                    bVar = (v.b) Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                }
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
                p0.c("CameraX");
            }
        }
        if (bVar != null) {
            v cameraXConfig = bVar.getCameraXConfig();
            this.f4348c = cameraXConfig;
            r rVar = cameraXConfig.E;
            c cVar = v.I;
            rVar.getClass();
            try {
                obj = rVar.a(cVar);
            } catch (IllegalArgumentException unused2) {
                obj = null;
            }
            Executor executor = (Executor) obj;
            r rVar2 = this.f4348c.E;
            c cVar2 = v.J;
            rVar2.getClass();
            try {
                obj2 = rVar2.a(cVar2);
            } catch (IllegalArgumentException unused3) {
                obj2 = null;
            }
            Handler handler = (Handler) obj2;
            this.f4349d = executor == null ? new m() : executor;
            if (handler == null) {
                HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
                handlerThread.start();
                this.f4350e = i.a(handlerThread.getLooper());
            } else {
                this.f4350e = handler;
            }
            v vVar = this.f4348c;
            c cVar3 = v.K;
            vVar.getClass();
            Integer num = (Integer) ((r) vVar.b()).e(cVar3, null);
            synchronized (f4344l) {
                if (num != null) {
                    g0.A(num.intValue(), 3, 6, "minLogLevel");
                    SparseArray<Integer> sparseArray = f4345m;
                    if (sparseArray.get(num.intValue()) != null) {
                        i10 = sparseArray.get(num.intValue()).intValue() + 1;
                    } else {
                        i10 = 1;
                    }
                    sparseArray.put(num.intValue(), Integer.valueOf(i10));
                    if (sparseArray.size() == 0) {
                        p0.f4314a = 3;
                    } else if (sparseArray.get(3) != null) {
                        p0.f4314a = 3;
                    } else if (sparseArray.get(4) != null) {
                        p0.f4314a = 4;
                    } else if (sparseArray.get(5) != null) {
                        p0.f4314a = 5;
                    } else if (sparseArray.get(6) != null) {
                        p0.f4314a = 6;
                    }
                }
            }
            synchronized (this.f4347b) {
                if (this.f4356k != 1) {
                    z10 = false;
                }
                g0.E("CameraX.initInternal() should only be called once per instance", z10);
                this.f4356k = 2;
                a10 = b.a(new r(0, this, qRScannerActivity));
            }
            this.f4355j = a10;
            return;
        }
        throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
    }

    public final p a() {
        p pVar = this.f4351f;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public final void b() {
        synchronized (this.f4347b) {
            this.f4356k = 4;
        }
    }
}
