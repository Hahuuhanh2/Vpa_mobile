package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: IndicatorViewController */
public final class o extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7078a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextView f7079b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f7080c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TextView f7081d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ q f7082e;

    public o(q qVar, int i10, TextView textView, int i11, TextView textView2) {
        this.f7082e = qVar;
        this.f7078a = i10;
        this.f7079b = textView;
        this.f7080c = i11;
        this.f7081d = textView2;
    }

    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        q qVar = this.f7082e;
        qVar.f7097n = this.f7078a;
        qVar.f7095l = null;
        TextView textView = this.f7079b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f7080c == 1 && (appCompatTextView = this.f7082e.f7101r) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f7081d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            this.f7081d.setAlpha(1.0f);
        }
    }

    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f7081d;
        if (textView != null) {
            textView.setVisibility(0);
            this.f7081d.setAlpha(0.0f);
        }
    }
}
