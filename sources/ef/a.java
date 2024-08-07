package ef;

import al.a0;
import al.g0;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.core.content.FileProvider;
import bc.h;
import com.ots.core.base.BaseActivity;
import com.vpa.daugia.module.auction.data.api.request.AwaitAuctionRequest;
import com.vpa.daugia.module.auth.ui.activity.StepThreeOrganizationActivity;
import com.vpa.daugia.module.auth.ui.activity.StepThreePersonalActivity;
import com.vpa.daugia.module.home.data.api.request.AnnouncementPlanRequest;
import com.vpa.daugia.module.profile.ui.activity.ProfileActivity;
import com.vpa.daugia.module.profile.ui.activity.VerifyActivity;
import com.vpa.daugia.module.register.ui.ListAwaitAuctionActivity;
import com.vpa.daugia.module.scope.ui.activity.ScopeActivity;
import com.vpa.daugia.module.searching.ui.viewmodel.SearchViewModel;
import gi.b1;
import ii.q;
import ik.d;
import java.io.File;
import java.lang.reflect.Type;
import java.util.List;
import java.util.UUID;
import mg.a4;
import mg.d1;
import mg.y1;
import of.b;
import p3.l0;
import sk.e;
import sk.j;
import zg.v0;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9438a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9439b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f9438a = i10;
        this.f9439b = obj;
    }

    public final void b(Object obj) {
        String str;
        String str2;
        String str3;
        Integer num;
        String str4;
        String b10;
        String str5;
        String str6;
        String str7;
        Integer num2;
        String b11;
        String str8 = null;
        switch (this.f9438a) {
            case 0:
                ((Boolean) obj).booleanValue();
                int i10 = BaseActivity.N;
                j.f((BaseActivity) this.f9439b, "this$0");
                return;
            case 1:
                StepThreeOrganizationActivity stepThreeOrganizationActivity = (StepThreeOrganizationActivity) this.f9439b;
                int i11 = StepThreeOrganizationActivity.Z;
                j.f(stepThreeOrganizationActivity, "this$0");
                if (((ActivityResult) obj).f303a == -1) {
                    String[] strArr = new String[1];
                    String str9 = stepThreeOrganizationActivity.V;
                    if (str9 != null) {
                        strArr[0] = str9;
                        l0.j0(g0.W(stepThreeOrganizationActivity), (a0) null, new v0(j7.a.e(strArr), stepThreeOrganizationActivity, (d<? super v0>) null), 3);
                        return;
                    }
                    j.l("imagePath");
                    throw null;
                }
                return;
            case 2:
                StepThreePersonalActivity stepThreePersonalActivity = (StepThreePersonalActivity) this.f9439b;
                Boolean bool = (Boolean) obj;
                int i12 = StepThreePersonalActivity.f19534a0;
                j.f(stepThreePersonalActivity, "this$0");
                j.c(bool);
                if (bool.booleanValue()) {
                    File file = new File(stepThreePersonalActivity.getCacheDir(), UUID.randomUUID().toString() + ".jpg");
                    file.createNewFile();
                    String absolutePath = file.getAbsolutePath();
                    j.e(absolutePath, "getAbsolutePath(...)");
                    stepThreePersonalActivity.V = absolutePath;
                    Uri c10 = FileProvider.c(stepThreePersonalActivity, stepThreePersonalActivity.getApplicationContext().getPackageName() + ".provider", file);
                    j.e(c10, "getUriForFile(...)");
                    stepThreePersonalActivity.W = c10;
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    intent.addFlags(1);
                    Uri uri = stepThreePersonalActivity.W;
                    if (uri != null) {
                        intent.putExtra("output", uri);
                        stepThreePersonalActivity.Y.a(intent);
                        return;
                    }
                    j.l("photoUri");
                    throw null;
                }
                View view = ((a4) stepThreePersonalActivity.M()).f8554e;
                j.e(view, "getRoot(...)");
                new of.a(view).a("Vui lòng mở cài đặt, Chọn quyền và bật ON mục máy ảnh cho VPA", b.ERROR);
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.f9439b;
                int i13 = ProfileActivity.f19812b0;
                j.f(profileActivity, "this$0");
                if (((ActivityResult) obj).f303a == -1) {
                    String[] strArr2 = new String[1];
                    String str10 = profileActivity.S;
                    if (str10 != null) {
                        strArr2[0] = str10;
                        l0.j0(g0.W(profileActivity), (a0) null, new b1(j7.a.e(strArr2), profileActivity, (d<? super b1>) null), 3);
                        return;
                    }
                    j.l("imagePath");
                    throw null;
                }
                return;
            case 4:
                VerifyActivity verifyActivity = (VerifyActivity) this.f9439b;
                Boolean bool2 = (Boolean) obj;
                int i14 = VerifyActivity.f19818a0;
                j.f(verifyActivity, "this$0");
                j.c(bool2);
                if (bool2.booleanValue()) {
                    File file2 = new File(verifyActivity.getCacheDir(), UUID.randomUUID().toString() + ".jpg");
                    file2.createNewFile();
                    String absolutePath2 = file2.getAbsolutePath();
                    j.e(absolutePath2, "getAbsolutePath(...)");
                    verifyActivity.T = absolutePath2;
                    if (j.a(verifyActivity.X, "FRONT")) {
                        String absolutePath3 = file2.getAbsolutePath();
                        j.e(absolutePath3, "getAbsolutePath(...)");
                        verifyActivity.V = absolutePath3;
                    } else {
                        String absolutePath4 = file2.getAbsolutePath();
                        j.e(absolutePath4, "getAbsolutePath(...)");
                        verifyActivity.W = absolutePath4;
                    }
                    Uri c11 = FileProvider.c(verifyActivity, verifyActivity.getApplicationContext().getPackageName() + ".provider", file2);
                    j.e(c11, "getUriForFile(...)");
                    verifyActivity.U = c11;
                    Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
                    intent2.addFlags(1);
                    Uri uri2 = verifyActivity.U;
                    if (uri2 != null) {
                        intent2.putExtra("output", uri2);
                        verifyActivity.Y.a(intent2);
                        return;
                    }
                    j.l("photoUri");
                    throw null;
                }
                View view2 = ((y1) verifyActivity.M()).f8554e;
                j.e(view2, "getRoot(...)");
                new of.a(view2).a("Vui lòng mở cài đặt, Chọn quyền và bật ON mục máy ảnh cho VPA", b.ERROR);
                return;
            case 5:
                ListAwaitAuctionActivity listAwaitAuctionActivity = (ListAwaitAuctionActivity) this.f9439b;
                ActivityResult activityResult = (ActivityResult) obj;
                int i15 = ListAwaitAuctionActivity.Z;
                j.f(listAwaitAuctionActivity, "this$0");
                if (activityResult.f303a == -1) {
                    h hVar = new h();
                    Intent intent3 = activityResult.f304b;
                    if (intent3 != null) {
                        str2 = intent3.getStringExtra("selected_vehicles");
                    } else {
                        str2 = null;
                    }
                    listAwaitAuctionActivity.W = (gf.b) hVar.d(gf.b.class, str2);
                    h hVar2 = new h();
                    Intent intent4 = activityResult.f304b;
                    if (intent4 != null) {
                        str3 = intent4.getStringExtra("selected_provinces");
                    } else {
                        str3 = null;
                    }
                    listAwaitAuctionActivity.X = (gf.b) hVar2.d(gf.b.class, str3);
                    listAwaitAuctionActivity.U().I = new AwaitAuctionRequest((Integer) null, (Integer) null, (String) null, (Integer) null, (Integer) null, (String) null, 63, (e) null);
                    AwaitAuctionRequest awaitAuctionRequest = listAwaitAuctionActivity.U().I;
                    gf.b bVar = listAwaitAuctionActivity.W;
                    if (bVar == null || (b10 = bVar.b()) == null) {
                        num = null;
                    } else {
                        num = Integer.valueOf(Integer.parseInt(b10));
                    }
                    awaitAuctionRequest.setTypeVehicle(num);
                    AwaitAuctionRequest awaitAuctionRequest2 = listAwaitAuctionActivity.U().I;
                    gf.b bVar2 = listAwaitAuctionActivity.X;
                    if (bVar2 != null) {
                        str4 = bVar2.b();
                    } else {
                        str4 = null;
                    }
                    awaitAuctionRequest2.setProvinceId(str4);
                    TextView textView = ((d1) listAwaitAuctionActivity.M()).B;
                    gf.b bVar3 = listAwaitAuctionActivity.X;
                    if (bVar3 != null) {
                        str8 = bVar3.a();
                    }
                    textView.setText(str8);
                    if (listAwaitAuctionActivity.X == null) {
                        ((d1) listAwaitAuctionActivity.M()).B.setVisibility(8);
                    } else {
                        ((d1) listAwaitAuctionActivity.M()).B.setVisibility(0);
                    }
                    listAwaitAuctionActivity.U().g(((d1) listAwaitAuctionActivity.M()).f21022z.getQuery().toString());
                    return;
                }
                return;
            case 6:
                q qVar = (q) this.f9439b;
                ActivityResult activityResult2 = (ActivityResult) obj;
                int i16 = q.f20604x0;
                j.f(qVar, "this$0");
                if (activityResult2.f303a == -1) {
                    qVar.o0().f19709g = new n<>((Object) null);
                    h hVar3 = new h();
                    Intent intent5 = activityResult2.f304b;
                    if (intent5 != null) {
                        str5 = intent5.getStringExtra("selected_vehicles");
                    } else {
                        str5 = null;
                    }
                    qVar.f20614v0 = (gf.b) hVar3.d(gf.b.class, str5);
                    h hVar4 = new h();
                    Intent intent6 = activityResult2.f304b;
                    if (intent6 != null) {
                        str6 = intent6.getStringExtra("selected_provinces");
                    } else {
                        str6 = null;
                    }
                    qVar.f20615w0 = (gf.b) hVar4.d(gf.b.class, str6);
                    if (qVar.f20614v0 != null) {
                        AnnouncementPlanRequest announcementPlanRequest = qVar.o0().H;
                        gf.b bVar4 = qVar.f20614v0;
                        if (bVar4 == null || (b11 = bVar4.b()) == null) {
                            num2 = null;
                        } else {
                            num2 = Integer.valueOf(Integer.parseInt(b11));
                        }
                        announcementPlanRequest.setVehicle(num2);
                    }
                    if (qVar.f20615w0 != null) {
                        AnnouncementPlanRequest announcementPlanRequest2 = qVar.o0().H;
                        gf.b bVar5 = qVar.f20615w0;
                        if (bVar5 != null) {
                            str7 = bVar5.b();
                        } else {
                            str7 = null;
                        }
                        announcementPlanRequest2.setProvince(str7);
                    }
                    qVar.o0().e((String) null);
                    return;
                }
                return;
            default:
                ScopeActivity scopeActivity = (ScopeActivity) this.f9439b;
                ActivityResult activityResult3 = (ActivityResult) obj;
                int i17 = ScopeActivity.R;
                j.f(scopeActivity, "this$0");
                if (activityResult3.f303a == -1) {
                    Intent intent7 = activityResult3.f304b;
                    if (intent7 != null) {
                        str = intent7.getStringExtra("selected_vehicles");
                    } else {
                        str = null;
                    }
                    Intent intent8 = activityResult3.f304b;
                    if (intent8 != null) {
                        str8 = intent8.getStringExtra("selected_provinces");
                    }
                    Type type = new ScopeActivity.a().f10438b;
                    if (str != null) {
                        Object e10 = new h().e(str, new gc.a(type));
                        j.e(e10, "fromJson(...)");
                        ((SearchViewModel) scopeActivity.O.getValue()).f19882d.k((List) e10);
                    }
                    if (str8 != null) {
                        Object e11 = new h().e(str8, new gc.a(type));
                        j.e(e11, "fromJson(...)");
                        ((SearchViewModel) scopeActivity.O.getValue()).f19882d.k((List) e11);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
