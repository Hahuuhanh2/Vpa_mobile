package ee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.entity.LocalMedia;
import je.h;
import te.b;
import te.c;
import xe.i;
import xe.k;

/* compiled from: PictureOnlyCameraFragment */
public class a extends h {

    /* renamed from: o0  reason: collision with root package name */
    public static final String f9356o0 = a.class.getSimpleName();

    /* renamed from: ee.a$a  reason: collision with other inner class name */
    /* compiled from: PictureOnlyCameraFragment */
    public class C0102a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String[] f9357a;

        public C0102a(String[] strArr) {
            this.f9357a = strArr;
        }

        public final void a() {
            a.this.G0();
        }

        public final void b() {
            a.this.s0(this.f9357a);
        }
    }

    public final void G(int i10, int i11, Intent intent) {
        super.G(i10, i11, intent);
        if (i11 == 0) {
            C0();
        }
    }

    public final void W(View view, Bundle bundle) {
        super.W(view, bundle);
        if (bundle != null) {
            return;
        }
        if (i.a()) {
            G0();
            return;
        }
        String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE"};
        te.a b10 = te.a.b();
        C0102a aVar = new C0102a(strArr);
        b10.getClass();
        te.a.d(this, strArr, aVar);
    }

    public final void m0(LocalMedia localMedia) {
        if (l0(localMedia, false) == 0) {
            n0();
        } else {
            C0();
        }
    }

    public final int q0() {
        return R$layout.ps_empty;
    }

    public final void t0(String[] strArr) {
        D0();
        this.f11878i0.getClass();
        boolean a10 = te.a.a(r(), new String[]{"android.permission.CAMERA"});
        if (!i.a()) {
            a10 = te.a.a(r(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
        }
        if (a10) {
            G0();
        } else {
            if (!te.a.a(r(), new String[]{"android.permission.CAMERA"})) {
                k.a(r(), x(R$string.ps_camera));
            } else if (!te.a.a(r(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})) {
                k.a(r(), x(R$string.ps_jurisdiction));
            }
            C0();
        }
        b.f15023a = new String[0];
    }
}
