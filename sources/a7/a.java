package a7;

import android.util.Log;
import java.util.Locale;
import y6.e;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f107a;

    /* renamed from: b  reason: collision with root package name */
    public final String f108b;

    /* renamed from: c  reason: collision with root package name */
    public final int f109c;

    public a(String str, String... strArr) {
        String str2;
        if (r0 == 0) {
            str2 = "";
        } else {
            StringBuilder p10 = android.support.v4.media.a.p('[');
            for (String str3 : strArr) {
                if (p10.length() > 1) {
                    p10.append(",");
                }
                p10.append(str3);
            }
            p10.append("] ");
            str2 = p10.toString();
        }
        this.f108b = str2;
        this.f107a = str;
        new e(str, (String) null);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f107a, i10)) {
            i10++;
        }
        this.f109c = i10;
    }

    public final String a(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f108b.concat(str);
    }

    public final void b(String str, Object... objArr) {
        boolean z10;
        if (this.f109c <= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a(str, objArr);
        }
    }
}
