package oi;

import android.os.Handler;
import android.os.Looper;
import com.vpa.daugia.module.searching.ui.activity.FilterActivity;
import java.util.TimerTask;
import pi.a;

/* compiled from: SearchViewExtensions.kt */
public final class d extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f21811a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FilterActivity f21812b;

    /* compiled from: SearchViewExtensions.kt */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21813a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ FilterActivity f21814b;

        public a(String str, FilterActivity filterActivity) {
            this.f21813a = str;
            this.f21814b = filterActivity;
        }

        public final void run() {
            String str = this.f21813a;
            if (str == null) {
                str = "";
            }
            FilterActivity filterActivity = this.f21814b;
            int i10 = FilterActivity.Y;
            pi.a U = filterActivity.U();
            U.getClass();
            new a.c(U).filter(str);
        }
    }

    public d(String str, FilterActivity filterActivity) {
        this.f21811a = str;
        this.f21812b = filterActivity;
    }

    public final void run() {
        new Handler(Looper.getMainLooper()).post(new a(this.f21811a, this.f21812b));
    }
}
