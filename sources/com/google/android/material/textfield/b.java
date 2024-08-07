package com.google.android.material.textfield;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.google.android.material.datepicker.RangeDateSelector;
import com.google.android.material.datepicker.r;
import com.kizitonwose.calendar.view.CalendarView;
import com.ots.base.utils.customview.BackButton;
import com.ots.base.utils.customview.bottomnavigationbar.BottomNavigationFloatingButton;
import com.ots.core.utils.customview.a;
import com.vpa.daugia.C0541R$style;
import com.vpa.daugia.module.auction.ui.activity.AuctionResultActivity;
import com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity;
import com.vpa.daugia.module.auth.ui.activity.RegisterAccountActivity;
import com.vpa.daugia.module.common.ui.activity.MyDocumentActivity;
import com.vpa.daugia.module.history.ui.activity.AuctionHistoryActivity;
import com.vpa.daugia.module.home.ui.HomeFragment;
import com.vpa.daugia.module.menu.ui.activity.SettingActivity;
import com.vpa.daugia.module.menu.ui.fragment.MenuFragment;
import com.vpa.daugia.module.notification.ui.activity.NotificationManagerActivity;
import com.vpa.daugia.module.payment.ui.activity.RegulationActivity;
import com.vpa.daugia.module.register.ui.ListAwaitAuctionActivity;
import ek.i;
import j$.time.YearMonth;
import java.util.ArrayList;
import java.util.Iterator;
import jf.c;
import jf.d;
import mg.e4;
import mg.o4;
import p002if.e;
import sg.k;
import sk.j;
import yg.g;
import yk.l;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7017a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f7018b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f7017a = i10;
        this.f7018b = obj;
    }

    public final void onClick(View view) {
        String str;
        YearMonth yearMonth;
        int i10 = 0;
        String str2 = "";
        switch (this.f7017a) {
            case 0:
                e eVar = (e) this.f7018b;
                EditText editText = eVar.f7025i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    eVar.q();
                    return;
                }
                return;
            case 1:
                ((k) this.f7018b).u();
                return;
            case 2:
                s sVar = (s) this.f7018b;
                EditText editText2 = sVar.f7111f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = sVar.f7111f;
                    if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        i10 = 1;
                    }
                    if (i10 != 0) {
                        sVar.f7111f.setTransformationMethod((TransformationMethod) null);
                    } else {
                        sVar.f7111f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        sVar.f7111f.setSelection(selectionEnd);
                    }
                    sVar.q();
                    return;
                }
                return;
            case 3:
                o4 o4Var = (o4) this.f7018b;
                j.f(o4Var, "$binding");
                CheckBox checkBox = o4Var.f21272w;
                checkBox.setChecked(true ^ checkBox.isChecked());
                o4Var.f21274y.setSelected(o4Var.f21272w.isChecked());
                return;
            case 4:
                Context context = (Context) this.f7018b;
                int i11 = BackButton.f8248a;
                j.f(context, "$context");
                ((Activity) context).finish();
                return;
            case 5:
                BottomNavigationFloatingButton.a((BottomNavigationFloatingButton) this.f7018b);
                return;
            case 6:
                jf.b bVar = (jf.b) this.f7018b;
                j.f(bVar, "this$0");
                c cVar = bVar.f11889j;
                if (cVar != null) {
                    cVar.a(false);
                    bVar.a();
                    return;
                }
                j.l("onActionDone");
                throw null;
            case 7:
                d dVar = (d) this.f7018b;
                int i12 = d.J0;
                j.f(dVar, "this$0");
                dVar.o0();
                return;
            case 8:
                com.google.android.material.bottomsheet.b bVar2 = (com.google.android.material.bottomsheet.b) this.f7018b;
                j.f(bVar2, "$dialog");
                if (bVar2.isShowing()) {
                    bVar2.dismiss();
                    return;
                }
                return;
            case 9:
                a aVar = (a) this.f7018b;
                int i13 = a.F0;
                j.f(aVar, "this$0");
                ArrayList arrayList = new ArrayList();
                for (Model add : ((e) aVar.D0.getValue()).f9444f) {
                    arrayList.add(add);
                }
                a.C0083a aVar2 = aVar.E0;
                if (aVar2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (((gf.b) next).f10499c) {
                            arrayList2.add(next);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        int i14 = i10 + 1;
                        if (i10 >= 0) {
                            gf.b bVar3 = (gf.b) next2;
                            if (bVar3.f10499c) {
                                StringBuilder q10 = android.support.v4.media.a.q(str2);
                                if (i10 != arrayList2.size() - 1) {
                                    str = bVar3.a() + "; ";
                                } else {
                                    str = bVar3.a();
                                }
                                q10.append(str);
                                str2 = q10.toString();
                            }
                            i10 = i14;
                        } else {
                            j7.a.x0();
                            throw null;
                        }
                    }
                    aVar2.a(arrayList, str2);
                    aVar.o0();
                    return;
                }
                j.l("onActionDone");
                throw null;
            case 10:
                AuctionResultActivity auctionResultActivity = (AuctionResultActivity) this.f7018b;
                int i15 = AuctionResultActivity.U;
                j.f(auctionResultActivity, "this$0");
                auctionResultActivity.S = null;
                CalendarConstraints.b bVar4 = new CalendarConstraints.b();
                bVar4.f6088e = DateValidatorPointBackward.a();
                CalendarConstraints a10 = bVar4.a();
                r.d dVar2 = new r.d(new RangeDateSelector());
                dVar2.f6201c = a10;
                dVar2.f6203e = "Chọn thời gian";
                dVar2.f6202d = 0;
                dVar2.f6205g = "Trở về";
                dVar2.f6204f = "Chọn";
                dVar2.f6200b = C0541R$style.CustomMaterialDatePicker;
                r a11 = dVar2.a();
                a11.f6190u0.add(new sg.e(0, new k(auctionResultActivity)));
                a11.n0(auctionResultActivity.G(), (String) null);
                return;
            case 11:
                SessionAuctionActivity sessionAuctionActivity = (SessionAuctionActivity) this.f7018b;
                int i16 = SessionAuctionActivity.X;
                j.f(sessionAuctionActivity, "this$0");
                sessionAuctionActivity.finish();
                return;
            case 12:
                vg.e eVar2 = (vg.e) this.f7018b;
                j.f(eVar2, "this$0");
                eVar2.a();
                return;
            case 13:
                g gVar = (g) this.f7018b;
                int i17 = g.f23548q0;
                j.f(gVar, "this$0");
                gVar.m0();
                return;
            case 14:
                RegisterAccountActivity registerAccountActivity = (RegisterAccountActivity) this.f7018b;
                String str3 = RegisterAccountActivity.T;
                j.f(registerAccountActivity, "this$0");
                registerAccountActivity.finish();
                return;
            case 15:
                ah.a aVar3 = (ah.a) this.f7018b;
                j.f(aVar3, "this$0");
                ah.b bVar5 = aVar3.f18957j;
                if (bVar5 != null) {
                    bVar5.a();
                    aVar3.a();
                    return;
                }
                j.l("onActionDone");
                throw null;
            case 16:
                ah.d dVar3 = (ah.d) this.f7018b;
                j.f(dVar3, "this$0");
                zd.b t02 = dVar3.f18960i.f21334x.t0();
                if (t02 != null && (yearMonth = t02.f17980a) != null) {
                    CalendarView calendarView = dVar3.f18960i.f21334x;
                    YearMonth minusMonths = yearMonth.minusMonths(1);
                    j.e(minusMonths, "minusMonths(...)");
                    calendarView.y0(minusMonths);
                    return;
                }
                return;
            case 17:
                fh.c cVar2 = (fh.c) this.f7018b;
                j.f(cVar2, "this$0");
                cVar2.a();
                return;
            case 18:
                MyDocumentActivity myDocumentActivity = (MyDocumentActivity) this.f7018b;
                int i18 = MyDocumentActivity.V;
                j.f(myDocumentActivity, "this$0");
                myDocumentActivity.finish();
                return;
            case 19:
                AuctionHistoryActivity auctionHistoryActivity = (AuctionHistoryActivity) this.f7018b;
                int i19 = AuctionHistoryActivity.U;
                j.f(auctionHistoryActivity, "this$0");
                auctionHistoryActivity.finish();
                return;
            case 20:
                HomeFragment homeFragment = (HomeFragment) this.f7018b;
                int i20 = HomeFragment.f19678z0;
                j.f(homeFragment, "this$0");
                homeFragment.h0(new Intent(homeFragment.d0(), ListAwaitAuctionActivity.class));
                return;
            case 21:
                ph.b bVar6 = (ph.b) this.f7018b;
                int i21 = ph.b.f22643p;
                j.f(bVar6, "this$0");
                bVar6.dismiss();
                rk.a<i> aVar4 = bVar6.f22645n;
                if (aVar4 != null) {
                    aVar4.invoke();
                    return;
                }
                return;
            case 22:
                ph.c cVar3 = (ph.c) this.f7018b;
                int i22 = ph.c.f22647o;
                j.f(cVar3, "this$0");
                cVar3.dismiss();
                rk.a<i> aVar5 = cVar3.f22649n;
                if (aVar5 != null) {
                    aVar5.invoke();
                    return;
                }
                return;
            case 23:
                SettingActivity settingActivity = (SettingActivity) this.f7018b;
                int i23 = SettingActivity.U;
                j.f(settingActivity, "this$0");
                settingActivity.finish();
                return;
            case 24:
                th.a aVar6 = (th.a) this.f7018b;
                j.f(aVar6, "this$0");
                th.b bVar7 = aVar6.f23013j;
                if (bVar7 != null) {
                    bVar7.a(false);
                    aVar6.a();
                    return;
                }
                j.l("onActionDone");
                throw null;
            case 25:
                th.c cVar4 = (th.c) this.f7018b;
                j.f(cVar4, "this$0");
                th.d dVar4 = cVar4.f23015j;
                if (dVar4 != null) {
                    dVar4.a(false);
                    cVar4.a();
                    return;
                }
                j.l("onActionDone");
                throw null;
            case 26:
                MenuFragment menuFragment = (MenuFragment) this.f7018b;
                int i24 = MenuFragment.f19755o0;
                j.f(menuFragment, "this$0");
                menuFragment.h0(new Intent(menuFragment.d0(), AuctionHistoryActivity.class));
                return;
            case 27:
                NotificationManagerActivity notificationManagerActivity = (NotificationManagerActivity) this.f7018b;
                int i25 = NotificationManagerActivity.T;
                j.f(notificationManagerActivity, "this$0");
                notificationManagerActivity.finish();
                return;
            case 28:
                RegulationActivity regulationActivity = (RegulationActivity) this.f7018b;
                int i26 = RegulationActivity.O;
                j.f(regulationActivity, "this$0");
                regulationActivity.finish();
                return;
            default:
                ai.j jVar = (ai.j) this.f7018b;
                int i27 = ai.j.f18980n0;
                j.f(jVar, "this$0");
                FragmentActivity c02 = jVar.c0();
                CharSequence text2 = ((e4) jVar.i0()).C.getText();
                if (text2 != null) {
                    str2 = l.k1(text2.toString()).toString();
                }
                ai.e eVar3 = new ai.e(jVar);
                Object systemService = c02.getSystemService("clipboard");
                j.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("\"text\"", str2));
                eVar3.invoke("Đã lưu vào bộ nhớ tạm");
                return;
        }
    }
}
