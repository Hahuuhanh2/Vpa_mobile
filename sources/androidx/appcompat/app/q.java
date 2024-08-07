package androidx.appcompat.app;

import android.content.Context;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: AppLocalesStorageHelper */
public final class q {

    /* compiled from: AppLocalesStorageHelper */
    public static class a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        public final Object f461a = new Object();

        /* renamed from: b  reason: collision with root package name */
        public final ArrayDeque f462b = new ArrayDeque();

        /* renamed from: c  reason: collision with root package name */
        public final Executor f463c;

        /* renamed from: d  reason: collision with root package name */
        public Runnable f464d;

        public a(b bVar) {
            this.f463c = bVar;
        }

        public final void a() {
            synchronized (this.f461a) {
                Runnable runnable = (Runnable) this.f462b.poll();
                this.f464d = runnable;
                if (runnable != null) {
                    this.f463c.execute(runnable);
                }
            }
        }

        public final void execute(Runnable runnable) {
            synchronized (this.f461a) {
                this.f462b.add(new p(0, this, runnable));
                if (this.f464d == null) {
                    a();
                }
            }
        }
    }

    /* compiled from: AppLocalesStorageHelper */
    public static class b implements Executor {
        public final void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static void a(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                newSerializer.setOutput(openFileOutput, (String) null);
                newSerializer.startDocument("UTF-8", Boolean.TRUE);
                newSerializer.startTag((String) null, "locales");
                newSerializer.attribute((String) null, "application_locales", str);
                newSerializer.endTag((String) null, "locales");
                newSerializer.endDocument();
                if (openFileOutput == null) {
                    return;
                }
            } catch (Exception unused) {
                if (openFileOutput == null) {
                    return;
                }
            } catch (Throwable th2) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th2;
            }
            try {
                openFileOutput.close();
            } catch (IOException unused3) {
            }
        } catch (FileNotFoundException unused4) {
            String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", new Object[]{"androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"});
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r2 != null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        if (r2 == null) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(android.content.Context r8) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = ""
            java.io.FileInputStream r2 = r8.openFileInput(r0)     // Catch:{ FileNotFoundException -> 0x0058 }
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch:{ IOException | XmlPullParserException -> 0x004b, all -> 0x0044 }
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch:{ IOException | XmlPullParserException -> 0x004b, all -> 0x0044 }
            int r4 = r3.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x004b, all -> 0x0044 }
        L_0x0015:
            int r5 = r3.next()     // Catch:{ IOException | XmlPullParserException -> 0x004b, all -> 0x0044 }
            r6 = 1
            if (r5 == r6) goto L_0x003e
            r6 = 3
            if (r5 != r6) goto L_0x0025
            int r7 = r3.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x004b, all -> 0x0044 }
            if (r7 <= r4) goto L_0x003e
        L_0x0025:
            if (r5 == r6) goto L_0x0015
            r6 = 4
            if (r5 != r6) goto L_0x002b
            goto L_0x0015
        L_0x002b:
            java.lang.String r5 = r3.getName()     // Catch:{ IOException | XmlPullParserException -> 0x004b, all -> 0x0044 }
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch:{ IOException | XmlPullParserException -> 0x004b, all -> 0x0044 }
            if (r5 == 0) goto L_0x0015
            r4 = 0
            java.lang.String r5 = "application_locales"
            java.lang.String r1 = r3.getAttributeValue(r4, r5)     // Catch:{ IOException | XmlPullParserException -> 0x004b, all -> 0x0044 }
        L_0x003e:
            if (r2 == 0) goto L_0x004e
        L_0x0040:
            r2.close()     // Catch:{ IOException -> 0x004e }
            goto L_0x004e
        L_0x0044:
            r8 = move-exception
            if (r2 == 0) goto L_0x004a
            r2.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            throw r8
        L_0x004b:
            if (r2 == 0) goto L_0x004e
            goto L_0x0040
        L_0x004e:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0055
            goto L_0x0058
        L_0x0055:
            r8.deleteFile(r0)
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.q.b(android.content.Context):java.lang.String");
    }
}
