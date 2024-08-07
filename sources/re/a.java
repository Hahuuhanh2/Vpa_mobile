package re;

import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import ee.b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: IBridgeMediaLoader */
public abstract class a {

    /* renamed from: c  reason: collision with root package name */
    public static final Uri f14572c = MediaStore.Files.getContentUri("external");

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f14573d = {"_id", "_data", "mime_type", "width", "height", "duration", "_size", "bucket_display_name", "_display_name", "bucket_id", "date_added", "orientation"};

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f14574e = {"_id", "_data", "mime_type", "width", "height", "duration", "_size", "bucket_display_name", "_display_name", "bucket_id", "date_added", "orientation", "COUNT(*) AS count"};

    /* renamed from: a  reason: collision with root package name */
    public final Context f14575a;

    /* renamed from: b  reason: collision with root package name */
    public final ke.a f14576b;

    public a(Context context, ke.a aVar) {
        this.f14575a = context;
        this.f14576b = aVar;
    }

    public final String a() {
        this.f14576b.getClass();
        Locale locale = Locale.CHINA;
        this.f14576b.getClass();
        return String.format(locale, "%d <%s duration and duration <= %d", new Object[]{Long.valueOf(Math.max(0, (long) 0)), "=", Long.MAX_VALUE});
    }

    public final String b() {
        this.f14576b.getClass();
        Locale locale = Locale.CHINA;
        this.f14576b.getClass();
        return String.format(locale, "%d <%s _size and _size <= %d", new Object[]{Long.valueOf(Math.max(0, 0)), "=", Long.MAX_VALUE});
    }

    public final String c() {
        int i10;
        String str;
        HashSet hashSet = new HashSet(this.f14576b.f12540w);
        Iterator it = hashSet.iterator();
        StringBuilder sb2 = new StringBuilder();
        int i11 = -1;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!TextUtils.isEmpty(str2) && ((i10 = this.f14576b.f12517a) != 2 ? i10 != 1 ? i10 != 3 || (!str2.startsWith("video") && !str2.startsWith("image")) : !str2.startsWith("audio") && !str2.startsWith("video") : !str2.startsWith("image") && !str2.startsWith("audio"))) {
                i11++;
                if (i11 == 0) {
                    str = " AND ";
                } else {
                    str = " OR ";
                }
                sb2.append(str);
                sb2.append("mime_type");
                sb2.append("='");
                sb2.append(str2);
                sb2.append("'");
            }
        }
        if (this.f14576b.f12517a != 2 && !hashSet.contains("image/gif")) {
            sb2.append(" AND (mime_type!='image/gif')");
        }
        return sb2.toString();
    }

    public abstract void d(b bVar);

    public abstract void e(long j10, int i10, int i11, a.a aVar);
}
