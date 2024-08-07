package kg;

import com.vpa.daugia.data.model.BaseServiceCacheModel;
import com.vpa.daugia.data.model.ServiceCacheType;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import kf.h;
import sk.j;
import yk.a;

/* compiled from: ServiceCacheHelper.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final a f20809a;

    public c(a aVar) {
        this.f20809a = aVar;
    }

    public final long a(ArrayList arrayList) {
        String str = "PROVINCES" + arrayList.getClass();
        j.f(str, "str");
        MessageDigest instance = MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(a.f23582b);
        j.e(bytes, "this as java.lang.String).getBytes(charset)");
        String format = String.format("%032x", Arrays.copyOf(new Object[]{new BigInteger(1, instance.digest(bytes))}, 1));
        j.e(format, "format(format, *args)");
        int i10 = h.f12560a;
        return this.f20809a.a(new BaseServiceCacheModel(format, arrayList.getClass().toString(), arrayList, ServiceCacheType.GET, (String) null));
    }
}
