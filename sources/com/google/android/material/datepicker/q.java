package com.google.android.material.datepicker;

import al.r0;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import bh.g;
import bh.o;
import bh.s;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.r;
import com.ots.base.utils.customview.SearchView;
import com.ots.base.utils.customview.bottomnavigationbar.BottomNavigationViewItem;
import com.vpa.daugia.C0541R$style;
import com.vpa.daugia.module.auction.data.model.BiddingPrice;
import com.vpa.daugia.module.auction.data.model.PriceTable;
import com.vpa.daugia.module.auction.ui.activity.AuctionProgressActivity;
import com.vpa.daugia.module.auction.ui.activity.AuctionResultActivity;
import com.vpa.daugia.module.auction.ui.activity.DetailAuctionResultActivity;
import com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity;
import com.vpa.daugia.module.auth.ui.activity.ForgotActivity;
import com.vpa.daugia.module.auth.ui.activity.OtpActivity;
import com.vpa.daugia.module.auth.ui.activity.ReadQrCodeActivity;
import com.vpa.daugia.module.auth.ui.activity.RegisterAccountActivity;
import com.vpa.daugia.module.auth.ui.activity.StepOneActivity;
import com.vpa.daugia.module.auth.ui.activity.StepThreeOrganizationActivity;
import com.vpa.daugia.module.auth.ui.activity.StepThreePersonalActivity;
import com.vpa.daugia.module.auth.ui.activity.StepTwoActivity;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import com.vpa.daugia.module.cart.ui.CartManagerActivity;
import com.vpa.daugia.module.common.ui.activity.MyDocumentActivity;
import com.vpa.daugia.module.common.ui.activity.WebViewActivity;
import com.vpa.daugia.module.history.ui.activity.AuctionHistoryActivity;
import com.vpa.daugia.module.history.ui.activity.AuctionReportActivity;
import com.vpa.daugia.module.home.ui.AnnouncementListActivity;
import com.vpa.daugia.module.notification.ui.NotificationViewModel;
import com.vpa.daugia.module.notification.ui.activity.NotificationManagerActivity;
import com.vpa.daugia.module.payment.ui.activity.PaymentActivity;
import com.vpa.daugia.ui.MainActivity;
import ek.i;
import ik.d;
import java.util.ArrayList;
import jf.a;
import jf.b;
import jf.c;
import mg.a2;
import mg.b0;
import mg.c4;
import mg.k;
import mg.w3;
import p3.l0;
import sk.j;
import vg.e;
import vg.f;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6188a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6189b;

    public /* synthetic */ q(Object obj, int i10) {
        this.f6188a = i10;
        this.f6189b = obj;
    }

    public final void onClick(View view) {
        ArrayList<BiddingPrice> arrayList;
        boolean z10;
        String str = "";
        int i10 = 0;
        switch (this.f6188a) {
            case 0:
                r rVar = (r) this.f6189b;
                rVar.U0.setEnabled(rVar.o0().o0());
                rVar.S0.toggle();
                if (rVar.H0 != 1) {
                    i10 = 1;
                }
                rVar.H0 = i10;
                rVar.t0(rVar.S0);
                rVar.s0();
                return;
            case 1:
                SearchView searchView = (SearchView) this.f6189b;
                int i11 = SearchView.f8262b;
                j.f(searchView, "this$0");
                searchView.getBinding().f21503w.setText(str);
                j.c(view);
                view.setVisibility(8);
                return;
            case 2:
                BottomNavigationViewItem bottomNavigationViewItem = (BottomNavigationViewItem) this.f6189b;
                int i12 = BottomNavigationViewItem.f8288e;
                j.f(bottomNavigationViewItem, "this$0");
                bottomNavigationViewItem.getClass();
                return;
            case 3:
                a aVar = (a) this.f6189b;
                int i13 = a.f11885w0;
                j.f(aVar, "this$0");
                a.C0130a aVar2 = aVar.f11887v0;
                if (aVar2 != null) {
                    aVar2.a("ACTION_CAMERA");
                    aVar.o0();
                    return;
                }
                j.l("onActionDone");
                throw null;
            case 4:
                b bVar = (b) this.f6189b;
                j.f(bVar, "this$0");
                c cVar = bVar.f11889j;
                if (cVar != null) {
                    cVar.a(true);
                    bVar.a();
                    return;
                }
                j.l("onActionDone");
                throw null;
            case 5:
                AuctionProgressActivity auctionProgressActivity = (AuctionProgressActivity) this.f6189b;
                int i14 = AuctionProgressActivity.V;
                j.f(auctionProgressActivity, "this$0");
                auctionProgressActivity.finish();
                return;
            case 6:
                AuctionResultActivity auctionResultActivity = (AuctionResultActivity) this.f6189b;
                int i15 = AuctionResultActivity.U;
                j.f(auctionResultActivity, "this$0");
                auctionResultActivity.finish();
                return;
            case 7:
                DetailAuctionResultActivity detailAuctionResultActivity = (DetailAuctionResultActivity) this.f6189b;
                int i16 = DetailAuctionResultActivity.U;
                j.f(detailAuctionResultActivity, "this$0");
                detailAuctionResultActivity.finish();
                return;
            case 8:
                SessionAuctionActivity sessionAuctionActivity = (SessionAuctionActivity) this.f6189b;
                int i17 = SessionAuctionActivity.X;
                j.f(sessionAuctionActivity, "this$0");
                PriceTable d10 = sessionAuctionActivity.U().f19443r.d();
                if (d10 == null || (arrayList = d10.getPrices()) == null) {
                    arrayList = new ArrayList<>();
                }
                lg.b bVar2 = sessionAuctionActivity.S;
                if (bVar2 != null) {
                    new e(sessionAuctionActivity, arrayList, bVar2).h();
                    return;
                } else {
                    j.l("sharedPrefsHelper");
                    throw null;
                }
            case 9:
                f fVar = (f) this.f6189b;
                j.f(fVar, "this$0");
                fVar.a();
                return;
            case 10:
                ForgotActivity forgotActivity = (ForgotActivity) this.f6189b;
                int i18 = ForgotActivity.S;
                j.f(forgotActivity, "this$0");
                if (((b0) forgotActivity.M()).f20966y.b()) {
                    View view2 = ((b0) forgotActivity.M()).f8554e;
                    j.e(view2, "getRoot(...)");
                    new of.a(view2).a(((b0) forgotActivity.M()).f20966y.getValidatorTypeText(), of.b.ERROR);
                    ((b0) forgotActivity.M()).f20966y.requestFocus();
                } else if (((b0) forgotActivity.M()).E.isChecked() && ((b0) forgotActivity.M()).B.b()) {
                    View view3 = ((b0) forgotActivity.M()).f8554e;
                    j.e(view3, "getRoot(...)");
                    new of.a(view3).a(((b0) forgotActivity.M()).B.getValidatorTypeText(), of.b.ERROR);
                    ((b0) forgotActivity.M()).f20967z.requestFocus();
                } else if (!((b0) forgotActivity.M()).F.isChecked() || !((b0) forgotActivity.M()).C.b()) {
                    i10 = 1;
                } else {
                    View view4 = ((b0) forgotActivity.M()).f8554e;
                    j.e(view4, "getRoot(...)");
                    new of.a(view4).a(((b0) forgotActivity.M()).C.getValidatorTypeText(), of.b.ERROR);
                    ((b0) forgotActivity.M()).C.requestFocus();
                }
                if (i10 == 0) {
                    return;
                }
                if (((b0) forgotActivity.M()).E.isChecked()) {
                    LoginViewModel U = forgotActivity.U();
                    l0.j0(l0.d0(U), r0.f19085b, new bh.f(U, (d<? super bh.f>) null), 2);
                    return;
                }
                LoginViewModel U2 = forgotActivity.U();
                l0.j0(l0.d0(U2), r0.f19085b, new g(U2, (d<? super g>) null), 2);
                return;
            case 11:
                OtpActivity otpActivity = (OtpActivity) this.f6189b;
                int i19 = OtpActivity.V;
                j.f(otpActivity, "this$0");
                otpActivity.finish();
                return;
            case 12:
                ReadQrCodeActivity readQrCodeActivity = (ReadQrCodeActivity) this.f6189b;
                int i20 = ReadQrCodeActivity.R;
                j.f(readQrCodeActivity, "this$0");
                readQrCodeActivity.finish();
                return;
            case 13:
                StepOneActivity stepOneActivity = (StepOneActivity) this.f6189b;
                int i21 = StepOneActivity.T;
                j.f(stepOneActivity, "this$0");
                if (((w3) stepOneActivity.M()).f21417z.isChecked()) {
                    stepOneActivity.S.a("android.permission.CAMERA");
                    return;
                }
                Intent intent = new Intent(stepOneActivity, StepTwoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString(RegisterAccountActivity.T, RegisterAccountActivity.U);
                intent.putExtras(bundle);
                stepOneActivity.startActivity(intent);
                return;
            case 14:
                StepThreeOrganizationActivity stepThreeOrganizationActivity = (StepThreeOrganizationActivity) this.f6189b;
                int i22 = StepThreeOrganizationActivity.Z;
                j.f(stepThreeOrganizationActivity, "this$0");
                LoginViewModel T = stepThreeOrganizationActivity.T();
                l0.j0(l0.d0(T), r0.f19085b, new s(T, (d<? super s>) null), 2);
                return;
            case 15:
                StepThreePersonalActivity stepThreePersonalActivity = (StepThreePersonalActivity) this.f6189b;
                int i23 = StepThreePersonalActivity.f19534a0;
                j.f(stepThreePersonalActivity, "this$0");
                stepThreePersonalActivity.startActivity(new Intent(stepThreePersonalActivity, MainActivity.class));
                stepThreePersonalActivity.finish();
                return;
            case 16:
                StepTwoActivity stepTwoActivity = (StepTwoActivity) this.f6189b;
                int i24 = StepTwoActivity.V;
                j.f(stepTwoActivity, "this$0");
                Editable text = ((c4) stepTwoActivity.M()).f21010y.C.getText();
                if (text != null) {
                    str = android.support.v4.media.a.j(text);
                }
                if (str.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    View view5 = ((c4) stepTwoActivity.M()).f8554e;
                    j.e(view5, "getRoot(...)");
                    new of.a(view5).a("Vui lòng nhập số điện thoại", of.b.ERROR);
                } else {
                    i10 = 1;
                }
                if (i10 != 0) {
                    LoginViewModel X = stepTwoActivity.X();
                    l0.j0(l0.d0(X), r0.f19085b, new o(X, (d<? super o>) null), 2);
                    return;
                }
                return;
            case 17:
                CartManagerActivity cartManagerActivity = (CartManagerActivity) this.f6189b;
                int i25 = CartManagerActivity.W;
                j.f(cartManagerActivity, "this$0");
                cartManagerActivity.finish();
                return;
            case 18:
                fh.a aVar3 = (fh.a) this.f6189b;
                j.f(aVar3, "this$0");
                aVar3.a();
                return;
            case 19:
                MyDocumentActivity myDocumentActivity = (MyDocumentActivity) this.f6189b;
                int i26 = MyDocumentActivity.V;
                j.f(myDocumentActivity, "this$0");
                myDocumentActivity.S = null;
                CalendarConstraints.b bVar3 = new CalendarConstraints.b();
                bVar3.f6088e = DateValidatorPointBackward.a();
                CalendarConstraints a10 = bVar3.a();
                r.d dVar = new r.d(new RangeDateSelector());
                dVar.f6201c = a10;
                dVar.f6203e = "Chọn thời gian";
                dVar.f6202d = 0;
                dVar.f6205g = "Trở về";
                dVar.f6204f = "Chọn";
                dVar.f6200b = C0541R$style.CustomMaterialDatePicker;
                r a11 = dVar.a();
                a11.f6190u0.add(new sg.e(1, new ih.g(myDocumentActivity)));
                a11.n0(myDocumentActivity.G(), (String) null);
                return;
            case 20:
                WebViewActivity webViewActivity = (WebViewActivity) this.f6189b;
                int i27 = WebViewActivity.O;
                j.f(webViewActivity, "this$0");
                if (((a2) webViewActivity.M()).A.canGoBack()) {
                    ((a2) webViewActivity.M()).A.goBack();
                    return;
                } else {
                    webViewActivity.finish();
                    return;
                }
            case 21:
                AuctionHistoryActivity auctionHistoryActivity = (AuctionHistoryActivity) this.f6189b;
                int i28 = AuctionHistoryActivity.U;
                j.f(auctionHistoryActivity, "this$0");
                auctionHistoryActivity.S = null;
                CalendarConstraints.b bVar4 = new CalendarConstraints.b();
                bVar4.f6088e = DateValidatorPointBackward.a();
                CalendarConstraints a12 = bVar4.a();
                r.d dVar2 = new r.d(new RangeDateSelector());
                dVar2.f6201c = a12;
                dVar2.f6203e = "Chọn thời gian";
                dVar2.f6202d = 0;
                dVar2.f6205g = "Trở về";
                dVar2.f6204f = "Chọn";
                dVar2.f6200b = C0541R$style.CustomMaterialDatePicker;
                r a13 = dVar2.a();
                a13.f6190u0.add(new sg.e(2, new kh.f(auctionHistoryActivity)));
                a13.n0(auctionHistoryActivity.G(), (String) null);
                return;
            case 22:
                AuctionReportActivity auctionReportActivity = (AuctionReportActivity) this.f6189b;
                int i29 = AuctionReportActivity.V;
                j.f(auctionReportActivity, "this$0");
                if (k1.a.checkSelfPermission(auctionReportActivity, "android.permission.READ_EXTERNAL_STORAGE") == 0 && k1.a.checkSelfPermission(auctionReportActivity, "android.permission.READ_MEDIA_IMAGES") == 0 && k1.a.checkSelfPermission(auctionReportActivity, "android.permission.READ_MEDIA_VIDEO") == 0 && k1.a.checkSelfPermission(auctionReportActivity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    View view6 = ((k) auctionReportActivity.M()).f8554e;
                    j.e(view6, "getRoot(...)");
                    String str2 = j7.a.f11713u + "web-api/user-bidding/api/document/user/download?documentId=" + auctionReportActivity.S + "&timestamp=" + System.currentTimeMillis();
                    lg.b bVar5 = auctionReportActivity.U;
                    if (bVar5 != null) {
                        ze.b.m(view6, str2, bVar5.a());
                        return;
                    } else {
                        j.l("sharedPrefsHelper");
                        throw null;
                    }
                } else if (Build.VERSION.SDK_INT >= 33) {
                    i1.a.a(auctionReportActivity, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.WRITE_EXTERNAL_STORAGE"}, auctionReportActivity.T);
                    return;
                } else {
                    i1.a.a(auctionReportActivity, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, auctionReportActivity.T);
                    return;
                }
            case 23:
                AnnouncementListActivity announcementListActivity = (AnnouncementListActivity) this.f6189b;
                int i30 = AnnouncementListActivity.Z;
                j.f(announcementListActivity, "this$0");
                announcementListActivity.finish();
                return;
            case 24:
                ph.a aVar4 = (ph.a) this.f6189b;
                j.f(aVar4, "this$0");
                aVar4.a();
                return;
            case 25:
                ph.b bVar6 = (ph.b) this.f6189b;
                int i31 = ph.b.f22643p;
                j.f(bVar6, "this$0");
                bVar6.dismiss();
                rk.a<i> aVar5 = bVar6.f22646o;
                if (aVar5 != null) {
                    aVar5.invoke();
                    return;
                }
                return;
            case 26:
                th.a aVar6 = (th.a) this.f6189b;
                j.f(aVar6, "this$0");
                aVar6.a();
                return;
            case 27:
                th.c cVar2 = (th.c) this.f6189b;
                j.f(cVar2, "this$0");
                th.d dVar3 = cVar2.f23015j;
                if (dVar3 != null) {
                    dVar3.a(true);
                    cVar2.a();
                    return;
                }
                j.l("onActionDone");
                throw null;
            case 28:
                NotificationManagerActivity notificationManagerActivity = (NotificationManagerActivity) this.f6189b;
                int i32 = NotificationManagerActivity.T;
                j.f(notificationManagerActivity, "this$0");
                NotificationViewModel U3 = notificationManagerActivity.U();
                l0.j0(l0.d0(U3), r0.f19085b, new vh.a(U3, (d<? super vh.a>) null), 2);
                return;
            default:
                PaymentActivity paymentActivity = (PaymentActivity) this.f6189b;
                String str3 = PaymentActivity.S;
                j.f(paymentActivity, "this$0");
                paymentActivity.finish();
                return;
        }
    }
}
