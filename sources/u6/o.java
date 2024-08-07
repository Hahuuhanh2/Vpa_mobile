package u6;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public abstract class o extends m {

    /* renamed from: d  reason: collision with root package name */
    public static final WeakReference f15303d = new WeakReference((Object) null);

    /* renamed from: c  reason: collision with root package name */
    public WeakReference f15304c = f15303d;

    public o(byte[] bArr) {
        super(bArr);
    }

    public final byte[] o() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f15304c.get();
            if (bArr == null) {
                bArr = r();
                this.f15304c = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    public abstract byte[] r();
}
