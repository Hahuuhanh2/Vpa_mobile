package re;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import ee.b;
import java.util.ArrayList;
import java.util.Iterator;
import ke.a;
import xe.g;
import xe.i;

/* compiled from: LocalMediaLoader */
public final class c extends a {
    public c(Context context, a aVar) {
        super(context, aVar);
    }

    public static LocalMediaFolder f(c cVar, String str, String str2, String str3, ArrayList arrayList) {
        cVar.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LocalMediaFolder localMediaFolder = (LocalMediaFolder) it.next();
            String d10 = localMediaFolder.d();
            if (!TextUtils.isEmpty(d10) && TextUtils.equals(d10, str3)) {
                return localMediaFolder;
            }
        }
        LocalMediaFolder localMediaFolder2 = new LocalMediaFolder();
        localMediaFolder2.f8092b = str3;
        localMediaFolder2.f8093c = str;
        localMediaFolder2.f8094d = str2;
        arrayList.add(localMediaFolder2);
        return localMediaFolder2;
    }

    public final void d(b bVar) {
        we.b.b(new b(this, bVar));
    }

    public final void e(long j10, int i10, int i11, a.a aVar) {
    }

    public final LocalMedia g(Cursor cursor) {
        long j10;
        String str;
        String str2;
        int i10;
        String str3;
        Cursor cursor2 = cursor;
        String[] strArr = a.f14573d;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow(strArr[0]);
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow(strArr[1]);
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow(strArr[2]);
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow(strArr[3]);
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow(strArr[4]);
        int columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow(strArr[5]);
        int columnIndexOrThrow7 = cursor2.getColumnIndexOrThrow(strArr[6]);
        int columnIndexOrThrow8 = cursor2.getColumnIndexOrThrow(strArr[7]);
        int columnIndexOrThrow9 = cursor2.getColumnIndexOrThrow(strArr[8]);
        int columnIndexOrThrow10 = cursor2.getColumnIndexOrThrow(strArr[9]);
        int columnIndexOrThrow11 = cursor2.getColumnIndexOrThrow(strArr[10]);
        int columnIndexOrThrow12 = cursor2.getColumnIndexOrThrow(strArr[11]);
        long j11 = cursor2.getLong(columnIndexOrThrow);
        long j12 = cursor2.getLong(columnIndexOrThrow11);
        String string = cursor2.getString(columnIndexOrThrow3);
        String string2 = cursor2.getString(columnIndexOrThrow2);
        if (i.a()) {
            j10 = j12;
            str = g.f(j11, string);
        } else {
            j10 = j12;
            str = string2;
        }
        if (TextUtils.isEmpty(string)) {
            string = "image/jpeg";
        }
        if (string.endsWith("image/*")) {
            string = g.e(string2);
            str2 = str;
            this.f14576b.getClass();
            if (j7.a.W(string)) {
                return null;
            }
        } else {
            str2 = str;
        }
        if (string.endsWith("image/*")) {
            return null;
        }
        if (!this.f14576b.f12533p && string.startsWith("image/webp")) {
            return null;
        }
        if (!this.f14576b.f12534q && j7.a.V(string)) {
            return null;
        }
        int i11 = cursor2.getInt(columnIndexOrThrow4);
        int i12 = cursor2.getInt(columnIndexOrThrow5);
        int i13 = cursor2.getInt(columnIndexOrThrow12);
        int i14 = i11;
        if (i13 == 90 || i13 == 270) {
            i10 = cursor2.getInt(columnIndexOrThrow5);
            i12 = cursor2.getInt(columnIndexOrThrow4);
        } else {
            i10 = i14;
        }
        long j13 = cursor2.getLong(columnIndexOrThrow6);
        long j14 = cursor2.getLong(columnIndexOrThrow7);
        String string3 = cursor2.getString(columnIndexOrThrow8);
        String string4 = cursor2.getString(columnIndexOrThrow9);
        long j15 = cursor2.getLong(columnIndexOrThrow10);
        if (TextUtils.isEmpty(string4)) {
            try {
                int lastIndexOf = string2.lastIndexOf("/");
                if (lastIndexOf != -1) {
                    str3 = string2.substring(lastIndexOf + 1);
                    string4 = str3;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            str3 = "";
            string4 = str3;
        }
        if (this.f14576b.R && j14 > 0 && j14 < 1024) {
            return null;
        }
        if (j7.a.Z(string) || j7.a.U(string)) {
            this.f14576b.getClass();
            this.f14576b.getClass();
            if (this.f14576b.R && j13 <= 0) {
                return null;
            }
        }
        LocalMedia localMedia = new LocalMedia();
        localMedia.f8072a = j11;
        localMedia.K = j15;
        localMedia.f8073b = str2;
        localMedia.f8074c = string2;
        localMedia.I = string4;
        localMedia.J = string3;
        localMedia.f8081q = j13;
        localMedia.f8087w = this.f14576b.f12517a;
        localMedia.f8086v = string;
        localMedia.f8090z = i10;
        localMedia.A = i12;
        localMedia.G = j14;
        localMedia.L = j10;
        return localMedia;
    }
}
