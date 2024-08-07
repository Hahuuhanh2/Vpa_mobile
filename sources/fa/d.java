package fa;

import android.content.Context;
import android.util.Log;
import ia.h;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DevelopmentPlatformProvider */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10075a;

    /* renamed from: b  reason: collision with root package name */
    public a f10076b = null;

    /* compiled from: DevelopmentPlatformProvider */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f10077a;

        /* renamed from: b  reason: collision with root package name */
        public final String f10078b;

        public a(d dVar) {
            int e10 = h.e(dVar.f10075a, "com.google.firebase.crashlytics.unity_version", "string");
            if (e10 != 0) {
                this.f10077a = "Unity";
                this.f10078b = dVar.f10075a.getResources().getString(e10);
                Log.isLoggable("FirebaseCrashlytics", 2);
                return;
            }
            boolean z10 = false;
            if (dVar.f10075a.getAssets() != null) {
                try {
                    InputStream open = dVar.f10075a.getAssets().open("flutter_assets/NOTICES.Z");
                    if (open != null) {
                        open.close();
                    }
                    z10 = true;
                } catch (IOException unused) {
                }
            }
            if (z10) {
                this.f10077a = "Flutter";
                this.f10078b = null;
                Log.isLoggable("FirebaseCrashlytics", 2);
                return;
            }
            this.f10077a = null;
            this.f10078b = null;
        }
    }

    public d(Context context) {
        this.f10075a = context;
    }
}
