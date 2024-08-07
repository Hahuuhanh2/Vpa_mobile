package gi;

import al.r0;
import android.view.View;
import bh.t;
import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import com.vpa.daugia.module.profile.ui.activity.ProfileActivity;
import fk.l;
import gf.a;
import ik.d;
import java.util.ArrayList;
import kf.e;
import mg.x0;
import of.b;
import p3.l0;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20387a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ProfileActivity f20388b;

    public /* synthetic */ j0(ProfileActivity profileActivity, int i10) {
        this.f20387a = i10;
        this.f20388b = profileActivity;
    }

    public final void onClick(View view) {
        ContactPersonIdentityCard frontOfIdentityCard;
        ArrayList<a> files;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        switch (this.f20387a) {
            case 0:
                ProfileActivity profileActivity = this.f20388b;
                int i10 = ProfileActivity.f19812b0;
                j.f(profileActivity, "this$0");
                if (((x0) profileActivity.M()).U.b()) {
                    View view2 = ((x0) profileActivity.M()).f8554e;
                    j.e(view2, "getRoot(...)");
                    new of.a(view2).a(((x0) profileActivity.M()).U.getValidatorTypeText(), b.ERROR);
                    ((x0) profileActivity.M()).U.requestFocus();
                } else if (((x0) profileActivity.M()).S.b()) {
                    View view3 = ((x0) profileActivity.M()).f8554e;
                    j.e(view3, "getRoot(...)");
                    new of.a(view3).a("Vui lòng nhập CCCD", b.ERROR);
                    ((x0) profileActivity.M()).S.requestFocus();
                } else if (j.a(e.b(((x0) profileActivity.M()).f21437i0.getText()), "Tỉnh/ thành phố *")) {
                    View view4 = ((x0) profileActivity.M()).f8554e;
                    j.e(view4, "getRoot(...)");
                    new of.a(view4).a("Vui lòng chọn Tỉnh/Thành phố", b.ERROR);
                    ((x0) profileActivity.M()).E.setScrollY((int) ((x0) profileActivity.M()).f21437i0.getY());
                } else if (j.a(e.b(((x0) profileActivity.M()).f21440l0.getText()), "Quận/ huyện *")) {
                    View view5 = ((x0) profileActivity.M()).f8554e;
                    j.e(view5, "getRoot(...)");
                    new of.a(view5).a("Vui lòng chọn Quận/Huyện", b.ERROR);
                    ((x0) profileActivity.M()).E.setScrollY((int) ((x0) profileActivity.M()).f21440l0.getY());
                } else if (j.a(e.b(((x0) profileActivity.M()).f21441m0.getText()), "Phường/ xã *")) {
                    View view6 = ((x0) profileActivity.M()).f8554e;
                    j.e(view6, "getRoot(...)");
                    new of.a(view6).a("Vui lòng chọn Phường/Xã", b.ERROR);
                    ((x0) profileActivity.M()).E.setScrollY((int) ((x0) profileActivity.M()).f21441m0.getY());
                } else if (((x0) profileActivity.M()).T.b()) {
                    View view7 = ((x0) profileActivity.M()).f8554e;
                    j.e(view7, "getRoot(...)");
                    new of.a(view7).a(((x0) profileActivity.M()).T.getValidatorTypeText(), b.ERROR);
                    ((x0) profileActivity.M()).T.requestFocus();
                } else if (((x0) profileActivity.M()).V.b()) {
                    View view8 = ((x0) profileActivity.M()).f8554e;
                    j.e(view8, "getRoot(...)");
                    new of.a(view8).a(((x0) profileActivity.M()).V.getValidatorTypeText(), b.ERROR);
                    ((x0) profileActivity.M()).V.requestFocus();
                } else if (((x0) profileActivity.M()).W.b()) {
                    View view9 = ((x0) profileActivity.M()).f8554e;
                    j.e(view9, "getRoot(...)");
                    new of.a(view9).a(((x0) profileActivity.M()).W.getValidatorTypeText(), b.ERROR);
                    ((x0) profileActivity.M()).W.requestFocus();
                } else {
                    if (e.b(((x0) profileActivity.M()).f21445x.getText()).length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        View view10 = ((x0) profileActivity.M()).f8554e;
                        j.e(view10, "getRoot(...)");
                        new of.a(view10).a("Vui lòng chọn Ngân hàng hoàn tiền", b.ERROR);
                        ((x0) profileActivity.M()).E.setScrollY((int) ((x0) profileActivity.M()).f21445x.getY());
                    } else if (((x0) profileActivity.M()).Q.b()) {
                        View view11 = ((x0) profileActivity.M()).f8554e;
                        j.e(view11, "getRoot(...)");
                        new of.a(view11).a(((x0) profileActivity.M()).Q.getValidatorTypeText(), b.ERROR);
                        ((x0) profileActivity.M()).Q.requestFocus();
                    } else if (((x0) profileActivity.M()).R.b()) {
                        View view12 = ((x0) profileActivity.M()).f8554e;
                        j.e(view12, "getRoot(...)");
                        new of.a(view12).a(((x0) profileActivity.M()).R.getValidatorTypeText(), b.ERROR);
                        ((x0) profileActivity.M()).R.requestFocus();
                    } else {
                        if (e.b(((x0) profileActivity.M()).f21438j0.getText()).length() == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            View view13 = ((x0) profileActivity.M()).f8554e;
                            j.e(view13, "getRoot(...)");
                            new of.a(view13).a("Vui lòng nhập ngày cấp CCCD", b.ERROR);
                            ((x0) profileActivity.M()).E.setScrollY((int) ((x0) profileActivity.M()).f21438j0.getY());
                        } else {
                            if (e.b(((x0) profileActivity.M()).O.getText()).length() == 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                View view14 = ((x0) profileActivity.M()).f8554e;
                                j.e(view14, "getRoot(...)");
                                new of.a(view14).a("Vui lòng chọn nơi cấp CCCD", b.ERROR);
                                ((x0) profileActivity.M()).O.requestFocus();
                            } else {
                                if (profileActivity.X.length() == 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    View view15 = ((x0) profileActivity.M()).f8554e;
                                    j.e(view15, "getRoot(...)");
                                    new of.a(view15).a("Vui lòng chụp ảnh mặt trước CCCD", b.ERROR);
                                } else {
                                    if (profileActivity.Y.length() == 0) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (z14) {
                                        View view16 = ((x0) profileActivity.M()).f8554e;
                                        j.e(view16, "getRoot(...)");
                                        new of.a(view16).a("Vui lòng chụp ảnh mặt sau CCCD", b.ERROR);
                                    } else {
                                        z15 = true;
                                    }
                                }
                            }
                        }
                    }
                }
                if (z15) {
                    LoginViewModel T = profileActivity.T();
                    l0.j0(l0.d0(T), r0.f19085b, new t(T, (d<? super t>) null), 2);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f20388b;
                int i11 = ProfileActivity.f19812b0;
                j.f(profileActivity2, "this$0");
                profileActivity2.Y = "";
                User user = (User) profileActivity2.T().L.f8545b;
                if (!(user == null || (frontOfIdentityCard = user.getFrontOfIdentityCard()) == null || (files = frontOfIdentityCard.getFiles()) == null)) {
                    a aVar = (a) l.K0(files);
                }
                ((x0) profileActivity2.M()).Y.setImageResource(0);
                j.c(view);
                view.setVisibility(8);
                return;
        }
    }
}
