package ue;

import android.view.ScaleGestureDetector;
import ue.k;

/* compiled from: CustomGestureDetector */
public final class a implements ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public float f15525a;

    /* renamed from: b  reason: collision with root package name */
    public float f15526b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f15527c;

    public a(b bVar) {
        this.f15527c = bVar;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        if (scaleFactor < 0.0f) {
            return true;
        }
        ((k.a) this.f15527c.f15537j).a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), scaleGestureDetector.getFocusX() - this.f15525a, scaleGestureDetector.getFocusY() - this.f15526b);
        this.f15525a = scaleGestureDetector.getFocusX();
        this.f15526b = scaleGestureDetector.getFocusY();
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f15525a = scaleGestureDetector.getFocusX();
        this.f15526b = scaleGestureDetector.getFocusY();
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}
