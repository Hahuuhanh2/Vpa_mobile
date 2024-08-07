package ei;

import al.r0;
import android.content.Intent;
import android.view.View;
import bc.h;
import bh.s;
import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import com.vpa.daugia.module.profile.ui.activity.OrganizationProfileActivity;
import com.vpa.daugia.module.profile.ui.activity.PolicyAndTermActivity;
import com.vpa.daugia.module.profile.ui.activity.ProfileActivity;
import com.vpa.daugia.module.register.ui.ListAwaitAuctionActivity;
import com.vpa.daugia.module.scope.ui.activity.ScopeActivity;
import com.vpa.daugia.module.searching.ui.activity.FilterActivity;
import ik.d;
import java.util.ArrayList;
import ji.c;
import mg.m0;
import mg.x0;
import of.b;
import p3.l0;
import sk.j;
import yk.l;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20069a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f20070b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f20069a = i10;
        this.f20070b = obj;
    }

    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ContactPersonIdentityCard frontOfIdentityCard;
        ArrayList<gf.a> files;
        Class<FilterActivity> cls = FilterActivity.class;
        String str4 = "";
        boolean z14 = false;
        switch (this.f20069a) {
            case 0:
                b bVar = (b) this.f20070b;
                j.f(bVar, "this$0");
                bVar.a();
                return;
            case 1:
                OrganizationProfileActivity organizationProfileActivity = (OrganizationProfileActivity) this.f20070b;
                int i10 = OrganizationProfileActivity.f19804d0;
                j.f(organizationProfileActivity, "this$0");
                if (((m0) organizationProfileActivity.M()).Z.b()) {
                    View view2 = ((m0) organizationProfileActivity.M()).f8554e;
                    j.e(view2, "getRoot(...)");
                    new of.a(view2).a(((m0) organizationProfileActivity.M()).Z.getValidatorTypeText(), b.ERROR);
                    ((m0) organizationProfileActivity.M()).Z.requestFocus();
                } else if (((m0) organizationProfileActivity.M()).f21189g0.b()) {
                    View view3 = ((m0) organizationProfileActivity.M()).f8554e;
                    j.e(view3, "getRoot(...)");
                    new of.a(view3).a(((m0) organizationProfileActivity.M()).f21189g0.getValidatorTypeText(), b.ERROR);
                    ((m0) organizationProfileActivity.M()).f21189g0.requestFocus();
                } else if (((m0) organizationProfileActivity.M()).f21183a0.b()) {
                    View view4 = ((m0) organizationProfileActivity.M()).f8554e;
                    j.e(view4, "getRoot(...)");
                    new of.a(view4).a(((m0) organizationProfileActivity.M()).f21183a0.getValidatorTypeText(), b.ERROR);
                    ((m0) organizationProfileActivity.M()).f21183a0.requestFocus();
                } else if (((m0) organizationProfileActivity.M()).f21188f0.b()) {
                    View view5 = ((m0) organizationProfileActivity.M()).f8554e;
                    j.e(view5, "getRoot(...)");
                    new of.a(view5).a(((m0) organizationProfileActivity.M()).f21188f0.getValidatorTypeText(), b.ERROR);
                    ((m0) organizationProfileActivity.M()).f21188f0.requestFocus();
                } else {
                    CharSequence text = ((m0) organizationProfileActivity.M()).G.getText();
                    if (text == null) {
                        str = str4;
                    } else {
                        str = l.k1(text.toString()).toString();
                    }
                    if (j.a(str, "Tỉnh/ thành phố *")) {
                        View view6 = ((m0) organizationProfileActivity.M()).f8554e;
                        j.e(view6, "getRoot(...)");
                        new of.a(view6).a("Vui lòng chọn Tỉnh/Thành phố", b.ERROR);
                        ((m0) organizationProfileActivity.M()).H.setScrollY((int) ((m0) organizationProfileActivity.M()).f21203u0.getY());
                    } else {
                        CharSequence text2 = ((m0) organizationProfileActivity.M()).J.getText();
                        if (text2 == null) {
                            str2 = str4;
                        } else {
                            str2 = l.k1(text2.toString()).toString();
                        }
                        if (j.a(str2, "Quận/ huyện *")) {
                            View view7 = ((m0) organizationProfileActivity.M()).f8554e;
                            j.e(view7, "getRoot(...)");
                            new of.a(view7).a("Vui lòng chọn Quận/Huyện", b.ERROR);
                            ((m0) organizationProfileActivity.M()).H.setScrollY((int) ((m0) organizationProfileActivity.M()).f21206w0.getY());
                        } else {
                            CharSequence text3 = ((m0) organizationProfileActivity.M()).f21210y0.getText();
                            if (text3 == null) {
                                str3 = str4;
                            } else {
                                str3 = l.k1(text3.toString()).toString();
                            }
                            if (j.a(str3, "Phường/ xã *")) {
                                View view8 = ((m0) organizationProfileActivity.M()).f8554e;
                                j.e(view8, "getRoot(...)");
                                new of.a(view8).a("Vui lòng chọn Phường/Xã", b.ERROR);
                                ((m0) organizationProfileActivity.M()).H.setScrollY((int) ((m0) organizationProfileActivity.M()).f21208x0.getY());
                            } else if (((m0) organizationProfileActivity.M()).W.b()) {
                                View view9 = ((m0) organizationProfileActivity.M()).f8554e;
                                j.e(view9, "getRoot(...)");
                                new of.a(view9).a("Vui lòng nhập địa chỉ chi tiết", b.ERROR);
                                ((m0) organizationProfileActivity.M()).W.requestFocus();
                            } else if (((m0) organizationProfileActivity.M()).f21184b0.b()) {
                                View view10 = ((m0) organizationProfileActivity.M()).f8554e;
                                j.e(view10, "getRoot(...)");
                                new of.a(view10).a(((m0) organizationProfileActivity.M()).f21184b0.getValidatorTypeText(), b.ERROR);
                                ((m0) organizationProfileActivity.M()).f21184b0.requestFocus();
                            } else if (((m0) organizationProfileActivity.M()).f21186d0.b()) {
                                View view11 = ((m0) organizationProfileActivity.M()).f8554e;
                                j.e(view11, "getRoot(...)");
                                new of.a(view11).a(((m0) organizationProfileActivity.M()).f21186d0.getValidatorTypeText(), b.ERROR);
                                ((m0) organizationProfileActivity.M()).f21186d0.requestFocus();
                            } else {
                                CharSequence text4 = ((m0) organizationProfileActivity.M()).f21207x.getText();
                                if (text4 != null) {
                                    str4 = l.k1(text4.toString()).toString();
                                }
                                if (str4.length() == 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    View view12 = ((m0) organizationProfileActivity.M()).f8554e;
                                    j.e(view12, "getRoot(...)");
                                    new of.a(view12).a("Vui lòng chọn ngân hàng", b.ERROR);
                                    ((m0) organizationProfileActivity.M()).H.setScrollY((int) ((m0) organizationProfileActivity.M()).f21207x.getY());
                                } else if (((m0) organizationProfileActivity.M()).X.b()) {
                                    View view13 = ((m0) organizationProfileActivity.M()).f8554e;
                                    j.e(view13, "getRoot(...)");
                                    new of.a(view13).a(((m0) organizationProfileActivity.M()).X.getValidatorTypeText(), b.ERROR);
                                    ((m0) organizationProfileActivity.M()).X.requestFocus();
                                } else if (((m0) organizationProfileActivity.M()).Y.b()) {
                                    View view14 = ((m0) organizationProfileActivity.M()).f8554e;
                                    j.e(view14, "getRoot(...)");
                                    new of.a(view14).a(((m0) organizationProfileActivity.M()).Y.getValidatorTypeText(), b.ERROR);
                                    ((m0) organizationProfileActivity.M()).Y.requestFocus();
                                } else if (((m0) organizationProfileActivity.M()).f21185c0.b()) {
                                    View view15 = ((m0) organizationProfileActivity.M()).f8554e;
                                    j.e(view15, "getRoot(...)");
                                    new of.a(view15).a(((m0) organizationProfileActivity.M()).f21185c0.getValidatorTypeText(), b.ERROR);
                                    ((m0) organizationProfileActivity.M()).f21185c0.requestFocus();
                                } else if (((m0) organizationProfileActivity.M()).f21204v0.getDate() == 0) {
                                    View view16 = ((m0) organizationProfileActivity.M()).f8554e;
                                    j.e(view16, "getRoot(...)");
                                    new of.a(view16).a("Vui lòng nhập ngày cấp", b.ERROR);
                                    ((m0) organizationProfileActivity.M()).H.setScrollY((int) ((m0) organizationProfileActivity.M()).I.getY());
                                } else if (((m0) organizationProfileActivity.M()).f21187e0.b()) {
                                    View view17 = ((m0) organizationProfileActivity.M()).f8554e;
                                    j.e(view17, "getRoot(...)");
                                    new of.a(view17).a(((m0) organizationProfileActivity.M()).f21187e0.getValidatorTypeText(), b.ERROR);
                                    ((m0) organizationProfileActivity.M()).f21187e0.requestFocus();
                                } else {
                                    if (organizationProfileActivity.Z.length() == 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        View view18 = ((m0) organizationProfileActivity.M()).f8554e;
                                        j.e(view18, "getRoot(...)");
                                        new of.a(view18).a("Vui lòng chụp Đăng ký kinh doanh và các giấy tờ liên quan", b.ERROR);
                                    } else {
                                        if (organizationProfileActivity.f19805a0.length() == 0) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (z12) {
                                            View view19 = ((m0) organizationProfileActivity.M()).f8554e;
                                            j.e(view19, "getRoot(...)");
                                            new of.a(view19).a("Vui lòng chụp ảnh mặt trước CCCD", b.ERROR);
                                        } else {
                                            if (organizationProfileActivity.f19806b0.length() == 0) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            if (z13) {
                                                View view20 = ((m0) organizationProfileActivity.M()).f8554e;
                                                j.e(view20, "getRoot(...)");
                                                new of.a(view20).a("Vui lòng chụp ảnh mặt sau CCCD", b.ERROR);
                                            } else {
                                                z14 = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (z14) {
                    LoginViewModel V = organizationProfileActivity.V();
                    l0.j0(l0.d0(V), r0.f19085b, new s(V, (d<? super s>) null), 2);
                    return;
                }
                return;
            case 2:
                PolicyAndTermActivity policyAndTermActivity = (PolicyAndTermActivity) this.f20070b;
                int i11 = PolicyAndTermActivity.P;
                j.f(policyAndTermActivity, "this$0");
                policyAndTermActivity.finish();
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.f20070b;
                int i12 = ProfileActivity.f19812b0;
                j.f(profileActivity, "this$0");
                profileActivity.X = str4;
                User user = (User) profileActivity.T().L.f8545b;
                if (!(user == null || (frontOfIdentityCard = user.getFrontOfIdentityCard()) == null || (files = frontOfIdentityCard.getFiles()) == null)) {
                    gf.a aVar = (gf.a) fk.l.J0(files);
                }
                ((x0) profileActivity.M()).Z.setImageResource(0);
                j.c(view);
                view.setVisibility(8);
                return;
            case 4:
                ListAwaitAuctionActivity listAwaitAuctionActivity = (ListAwaitAuctionActivity) this.f20070b;
                int i13 = ListAwaitAuctionActivity.Z;
                j.f(listAwaitAuctionActivity, "this$0");
                Intent intent = new Intent(listAwaitAuctionActivity, cls);
                intent.putExtra("selected_vehicles", new h().i(listAwaitAuctionActivity.W));
                intent.putExtra("selected_provinces", new h().i(listAwaitAuctionActivity.X));
                listAwaitAuctionActivity.Y.a(intent);
                return;
            case 5:
                c cVar = (c) this.f20070b;
                j.f(cVar, "this$0");
                cVar.a();
                return;
            default:
                ScopeActivity scopeActivity = (ScopeActivity) this.f20070b;
                int i14 = ScopeActivity.R;
                j.f(scopeActivity, "this$0");
                scopeActivity.Q.a(new Intent(scopeActivity, cls));
                return;
        }
    }
}
