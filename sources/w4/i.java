package w4;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* compiled from: MemorySizeCalculator */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f16474a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16475b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16476c;

    /* compiled from: MemorySizeCalculator */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final int f16477e;

        /* renamed from: a  reason: collision with root package name */
        public final Context f16478a;

        /* renamed from: b  reason: collision with root package name */
        public ActivityManager f16479b;

        /* renamed from: c  reason: collision with root package name */
        public b f16480c;

        /* renamed from: d  reason: collision with root package name */
        public float f16481d = ((float) f16477e);

        static {
            int i10;
            if (Build.VERSION.SDK_INT < 26) {
                i10 = 4;
            } else {
                i10 = 1;
            }
            f16477e = i10;
        }

        public a(Context context) {
            this.f16478a = context;
            this.f16479b = (ActivityManager) context.getSystemService("activity");
            this.f16480c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && this.f16479b.isLowRamDevice()) {
                this.f16481d = 0.0f;
            }
        }
    }

    /* compiled from: MemorySizeCalculator */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final DisplayMetrics f16482a;

        public b(DisplayMetrics displayMetrics) {
            this.f16482a = displayMetrics;
        }
    }

    public i(a aVar) {
        int i10;
        Context context = aVar.f16478a;
        if (aVar.f16479b.isLowRamDevice()) {
            i10 = 2097152;
        } else {
            i10 = 4194304;
        }
        this.f16476c = i10;
        ActivityManager activityManager = aVar.f16479b;
        float f10 = 0.4f;
        int round = Math.round(((float) (activityManager.getMemoryClass() * 1024 * 1024)) * (activityManager.isLowRamDevice() ? 0.33f : f10));
        DisplayMetrics displayMetrics = aVar.f16480c.f16482a;
        float f11 = (float) (displayMetrics.widthPixels * displayMetrics.heightPixels * 4);
        int round2 = Math.round(aVar.f16481d * f11);
        int round3 = Math.round(f11 * 2.0f);
        int i11 = round - i10;
        if (round3 + round2 <= i11) {
            this.f16475b = round3;
            this.f16474a = round2;
        } else {
            float f12 = ((float) i11) / (aVar.f16481d + 2.0f);
            this.f16475b = Math.round(2.0f * f12);
            this.f16474a = Math.round(f12 * aVar.f16481d);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(context, (long) this.f16475b);
            Formatter.formatFileSize(context, (long) this.f16474a);
            Formatter.formatFileSize(context, (long) i10);
            Formatter.formatFileSize(context, (long) round);
            aVar.f16479b.getMemoryClass();
            aVar.f16479b.isLowRamDevice();
        }
    }
}
