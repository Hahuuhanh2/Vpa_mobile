package v;

import android.hardware.camera2.CameraDevice;
import d.h;
import h0.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* compiled from: CaptureSessionRepository */
public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f15590a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15591b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet f15592c = new LinkedHashSet();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet f15593d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet f15594e = new LinkedHashSet();

    /* renamed from: f  reason: collision with root package name */
    public final a f15595f = new a();

    /* compiled from: CaptureSessionRepository */
    public class a extends CameraDevice.StateCallback {

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int f15596b = 0;

        public a() {
        }

        public final void a() {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            synchronized (b1.this.f15591b) {
                b1 b1Var = b1.this;
                synchronized (b1Var.f15591b) {
                    arrayList = new ArrayList();
                    synchronized (b1Var.f15591b) {
                        arrayList2 = new ArrayList(b1Var.f15592c);
                    }
                    arrayList.addAll(arrayList2);
                    synchronized (b1Var.f15591b) {
                        arrayList3 = new ArrayList(b1Var.f15594e);
                    }
                    arrayList.addAll(arrayList3);
                }
                b1.this.f15594e.clear();
                b1.this.f15592c.clear();
                b1.this.f15593d.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((u1) it.next()).d();
            }
        }

        public final void b() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (b1.this.f15591b) {
                linkedHashSet.addAll(b1.this.f15594e);
                linkedHashSet.addAll(b1.this.f15592c);
            }
            b1.this.f15590a.execute(new h(linkedHashSet, 4));
        }

        public final void onClosed(CameraDevice cameraDevice) {
            a();
        }

        public final void onDisconnected(CameraDevice cameraDevice) {
            b();
            a();
        }

        public final void onError(CameraDevice cameraDevice, int i10) {
            b();
            a();
        }

        public final void onOpened(CameraDevice cameraDevice) {
        }
    }

    public b1(g gVar) {
        this.f15590a = gVar;
    }

    public final void a(u1 u1Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        u1 u1Var2;
        synchronized (this.f15591b) {
            arrayList = new ArrayList();
            synchronized (this.f15591b) {
                arrayList2 = new ArrayList(this.f15592c);
            }
            arrayList.addAll(arrayList2);
            synchronized (this.f15591b) {
                arrayList3 = new ArrayList(this.f15594e);
            }
            arrayList.addAll(arrayList3);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && (u1Var2 = (u1) it.next()) != u1Var) {
            u1Var2.d();
        }
    }
}
