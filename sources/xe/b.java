package xe;

import android.annotation.SuppressLint;
import j7.a;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: DateUtils */
public final class b {
    @SuppressLint({"SimpleDateFormat"})

    /* renamed from: a  reason: collision with root package name */
    public static final SimpleDateFormat f17318a = new SimpleDateFormat("yyyyMMddHHmmssSSS");
    @SuppressLint({"SimpleDateFormat"})

    /* renamed from: b  reason: collision with root package name */
    public static final SimpleDateFormat f17319b = new SimpleDateFormat("yyyy-MM");
    @SuppressLint({"SimpleDateFormat"})

    /* renamed from: c  reason: collision with root package name */
    public static final SimpleDateFormat f17320c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static int a(long j10) {
        try {
            String E0 = a.E0(Long.valueOf(System.currentTimeMillis()));
            if (E0.length() > 10) {
                E0 = E0.substring(0, 10);
            }
            return (int) Math.abs(a.C0(E0) - j10);
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    public static String b(long j10) {
        String str;
        if (j10 < 0) {
            str = "-";
        } else {
            str = "";
        }
        long abs = Math.abs(j10) / 1000;
        long j11 = abs % 60;
        long j12 = (abs / 60) % 60;
        long j13 = abs / 3600;
        if (j13 > 0) {
            return String.format(Locale.getDefault(), "%s%d:%02d:%02d", new Object[]{str, Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)});
        }
        return String.format(Locale.getDefault(), "%s%02d:%02d", new Object[]{str, Long.valueOf(j12), Long.valueOf(j11)});
    }

    public static String c(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder q10 = android.support.v4.media.a.q(str);
        q10.append(f17318a.format(Long.valueOf(currentTimeMillis)));
        return q10.toString();
    }
}
