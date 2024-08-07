package x7;

import al.g0;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.o;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$dimen;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.carousel.a;
import com.google.android.material.carousel.b;

/* compiled from: MultiBrowseCarouselStrategy */
public final class h extends o {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f17085c = {1};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f17086d = {1, 0};

    /* renamed from: b  reason: collision with root package name */
    public int f17087b = 0;

    public final b C(b bVar, View view) {
        int[] iArr;
        int[] iArr2;
        boolean z10;
        float f10;
        CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) bVar;
        float f11 = (float) carouselLayoutManager.f3061w;
        if (carouselLayoutManager.c1()) {
            f11 = (float) carouselLayoutManager.f3060v;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f12 = (float) (layoutParams.topMargin + layoutParams.bottomMargin);
        float measuredHeight = (float) view.getMeasuredHeight();
        if (carouselLayoutManager.c1()) {
            f12 = (float) (layoutParams.leftMargin + layoutParams.rightMargin);
            measuredHeight = (float) view.getMeasuredWidth();
        }
        float f13 = f12;
        Resources resources = view.getContext().getResources();
        int i10 = R$dimen.m3_carousel_small_item_size_min;
        float dimension = resources.getDimension(i10) + f13;
        Resources resources2 = view.getContext().getResources();
        int i11 = R$dimen.m3_carousel_small_item_size_max;
        float dimension2 = resources2.getDimension(i11) + f13;
        float min = Math.min(measuredHeight + f13, f11);
        float F = g0.F((measuredHeight / 3.0f) + f13, view.getContext().getResources().getDimension(i10) + f13, view.getContext().getResources().getDimension(i11) + f13);
        float f14 = (min + F) / 2.0f;
        int[] iArr3 = f17085c;
        if (f11 < dimension * 2.0f) {
            iArr3 = new int[]{0};
        }
        int[] iArr4 = f17086d;
        if (carouselLayoutManager.K == 1) {
            int length = iArr3.length;
            int[] iArr5 = new int[length];
            for (int i12 = 0; i12 < length; i12++) {
                iArr5[i12] = iArr3[i12] * 2;
            }
            int[] iArr6 = new int[2];
            for (int i13 = 0; i13 < 2; i13++) {
                iArr6[i13] = iArr4[i13] * 2;
            }
            iArr = iArr6;
            iArr2 = iArr5;
        } else {
            iArr2 = iArr3;
            iArr = iArr4;
        }
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MIN_VALUE;
        for (int i16 : iArr) {
            if (i16 > i15) {
                i15 = i16;
            }
        }
        float f15 = f11 - (((float) i15) * f14);
        for (int i17 : iArr2) {
            if (i17 > i14) {
                i14 = i17;
            }
        }
        float f16 = f13;
        int ceil = (int) Math.ceil((double) (f11 / min));
        int max = (ceil - ((int) Math.max(1.0d, Math.floor((double) ((f15 - (((float) i14) * dimension2)) / min))))) + 1;
        int[] iArr7 = new int[max];
        for (int i18 = 0; i18 < max; i18++) {
            iArr7[i18] = ceil - i18;
        }
        CarouselLayoutManager carouselLayoutManager2 = carouselLayoutManager;
        a a10 = a.a(f11, F, dimension, dimension2, iArr2, f14, iArr, min, iArr7);
        this.f17087b = a10.f17075c + a10.f17076d + a10.f17079g;
        int L = ((RecyclerView.m) bVar).L();
        int i19 = a10.f17075c;
        int i20 = a10.f17076d;
        int i21 = ((i19 + i20) + a10.f17079g) - L;
        if (i21 <= 0 || (i19 <= 0 && i20 <= 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        while (i21 > 0) {
            int i22 = a10.f17075c;
            if (i22 > 0) {
                a10.f17075c = i22 - 1;
            } else {
                int i23 = a10.f17076d;
                if (i23 > 1) {
                    a10.f17076d = i23 - 1;
                }
            }
            i21--;
        }
        if (z10) {
            a10 = a.a(f11, F, dimension, dimension2, new int[]{a10.f17075c}, f14, new int[]{a10.f17076d}, min, new int[]{a10.f17079g});
        }
        Context context = view.getContext();
        if (carouselLayoutManager2.K == 1) {
            float min2 = Math.min(context.getResources().getDimension(R$dimen.m3_carousel_gone_size) + f16, a10.f17078f);
            float f17 = min2 / 2.0f;
            float f18 = 0.0f - f17;
            float b10 = a.b(0.0f, a10.f17074b, a10.f17075c);
            float c10 = a.c(0.0f, a.a(b10, a10.f17074b, (int) Math.floor((double) (((float) a10.f17075c) / 2.0f))), a10.f17074b, a10.f17075c);
            float b11 = a.b(c10, a10.f17077e, a10.f17076d);
            float c11 = a.c(c10, a.a(b11, a10.f17077e, (int) Math.floor((double) (((float) a10.f17076d) / 2.0f))), a10.f17077e, a10.f17076d);
            float b12 = a.b(c11, a10.f17078f, a10.f17079g);
            float c12 = a.c(c11, a.a(b12, a10.f17078f, a10.f17079g), a10.f17078f, a10.f17079g);
            float b13 = a.b(c12, a10.f17077e, a10.f17076d);
            float b14 = a.b(a.c(c12, a.a(b13, a10.f17077e, (int) Math.ceil((double) (((float) a10.f17076d) / 2.0f))), a10.f17077e, a10.f17076d), a10.f17074b, a10.f17075c);
            float f19 = f17 + f11;
            float f20 = f16;
            float d10 = o.d(min2, a10.f17078f, f20);
            float d11 = o.d(a10.f17074b, a10.f17078f, f20);
            float d12 = o.d(a10.f17077e, a10.f17078f, f20);
            b.a aVar = new b.a(a10.f17078f, f11);
            aVar.a(f18, d10, min2, false, true);
            int i24 = a10.f17075c;
            if (i24 > 0) {
                f10 = min2;
                aVar.c(b10, d11, a10.f17074b, (int) Math.floor((double) (((float) i24) / 2.0f)), false);
            } else {
                f10 = min2;
            }
            int i25 = a10.f17076d;
            if (i25 > 0) {
                aVar.c(b11, d12, a10.f17077e, (int) Math.floor((double) (((float) i25) / 2.0f)), false);
            }
            aVar.c(b12, 0.0f, a10.f17078f, a10.f17079g, true);
            int i26 = a10.f17076d;
            if (i26 > 0) {
                aVar.c(b13, d12, a10.f17077e, (int) Math.ceil((double) (((float) i26) / 2.0f)), false);
            }
            int i27 = a10.f17075c;
            if (i27 > 0) {
                aVar.c(b14, d11, a10.f17074b, (int) Math.ceil((double) (((float) i27) / 2.0f)), false);
            }
            aVar.a(f19, d10, f10, false, true);
            return aVar.d();
        }
        float f21 = f16;
        float min3 = Math.min(context.getResources().getDimension(R$dimen.m3_carousel_gone_size) + f21, a10.f17078f);
        float f22 = min3 / 2.0f;
        float b15 = a.b(0.0f, a10.f17078f, a10.f17079g);
        float c13 = a.c(0.0f, a.a(b15, a10.f17078f, a10.f17079g), a10.f17078f, a10.f17079g);
        float b16 = a.b(c13, a10.f17077e, a10.f17076d);
        float b17 = a.b(a.c(c13, b16, a10.f17077e, a10.f17076d), a10.f17074b, a10.f17075c);
        float f23 = f22 + f11;
        float d13 = o.d(min3, a10.f17078f, f21);
        float d14 = o.d(a10.f17074b, a10.f17078f, f21);
        float d15 = o.d(a10.f17077e, a10.f17078f, f21);
        b.a aVar2 = new b.a(a10.f17078f, f11);
        aVar2.a(0.0f - f22, d13, min3, false, true);
        aVar2.c(b15, 0.0f, a10.f17078f, a10.f17079g, true);
        if (a10.f17076d > 0) {
            aVar2.a(b16, d15, a10.f17077e, false, false);
        }
        int i28 = a10.f17075c;
        if (i28 > 0) {
            aVar2.c(b17, d14, a10.f17074b, i28, false);
        }
        aVar2.a(f23, d13, min3, false, true);
        return aVar2.d();
    }

    public final boolean H(b bVar, int i10) {
        if ((i10 >= this.f17087b || ((RecyclerView.m) bVar).L() < this.f17087b) && (i10 < this.f17087b || ((RecyclerView.m) bVar).L() >= this.f17087b)) {
            return false;
        }
        return true;
    }
}
