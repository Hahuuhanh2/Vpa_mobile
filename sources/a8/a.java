package a8;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: InsetDialogOnTouchListener */
public final class a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final Dialog f110a;

    /* renamed from: b  reason: collision with root package name */
    public final int f111b;

    /* renamed from: c  reason: collision with root package name */
    public final int f112c;

    /* renamed from: d  reason: collision with root package name */
    public final int f113d;

    public a(Dialog dialog, Rect rect) {
        this.f110a = dialog;
        this.f111b = rect.left;
        this.f112c = rect.top;
        this.f113d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f111b;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f112c;
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f113d;
            obtain.setLocation((float) ((-i10) - 1), (float) ((-i10) - 1));
        }
        view.performClick();
        return this.f110a.onTouchEvent(obtain);
    }
}
