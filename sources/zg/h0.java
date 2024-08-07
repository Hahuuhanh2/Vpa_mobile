package zg;

import af.c;
import al.a0;
import al.g0;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.core.content.FileProvider;
import com.vpa.daugia.module.auth.ui.activity.StepThreeOrganizationActivity;
import com.vpa.daugia.module.profile.ui.activity.OrganizationProfileActivity;
import com.vpa.daugia.module.profile.ui.activity.ProfileActivity;
import f.a;
import gi.f0;
import ik.d;
import io.github.g00fy2.quickie.QRScannerActivity;
import java.io.File;
import java.util.UUID;
import mg.x0;
import mg.y3;
import of.b;
import p3.l0;
import rk.l;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h0 implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23670a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f23671b;

    public /* synthetic */ h0(Object obj, int i10) {
        this.f23670a = i10;
        this.f23671b = obj;
    }

    public final void b(Object obj) {
        switch (this.f23670a) {
            case 0:
                StepThreeOrganizationActivity stepThreeOrganizationActivity = (StepThreeOrganizationActivity) this.f23671b;
                Boolean bool = (Boolean) obj;
                int i10 = StepThreeOrganizationActivity.Z;
                j.f(stepThreeOrganizationActivity, "this$0");
                j.c(bool);
                if (bool.booleanValue()) {
                    File file = new File(stepThreeOrganizationActivity.getCacheDir(), UUID.randomUUID().toString() + ".jpg");
                    file.createNewFile();
                    String absolutePath = file.getAbsolutePath();
                    j.e(absolutePath, "getAbsolutePath(...)");
                    stepThreeOrganizationActivity.V = absolutePath;
                    Uri c10 = FileProvider.c(stepThreeOrganizationActivity, stepThreeOrganizationActivity.getApplicationContext().getPackageName() + ".provider", file);
                    j.e(c10, "getUriForFile(...)");
                    stepThreeOrganizationActivity.W = c10;
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    intent.addFlags(1);
                    Uri uri = stepThreeOrganizationActivity.W;
                    if (uri != null) {
                        intent.putExtra("output", uri);
                        stepThreeOrganizationActivity.X.a(intent);
                        return;
                    }
                    j.l("photoUri");
                    throw null;
                }
                View view = ((y3) stepThreeOrganizationActivity.M()).f8554e;
                j.e(view, "getRoot(...)");
                c.a(new c(view), "Vui lòng mở cài đặt, Chọn quyền và bật ON mục máy ảnh cho VPA", 500, stepThreeOrganizationActivity);
                return;
            case 1:
                OrganizationProfileActivity organizationProfileActivity = (OrganizationProfileActivity) this.f23671b;
                int i11 = OrganizationProfileActivity.f19804d0;
                j.f(organizationProfileActivity, "this$0");
                if (((ActivityResult) obj).f303a == -1) {
                    String[] strArr = new String[1];
                    String str = organizationProfileActivity.U;
                    if (str != null) {
                        strArr[0] = str;
                        l0.j0(g0.W(organizationProfileActivity), (a0) null, new f0(j7.a.e(strArr), organizationProfileActivity, (d<? super f0>) null), 3);
                        return;
                    }
                    j.l("imagePath");
                    throw null;
                }
                return;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) this.f23671b;
                Boolean bool2 = (Boolean) obj;
                int i12 = ProfileActivity.f19812b0;
                j.f(profileActivity, "this$0");
                j.c(bool2);
                if (bool2.booleanValue()) {
                    File file2 = new File(profileActivity.getCacheDir(), UUID.randomUUID().toString() + ".jpg");
                    file2.createNewFile();
                    String absolutePath2 = file2.getAbsolutePath();
                    j.e(absolutePath2, "getAbsolutePath(...)");
                    profileActivity.S = absolutePath2;
                    Uri c11 = FileProvider.c(profileActivity, profileActivity.getApplicationContext().getPackageName() + ".provider", file2);
                    j.e(c11, "getUriForFile(...)");
                    profileActivity.T = c11;
                    Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
                    intent2.addFlags(1);
                    Uri uri2 = profileActivity.T;
                    if (uri2 != null) {
                        intent2.putExtra("output", uri2);
                        profileActivity.Z.a(intent2);
                        return;
                    }
                    j.l("photoUri");
                    throw null;
                }
                View view2 = ((x0) profileActivity.M()).f8554e;
                j.e(view2, "getRoot(...)");
                new of.a(view2).a("Vui lòng mở cài đặt, Chọn quyền và bật ON mục máy ảnh cho VPA", b.ERROR);
                return;
            default:
                l lVar = (l) this.f23671b;
                Boolean bool3 = (Boolean) obj;
                int i13 = QRScannerActivity.Q;
                j.f(lVar, "$onResult");
                j.c(bool3);
                lVar.invoke(bool3);
                return;
        }
    }
}
