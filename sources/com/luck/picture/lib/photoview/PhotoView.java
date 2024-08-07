package com.luck.picture.lib.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import ue.d;
import ue.e;
import ue.f;
import ue.g;
import ue.h;
import ue.i;
import ue.j;
import ue.k;
import ue.l;

public class PhotoView extends AppCompatImageView {

    /* renamed from: d  reason: collision with root package name */
    public k f8126d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView.ScaleType f8127e;

    public PhotoView(Context context) {
        this(context, (AttributeSet) null);
    }

    public k getAttacher() {
        return this.f8126d;
    }

    public RectF getDisplayRect() {
        return this.f8126d.c();
    }

    public Matrix getImageMatrix() {
        return this.f8126d.f15549s;
    }

    public float getMaximumScale() {
        return this.f8126d.f15542e;
    }

    public float getMediumScale() {
        return this.f8126d.f15541d;
    }

    public float getMinimumScale() {
        return this.f8126d.f15540c;
    }

    public float getScale() {
        return this.f8126d.f();
    }

    public ImageView.ScaleType getScaleType() {
        return this.f8126d.D;
    }

    public void setAllowParentInterceptOnEdge(boolean z10) {
        this.f8126d.f15543f = z10;
    }

    public final boolean setFrame(int i10, int i11, int i12, int i13) {
        boolean frame = super.setFrame(i10, i11, i12, i13);
        if (frame) {
            this.f8126d.h();
        }
        return frame;
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        k kVar = this.f8126d;
        if (kVar != null) {
            kVar.h();
        }
    }

    public void setImageResource(int i10) {
        super.setImageResource(i10);
        k kVar = this.f8126d;
        if (kVar != null) {
            kVar.h();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        k kVar = this.f8126d;
        if (kVar != null) {
            kVar.h();
        }
    }

    public void setMaximumScale(float f10) {
        k kVar = this.f8126d;
        l.a(kVar.f15540c, kVar.f15541d, f10);
        kVar.f15542e = f10;
    }

    public void setMediumScale(float f10) {
        k kVar = this.f8126d;
        l.a(kVar.f15540c, f10, kVar.f15542e);
        kVar.f15541d = f10;
    }

    public void setMinimumScale(float f10) {
        k kVar = this.f8126d;
        l.a(f10, kVar.f15541d, kVar.f15542e);
        kVar.f15540c = f10;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f8126d.f15554x = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f8126d.f15546p.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f8126d.f15555y = onLongClickListener;
    }

    public void setOnMatrixChangeListener(d dVar) {
        this.f8126d.getClass();
    }

    public void setOnOutsidePhotoTapListener(e eVar) {
        this.f8126d.getClass();
    }

    public void setOnPhotoTapListener(f fVar) {
        this.f8126d.getClass();
    }

    public void setOnScaleChangeListener(g gVar) {
        this.f8126d.getClass();
    }

    public void setOnSingleFlingListener(h hVar) {
        this.f8126d.getClass();
    }

    public void setOnViewDragListener(i iVar) {
        this.f8126d.getClass();
    }

    public void setOnViewTapListener(j jVar) {
        this.f8126d.f15553w = jVar;
    }

    public void setRotationBy(float f10) {
        k kVar = this.f8126d;
        kVar.f15550t.postRotate(f10 % 360.0f);
        kVar.a();
    }

    public void setRotationTo(float f10) {
        k kVar = this.f8126d;
        kVar.f15550t.setRotate(f10 % 360.0f);
        kVar.a();
    }

    public void setScale(float f10) {
        k kVar = this.f8126d;
        kVar.g(f10, (float) (kVar.f15545o.getRight() / 2), (float) (kVar.f15545o.getBottom() / 2), false);
    }

    public void setScaleLevels(float f10, float f11, float f12) {
        k kVar = this.f8126d;
        kVar.getClass();
        l.a(f10, f11, f12);
        kVar.f15540c = f10;
        kVar.f15541d = f11;
        kVar.f15542e = f12;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        boolean z10;
        k kVar = this.f8126d;
        if (kVar == null) {
            this.f8127e = scaleType;
            return;
        }
        kVar.getClass();
        if (scaleType == null) {
            z10 = false;
        } else if (l.a.f15571a[scaleType.ordinal()] != 1) {
            z10 = true;
        } else {
            throw new IllegalStateException("Matrix scale type is not supported");
        }
        if (z10 && scaleType != kVar.D) {
            kVar.D = scaleType;
            kVar.h();
        }
    }

    public void setZoomTransitionDuration(int i10) {
        this.f8126d.f15539b = i10;
    }

    public void setZoomable(boolean z10) {
        k kVar = this.f8126d;
        kVar.C = z10;
        kVar.h();
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8126d = new k(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f8127e;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f8127e = null;
        }
    }

    public void setScale(float f10, boolean z10) {
        k kVar = this.f8126d;
        kVar.g(f10, (float) (kVar.f15545o.getRight() / 2), (float) (kVar.f15545o.getBottom() / 2), z10);
    }

    public void setScale(float f10, float f11, float f12, boolean z10) {
        this.f8126d.g(f10, f11, f12, z10);
    }
}
