package nh;

import androidx.appcompat.widget.SearchView;
import com.vpa.daugia.module.home.ui.AnnouncementListActivity;
import df.b;
import java.util.Timer;
import n0.l;

/* compiled from: SearchViewExtensions.kt */
public final class e implements SearchView.m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AnnouncementListActivity f21652a;

    public e(AnnouncementListActivity announcementListActivity) {
        this.f21652a = announcementListActivity;
    }

    public final void a(String str) {
        Timer n10 = l.n(b.f8966a);
        b.f8966a = n10;
        n10.schedule(new d(this.f21652a, str), 500);
    }

    public final void b() {
    }
}
