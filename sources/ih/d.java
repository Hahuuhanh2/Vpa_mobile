package ih;

import android.os.Handler;
import android.os.Looper;
import com.vpa.daugia.module.common.ui.CommonViewModel;
import com.vpa.daugia.module.common.ui.activity.MyDocumentActivity;
import ef.n;
import java.util.TimerTask;

/* compiled from: SearchViewExtensions.kt */
public final class d extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f20567a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MyDocumentActivity f20568b;

    /* compiled from: SearchViewExtensions.kt */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20569a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ MyDocumentActivity f20570b;

        public a(String str, MyDocumentActivity myDocumentActivity) {
            this.f20569a = str;
            this.f20570b = myDocumentActivity;
        }

        public final void run() {
            String str = this.f20569a;
            if (str == null) {
                str = "";
            }
            MyDocumentActivity myDocumentActivity = this.f20570b;
            int i10 = MyDocumentActivity.V;
            myDocumentActivity.U().f19618e = new n<>((Object) null);
            CommonViewModel.e(this.f20570b.U(), str, 6);
        }
    }

    public d(String str, MyDocumentActivity myDocumentActivity) {
        this.f20567a = str;
        this.f20568b = myDocumentActivity;
    }

    public final void run() {
        new Handler(Looper.getMainLooper()).post(new a(this.f20567a, this.f20568b));
    }
}
