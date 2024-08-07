package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.i;
import i3.h;
import i3.i;
import i3.p;
import java.util.HashMap;

public class ChangeImageTransform extends Transition {
    public static final String[] F = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    public static final a G = new a();
    public static final b H = new b(Matrix.class);

    public class a implements TypeEvaluator<Matrix> {
        public final /* bridge */ /* synthetic */ Object evaluate(float f10, Object obj, Object obj2) {
            Matrix matrix = (Matrix) obj;
            Matrix matrix2 = (Matrix) obj2;
            return null;
        }
    }

    public class b extends Property<ImageView, Matrix> {
        public b(Class cls) {
            super(cls, "animatedTransform");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            ImageView imageView = (ImageView) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            ImageView imageView = (ImageView) obj;
            Matrix matrix = (Matrix) obj2;
            if (Build.VERSION.SDK_INT >= 29) {
                imageView.animateTransform(matrix);
            } else if (matrix == null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable != null) {
                    drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                    imageView.invalidate();
                }
            } else if (h.f11046a) {
                try {
                    imageView.animateTransform(matrix);
                } catch (NoSuchMethodError unused) {
                    h.f11046a = false;
                }
            }
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3411a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3411a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3411a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeImageTransform.c.<clinit>():void");
        }
    }

    public ChangeImageTransform() {
        throw null;
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void L(p pVar) {
        Matrix matrix;
        View view = pVar.f11063b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                HashMap hashMap = pVar.f11062a;
                hashMap.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                Drawable drawable = imageView.getDrawable();
                if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                    matrix = new Matrix(imageView.getImageMatrix());
                } else {
                    int i10 = c.f3411a[imageView.getScaleType().ordinal()];
                    if (i10 == 1) {
                        Drawable drawable2 = imageView.getDrawable();
                        Matrix matrix2 = new Matrix();
                        matrix2.postScale(((float) imageView.getWidth()) / ((float) drawable2.getIntrinsicWidth()), ((float) imageView.getHeight()) / ((float) drawable2.getIntrinsicHeight()));
                        matrix = matrix2;
                    } else if (i10 != 2) {
                        matrix = new Matrix(imageView.getImageMatrix());
                    } else {
                        Drawable drawable3 = imageView.getDrawable();
                        int intrinsicWidth = drawable3.getIntrinsicWidth();
                        float width = (float) imageView.getWidth();
                        float f10 = (float) intrinsicWidth;
                        int intrinsicHeight = drawable3.getIntrinsicHeight();
                        float height = (float) imageView.getHeight();
                        float f11 = (float) intrinsicHeight;
                        float max = Math.max(width / f10, height / f11);
                        int round = Math.round((width - (f10 * max)) / 2.0f);
                        int round2 = Math.round((height - (f11 * max)) / 2.0f);
                        Matrix matrix3 = new Matrix();
                        matrix3.postScale(max, max);
                        matrix3.postTranslate((float) round, (float) round2);
                        matrix = matrix3;
                    }
                }
                hashMap.put("android:changeImageTransform:matrix", matrix);
            }
        }
    }

    public final void e(p pVar) {
        L(pVar);
    }

    public final void j(p pVar) {
        L(pVar);
    }

    public final Animator n(ViewGroup viewGroup, p pVar, p pVar2) {
        boolean z10;
        if (pVar == null || pVar2 == null) {
            return null;
        }
        Rect rect = (Rect) pVar.f11062a.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) pVar2.f11062a.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) pVar.f11062a.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) pVar2.f11062a.get("android:changeImageTransform:matrix");
        if (!(matrix == null && matrix2 == null) && (matrix == null || !matrix.equals(matrix2))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (rect.equals(rect2) && z10) {
            return null;
        }
        ImageView imageView = (ImageView) pVar2.f11063b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            b bVar = H;
            a aVar = G;
            i.a aVar2 = i.f11047a;
            return ObjectAnimator.ofObject(imageView, bVar, aVar, new Matrix[]{aVar2, aVar2});
        }
        if (matrix == null) {
            matrix = i.f11047a;
        }
        if (matrix2 == null) {
            matrix2 = i.f11047a;
        }
        b bVar2 = H;
        bVar2.set(imageView, matrix);
        return ObjectAnimator.ofObject(imageView, bVar2, new i.a(), new Matrix[]{matrix, matrix2});
    }

    public final String[] s() {
        return F;
    }
}
