package k4;

import a.a;
import com.airbnb.lottie.h0;
import com.airbnb.lottie.i;
import com.airbnb.lottie.p;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import n4.c;

/* compiled from: NetworkFetcher */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final d f11973a;

    /* renamed from: b  reason: collision with root package name */
    public final a f11974b;

    public e(d dVar, a aVar) {
        this.f11973a = dVar;
        this.f11974b = aVar;
    }

    public final h0<i> a(String str, InputStream inputStream, String str2, String str3) {
        b bVar;
        h0<i> h0Var;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            c.a();
            bVar = b.ZIP;
            if (str3 == null) {
                h0Var = p.f(new ZipInputStream(inputStream), (String) null);
            } else {
                h0Var = p.f(new ZipInputStream(new FileInputStream(this.f11973a.i(str, inputStream, bVar))), str);
            }
        } else {
            c.a();
            bVar = b.JSON;
            if (str3 == null) {
                h0Var = p.c(inputStream, (String) null);
            } else {
                h0Var = p.c(new FileInputStream(this.f11973a.i(str, inputStream, bVar).getAbsolutePath()), str);
            }
        }
        if (!(str3 == null || h0Var.f4830a == null)) {
            d dVar = this.f11973a;
            dVar.getClass();
            File file = new File(dVar.f(), d.e(str, bVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            c.a();
            if (!renameTo) {
                StringBuilder q10 = android.support.v4.media.a.q("Unable to rename cache file ");
                q10.append(file.getAbsolutePath());
                q10.append(" to ");
                q10.append(file2.getAbsolutePath());
                q10.append(".");
                c.b(q10.toString());
            }
        }
        return h0Var;
    }
}
