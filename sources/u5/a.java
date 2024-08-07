package u5;

import al.a0;
import al.g0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.result.ActivityResult;
import androidx.core.content.FileProvider;
import androidx.fragment.app.r;
import com.vpa.daugia.C0540R$string;
import com.vpa.daugia.module.auth.ui.activity.StepOneActivity;
import com.vpa.daugia.module.auth.ui.activity.StepThreePersonalActivity;
import com.vpa.daugia.module.home.data.api.request.AnnouncementPlanRequest;
import com.vpa.daugia.module.home.ui.AnnouncementListActivity;
import com.vpa.daugia.module.home.ui.HomeFragment;
import com.vpa.daugia.module.profile.ui.activity.OrganizationProfileActivity;
import com.vpa.daugia.module.profile.ui.activity.VerifyActivity;
import com.vpa.daugia.module.qr.ScanQrActivity;
import com.vpa.daugia.module.searching.ui.activity.SearchingActivity;
import com.vpa.daugia.module.searching.ui.viewmodel.SearchViewModel;
import ef.n;
import fk.h;
import hi.c;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.UUID;
import kf.e;
import mg.h1;
import mg.m0;
import mg.w3;
import mg.y1;
import n0.l;
import nj.b;
import p3.l0;
import r5.a;
import sk.j;
import u5.d;
import zg.p1;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15281a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15282b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f15281a = i10;
        this.f15282b = obj;
    }

    public final void b(Object obj) {
        String str;
        Object obj2;
        boolean z10;
        boolean z11;
        String str2;
        String str3;
        Integer num;
        String str4;
        String b10;
        String str5 = null;
        switch (this.f15281a) {
            case 0:
                b bVar = (b) this.f15282b;
                Map map = (Map) obj;
                bVar.getClass();
                j.f(map, "permissionsResult");
                String[] strArr = bVar.f15284f0;
                if (strArr != null) {
                    bVar.f15284f0 = null;
                    d.a aVar = (d.a) bVar.f15283e0.get(h.C0(strArr));
                    if (aVar != null) {
                        Context d02 = bVar.d0();
                        ArrayList arrayList = new ArrayList(strArr.length);
                        for (String str6 : strArr) {
                            Object obj3 = map.get(str6);
                            if (obj3 == null) {
                                j.f(str6, "permission");
                                if (k1.a.checkSelfPermission(d02, str6) == 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                obj3 = Boolean.valueOf(z11);
                            }
                            if (((Boolean) obj3).booleanValue()) {
                                obj2 = new a.b(str6);
                            } else {
                                r<?> rVar = bVar.f2461z;
                                if (rVar != null) {
                                    z10 = rVar.M(str6);
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    obj2 = new a.C0187a.b(str6);
                                } else {
                                    obj2 = new a.C0187a.C0188a(str6);
                                }
                            }
                            arrayList.add(obj2);
                        }
                        aVar.a(arrayList);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                StepOneActivity stepOneActivity = (StepOneActivity) this.f15282b;
                Boolean bool = (Boolean) obj;
                int i10 = StepOneActivity.T;
                j.f(stepOneActivity, "this$0");
                j.c(bool);
                if (bool.booleanValue()) {
                    stepOneActivity.R.a(b.C0291b.a(new StepOneActivity.a(stepOneActivity)));
                    return;
                }
                View view = ((w3) stepOneActivity.M()).f8554e;
                j.e(view, "getRoot(...)");
                new of.a(view).a(stepOneActivity.getString(C0540R$string.permission_camera), of.b.ERROR);
                Timer n10 = l.n(df.b.f8966a);
                df.b.f8966a = n10;
                n10.schedule(new StepOneActivity.b(stepOneActivity), 2000);
                return;
            case 2:
                StepThreePersonalActivity stepThreePersonalActivity = (StepThreePersonalActivity) this.f15282b;
                int i11 = StepThreePersonalActivity.f19534a0;
                j.f(stepThreePersonalActivity, "this$0");
                if (((ActivityResult) obj).f303a == -1) {
                    String[] strArr2 = new String[1];
                    String str7 = stepThreePersonalActivity.V;
                    if (str7 != null) {
                        strArr2[0] = str7;
                        l0.j0(g0.W(stepThreePersonalActivity), (a0) null, new p1(j7.a.e(strArr2), stepThreePersonalActivity, (ik.d<? super p1>) null), 3);
                        return;
                    }
                    j.l("imagePath");
                    throw null;
                }
                return;
            case 3:
                AnnouncementListActivity announcementListActivity = (AnnouncementListActivity) this.f15282b;
                ActivityResult activityResult = (ActivityResult) obj;
                int i12 = AnnouncementListActivity.Z;
                j.f(announcementListActivity, "this$0");
                if (activityResult.f303a == -1) {
                    announcementListActivity.U().f19709g = new n<>((Object) null);
                    bc.h hVar = new bc.h();
                    Intent intent = activityResult.f304b;
                    if (intent != null) {
                        str2 = intent.getStringExtra("selected_vehicles");
                    } else {
                        str2 = null;
                    }
                    announcementListActivity.W = (gf.b) hVar.d(gf.b.class, str2);
                    bc.h hVar2 = new bc.h();
                    Intent intent2 = activityResult.f304b;
                    if (intent2 != null) {
                        str3 = intent2.getStringExtra("selected_provinces");
                    } else {
                        str3 = null;
                    }
                    announcementListActivity.X = (gf.b) hVar2.d(gf.b.class, str3);
                    AnnouncementPlanRequest announcementPlanRequest = announcementListActivity.U().H;
                    gf.b bVar2 = announcementListActivity.W;
                    if (bVar2 == null || (b10 = bVar2.b()) == null) {
                        num = null;
                    } else {
                        num = Integer.valueOf(Integer.parseInt(b10));
                    }
                    announcementPlanRequest.setVehicle(num);
                    AnnouncementPlanRequest announcementPlanRequest2 = announcementListActivity.U().H;
                    gf.b bVar3 = announcementListActivity.X;
                    if (bVar3 != null) {
                        str4 = bVar3.b();
                    } else {
                        str4 = null;
                    }
                    announcementPlanRequest2.setProvince(str4);
                    announcementListActivity.U().e((String) null);
                    return;
                }
                return;
            case 4:
                HomeFragment homeFragment = (HomeFragment) this.f15282b;
                int i13 = HomeFragment.f19678z0;
                j.f(homeFragment, "this$0");
                if (((ActivityResult) obj).f303a == -1) {
                    homeFragment.n0().i();
                    return;
                }
                return;
            case 5:
                OrganizationProfileActivity organizationProfileActivity = (OrganizationProfileActivity) this.f15282b;
                Boolean bool2 = (Boolean) obj;
                int i14 = OrganizationProfileActivity.f19804d0;
                j.f(organizationProfileActivity, "this$0");
                j.c(bool2);
                if (bool2.booleanValue()) {
                    File file = new File(organizationProfileActivity.getCacheDir(), UUID.randomUUID().toString() + ".jpg");
                    file.createNewFile();
                    String absolutePath = file.getAbsolutePath();
                    j.e(absolutePath, "getAbsolutePath(...)");
                    organizationProfileActivity.U = absolutePath;
                    if (j.a(organizationProfileActivity.Y, "REGISTER")) {
                        String absolutePath2 = file.getAbsolutePath();
                        j.e(absolutePath2, "getAbsolutePath(...)");
                        organizationProfileActivity.V = absolutePath2;
                    }
                    Uri c10 = FileProvider.c(organizationProfileActivity, organizationProfileActivity.getApplicationContext().getPackageName() + ".provider", file);
                    j.e(c10, "getUriForFile(...)");
                    organizationProfileActivity.W = c10;
                    Intent intent3 = new Intent("android.media.action.IMAGE_CAPTURE");
                    intent3.addFlags(1);
                    Uri uri = organizationProfileActivity.W;
                    if (uri != null) {
                        intent3.putExtra("output", uri);
                        organizationProfileActivity.X.a(intent3);
                        return;
                    }
                    j.l("photoUri");
                    throw null;
                }
                View view2 = ((m0) organizationProfileActivity.M()).f8554e;
                j.e(view2, "getRoot(...)");
                new of.a(view2).a("Vui lòng mở cài đặt, Chọn quyền và bật ON mục máy ảnh cho VPA", of.b.ERROR);
                return;
            case 6:
                VerifyActivity verifyActivity = (VerifyActivity) this.f15282b;
                int i15 = VerifyActivity.f19818a0;
                j.f(verifyActivity, "this$0");
                if (((ActivityResult) obj).f303a != -1) {
                    return;
                }
                if (j.a(verifyActivity.X, "FRONT")) {
                    ImageView imageView = ((y1) verifyActivity.M()).B;
                    j.e(imageView, "ivFront");
                    String str8 = verifyActivity.T;
                    if (str8 != null) {
                        e.g(imageView, str8);
                        return;
                    } else {
                        j.l("imagePath");
                        throw null;
                    }
                } else {
                    ImageView imageView2 = ((y1) verifyActivity.M()).A;
                    j.e(imageView2, "ivBack");
                    String str9 = verifyActivity.T;
                    if (str9 != null) {
                        e.g(imageView2, str9);
                        return;
                    } else {
                        j.l("imagePath");
                        throw null;
                    }
                }
            case 7:
                ScanQrActivity scanQrActivity = (ScanQrActivity) this.f15282b;
                Boolean bool3 = (Boolean) obj;
                int i16 = ScanQrActivity.P;
                j.f(scanQrActivity, "this$0");
                j.c(bool3);
                if (bool3.booleanValue()) {
                    scanQrActivity.O.a(b.C0291b.a(new c(scanQrActivity)));
                    return;
                }
                View view3 = ((h1) scanQrActivity.M()).f8554e;
                j.e(view3, "getRoot(...)");
                new of.a(view3).a(scanQrActivity.getString(C0540R$string.permission_camera), of.b.ERROR);
                Timer n11 = l.n(df.b.f8966a);
                df.b.f8966a = n11;
                n11.schedule(new hi.b(scanQrActivity), 2000);
                return;
            default:
                SearchingActivity searchingActivity = (SearchingActivity) this.f15282b;
                ActivityResult activityResult2 = (ActivityResult) obj;
                int i17 = SearchingActivity.Q;
                j.f(searchingActivity, "this$0");
                if (activityResult2.f303a == -1) {
                    Intent intent4 = activityResult2.f304b;
                    if (intent4 != null) {
                        str = intent4.getStringExtra("selected_vehicles");
                    } else {
                        str = null;
                    }
                    Intent intent5 = activityResult2.f304b;
                    if (intent5 != null) {
                        str5 = intent5.getStringExtra("selected_provinces");
                    }
                    Type type = new SearchingActivity.a().f10438b;
                    if (str != null) {
                        Object e10 = new bc.h().e(str, new gc.a(type));
                        j.e(e10, "fromJson(...)");
                        ((SearchViewModel) searchingActivity.O.getValue()).f19882d.k((List) e10);
                    }
                    if (str5 != null) {
                        Object e11 = new bc.h().e(str5, new gc.a(type));
                        j.e(e11, "fromJson(...)");
                        ((SearchViewModel) searchingActivity.O.getValue()).f19882d.k((List) e11);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
