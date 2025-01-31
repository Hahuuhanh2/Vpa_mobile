package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.appcompat.R$attr;

public class AppCompatImageButton extends ImageButton {

    /* renamed from: a  reason: collision with root package name */
    public final d f817a;

    /* renamed from: b  reason: collision with root package name */
    public final i f818b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f819c;

    public AppCompatImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f817a;
        if (dVar != null) {
            dVar.a();
        }
        i iVar = this.f818b;
        if (iVar != null) {
            iVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f817a;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f817a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        l0 l0Var;
        i iVar = this.f818b;
        if (iVar == null || (l0Var = iVar.f1131b) == null) {
            return null;
        }
        return l0Var.f1144a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        l0 l0Var;
        i iVar = this.f818b;
        if (iVar == null || (l0Var = iVar.f1131b) == null) {
            return null;
        }
        return l0Var.f1145b;
    }

    public final boolean hasOverlappingRendering() {
        if (!(!(this.f818b.f1130a.getBackground() instanceof RippleDrawable)) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f817a;
        if (dVar != null) {
            dVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        d dVar = this.f817a;
        if (dVar != null) {
            dVar.f(i10);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        i iVar = this.f818b;
        if (iVar != null) {
            iVar.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        i iVar = this.f818b;
        if (!(iVar == null || drawable == null || this.f819c)) {
            iVar.f1132c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        i iVar2 = this.f818b;
        if (iVar2 != null) {
            iVar2.a();
            if (!this.f819c) {
                i iVar3 = this.f818b;
                if (iVar3.f1130a.getDrawable() != null) {
                    iVar3.f1130a.getDrawable().setLevel(iVar3.f1132c);
                }
            }
        }
    }

    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f819c = true;
    }

    public void setImageResource(int i10) {
        this.f818b.c(i10);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        i iVar = this.f818b;
        if (iVar != null) {
            iVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f817a;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f817a;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        i iVar = this.f818b;
        if (iVar != null) {
            if (iVar.f1131b == null) {
                iVar.f1131b = new l0();
            }
            l0 l0Var = iVar.f1131b;
            l0Var.f1144a = colorStateList;
            l0Var.f1147d = true;
            iVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        i iVar = this.f818b;
        if (iVar != null) {
            if (iVar.f1131b == null) {
                iVar.f1131b = new l0();
            }
            l0 l0Var = iVar.f1131b;
            l0Var.f1145b = mode;
            l0Var.f1146c = true;
            iVar.a();
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.imageButtonStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        k0.a(context);
        this.f819c = false;
        i0.a(getContext(), this);
        d dVar = new d(this);
        this.f817a = dVar;
        dVar.d(attributeSet, i10);
        i iVar = new i(this);
        this.f818b = iVar;
        iVar.b(attributeSet, i10);
    }
}
