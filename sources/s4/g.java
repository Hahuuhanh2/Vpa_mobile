package s4;

import android.text.TextUtils;
import java.security.MessageDigest;

/* compiled from: Option */
public final class g<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f14626e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final T f14627a;

    /* renamed from: b  reason: collision with root package name */
    public final b<T> f14628b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14629c;

    /* renamed from: d  reason: collision with root package name */
    public volatile byte[] f14630d;

    /* compiled from: Option */
    public class a implements b<Object> {
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* compiled from: Option */
    public interface b<T> {
        void a(byte[] bArr, T t10, MessageDigest messageDigest);
    }

    public g(String str, T t10, b<T> bVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f14629c = str;
            this.f14627a = t10;
            this.f14628b = bVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static g a(Object obj, String str) {
        return new g(str, obj, f14626e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f14629c.equals(((g) obj).f14629c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14629c.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("Option{key='");
        q10.append(this.f14629c);
        q10.append('\'');
        q10.append('}');
        return q10.toString();
    }
}
