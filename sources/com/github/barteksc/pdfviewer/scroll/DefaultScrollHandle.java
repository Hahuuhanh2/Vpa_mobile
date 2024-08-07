package com.github.barteksc.pdfviewer.scroll;

import al.g0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.R$drawable;

public class DefaultScrollHandle extends RelativeLayout implements z5.a {

    /* renamed from: a  reason: collision with root package name */
    public float f5097a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    public TextView f5098b;

    /* renamed from: c  reason: collision with root package name */
    public Context f5099c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5100d;

    /* renamed from: e  reason: collision with root package name */
    public PDFView f5101e;

    /* renamed from: f  reason: collision with root package name */
    public float f5102f;

    /* renamed from: n  reason: collision with root package name */
    public Handler f5103n = new Handler();

    /* renamed from: o  reason: collision with root package name */
    public a f5104o = new a();

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            DefaultScrollHandle.this.setVisibility(4);
        }
    }

    public DefaultScrollHandle(Context context) {
        super(context);
        this.f5099c = context;
        this.f5100d = false;
        this.f5098b = new TextView(context);
        setVisibility(4);
        setTextColor(-16777216);
        setTextSize(16);
    }

    private void setPosition(float f10) {
        int i10;
        float f11;
        int i11;
        float f12;
        if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
            PDFView pDFView = this.f5101e;
            if (pDFView.N) {
                i10 = pDFView.getHeight();
            } else {
                i10 = pDFView.getWidth();
            }
            float f13 = (float) i10;
            float f14 = f10 - this.f5097a;
            if (f14 < 0.0f) {
                f14 = 0.0f;
            } else if (f14 > f13 - ((float) g0.S(this.f5099c, 40))) {
                f14 = f13 - ((float) g0.S(this.f5099c, 40));
            }
            if (this.f5101e.N) {
                setY(f14);
            } else {
                setX(f14);
            }
            if (this.f5101e.N) {
                f11 = getY();
                f12 = (float) getHeight();
                i11 = this.f5101e.getHeight();
            } else {
                f11 = getX();
                f12 = (float) getWidth();
                i11 = this.f5101e.getWidth();
            }
            this.f5097a = ((f11 + this.f5097a) / ((float) i11)) * f12;
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            com.github.barteksc.pdfviewer.PDFView r0 = r4.f5101e
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0016
            int r0 = r0.getPageCount()
            if (r0 <= 0) goto L_0x0016
            com.github.barteksc.pdfviewer.PDFView r0 = r4.f5101e
            boolean r0 = r0.o()
            if (r0 != 0) goto L_0x0016
            r0 = r1
            goto L_0x0017
        L_0x0016:
            r0 = r2
        L_0x0017:
            if (r0 != 0) goto L_0x001e
            boolean r5 = super.onTouchEvent(r5)
            return r5
        L_0x001e:
            int r0 = r5.getAction()
            if (r0 == 0) goto L_0x0041
            if (r0 == r1) goto L_0x0037
            r3 = 2
            if (r0 == r3) goto L_0x0070
            r3 = 3
            if (r0 == r3) goto L_0x0037
            r3 = 5
            if (r0 == r3) goto L_0x0041
            r2 = 6
            if (r0 == r2) goto L_0x0037
            boolean r5 = super.onTouchEvent(r5)
            return r5
        L_0x0037:
            android.os.Handler r5 = r4.f5103n
            com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle$a r0 = r4.f5104o
            r2 = 1000(0x3e8, double:4.94E-321)
            r5.postDelayed(r0, r2)
            return r1
        L_0x0041:
            com.github.barteksc.pdfviewer.PDFView r0 = r4.f5101e
            w5.a r0 = r0.f5043f
            r0.f16490d = r2
            android.widget.OverScroller r0 = r0.f16489c
            r0.forceFinished(r1)
            android.os.Handler r0 = r4.f5103n
            com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle$a r3 = r4.f5104o
            r0.removeCallbacks(r3)
            com.github.barteksc.pdfviewer.PDFView r0 = r4.f5101e
            boolean r0 = r0.N
            if (r0 == 0) goto L_0x0065
            float r0 = r5.getRawY()
            float r3 = r4.getY()
            float r0 = r0 - r3
            r4.f5102f = r0
            goto L_0x0070
        L_0x0065:
            float r0 = r5.getRawX()
            float r3 = r4.getX()
            float r0 = r0 - r3
            r4.f5102f = r0
        L_0x0070:
            com.github.barteksc.pdfviewer.PDFView r0 = r4.f5101e
            boolean r0 = r0.N
            if (r0 == 0) goto L_0x0091
            float r5 = r5.getRawY()
            float r0 = r4.f5102f
            float r5 = r5 - r0
            float r0 = r4.f5097a
            float r5 = r5 + r0
            r4.setPosition(r5)
            com.github.barteksc.pdfviewer.PDFView r5 = r4.f5101e
            float r0 = r4.f5097a
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            r5.setPositionOffset(r0, r2)
            goto L_0x00ab
        L_0x0091:
            float r5 = r5.getRawX()
            float r0 = r4.f5102f
            float r5 = r5 - r0
            float r0 = r4.f5097a
            float r5 = r5 + r0
            r4.setPosition(r5)
            com.github.barteksc.pdfviewer.PDFView r5 = r4.f5101e
            float r0 = r4.f5097a
            int r3 = r4.getWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            r5.setPositionOffset(r0, r2)
        L_0x00ab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setPageNum(int i10) {
        String valueOf = String.valueOf(i10);
        if (!this.f5098b.getText().equals(valueOf)) {
            this.f5098b.setText(valueOf);
        }
    }

    public void setScroll(float f10) {
        boolean z10;
        int i10;
        if (getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            setVisibility(0);
        } else {
            this.f5103n.removeCallbacks(this.f5104o);
        }
        PDFView pDFView = this.f5101e;
        if (pDFView.N) {
            i10 = pDFView.getHeight();
        } else {
            i10 = pDFView.getWidth();
        }
        setPosition(((float) i10) * f10);
    }

    public void setTextColor(int i10) {
        this.f5098b.setTextColor(i10);
    }

    public void setTextSize(int i10) {
        this.f5098b.setTextSize(1, (float) i10);
    }

    public void setupLayout(PDFView pDFView) {
        Drawable drawable;
        int i10;
        int i11 = 65;
        int i12 = 40;
        if (!pDFView.N) {
            if (this.f5100d) {
                i10 = 10;
                drawable = k1.a.getDrawable(this.f5099c, R$drawable.default_scroll_handle_top);
            } else {
                i10 = 12;
                drawable = k1.a.getDrawable(this.f5099c, R$drawable.default_scroll_handle_bottom);
            }
            i12 = 65;
            i11 = 40;
        } else if (this.f5100d) {
            i10 = 9;
            drawable = k1.a.getDrawable(this.f5099c, R$drawable.default_scroll_handle_left);
        } else {
            i10 = 11;
            drawable = k1.a.getDrawable(this.f5099c, R$drawable.default_scroll_handle_right);
        }
        setBackground(drawable);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(g0.S(this.f5099c, i11), g0.S(this.f5099c, i12));
        layoutParams.setMargins(0, 0, 0, 0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13, -1);
        addView(this.f5098b, layoutParams2);
        layoutParams.addRule(i10);
        pDFView.addView(this, layoutParams);
        this.f5101e = pDFView;
    }
}
