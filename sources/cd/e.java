package cd;

import java.util.ArrayList;
import java.util.List;

/* compiled from: DecoderResult */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f4701a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4702b;

    /* renamed from: c  reason: collision with root package name */
    public final List<byte[]> f4703c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4704d;

    /* renamed from: e  reason: collision with root package name */
    public Object f4705e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4706f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4707g;

    public e(byte[] bArr, String str, ArrayList arrayList, String str2) {
        this(bArr, str, arrayList, str2, -1, -1);
    }

    public e(byte[] bArr, String str, ArrayList arrayList, String str2, int i10, int i11) {
        this.f4701a = bArr;
        if (bArr != null) {
            int length = bArr.length;
        }
        this.f4702b = str;
        this.f4703c = arrayList;
        this.f4704d = str2;
        this.f4706f = i11;
        this.f4707g = i10;
    }
}
