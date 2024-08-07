package vl;

import al.g0;
import android.content.res.TypedArray;
import android.graphics.drawable.BitmapDrawable;
import android.os.IInterface;
import android.os.Parcel;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.appcompat.R$styleable;
import c7.h;
import c7.q;
import cd.b;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.zxing.NotFoundException;
import h4.i;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import n2.a;
import n2.e;
import n2.g;
import qd.a;
import s4.c;
import s4.k;
import u4.u;
import w6.m;

/* compiled from: Result */
public final class d implements k, m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23361a;

    /* renamed from: b  reason: collision with root package name */
    public Object f23362b;

    /* renamed from: c  reason: collision with root package name */
    public Object f23363c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f23361a = i10;
        this.f23362b = obj;
        this.f23363c = obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029 A[SYNTHETIC, Splitter:B:14:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e A[SYNTHETIC, Splitter:B:18:0x002e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static vl.d a(android.content.Context r4) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0025 }
            java.io.File r4 = r4.getFilesDir()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0025 }
            r2.<init>(r4, r0)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0025 }
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0025 }
            java.lang.String r0 = "rw"
            r4.<init>(r2, r0)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0025 }
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0025 }
            java.nio.channels.FileLock r0 = r4.lock()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0023 }
            vl.d r2 = new vl.d     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0027 }
            r3 = 9
            r2.<init>(r3, r4, r0)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0027 }
            return r2
        L_0x0023:
            r0 = r1
            goto L_0x0027
        L_0x0025:
            r4 = r1
            r0 = r4
        L_0x0027:
            if (r0 == 0) goto L_0x002c
            r0.release()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            if (r4 == 0) goto L_0x0031
            r4.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vl.d.a(android.content.Context):vl.d");
    }

    public final void accept(Object obj, Object obj2) {
        c7.m mVar = new c7.m((TaskCompletionSource) obj2);
        h hVar = (h) ((q) obj).getService();
        Parcel zaa = hVar.zaa();
        zac.zae(zaa, mVar);
        zac.zad(zaa, (ApiFeatureRequest) this.f23363c);
        zac.zae(zaa, (IInterface) null);
        hVar.zac(2, zaa);
    }

    public final d b(d dVar) {
        if (!((a) this.f23362b).equals((a) dVar.f23362b)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (j()) {
            return dVar;
        } else {
            if (dVar.j()) {
                return this;
            }
            int[] iArr = (int[]) this.f23363c;
            int[] iArr2 = (int[]) dVar.f23363c;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i10 = length; i10 < iArr.length; i10++) {
                ((a) this.f23362b).getClass();
                iArr4[i10] = (iArr2[i10 - length] + iArr[i10]) % 929;
            }
            return new d((a) this.f23362b, iArr4);
        }
    }

    public final int c(int i10) {
        if (i10 == 0) {
            return f(0);
        }
        if (i10 == 1) {
            int i11 = 0;
            for (int i12 : (int[]) this.f23363c) {
                ((a) this.f23362b).getClass();
                i11 = (i11 + i12) % 929;
            }
            return i11;
        }
        Object obj = this.f23363c;
        int i13 = ((int[]) obj)[0];
        int length = ((int[]) obj).length;
        for (int i14 = 1; i14 < length; i14++) {
            Object obj2 = this.f23362b;
            ((a) obj2).getClass();
            i13 = (((a) obj2).b(i10, i13) + ((int[]) this.f23363c)[i14]) % 929;
        }
        return i13;
    }

    public final c d(s4.h hVar) {
        return ((k) this.f23363c).d(hVar);
    }

    public final b e() {
        if (((b) this.f23363c) == null) {
            this.f23363c = ((i) this.f23362b).g();
        }
        return (b) this.f23363c;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        switch (this.f23361a) {
            case 3:
                if (obj instanceof v1.c) {
                    v1.c cVar = (v1.c) obj;
                    F f10 = cVar.f16012a;
                    F f11 = this.f23362b;
                    if (f10 == f11 || (f10 != null && f10.equals(f11))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        S s10 = cVar.f16013b;
                        S s11 = this.f23363c;
                        if (s10 == s11 || (s10 != null && s10.equals(s11))) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    public final int f(int i10) {
        Object obj = this.f23363c;
        return ((int[]) obj)[(((int[]) obj).length - 1) - i10];
    }

    public final int g() {
        return ((int[]) this.f23363c).length - 1;
    }

    public final KeyListener h(KeyListener keyListener) {
        if (!(!(keyListener instanceof NumberKeyListener))) {
            return keyListener;
        }
        ((n2.a) this.f23363c).f13452a.getClass();
        if (keyListener instanceof e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        return new e(keyListener);
    }

    public final int hashCode() {
        int i10;
        switch (this.f23361a) {
            case 3:
                Object obj = this.f23362b;
                int i11 = 0;
                if (obj == null) {
                    i10 = 0;
                } else {
                    i10 = obj.hashCode();
                }
                Object obj2 = this.f23363c;
                if (obj2 != null) {
                    i11 = obj2.hashCode();
                }
                return i10 ^ i11;
            default:
                return super.hashCode();
        }
    }

    public final boolean i(Object obj, File file, s4.h hVar) {
        return ((k) this.f23363c).i(new b5.d(((BitmapDrawable) ((u) obj).get()).getBitmap(), (v4.c) this.f23362b), file, hVar);
    }

    public final boolean j() {
        if (((int[]) this.f23363c)[0] == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    public final void k(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = ((EditText) this.f23362b).getContext().obtainStyledAttributes(attributeSet, R$styleable.AppCompatTextView, i10, 0);
        try {
            int i11 = R$styleable.AppCompatTextView_emojiCompatEnabled;
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(i11)) {
                z10 = obtainStyledAttributes.getBoolean(i11, true);
            }
            obtainStyledAttributes.recycle();
            q(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final d l(int i10) {
        if (i10 == 0) {
            return ((a) this.f23362b).f14447c;
        }
        if (i10 == 1) {
            return this;
        }
        int length = ((int[]) this.f23363c).length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = ((a) this.f23362b).b(((int[]) this.f23363c)[i11], i10);
        }
        return new d((a) this.f23362b, iArr);
    }

    public final d m(d dVar) {
        if (!((a) this.f23362b).equals((a) dVar.f23362b)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (j() || dVar.j()) {
            return ((a) this.f23362b).f14447c;
        } else {
            int[] iArr = (int[]) this.f23363c;
            int length = iArr.length;
            int[] iArr2 = (int[]) dVar.f23363c;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArr[i10];
                for (int i12 = 0; i12 < length2; i12++) {
                    int i13 = i10 + i12;
                    a aVar = (a) this.f23362b;
                    int i14 = iArr3[i13];
                    aVar.getClass();
                    iArr3[i13] = (aVar.b(i11, iArr2[i12]) + i14) % 929;
                }
            }
            return new d((a) this.f23362b, iArr3);
        }
    }

    public final d n() {
        int length = ((int[]) this.f23363c).length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = ((int[]) this.f23363c)[i10];
            ((a) this.f23362b).getClass();
            iArr[i10] = (929 - i11) % 929;
        }
        return new d((a) this.f23362b, iArr);
    }

    public final InputConnection o(InputConnection inputConnection, EditorInfo editorInfo) {
        n2.a aVar = (n2.a) this.f23363c;
        if (inputConnection == null) {
            aVar.getClass();
            return null;
        }
        a.C0163a aVar2 = aVar.f13452a;
        aVar2.getClass();
        if (inputConnection instanceof n2.c) {
            return inputConnection;
        }
        return new n2.c(aVar2.f13453a, inputConnection, editorInfo);
    }

    public final void p() {
        try {
            ((FileLock) this.f23363c).release();
            ((FileChannel) this.f23362b).close();
        } catch (IOException unused) {
        }
    }

    public final void q(boolean z10) {
        g gVar = ((n2.a) this.f23363c).f13452a.f13454b;
        if (gVar.f13474d != z10) {
            if (gVar.f13473c != null) {
                androidx.emoji2.text.d a10 = androidx.emoji2.text.d.a();
                g.a aVar = gVar.f13473c;
                a10.getClass();
                g0.D(aVar, "initCallback cannot be null");
                a10.f2381a.writeLock().lock();
                try {
                    a10.f2382b.remove(aVar);
                } finally {
                    a10.f2381a.writeLock().unlock();
                }
            }
            gVar.f13474d = z10;
            if (z10) {
                g.a(gVar.f13471a, androidx.emoji2.text.d.a().b());
            }
        }
    }

    public final d r(d dVar) {
        if (!((qd.a) this.f23362b).equals((qd.a) dVar.f23362b)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (dVar.j()) {
            return this;
        } else {
            return b(dVar.n());
        }
    }

    public final String toString() {
        switch (this.f23361a) {
            case 3:
                StringBuilder q10 = android.support.v4.media.a.q("Pair{");
                q10.append(this.f23362b);
                q10.append(" ");
                q10.append(this.f23363c);
                q10.append("}");
                return q10.toString();
            case 10:
                try {
                    return e().toString();
                } catch (NotFoundException unused) {
                    return "";
                }
            case 11:
                StringBuilder sb2 = new StringBuilder(g() * 8);
                for (int g2 = g(); g2 >= 0; g2--) {
                    int f10 = f(g2);
                    if (f10 != 0) {
                        if (f10 < 0) {
                            sb2.append(" - ");
                            f10 = -f10;
                        } else if (sb2.length() > 0) {
                            sb2.append(" + ");
                        }
                        if (g2 == 0 || f10 != 1) {
                            sb2.append(f10);
                        }
                        if (g2 != 0) {
                            if (g2 == 1) {
                                sb2.append('x');
                            } else {
                                sb2.append("x^");
                                sb2.append(g2);
                            }
                        }
                    }
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public d(qd.a aVar, int[] iArr) {
        this.f23361a = 11;
        if (iArr.length != 0) {
            this.f23362b = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f23363c = iArr;
                return;
            }
            int i10 = 1;
            while (i10 < length && iArr[i10] == 0) {
                i10++;
            }
            if (i10 == length) {
                this.f23363c = new int[]{0};
                return;
            }
            int i11 = length - i10;
            int[] iArr2 = new int[i11];
            this.f23363c = iArr2;
            System.arraycopy(iArr, i10, iArr2, 0, i11);
            return;
        }
        throw new IllegalArgumentException();
    }

    public d(i iVar) {
        this.f23361a = 10;
        if (iVar != null) {
            this.f23362b = iVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    public d(int i10) {
        this.f23361a = i10;
        if (i10 == 3) {
            return;
        }
        if (i10 != 8) {
            this.f23362b = new AtomicReference(j7.a.D);
            this.f23363c = new Object();
            return;
        }
        this.f23362b = new AtomicInteger();
        this.f23363c = new AtomicInteger();
    }

    public d(EditText editText) {
        this.f23361a = 1;
        this.f23362b = editText;
        this.f23363c = new n2.a(editText);
    }
}
