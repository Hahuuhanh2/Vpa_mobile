package ee;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import androidx.activity.ComponentActivity;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.entity.LocalMedia;
import java.util.ArrayList;
import java.util.List;
import je.h;
import xe.i;
import xe.k;

/* compiled from: PictureSelectorSystemFragment */
public class b0 extends h {

    /* renamed from: s0  reason: collision with root package name */
    public static final String f9362s0 = b0.class.getSimpleName();

    /* renamed from: o0  reason: collision with root package name */
    public androidx.fragment.app.h f9363o0;

    /* renamed from: p0  reason: collision with root package name */
    public f.b<String> f9364p0;

    /* renamed from: q0  reason: collision with root package name */
    public androidx.fragment.app.h f9365q0;

    /* renamed from: r0  reason: collision with root package name */
    public f.b<String> f9366r0;

    /* compiled from: PictureSelectorSystemFragment */
    public class a implements te.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String[] f9367a;

        public a(String[] strArr) {
            this.f9367a = strArr;
        }

        public final void a() {
            b0 b0Var = b0.this;
            String str = b0.f9362s0;
            b0Var.N0();
        }

        public final void b() {
            b0.this.s0(this.f9367a);
        }
    }

    /* compiled from: PictureSelectorSystemFragment */
    public class b extends g.a<String, List<Uri>> {
        public final Intent a(ComponentActivity componentActivity, Object obj) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType((String) obj);
            return intent;
        }

        public final Object c(Intent intent, int i10) {
            ArrayList arrayList = new ArrayList();
            if (intent != null) {
                if (intent.getClipData() != null) {
                    ClipData clipData = intent.getClipData();
                    int itemCount = clipData.getItemCount();
                    for (int i11 = 0; i11 < itemCount; i11++) {
                        arrayList.add(clipData.getItemAt(i11).getUri());
                    }
                } else if (intent.getData() != null) {
                    arrayList.add(intent.getData());
                }
            }
            return arrayList;
        }
    }

    /* compiled from: PictureSelectorSystemFragment */
    public class c implements f.a<List<Uri>> {
        public c() {
        }

        public final void b(Object obj) {
            String str;
            List list = (List) obj;
            if (list == null || list.size() == 0) {
                b0.this.C0();
                return;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                b0 b0Var = b0.this;
                String uri = ((Uri) list.get(i10)).toString();
                String str2 = b0.f9362s0;
                LocalMedia i02 = b0Var.i0(uri);
                if (i.a()) {
                    str = i02.f8073b;
                } else {
                    str = i02.f8074c;
                }
                i02.f8073b = str;
                b0.this.f11878i0.X.add(i02);
            }
            b0 b0Var2 = b0.this;
            String str3 = b0.f9362s0;
            b0Var2.n0();
        }
    }

    /* compiled from: PictureSelectorSystemFragment */
    public class d extends g.a<String, List<Uri>> {
        public final Intent a(ComponentActivity componentActivity, Object obj) {
            Intent intent;
            String str = (String) obj;
            if (TextUtils.equals("video/*", str)) {
                intent = new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
            } else if (TextUtils.equals("audio/*", str)) {
                intent = new Intent("android.intent.action.PICK", MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
            } else {
                intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            }
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            return intent;
        }

        public final Object c(Intent intent, int i10) {
            ArrayList arrayList = new ArrayList();
            if (intent != null) {
                if (intent.getClipData() != null) {
                    ClipData clipData = intent.getClipData();
                    int itemCount = clipData.getItemCount();
                    for (int i11 = 0; i11 < itemCount; i11++) {
                        arrayList.add(clipData.getItemAt(i11).getUri());
                    }
                } else if (intent.getData() != null) {
                    arrayList.add(intent.getData());
                }
            }
            return arrayList;
        }
    }

    /* compiled from: PictureSelectorSystemFragment */
    public class e implements f.a<List<Uri>> {
        public e() {
        }

        public final void b(Object obj) {
            String str;
            List list = (List) obj;
            if (list == null || list.size() == 0) {
                b0.this.C0();
                return;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                b0 b0Var = b0.this;
                String uri = ((Uri) list.get(i10)).toString();
                String str2 = b0.f9362s0;
                LocalMedia i02 = b0Var.i0(uri);
                if (i.a()) {
                    str = i02.f8073b;
                } else {
                    str = i02.f8074c;
                }
                i02.f8073b = str;
                b0.this.f11878i0.X.add(i02);
            }
            b0 b0Var2 = b0.this;
            String str3 = b0.f9362s0;
            b0Var2.n0();
        }
    }

    public final void G(int i10, int i11, Intent intent) {
        super.G(i10, i11, intent);
        if (i11 == 0) {
            C0();
        }
    }

    public final void L0() {
        this.f9365q0 = (androidx.fragment.app.h) Z(new e(), new d());
    }

    public final void M() {
        this.J = true;
        androidx.fragment.app.h hVar = this.f9363o0;
        if (hVar != null) {
            hVar.b();
        }
        f.b<String> bVar = this.f9364p0;
        if (bVar != null) {
            bVar.b();
        }
        androidx.fragment.app.h hVar2 = this.f9365q0;
        if (hVar2 != null) {
            hVar2.b();
        }
        f.b<String> bVar2 = this.f9366r0;
        if (bVar2 != null) {
            bVar2.b();
        }
    }

    public final void M0() {
        this.f9363o0 = (androidx.fragment.app.h) Z(new c(), new b());
    }

    public final void N0() {
        D0();
        ke.a aVar = this.f11878i0;
        String str = "audio/*";
        if (aVar.f12524g == 1) {
            int i10 = aVar.f12517a;
            if (i10 == 0) {
                this.f9364p0.a("image/*,video/*");
                return;
            }
            f.b<String> bVar = this.f9366r0;
            if (i10 == 2) {
                str = "video/*";
            } else if (i10 != 3) {
                str = "image/*";
            }
            bVar.a(str);
            return;
        }
        int i11 = aVar.f12517a;
        if (i11 == 0) {
            this.f9363o0.a("image/*,video/*");
            return;
        }
        androidx.fragment.app.h hVar = this.f9365q0;
        if (i11 == 2) {
            str = "video/*";
        } else if (i11 != 3) {
            str = "image/*";
        }
        hVar.a(str);
    }

    public final void W(View view, Bundle bundle) {
        super.W(view, bundle);
        ke.a aVar = this.f11878i0;
        if (aVar.f12524g == 1) {
            if (aVar.f12517a == 0) {
                this.f9364p0 = Z(new d0(this), new c0());
            } else {
                this.f9366r0 = Z(new a0(this), new e0());
            }
        } else if (aVar.f12517a == 0) {
            M0();
        } else {
            L0();
        }
        if (te.a.c(r(), this.f11878i0.f12517a)) {
            N0();
            return;
        }
        String[] a10 = te.b.a(p0(), this.f11878i0.f12517a);
        D0();
        this.f11878i0.getClass();
        te.a b10 = te.a.b();
        a aVar2 = new a(a10);
        b10.getClass();
        te.a.d(this, a10, aVar2);
    }

    public final int q0() {
        return R$layout.ps_empty;
    }

    public final void t0(String[] strArr) {
        D0();
        this.f11878i0.getClass();
        if (te.a.c(r(), this.f11878i0.f12517a)) {
            N0();
        } else {
            k.a(r(), x(R$string.ps_jurisdiction));
            C0();
        }
        te.b.f15023a = new String[0];
    }
}
