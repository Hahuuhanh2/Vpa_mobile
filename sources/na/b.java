package na;

import f0.b0;
import ia.k;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import ka.l;
import la.a;
import pa.e;
import pa.g;
import t1.d;
import v.n1;

/* compiled from: CrashlyticsReportPersistence */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f13542e = Charset.forName("UTF-8");

    /* renamed from: f  reason: collision with root package name */
    public static final int f13543f = 15;

    /* renamed from: g  reason: collision with root package name */
    public static final a f13544g = new a();

    /* renamed from: h  reason: collision with root package name */
    public static final d f13545h = new d(2);

    /* renamed from: i  reason: collision with root package name */
    public static final a f13546i = new a(1);

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f13547a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public final c f13548b;

    /* renamed from: c  reason: collision with root package name */
    public final g f13549c;

    /* renamed from: d  reason: collision with root package name */
    public final k f13550d;

    public b(c cVar, e eVar, k kVar) {
        this.f13548b = cVar;
        this.f13549c = eVar;
        this.f13550d = kVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String d(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f13542e);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        throw th;
    }

    public static void e(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f13542e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c.e(this.f13548b.f13555e.listFiles()));
        arrayList.addAll(c.e(this.f13548b.f13556f.listFiles()));
        d dVar = f13545h;
        Collections.sort(arrayList, dVar);
        List e10 = c.e(this.f13548b.f13554d.listFiles());
        Collections.sort(e10, dVar);
        arrayList.addAll(e10);
        return arrayList;
    }

    public final void c(l lVar, String str, boolean z10) {
        String str2;
        int i10 = ((e) this.f13549c).b().f14111a.f14120a;
        f13544g.getClass();
        ua.d dVar = a.f12898a;
        dVar.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            dVar.a(lVar, stringWriter);
        } catch (IOException unused) {
        }
        String stringWriter2 = stringWriter.toString();
        String format = String.format(Locale.US, "%010d", new Object[]{Integer.valueOf(this.f13547a.getAndIncrement())});
        if (z10) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            e(this.f13548b.b(str, b0.s("event", format, str2)), stringWriter2);
        } catch (IOException unused2) {
        }
        c cVar = this.f13548b;
        a aVar = new a(0);
        cVar.getClass();
        File file = new File(cVar.f13553c, str);
        file.mkdirs();
        List<File> e10 = c.e(file.listFiles(aVar));
        Collections.sort(e10, new n1(1));
        int size = e10.size();
        for (File file2 : e10) {
            if (size > i10) {
                c.d(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
