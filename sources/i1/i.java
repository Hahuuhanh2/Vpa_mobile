package i1;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FrameMetricsAggregator */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public final b f10946a;

    /* compiled from: FrameMetricsAggregator */
    public static class a extends b {

        /* renamed from: e  reason: collision with root package name */
        public static HandlerThread f10947e;

        /* renamed from: f  reason: collision with root package name */
        public static Handler f10948f;

        /* renamed from: a  reason: collision with root package name */
        public int f10949a = 1;

        /* renamed from: b  reason: collision with root package name */
        public SparseIntArray[] f10950b = new SparseIntArray[9];

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<WeakReference<Activity>> f10951c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public C0121a f10952d = new C0121a();

        /* renamed from: i1.i$a$a  reason: collision with other inner class name */
        /* compiled from: FrameMetricsAggregator */
        public class C0121a implements Window$OnFrameMetricsAvailableListener {
            public C0121a() {
            }

            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                a aVar = a.this;
                if ((aVar.f10949a & 1) != 0) {
                    a.e(aVar.f10950b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f10949a & 2) != 0) {
                    a.e(aVar2.f10950b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f10949a & 4) != 0) {
                    a.e(aVar3.f10950b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f10949a & 8) != 0) {
                    a.e(aVar4.f10950b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f10949a & 16) != 0) {
                    a.e(aVar5.f10950b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f10949a & 64) != 0) {
                    a.e(aVar6.f10950b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f10949a & 32) != 0) {
                    a.e(aVar7.f10950b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f10949a & 128) != 0) {
                    a.e(aVar8.f10950b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f10949a & 256) != 0) {
                    a.e(aVar9.f10950b[8], frameMetrics.getMetric(2));
                }
            }
        }

        public static void e(SparseIntArray sparseIntArray, long j10) {
            if (sparseIntArray != null) {
                int i10 = (int) ((500000 + j10) / 1000000);
                if (j10 >= 0) {
                    sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
                }
            }
        }

        public final void a(Activity activity) {
            if (f10947e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f10947e = handlerThread;
                handlerThread.start();
                f10948f = new Handler(f10947e.getLooper());
            }
            for (int i10 = 0; i10 <= 8; i10++) {
                SparseIntArray[] sparseIntArrayArr = this.f10950b;
                if (sparseIntArrayArr[i10] == null && (this.f10949a & (1 << i10)) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f10952d, f10948f);
            this.f10951c.add(new WeakReference(activity));
        }

        public final SparseIntArray[] b() {
            return this.f10950b;
        }

        public final SparseIntArray[] c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f10951c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference next = it.next();
                if (next.get() == activity) {
                    this.f10951c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f10952d);
            return this.f10950b;
        }

        public final SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f10950b;
            this.f10950b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }
    }

    /* compiled from: FrameMetricsAggregator */
    public static class b {
        public void a(Activity activity) {
        }

        public SparseIntArray[] b() {
            return null;
        }

        public SparseIntArray[] c(Activity activity) {
            return null;
        }

        public SparseIntArray[] d() {
            return null;
        }
    }

    public i() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f10946a = new a();
        } else {
            this.f10946a = new b();
        }
    }
}
