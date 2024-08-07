package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import w2.a;
import w2.e;

/* compiled from: DeviceProfileWriter */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f2913a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f2914b;

    /* renamed from: c  reason: collision with root package name */
    public final c.C0027c f2915c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f2916d;

    /* renamed from: e  reason: collision with root package name */
    public final File f2917e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2918f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2919g = false;

    /* renamed from: h  reason: collision with root package name */
    public a[] f2920h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f2921i;

    public b(AssetManager assetManager, Executor executor, c.C0027c cVar, String str, File file) {
        byte[] bArr;
        this.f2913a = assetManager;
        this.f2914b = executor;
        this.f2915c = cVar;
        this.f2918f = str;
        this.f2917e = file;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24 && i10 <= 33) {
            switch (i10) {
                case 24:
                case 25:
                    bArr = e.f16446e;
                    break;
                case 26:
                    bArr = e.f16445d;
                    break;
                case 27:
                    bArr = e.f16444c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = e.f16443b;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = e.f16442a;
                    break;
            }
        }
        bArr = null;
        this.f2916d = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f2915c.a();
            }
            return null;
        }
    }

    public final void b(int i10, Serializable serializable) {
        this.f2914b.execute(new q.e(this, i10, 2, serializable));
    }
}
