package nh;

import android.os.Handler;
import android.os.Looper;
import com.vpa.daugia.module.home.ui.AnnouncementListActivity;
import ef.n;
import java.util.TimerTask;

/* compiled from: SearchViewExtensions.kt */
public final class d extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f21647a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AnnouncementListActivity f21648b;

    /* compiled from: SearchViewExtensions.kt */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21649a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AnnouncementListActivity f21650b;

        public a(AnnouncementListActivity announcementListActivity, String str) {
            this.f21649a = str;
            this.f21650b = announcementListActivity;
        }

        public final void run() {
            String str = this.f21649a;
            if (str == null) {
                str = "";
            }
            AnnouncementListActivity announcementListActivity = this.f21650b;
            int i10 = AnnouncementListActivity.Z;
            announcementListActivity.U().f19709g = new n<>((Object) null);
            AnnouncementListActivity announcementListActivity2 = this.f21650b;
            announcementListActivity2.T = str;
            announcementListActivity2.U().e(str);
        }
    }

    public d(AnnouncementListActivity announcementListActivity, String str) {
        this.f21647a = str;
        this.f21648b = announcementListActivity;
    }

    public final void run() {
        new Handler(Looper.getMainLooper()).post(new a(this.f21648b, this.f21647a));
    }
}
