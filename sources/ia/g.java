package ia;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: CLSUUID */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicLong f11297a = new AtomicLong(0);

    /* renamed from: b  reason: collision with root package name */
    public static String f11298b;

    public g(k0 k0Var) {
        String str;
        long time = new Date().getTime();
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) (time / 1000));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        byte[] array = allocate.array();
        byte[] a10 = a(time % 1000);
        byte[] a11 = a(f11297a.incrementAndGet());
        byte[] a12 = a((long) Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {array[0], array[1], array[2], array[3], a10[0], a10[1], a11[0], a11[1], a12[0], a12[1]};
        byte[] bytes = ((c) k0Var.b()).f11277a.getBytes();
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bytes);
            str = h.f(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            str = "";
        }
        String f10 = h.f(bArr);
        Locale locale = Locale.US;
        f11298b = String.format(locale, "%s%s%s%s", new Object[]{f10.substring(0, 12), f10.substring(12, 16), f10.subSequence(16, 20), str.substring(0, 12)}).toUpperCase(locale);
    }

    public static byte[] a(long j10) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j10));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public final String toString() {
        return f11298b;
    }
}
