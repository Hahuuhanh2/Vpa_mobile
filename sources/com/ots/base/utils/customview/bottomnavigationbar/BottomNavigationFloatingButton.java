package com.ots.base.utils.customview.bottomnavigationbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.ots.core.R$anim;
import com.ots.core.R$id;
import com.ots.core.R$layout;
import ek.g;
import sk.j;
import sk.k;

/* compiled from: BottomNavigationFloatingButton.kt */
public final class BottomNavigationFloatingButton extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final g f8277a = j7.a.b0(new a(this));

    /* renamed from: b  reason: collision with root package name */
    public boolean f8278b;

    /* renamed from: c  reason: collision with root package name */
    public final g f8279c;

    /* renamed from: d  reason: collision with root package name */
    public final g f8280d;

    /* renamed from: e  reason: collision with root package name */
    public final g f8281e;

    /* renamed from: f  reason: collision with root package name */
    public final g f8282f;

    /* compiled from: BottomNavigationFloatingButton.kt */
    public static final class a extends k implements rk.a<View> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BottomNavigationFloatingButton f8283a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(BottomNavigationFloatingButton bottomNavigationFloatingButton) {
            super(0);
            this.f8283a = bottomNavigationFloatingButton;
        }

        public final Object invoke() {
            return this.f8283a.findViewById(R$id.createFab);
        }
    }

    /* compiled from: BottomNavigationFloatingButton.kt */
    public static final class b extends k implements rk.a<Animation> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f8284a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.f8284a = context;
        }

        public final Object invoke() {
            return AnimationUtils.loadAnimation(this.f8284a, R$anim.from_bottom_anim);
        }
    }

    /* compiled from: BottomNavigationFloatingButton.kt */
    public static final class c extends k implements rk.a<Animation> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f8285a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(0);
            this.f8285a = context;
        }

        public final Object invoke() {
            return AnimationUtils.loadAnimation(this.f8285a, R$anim.rotate_close_anim);
        }
    }

    /* compiled from: BottomNavigationFloatingButton.kt */
    public static final class d extends k implements rk.a<Animation> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f8286a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(0);
            this.f8286a = context;
        }

        public final Object invoke() {
            return AnimationUtils.loadAnimation(this.f8286a, R$anim.rotate_open_anim);
        }
    }

    /* compiled from: BottomNavigationFloatingButton.kt */
    public static final class e extends k implements rk.a<Animation> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f8287a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(Context context) {
            super(0);
            this.f8287a = context;
        }

        public final Object invoke() {
            return AnimationUtils.loadAnimation(this.f8287a, R$anim.to_botton_anim);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavigationFloatingButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        this.f8279c = j7.a.b0(new d(context));
        this.f8280d = j7.a.b0(new c(context));
        this.f8281e = j7.a.b0(new b(context));
        this.f8282f = j7.a.b0(new e(context));
        View.inflate(context, R$layout.floating_button_layout, this);
        getCreateFab().setOnClickListener(new com.google.android.material.textfield.b(this, 5));
    }

    public static void a(BottomNavigationFloatingButton bottomNavigationFloatingButton) {
        j.f(bottomNavigationFloatingButton, "this$0");
        bottomNavigationFloatingButton.setVisibility(bottomNavigationFloatingButton.f8278b);
        bottomNavigationFloatingButton.getClass();
        bottomNavigationFloatingButton.setAnimation(bottomNavigationFloatingButton.f8278b);
        bottomNavigationFloatingButton.f8278b = !bottomNavigationFloatingButton.f8278b;
    }

    private final View getCreateFab() {
        return (View) this.f8277a.getValue();
    }

    private final Animation getFromBottom() {
        Object value = this.f8281e.getValue();
        j.e(value, "getValue(...)");
        return (Animation) value;
    }

    private final Animation getRotateClose() {
        Object value = this.f8280d.getValue();
        j.e(value, "getValue(...)");
        return (Animation) value;
    }

    private final Animation getRotateOpen() {
        Object value = this.f8279c.getValue();
        j.e(value, "getValue(...)");
        return (Animation) value;
    }

    private final Animation getToBottom() {
        Object value = this.f8282f.getValue();
        j.e(value, "getValue(...)");
        return (Animation) value;
    }

    private final void setAnimation(boolean z10) {
    }

    private final void setVisibility(boolean z10) {
    }

    public final boolean getClicked() {
        return this.f8278b;
    }

    public final bf.b getOnBigFabClickListener() {
        return null;
    }

    public final bf.c getOnSmallFabClickListener() {
        return null;
    }

    public final void setBigFabClickListener(bf.b bVar) {
        j.f(bVar, "onBigFabClickListener");
    }

    public final void setClicked(boolean z10) {
        this.f8278b = z10;
    }

    public final void setFabClickListener(bf.c cVar) {
        j.f(cVar, "onSmallFabClickListener");
    }

    public final void setOnBigFabClickListener(bf.b bVar) {
    }

    public final void setOnSmallFabClickListener(bf.c cVar) {
    }
}
