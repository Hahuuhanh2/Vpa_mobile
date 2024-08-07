package q;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.biometric.R$color;
import androidx.biometric.R$id;
import androidx.biometric.R$layout;
import androidx.biometric.R$string;
import androidx.fragment.app.g;
import q.l;
import r2.p;

/* compiled from: FingerprintDialogFragment */
public final class r extends g {
    public TextView A0;

    /* renamed from: u0  reason: collision with root package name */
    public final Handler f14253u0 = new Handler(Looper.getMainLooper());

    /* renamed from: v0  reason: collision with root package name */
    public final a f14254v0 = new a();

    /* renamed from: w0  reason: collision with root package name */
    public n f14255w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f14256x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f14257y0;

    /* renamed from: z0  reason: collision with root package name */
    public ImageView f14258z0;

    /* compiled from: FingerprintDialogFragment */
    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            r rVar = r.this;
            Context r10 = rVar.r();
            if (r10 != null) {
                rVar.f14255w0.h(1);
                rVar.f14255w0.g(r10.getString(R$string.fingerprint_dialog_touch_sensor));
            }
        }
    }

    /* compiled from: FingerprintDialogFragment */
    public static class b {
        public static void a(Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    /* compiled from: FingerprintDialogFragment */
    public static class c {
        public static int a() {
            return R$attr.colorError;
        }
    }

    public final void J(Bundle bundle) {
        int i10;
        super.J(bundle);
        n c10 = l.c(this, this.f2448f.getBoolean("host_activity", true));
        this.f14255w0 = c10;
        if (c10.A == null) {
            c10.A = new p<>();
        }
        c10.A.e(this, new t(this));
        n nVar = this.f14255w0;
        if (nVar.B == null) {
            nVar.B = new p<>();
        }
        nVar.B.e(this, new u(this));
        if (Build.VERSION.SDK_INT >= 26) {
            this.f14256x0 = o0(c.a());
        } else {
            Context r10 = r();
            if (r10 != null) {
                i10 = k1.a.getColor(r10, R$color.biometric_error_color);
            } else {
                i10 = 0;
            }
            this.f14256x0 = i10;
        }
        this.f14257y0 = o0(16842808);
    }

    public final void Q() {
        this.J = true;
        this.f14253u0.removeCallbacksAndMessages((Object) null);
    }

    public final void S() {
        this.J = true;
        n nVar = this.f14255w0;
        nVar.f14246z = 0;
        nVar.h(1);
        this.f14255w0.g(x(R$string.fingerprint_dialog_touch_sensor));
    }

    public final Dialog k0() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        b.a aVar = new b.a(d0());
        l.d dVar = this.f14255w0.f14226f;
        if (dVar != null) {
            charSequence = dVar.f14213a;
        } else {
            charSequence = null;
        }
        AlertController.b bVar = aVar.f424a;
        bVar.f342d = charSequence;
        View inflate = LayoutInflater.from(bVar.f339a).inflate(R$layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R$id.fingerprint_subtitle);
        if (textView != null) {
            l.d dVar2 = this.f14255w0.f14226f;
            if (dVar2 != null) {
                charSequence3 = dVar2.f14214b;
            } else {
                charSequence3 = null;
            }
            if (TextUtils.isEmpty(charSequence3)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequence3);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(R$id.fingerprint_description);
        if (textView2 != null) {
            this.f14255w0.getClass();
            if (TextUtils.isEmpty((CharSequence) null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText((CharSequence) null);
            }
        }
        this.f14258z0 = (ImageView) inflate.findViewById(R$id.fingerprint_icon);
        this.A0 = (TextView) inflate.findViewById(R$id.fingerprint_error);
        if (c.a(this.f14255w0.d())) {
            charSequence2 = x(R$string.confirm_device_credential_password);
        } else {
            charSequence2 = this.f14255w0.e();
        }
        s sVar = new s(this);
        AlertController.b bVar2 = aVar.f424a;
        bVar2.f344f = charSequence2;
        bVar2.f345g = sVar;
        bVar2.f349k = inflate;
        androidx.appcompat.app.b a10 = aVar.a();
        a10.setCanceledOnTouchOutside(false);
        return a10;
    }

    public final int o0(int i10) {
        Context r10 = r();
        if (r10 == null) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        r10.getTheme().resolveAttribute(i10, typedValue, true);
        TypedArray obtainStyledAttributes = r10.obtainStyledAttributes(typedValue.data, new int[]{i10});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        n nVar = this.f14255w0;
        if (nVar.f14245y == null) {
            nVar.f14245y = new p<>();
        }
        n.j(nVar.f14245y, Boolean.TRUE);
    }
}
