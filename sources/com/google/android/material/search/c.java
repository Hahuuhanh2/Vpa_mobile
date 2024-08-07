package com.google.android.material.search;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.vpa.daugia.ui.common.DemoActivity;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6688a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f6689b;

    public /* synthetic */ c(KeyEvent.Callback callback, int i10) {
        this.f6688a = i10;
        this.f6689b = callback;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f6688a) {
            case 0:
                SearchView searchView = (SearchView) this.f6689b;
                int i10 = SearchView.K;
                if (searchView.g()) {
                    searchView.f();
                }
                return false;
            default:
                DemoActivity demoActivity = (DemoActivity) this.f6689b;
                int i11 = DemoActivity.f19915a0;
                j.f(demoActivity, "this$0");
                int action = motionEvent.getAction();
                if (action == 0) {
                    demoActivity.S = view.getX() - motionEvent.getRawX();
                    demoActivity.T = view.getY() - motionEvent.getRawY();
                    demoActivity.U = view.getX();
                    demoActivity.V = view.getY();
                    Path path = new Path();
                    path.moveTo(demoActivity.U, demoActivity.V);
                    demoActivity.W = path;
                    demoActivity.X = false;
                } else if (action != 1) {
                    if (action == 2) {
                        float rawX = motionEvent.getRawX() + demoActivity.S;
                        float rawY = motionEvent.getRawY() + demoActivity.T;
                        demoActivity.W.lineTo(rawX, rawY);
                        view.animate().x(rawX).y(rawY).setDuration(0).start();
                        demoActivity.X = true;
                    }
                } else if (!demoActivity.X) {
                    view.performClick();
                } else {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.X, View.Y, demoActivity.W);
                    ofFloat.setDuration(0);
                    ofFloat.start();
                }
                return true;
        }
    }
}
