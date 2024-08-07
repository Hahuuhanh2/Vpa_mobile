package oh;

import android.content.Context;
import android.view.View;
import com.vpa.daugia.module.auction.data.model.AwaitAuction;
import com.vpa.daugia.module.home.data.api.response.Plate;
import ek.i;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import ji.a;
import rk.l;
import sk.e;
import sk.j;
import sk.k;

/* compiled from: PlateAdapter.kt */
public final class f extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f21799a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Plate f21800b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(i iVar, Plate plate) {
        super(1);
        this.f21799a = iVar;
        this.f21800b = plate;
    }

    public final Object invoke(Object obj) {
        String str;
        j.f((View) obj, "it");
        Context y10 = this.f21799a.y();
        String bks = this.f21800b.getBks();
        String auctionDate = this.f21800b.getAuctionDate();
        Long timeEndRegister = this.f21800b.getTimeEndRegister();
        if (timeEndRegister != null) {
            str = ZonedDateTime.ofInstant(Instant.ofEpochMilli(timeEndRegister.longValue()), ZoneId.of("UTC")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"));
            j.e(str, "format(...)");
        } else {
            str = null;
        }
        new a(y10, new AwaitAuction((String) null, (Object) null, auctionDate, (Boolean) null, (String) null, (Long) null, (Object) null, (Object) null, (Object) null, (String) null, (String) null, (Object) null, bks, (Long) null, (Object) null, (String) null, str, (String) null, (Long) null, (Object) null, (Object) null, (Long) null, (Integer) null, 8318971, (e) null)).h();
        return i.f20112a;
    }
}
