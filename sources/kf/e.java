package kf;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.support.v4.media.a;
import android.text.Editable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import b5.h;
import b5.w;
import com.bumptech.glide.b;
import com.bumptech.glide.k;
import com.ots.core.R$dimen;
import com.ots.core.R$drawable;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import k5.g;
import s4.f;
import sk.j;
import yk.l;

/* compiled from: BaseAppUtils.kt */
public class e {
    public static String a(Editable editable) {
        if (editable == null) {
            return "";
        }
        return a.j(editable);
    }

    public static String b(CharSequence charSequence) {
        if (charSequence == null) {
            return "";
        }
        return l.k1(charSequence.toString()).toString();
    }

    public static void c(View view, rk.l lVar) {
        view.setOnClickListener(new b(500, view, lVar));
    }

    public static String d(long j10) {
        String format = ZonedDateTime.ofInstant(Instant.ofEpochMilli(j10), ZoneId.of("UTC")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"));
        j.e(format, "format(...)");
        return format;
    }

    public static String e(String str) {
        try {
            if (l.N0(str, "T")) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm dd/MM/yyyy", Locale.getDefault());
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                String format = simpleDateFormat2.format(simpleDateFormat.parse(str));
                j.e(format, "format(...)");
                return format;
            }
            String format2 = LocalDateTime.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S")).format(DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy"));
            j.e(format2, "format(...)");
            return format2;
        } catch (Exception e10) {
            e10.printStackTrace();
            String format3 = LocalDateTime.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S")).format(DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy"));
            j.c(format3);
            return format3;
        }
    }

    public static int f(int i10, View view) {
        j.f(view, "<this>");
        Context context = view.getContext();
        j.e(context, "getContext(...)");
        return (int) TypedValue.applyDimension(1, (float) i10, context.getResources().getDisplayMetrics());
    }

    public static void g(ImageView imageView, Object obj) {
        com.bumptech.glide.l e10 = b.e(imageView);
        e10.getClass();
        k kVar = (k) new k(e10.f4948a, e10, Drawable.class, e10.f4949b).E(obj).e(u4.l.f15172a);
        kVar.getClass();
        g gVar = new g();
        int i10 = R$drawable.ic_close;
        ((k) ((k) kVar.s(b5.k.f4027c, new h())).y(((g) gVar.l(i10)).f(i10)).u(new f(new h(), new w((int) imageView.getContext().getResources().getDimension(R$dimen.dp_8))), true)).B(imageView);
    }

    @SuppressLint({"MissingPermission"})
    public static void h(Context context) {
        j.f(context, "context");
        try {
            long[] jArr = {0, 30, 100, 20, 100, 10, 200, 5};
            if (Build.VERSION.SDK_INT >= 26) {
                Object systemService = context.getSystemService("vibrator");
                j.d(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                ((Vibrator) systemService).vibrate(VibrationEffect.createWaveform(jArr, -1));
                return;
            }
            Object systemService2 = context.getSystemService("vibrator");
            j.d(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
            ((Vibrator) systemService2).vibrate(jArr, -1);
        } catch (Exception unused) {
        }
    }

    public static long i(long j10) {
        TimeZone timeZone = TimeZone.getDefault();
        Calendar instance = Calendar.getInstance(timeZone);
        j.e(instance, "getInstance(...)");
        int offset = timeZone.getOffset(instance.getTimeInMillis());
        int i10 = h.f12560a;
        return j10 - ((long) offset);
    }

    public static void j(View view) {
        boolean z10;
        if (view.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int measuredHeight = view.getMeasuredHeight();
            c cVar = new c(measuredHeight, view);
            cVar.setDuration((long) ((int) (((float) measuredHeight) / view.getContext().getResources().getDisplayMetrics().density)));
            view.startAnimation(cVar);
            return;
        }
        view.measure(-1, -2);
        int measuredHeight2 = view.getMeasuredHeight();
        view.getLayoutParams().height = 1;
        view.setVisibility(0);
        d dVar = new d(measuredHeight2, view);
        dVar.setDuration((long) ((int) (((float) measuredHeight2) / view.getContext().getResources().getDisplayMetrics().density)));
        float f10 = view.getContext().getResources().getDisplayMetrics().density;
        int i10 = h.f12560a;
        view.startAnimation(dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0032 A[SYNTHETIC, Splitter:B:19:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0041 A[SYNTHETIC, Splitter:B:26:0x0041] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap k(com.ots.core.base.BaseActivity r2, android.net.Uri r3) {
        /*
            java.lang.String r0 = "context"
            sk.j.f(r2, r0)
            r0 = 0
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ IOException -> 0x002a, all -> 0x0028 }
            java.lang.String r1 = "getContentResolver(...)"
            sk.j.e(r2, r1)     // Catch:{ IOException -> 0x002a, all -> 0x0028 }
            java.io.InputStream r2 = r2.openInputStream(r3)     // Catch:{ IOException -> 0x002a, all -> 0x0028 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch:{ IOException -> 0x0026 }
            if (r2 == 0) goto L_0x0023
            r2.close()     // Catch:{ IOException -> 0x001d }
            goto L_0x0023
        L_0x001d:
            r2 = move-exception
            int r0 = kf.h.f12560a
            kf.h.a(r2)
        L_0x0023:
            return r3
        L_0x0024:
            r3 = move-exception
            goto L_0x003d
        L_0x0026:
            r3 = move-exception
            goto L_0x002d
        L_0x0028:
            r2 = move-exception
            goto L_0x003f
        L_0x002a:
            r2 = move-exception
            r3 = r2
            r2 = r0
        L_0x002d:
            kf.h.a(r3)     // Catch:{ all -> 0x0024 }
            if (r2 == 0) goto L_0x003c
            r2.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x003c
        L_0x0036:
            r2 = move-exception
            int r3 = kf.h.f12560a
            kf.h.a(r2)
        L_0x003c:
            return r0
        L_0x003d:
            r0 = r2
            r2 = r3
        L_0x003f:
            if (r0 == 0) goto L_0x004b
            r0.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x004b
        L_0x0045:
            r3 = move-exception
            int r0 = kf.h.f12560a
            kf.h.a(r3)
        L_0x004b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.e.k(com.ots.core.base.BaseActivity, android.net.Uri):android.graphics.Bitmap");
    }
}
