package ze;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.view.View;
import com.vpa.daugia.di.App;
import com.vpa.daugia.module.auth.data.model.AccountType;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.activity.AuthActivity;
import com.vpa.daugia.module.auth.ui.activity.RegisterAccountActivity;
import com.vpa.daugia.module.common.data.model.VehicleType;
import com.vpa.daugia.module.profile.ui.activity.OrganizationProfileActivity;
import com.vpa.daugia.module.profile.ui.activity.PolicyAndTermActivity;
import ek.i;
import java.io.File;
import kf.e;
import sk.j;
import sk.k;
import yk.h;

/* compiled from: AppUtil.kt */
public final class b extends e {

    /* compiled from: AppUtil.kt */
    public static final class a extends k implements rk.a<i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17995a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.f17995a = context;
        }

        public final Object invoke() {
            this.f17995a.startActivity(new Intent(this.f17995a, AuthActivity.class));
            return i.f20112a;
        }
    }

    /* renamed from: ze.b$b  reason: collision with other inner class name */
    /* compiled from: AppUtil.kt */
    public static final class C0254b extends k implements rk.a<i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17996a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0254b(Context context) {
            super(0);
            this.f17996a = context;
        }

        public final Object invoke() {
            this.f17996a.startActivity(new Intent(this.f17996a, RegisterAccountActivity.class));
            return i.f20112a;
        }
    }

    /* compiled from: AppUtil.kt */
    public static final class c extends k implements rk.a<i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ lg.b f17997a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f17998b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Context context, lg.b bVar) {
            super(0);
            this.f17997a = bVar;
            this.f17998b = context;
        }

        public final Object invoke() {
            User e10 = this.f17997a.e();
            boolean z10 = false;
            if (e10 != null) {
                Integer accountType = e10.getAccountType();
                int value = AccountType.PERSON.getValue();
                if (accountType != null && accountType.intValue() == value) {
                    z10 = true;
                }
            }
            if (z10) {
                this.f17998b.startActivity(new Intent(this.f17998b, PolicyAndTermActivity.class));
            } else {
                this.f17998b.startActivity(new Intent(this.f17998b, OrganizationProfileActivity.class));
            }
            return i.f20112a;
        }
    }

    public static boolean l(Context context, lg.b bVar) {
        int i10;
        Integer profileStatus;
        j.f(context, "context");
        if (!App.f19364o.a().a()) {
            ph.b bVar2 = new ph.b(context);
            bVar2.f22646o = new a(context);
            bVar2.f22645n = new C0254b(context);
            bVar2.show();
            return false;
        }
        User e10 = bVar.e();
        if (e10 == null || (profileStatus = e10.getProfileStatus()) == null) {
            i10 = 0;
        } else {
            i10 = profileStatus.intValue();
        }
        if (i10 >= 2) {
            return true;
        }
        ph.c cVar = new ph.c(context);
        cVar.f22649n = new c(context, bVar);
        cVar.show();
        return false;
    }

    public static void m(View view, String str, String str2) {
        j.f(str2, "token");
        Object systemService = view.getContext().getSystemService("download");
        j.d(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle("bien_ban_cuoc_dau_gia.pdf");
        request.setDescription("Tải về");
        request.addRequestHeader("Authorization", "Bearer " + str2);
        request.addRequestHeader("Csrf", "MTcwOTEwMzU4NzI4MQ==");
        request.addRequestHeader("App", "Mobile");
        String str3 = Environment.DIRECTORY_DOWNLOADS.toString();
        StringBuilder q10 = android.support.v4.media.a.q("FolderApp");
        q10.append(File.separator);
        q10.append(h.J0("bien_ban_cuoc_dau_gia.pdf", "%20", ""));
        request.setDestinationInExternalPublicDir(str3, q10.toString());
        request.setNotificationVisibility(1);
        ((DownloadManager) systemService).enqueue(request);
        new of.a(view).a("Đang tải xuống", of.b.SUCCESS);
    }

    public static String n(Integer num) {
        int value = VehicleType.AUTOMOBILE.getValue();
        if (num != null && num.intValue() == value) {
            return "Xe con";
        }
        int value2 = VehicleType.BUS.getValue();
        if (num != null && num.intValue() == value2) {
            return "Xe khách";
        }
        int value3 = VehicleType.TRUCK.getValue();
        if (num != null && num.intValue() == value3) {
            return "Xe tải";
        }
        int value4 = VehicleType.VAN.getValue();
        if (num != null && num.intValue() == value4) {
            return "Xe tải van";
        }
        return "";
    }
}
