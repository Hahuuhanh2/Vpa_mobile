package v;

import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageWriter;
import androidx.camera.core.e;
import androidx.camera.core.f;
import f0.e0;
import m0.b;
import w.t;
import y.i0;
import y.k;

/* compiled from: ZslControlImpl */
public final class l2 {

    /* renamed from: a  reason: collision with root package name */
    public final t f15736a;

    /* renamed from: b  reason: collision with root package name */
    public final b f15737b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15738c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15739d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f15740e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15741f = false;

    /* renamed from: g  reason: collision with root package name */
    public f f15742g;

    /* renamed from: h  reason: collision with root package name */
    public e.a f15743h;

    /* renamed from: i  reason: collision with root package name */
    public e0 f15744i;

    /* renamed from: j  reason: collision with root package name */
    public ImageWriter f15745j;

    public l2(t tVar) {
        boolean z10;
        boolean z11 = false;
        this.f15736a = tVar;
        int[] iArr = (int[]) tVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            int length = iArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (iArr[i10] == 4) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        z10 = false;
        this.f15740e = z10;
        this.f15741f = k.a(i0.class) != null ? true : z11;
        this.f15737b = new b(new g0(1));
    }
}
