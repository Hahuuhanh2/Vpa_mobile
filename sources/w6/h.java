package w6;

import android.os.Looper;
import y6.j;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class h<L> {

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f16598a;

    /* renamed from: b  reason: collision with root package name */
    public volatile a f16599b;

    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static final class a<L> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f16600a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16601b;

        public a(L l10, String str) {
            this.f16600a = l10;
            this.f16601b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f16600a != aVar.f16600a || !this.f16601b.equals(aVar.f16601b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f16601b.hashCode() + (System.identityHashCode(this.f16600a) * 31);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface b<L> {
    }

    public h(Looper looper, L l10, String str) {
        new w(looper);
        if (l10 != null) {
            this.f16598a = l10;
            j.c(str);
            this.f16599b = new a(l10, str);
            return;
        }
        throw new NullPointerException("Listener must not be null");
    }
}
