package w5;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.vpa.daugia.module.history.ui.activity.AuctionReportActivity;
import com.vpa.daugia.module.payment.ui.activity.RegulationActivity;
import x5.h;
import z5.a;

/* compiled from: DragPinchManager */
public final class d implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public PDFView f16507a;

    /* renamed from: b  reason: collision with root package name */
    public a f16508b;

    /* renamed from: c  reason: collision with root package name */
    public GestureDetector f16509c;

    /* renamed from: d  reason: collision with root package name */
    public ScaleGestureDetector f16510d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16511e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16512f = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f16513n = false;

    public d(PDFView pDFView, a aVar) {
        this.f16507a = pDFView;
        this.f16508b = aVar;
        this.f16511e = false;
        pDFView.getClass();
        this.f16509c = new GestureDetector(pDFView.getContext(), this);
        this.f16510d = new ScaleGestureDetector(pDFView.getContext(), this);
        pDFView.setOnTouchListener(this);
    }

    public final void a() {
        boolean z10;
        if (this.f16507a.getScrollHandle() != null) {
            if (((DefaultScrollHandle) this.f16507a.getScrollHandle()).getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                DefaultScrollHandle defaultScrollHandle = (DefaultScrollHandle) this.f16507a.getScrollHandle();
                defaultScrollHandle.f5103n.postDelayed(defaultScrollHandle.f5104o, 1000);
            }
        }
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.f16507a.getZoom() < this.f16507a.getMidZoom()) {
            PDFView pDFView = this.f16507a;
            pDFView.f5043f.a(motionEvent.getX(), motionEvent.getY(), pDFView.f5056z, this.f16507a.getMidZoom());
            return true;
        } else if (this.f16507a.getZoom() < this.f16507a.getMaxZoom()) {
            PDFView pDFView2 = this.f16507a;
            pDFView2.f5043f.a(motionEvent.getX(), motionEvent.getY(), pDFView2.f5056z, this.f16507a.getMaxZoom());
            return true;
        } else {
            PDFView pDFView3 = this.f16507a;
            pDFView3.f5043f.a((float) (pDFView3.getWidth() / 2), (float) (pDFView3.getHeight() / 2), pDFView3.f5056z, pDFView3.f5037a);
            return true;
        }
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        a aVar = this.f16508b;
        aVar.f16490d = false;
        aVar.f16489c.forceFinished(true);
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float f12;
        float f13;
        int currentXOffset = (int) this.f16507a.getCurrentXOffset();
        int currentYOffset = (int) this.f16507a.getCurrentYOffset();
        PDFView pDFView = this.f16507a;
        if (pDFView.N) {
            f13 = -((pDFView.getOptimalPageWidth() * pDFView.f5056z) - ((float) this.f16507a.getWidth()));
            f12 = -(this.f16507a.l() - ((float) this.f16507a.getHeight()));
        } else {
            f13 = -(pDFView.l() - ((float) this.f16507a.getWidth()));
            PDFView pDFView2 = this.f16507a;
            f12 = -((pDFView2.getOptimalPageHeight() * pDFView2.f5056z) - ((float) this.f16507a.getHeight()));
        }
        a aVar = this.f16508b;
        aVar.b();
        aVar.f16490d = true;
        aVar.f16489c.fling(currentXOffset, currentYOffset, (int) f10, (int) f11, (int) f13, 0, (int) f12, 0);
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float f10;
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float zoom = this.f16507a.getZoom() * scaleFactor;
        float f11 = 1.0f;
        if (zoom < 1.0f) {
            f10 = this.f16507a.getZoom();
        } else {
            f11 = 10.0f;
            if (zoom > 10.0f) {
                f10 = this.f16507a.getZoom();
            }
            PDFView pDFView = this.f16507a;
            PointF pointF = new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            float f12 = pDFView.f5056z;
            float f13 = scaleFactor * f12;
            float f14 = f13 / f12;
            pDFView.f5056z = f13;
            float f15 = pDFView.f5055y * f14;
            float f16 = pointF.x;
            float f17 = (f16 - (f16 * f14)) + (pDFView.f5054x * f14);
            float f18 = pointF.y;
            pDFView.u(f17, (f18 - (f14 * f18)) + f15, true);
            return true;
        }
        scaleFactor = f11 / f10;
        PDFView pDFView2 = this.f16507a;
        PointF pointF2 = new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        float f122 = pDFView2.f5056z;
        float f132 = scaleFactor * f122;
        float f142 = f132 / f122;
        pDFView2.f5056z = f132;
        float f152 = pDFView2.f5055y * f142;
        float f162 = pointF2.x;
        float f172 = (f162 - (f162 * f142)) + (pDFView2.f5054x * f142);
        float f182 = pointF2.y;
        pDFView2.u(f172, (f182 - (f142 * f182)) + f152, true);
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f16513n = true;
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f16507a.t();
        a();
        this.f16513n = false;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z10;
        this.f16512f = true;
        PDFView pDFView = this.f16507a;
        if (pDFView.f5056z != pDFView.f5037a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f16511e) {
            pDFView.u(pDFView.f5054x + (-f10), pDFView.f5055y + (-f11), true);
        }
        if (this.f16513n) {
            this.f16507a.getClass();
        } else {
            this.f16507a.s();
        }
        return true;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        boolean z10;
        h onTapListener = this.f16507a.getOnTapListener();
        if (onTapListener != null) {
            switch (((kh.h) onTapListener).f20819a) {
                case 1:
                    int i10 = AuctionReportActivity.V;
                    break;
                case 2:
                    break;
                default:
                    int i11 = RegulationActivity.O;
                    break;
            }
        } else {
            a scrollHandle = this.f16507a.getScrollHandle();
            if (scrollHandle != null && !this.f16507a.o()) {
                DefaultScrollHandle defaultScrollHandle = (DefaultScrollHandle) scrollHandle;
                if (defaultScrollHandle.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    defaultScrollHandle.setVisibility(0);
                } else {
                    defaultScrollHandle.setVisibility(4);
                }
            }
        }
        this.f16507a.performClick();
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean onTouchEvent = this.f16510d.onTouchEvent(motionEvent);
        if (this.f16509c.onTouchEvent(motionEvent) || onTouchEvent) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (motionEvent.getAction() == 1 && this.f16512f) {
            this.f16512f = false;
            this.f16507a.t();
            a();
        }
        return z10;
    }
}
