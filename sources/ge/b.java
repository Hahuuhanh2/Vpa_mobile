package ge;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.photoview.PhotoView;
import xe.c;

/* compiled from: BasePreviewHolder */
public abstract class b extends RecyclerView.a0 {
    public a A;

    /* renamed from: u  reason: collision with root package name */
    public final int f10454u;

    /* renamed from: v  reason: collision with root package name */
    public final int f10455v;

    /* renamed from: w  reason: collision with root package name */
    public final int f10456w;

    /* renamed from: x  reason: collision with root package name */
    public LocalMedia f10457x;

    /* renamed from: y  reason: collision with root package name */
    public final ke.a f10458y = ke.b.a().b();

    /* renamed from: z  reason: collision with root package name */
    public PhotoView f10459z;

    /* compiled from: BasePreviewHolder */
    public interface a {
    }

    public b(View view) {
        super(view);
        this.f10454u = c.e(view.getContext());
        this.f10455v = c.f(view.getContext());
        this.f10456w = c.d(view.getContext());
        this.f10459z = (PhotoView) view.findViewById(R$id.preview_image);
        s();
    }

    public static b t(RecyclerView recyclerView, int i10, int i11) {
        View inflate = LayoutInflater.from(recyclerView.getContext()).inflate(i11, recyclerView, false);
        if (i10 == 2) {
            return new h(inflate);
        }
        if (i10 == 3) {
            return new f(inflate);
        }
        return new g(inflate);
    }

    public void A() {
    }

    public void B() {
    }

    public void C(LocalMedia localMedia) {
        if (!this.f10458y.f12539v && this.f10454u < this.f10455v && localMedia.f8090z > 0 && localMedia.A > 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f10459z.getLayoutParams();
            layoutParams.width = this.f10454u;
            layoutParams.height = this.f10456w;
            layoutParams.gravity = 17;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r14 = r13.B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r3 = r13.C;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void r(com.luck.picture.lib.entity.LocalMedia r13, int r14) {
        /*
            r12 = this;
            r12.f10457x = r13
            boolean r14 = r13.d()
            r0 = 1
            r1 = 0
            r2 = 2
            if (r14 == 0) goto L_0x001a
            int r14 = r13.B
            if (r14 <= 0) goto L_0x001a
            int r3 = r13.C
            if (r3 <= 0) goto L_0x001a
            int[] r4 = new int[r2]
            r4[r1] = r14
            r4[r0] = r3
            goto L_0x0024
        L_0x001a:
            int[] r4 = new int[r2]
            int r14 = r13.f8090z
            r4[r1] = r14
            int r14 = r13.A
            r4[r0] = r14
        L_0x0024:
            r14 = r4[r1]
            r3 = r4[r0]
            if (r14 != 0) goto L_0x0032
            if (r3 != 0) goto L_0x0032
            int[] r14 = new int[r2]
            r14 = {-1, -1} // fill-array
            goto L_0x0063
        L_0x0032:
            int r4 = xe.a.a(r14, r3)
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()
            long r5 = r5.totalMemory()
            r7 = 104857600(0x6400000, double:5.1806538E-316)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0046
            r5 = r7
        L_0x0046:
            r7 = -1
            r9 = r1
            r8 = r7
        L_0x0049:
            if (r9 != 0) goto L_0x005d
            int r7 = r14 / r4
            int r8 = r3 / r4
            int r10 = r7 * r8
            int r10 = r10 * 4
            long r10 = (long) r10
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 <= 0) goto L_0x005b
            int r4 = r4 * 2
            goto L_0x0049
        L_0x005b:
            r9 = r0
            goto L_0x0049
        L_0x005d:
            int[] r14 = new int[r2]
            r14[r1] = r7
            r14[r0] = r8
        L_0x0063:
            r2 = r14[r1]
            r14 = r14[r0]
            r12.v(r13, r2, r14)
            r12.C(r13)
            int r14 = r13.f8090z
            int r2 = r13.A
            if (r14 <= 0) goto L_0x007b
            if (r2 > 0) goto L_0x0076
            goto L_0x007b
        L_0x0076:
            int r14 = r14 * 3
            if (r2 <= r14) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r0 = r1
        L_0x007c:
            if (r0 == 0) goto L_0x0086
            com.luck.picture.lib.photoview.PhotoView r14 = r12.f10459z
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r14.setScaleType(r0)
            goto L_0x008d
        L_0x0086:
            com.luck.picture.lib.photoview.PhotoView r14 = r12.f10459z
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r14.setScaleType(r0)
        L_0x008d:
            r12.w()
            r12.x(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.b.r(com.luck.picture.lib.entity.LocalMedia, int):void");
    }

    public abstract void s();

    public boolean u() {
        return false;
    }

    public abstract void v(LocalMedia localMedia, int i10, int i11);

    public abstract void w();

    public abstract void x(LocalMedia localMedia);

    public void y() {
    }

    public void z() {
    }
}
