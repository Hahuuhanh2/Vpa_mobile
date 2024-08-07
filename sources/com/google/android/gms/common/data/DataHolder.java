package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import p3.l0;
import x6.b;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    public final int f5366a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f5367b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f5368c;

    /* renamed from: d  reason: collision with root package name */
    public final CursorWindow[] f5369d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5370e;

    /* renamed from: f  reason: collision with root package name */
    public final Bundle f5371f;

    /* renamed from: n  reason: collision with root package name */
    public int[] f5372n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5373o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5374p = true;

    static {
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i10, String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.f5366a = i10;
        this.f5367b = strArr;
        this.f5369d = cursorWindowArr;
        this.f5370e = i11;
        this.f5371f = bundle;
    }

    public final void close() {
        synchronized (this) {
            if (!this.f5373o) {
                this.f5373o = true;
                int i10 = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f5369d;
                    if (i10 >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i10].close();
                    i10++;
                }
            }
        }
    }

    public final void finalize() {
        boolean z10;
        try {
            if (this.f5374p && this.f5369d.length > 0) {
                synchronized (this) {
                    z10 = this.f5373o;
                }
                if (!z10) {
                    close();
                }
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int n12 = l0.n1(20293, parcel);
        l0.g1(parcel, 1, this.f5367b);
        l0.i1(parcel, 2, this.f5369d, i10);
        l0.b1(parcel, 3, this.f5370e);
        l0.Y0(parcel, 4, this.f5371f);
        l0.b1(parcel, 1000, this.f5366a);
        l0.o1(n12, parcel);
        if ((i10 & 1) != 0) {
            close();
        }
    }
}
