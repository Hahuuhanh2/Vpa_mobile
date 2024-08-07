package m1;

import java.util.ArrayList;

/* compiled from: GradientColorInflaterCompat */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f13060a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f13061b;

    public d(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f13060a = new int[size];
        this.f13061b = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            this.f13060a[i10] = ((Integer) arrayList.get(i10)).intValue();
            this.f13061b[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public d(int i10, int i11) {
        this.f13060a = new int[]{i10, i11};
        this.f13061b = new float[]{0.0f, 1.0f};
    }

    public d(int i10, int i11, int i12) {
        this.f13060a = new int[]{i10, i11, i12};
        this.f13061b = new float[]{0.0f, 0.5f, 1.0f};
    }
}
