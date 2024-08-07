package com.google.android.material.carousel;

import android.support.v4.media.a;
import android.view.animation.LinearInterpolator;
import com.google.android.material.carousel.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: KeylineStateList */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f5980a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f5981b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f5982c;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f5983d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f5984e;

    /* renamed from: f  reason: collision with root package name */
    public final float f5985f;

    /* renamed from: g  reason: collision with root package name */
    public final float f5986g;

    public c(b bVar, ArrayList arrayList, ArrayList arrayList2) {
        this.f5980a = bVar;
        this.f5981b = Collections.unmodifiableList(arrayList);
        this.f5982c = Collections.unmodifiableList(arrayList2);
        float f10 = ((b) arrayList.get(arrayList.size() - 1)).b().f5974a - bVar.b().f5974a;
        this.f5985f = f10;
        float f11 = bVar.d().f5974a - ((b) arrayList2.get(arrayList2.size() - 1)).d().f5974a;
        this.f5986g = f11;
        this.f5983d = b(f10, arrayList, true);
        this.f5984e = b(f11, arrayList2, false);
    }

    public static float[] b(float f10, ArrayList arrayList, boolean z10) {
        float f11;
        float f12;
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i10 = 1; i10 < size; i10++) {
            int i11 = i10 - 1;
            b bVar = (b) arrayList.get(i11);
            b bVar2 = (b) arrayList.get(i10);
            if (z10) {
                f11 = bVar2.b().f5974a - bVar.b().f5974a;
            } else {
                f11 = bVar.d().f5974a - bVar2.d().f5974a;
            }
            float f13 = f11 / f10;
            if (i10 == size - 1) {
                f12 = 1.0f;
            } else {
                f12 = fArr[i11] + f13;
            }
            fArr[i10] = f12;
        }
        return fArr;
    }

    public static b c(b bVar, int i10, int i11, float f10, int i12, int i13, float f11) {
        boolean z10;
        ArrayList arrayList = new ArrayList(bVar.f5962b);
        arrayList.add(i11, (b.C0062b) arrayList.remove(i10));
        b.a aVar = new b.a(bVar.f5961a, f11);
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            b.C0062b bVar2 = (b.C0062b) arrayList.get(i14);
            float f12 = bVar2.f5977d;
            float f13 = (f12 / 2.0f) + f10;
            if (i14 < i12 || i14 > i13) {
                z10 = false;
            } else {
                z10 = true;
            }
            aVar.b(f13, bVar2.f5976c, f12, z10, bVar2.f5978e, bVar2.f5979f);
            f10 += bVar2.f5977d;
        }
        return aVar.d();
    }

    public final b a(float f10, float f11, float f12) {
        float[] fArr;
        List<b> list;
        float f13;
        float[] fArr2;
        float f14 = f10;
        float f15 = f11;
        float f16 = f12;
        float f17 = this.f5985f + f15;
        float f18 = f16 - this.f5986g;
        if (f14 < f17) {
            f13 = t7.b.a(1.0f, 0.0f, f15, f17, f14);
            list = this.f5981b;
            fArr = this.f5983d;
        } else if (f14 <= f18) {
            return this.f5980a;
        } else {
            f13 = t7.b.a(0.0f, 1.0f, f18, f16, f14);
            list = this.f5982c;
            fArr = this.f5984e;
        }
        int size = list.size();
        float f19 = fArr[0];
        int i10 = 1;
        while (true) {
            if (i10 >= size) {
                fArr2 = new float[]{0.0f, 0.0f, 0.0f};
                break;
            }
            float f20 = fArr[i10];
            if (f13 <= f20) {
                fArr2 = new float[]{t7.b.a(0.0f, 1.0f, f19, f20, f13), (float) (i10 - 1), (float) i10};
                break;
            }
            i10++;
            f19 = f20;
        }
        b bVar = list.get((int) fArr2[1]);
        b bVar2 = list.get((int) fArr2[2]);
        float f21 = fArr2[0];
        if (bVar.f5961a == bVar2.f5961a) {
            List<b.C0062b> list2 = bVar.f5962b;
            List<b.C0062b> list3 = bVar2.f5962b;
            if (list2.size() == list3.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < bVar.f5962b.size(); i11++) {
                    b.C0062b bVar3 = list2.get(i11);
                    b.C0062b bVar4 = list3.get(i11);
                    float f22 = bVar3.f5974a;
                    float f23 = bVar4.f5974a;
                    LinearInterpolator linearInterpolator = t7.b.f14885a;
                    float e10 = a.e(f23, f22, f21, f22);
                    float f24 = bVar3.f5975b;
                    float e11 = a.e(bVar4.f5975b, f24, f21, f24);
                    float f25 = bVar3.f5976c;
                    float e12 = a.e(bVar4.f5976c, f25, f21, f25);
                    float f26 = bVar3.f5977d;
                    float e13 = a.e(bVar4.f5977d, f26, f21, f26);
                    b.C0062b bVar5 = r10;
                    b.C0062b bVar6 = new b.C0062b(e10, e11, e12, e13, false, 0.0f);
                    arrayList.add(bVar5);
                }
                return new b(bVar.f5961a, arrayList, t7.b.b(f21, bVar.f5963c, bVar2.f5963c), t7.b.b(f21, bVar.f5964d, bVar2.f5964d));
            }
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
    }
}
