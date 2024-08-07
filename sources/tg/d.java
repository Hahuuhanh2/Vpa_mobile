package tg;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.vpa.daugia.C0531R$drawable;
import com.vpa.daugia.module.auction.data.model.AwaitAuction;
import com.vpa.daugia.module.auction.data.model.OrderWaitAuction;
import com.vpa.daugia.module.auction.data.model.PriceTable;
import com.vpa.daugia.module.cart.data.model.Cart;
import com.vpa.daugia.module.payment.data.model.BankQr;
import com.vpa.daugia.module.profile.ui.activity.ProfileActivity;
import eh.f;
import ek.i;
import gf.b;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ji.a;
import kf.e;
import mg.x0;
import pi.a;
import rk.l;
import sk.j;
import sk.q;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f22972a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f22973b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f22974c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f22972a = i10;
        this.f22973b = obj;
        this.f22974c = obj2;
    }

    public final void onClick(View view) {
        String str;
        String str2;
        switch (this.f22972a) {
            case 0:
                g gVar = (g) this.f22973b;
                OrderWaitAuction orderWaitAuction = (OrderWaitAuction) this.f22974c;
                j.f(gVar, "this$0");
                j.f(orderWaitAuction, "$model");
                Context y10 = gVar.y();
                String plateNumber = orderWaitAuction.getPlateNumber();
                Long auctionToTime = orderWaitAuction.getAuctionToTime();
                j.c(auctionToTime);
                long j10 = (long) 25200000;
                String d10 = e.d(auctionToTime.longValue() + j10);
                Long auctionFromTime = orderWaitAuction.getAuctionFromTime();
                j.c(auctionFromTime);
                String d11 = e.d(auctionFromTime.longValue() + j10);
                Long registerToDate = orderWaitAuction.getRegisterToDate();
                j.c(registerToDate);
                String d12 = e.d(registerToDate.longValue() + j10);
                Long registerFromDate = orderWaitAuction.getRegisterFromDate();
                j.c(registerFromDate);
                new a(y10, new AwaitAuction(d11, (Object) null, d10, (Boolean) null, (String) null, (Long) null, (Object) null, (Object) null, (Object) null, (String) null, (String) null, (Object) null, plateNumber, (Long) null, (Object) null, e.d(registerFromDate.longValue() + j10), d12, (String) null, (Long) null, (Object) null, (Object) null, (Long) null, (Integer) null, 8286202, (sk.e) null)).h();
                return;
            case 1:
                q qVar = (q) this.f22973b;
                PriceTable priceTable = (PriceTable) this.f22974c;
                j.f(qVar, "this$0");
                j.f(priceTable, "$model");
                Context y11 = qVar.y();
                String str3 = priceTable.getKyHieuDiaPhuong() + priceTable.getSeriDangKy() + priceTable.getSoThuTu();
                Long startAuction = priceTable.getStartAuction();
                if (startAuction != null) {
                    String format = ZonedDateTime.ofInstant(Instant.ofEpochMilli(startAuction.longValue()), ZoneId.of("UTC")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"));
                    j.e(format, "format(...)");
                    str = format;
                } else {
                    str = null;
                }
                Long endRegistTime = priceTable.getEndRegistTime();
                if (endRegistTime != null) {
                    String format2 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(endRegistTime.longValue()), ZoneId.of("UTC")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"));
                    j.e(format2, "format(...)");
                    str2 = format2;
                } else {
                    str2 = null;
                }
                new a(y11, new AwaitAuction((String) null, (Object) null, (String) null, (Boolean) null, (String) null, (Long) null, (Object) null, (Object) null, (Object) null, (String) null, (String) null, (Object) null, str3, (Long) null, (Object) null, str2, str, (String) null, (Long) null, (Object) null, (Object) null, (Long) null, (Integer) null, 8286207, (sk.e) null)).h();
                return;
            case 2:
                f fVar = (f) this.f22973b;
                Cart cart = (Cart) this.f22974c;
                j.f(fVar, "this$0");
                j.f(cart, "$model");
                l<? super Cart, i> lVar = fVar.f20068r;
                if (lVar != null) {
                    lVar.invoke(cart);
                    return;
                }
                return;
            case 3:
                ai.j jVar = (ai.j) this.f22973b;
                j.f(jVar, "this$0");
                String qrCode = ((BankQr) this.f22974c).getQrCode();
                if (qrCode == null) {
                    qrCode = "";
                }
                Bitmap m02 = ai.j.m0(jVar, qrCode);
                if (m02 != null) {
                    File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                    externalStoragePublicDirectory.mkdir();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStoragePublicDirectory, System.currentTimeMillis() + ".png"));
                        m02.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        Toast.makeText(jVar.d0(), "Đang tải xuống", 0).show();
                        return;
                    } catch (IOException e10) {
                        e10.printStackTrace();
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) this.f22973b;
                q qVar2 = (q) this.f22974c;
                int i10 = ProfileActivity.f19812b0;
                j.f(profileActivity, "this$0");
                j.f(qVar2, "$isShowUserId");
                LinearLayout linearLayout = ((x0) profileActivity.M()).f21430b0;
                j.e(linearLayout, "lnCitizen");
                e.j(linearLayout);
                if (qVar2.f22930a) {
                    ((x0) profileActivity.M()).B.setCompoundDrawablesWithIntrinsicBounds((int) C0531R$drawable.ic_menu_user, 0, (int) C0531R$drawable.ic_direction_down, 0);
                } else {
                    ((x0) profileActivity.M()).B.setCompoundDrawablesWithIntrinsicBounds((int) C0531R$drawable.ic_menu_user, 0, (int) C0531R$drawable.ic_direction_up, 0);
                }
                qVar2.f22930a = !qVar2.f22930a;
                return;
            default:
                pi.a aVar = (pi.a) this.f22973b;
                a.b bVar = (a.b) this.f22974c;
                j.f(aVar, "this$0");
                j.f(bVar, "$holder");
                b bVar2 = (b) aVar.f22653n.get(bVar.c());
                Iterator it = aVar.f22651e.iterator();
                while (it.hasNext()) {
                    b bVar3 = (b) it.next();
                    if (j.a(bVar3.b(), bVar2.b())) {
                        ArrayList arrayList = aVar.f22651e;
                        if (arrayList != null) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                b bVar4 = (b) it2.next();
                                if (!j.a(bVar4, bVar3)) {
                                    bVar4.f10499c = false;
                                }
                            }
                        }
                        bVar3.f10499c = !bVar3.f10499c;
                        aVar.t(aVar.f22652f);
                        aVar.f();
                        aVar.f22650d.invoke(bVar3);
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }
}
