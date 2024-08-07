package ee;

import com.luck.picture.lib.magical.MagicalView;

/* compiled from: PictureSelectorPreviewFragment */
public final class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int[] f9404a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f9405b;

    public r(t tVar, int[] iArr) {
        this.f9405b = tVar;
        this.f9404a = iArr;
    }

    public final void run() {
        MagicalView magicalView = this.f9405b.f9409p0;
        int[] iArr = this.f9404a;
        magicalView.j(iArr[0], iArr[1]);
    }
}
