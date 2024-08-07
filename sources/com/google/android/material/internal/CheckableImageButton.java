package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.customview.view.AbsSavedState;
import w1.d0;
import x1.f;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f6355n = {16842912};

    /* renamed from: d  reason: collision with root package name */
    public boolean f6356d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6357e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6358f;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f6359c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f2188a, i10);
            parcel.writeInt(this.f6359c ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6359c = parcel.readInt() != 1 ? false : true;
        }
    }

    public class a extends w1.a {
        public a() {
        }

        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        public final void d(View view, f fVar) {
            this.f16280a.onInitializeAccessibilityNodeInfo(view, fVar.f16862a);
            fVar.f16862a.setCheckable(CheckableImageButton.this.f6357e);
            fVar.f16862a.setChecked(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public final boolean isChecked() {
        return this.f6356d;
    }

    public final int[] onCreateDrawableState(int i10) {
        if (!this.f6356d) {
            return super.onCreateDrawableState(i10);
        }
        return View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), f6355n);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f2188a);
        setChecked(savedState.f6359c);
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6359c = this.f6356d;
        return savedState;
    }

    public void setCheckable(boolean z10) {
        if (this.f6357e != z10) {
            this.f6357e = z10;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z10) {
        if (this.f6357e && this.f6356d != z10) {
            this.f6356d = z10;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z10) {
        this.f6358f = z10;
    }

    public void setPressed(boolean z10) {
        if (this.f6358f) {
            super.setPressed(z10);
        }
    }

    public final void toggle() {
        setChecked(!this.f6356d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6357e = true;
        this.f6358f = true;
        d0.o(this, new a());
    }
}
