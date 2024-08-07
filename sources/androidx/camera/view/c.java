package androidx.camera.view;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import c0.d1;
import java.util.concurrent.Executor;
import r0.f;

/* compiled from: PreviewViewImplementation */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public Size f1495a;

    /* renamed from: b  reason: collision with root package name */
    public FrameLayout f1496b;

    /* renamed from: c  reason: collision with root package name */
    public final b f1497c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1498d = false;

    /* compiled from: PreviewViewImplementation */
    public interface a {
    }

    public c(PreviewView previewView, b bVar) {
        this.f1496b = previewView;
        this.f1497c = bVar;
    }

    public abstract View a();

    public abstract Bitmap b();

    public abstract void c();

    public abstract void d();

    public abstract void e(d1 d1Var, f fVar);

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0076, code lost:
        if (r6 != 0) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r9 = this;
            android.view.View r0 = r9.a()
            if (r0 == 0) goto L_0x00c7
            boolean r1 = r9.f1498d
            if (r1 != 0) goto L_0x000c
            goto L_0x00c7
        L_0x000c:
            androidx.camera.view.b r1 = r9.f1497c
            android.util.Size r2 = new android.util.Size
            android.widget.FrameLayout r3 = r9.f1496b
            int r3 = r3.getWidth()
            android.widget.FrameLayout r4 = r9.f1496b
            int r4 = r4.getHeight()
            r2.<init>(r3, r4)
            android.widget.FrameLayout r3 = r9.f1496b
            int r3 = r3.getLayoutDirection()
            r1.getClass()
            int r4 = r2.getHeight()
            java.lang.String r5 = "PreviewTransform"
            if (r4 == 0) goto L_0x00c1
            int r4 = r2.getWidth()
            if (r4 != 0) goto L_0x0038
            goto L_0x00c1
        L_0x0038:
            boolean r4 = r1.f()
            if (r4 != 0) goto L_0x0040
            goto L_0x00c7
        L_0x0040:
            boolean r4 = r0 instanceof android.view.TextureView
            if (r4 == 0) goto L_0x004f
            r4 = r0
            android.view.TextureView r4 = (android.view.TextureView) r4
            android.graphics.Matrix r5 = r1.d()
            r4.setTransform(r5)
            goto L_0x0081
        L_0x004f:
            android.view.Display r4 = r0.getDisplay()
            boolean r6 = r1.f1493g
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L_0x0065
            if (r4 == 0) goto L_0x0065
            int r4 = r4.getRotation()
            int r6 = r1.f1491e
            if (r4 == r6) goto L_0x0065
            r4 = r7
            goto L_0x0066
        L_0x0065:
            r4 = r8
        L_0x0066:
            boolean r6 = r1.f1493g
            if (r6 != 0) goto L_0x0079
            if (r6 != 0) goto L_0x006f
            int r6 = r1.f1489c
            goto L_0x0076
        L_0x006f:
            int r6 = r1.f1491e
            int r6 = p3.l0.M0(r6)
            int r6 = -r6
        L_0x0076:
            if (r6 == 0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r7 = r8
        L_0x007a:
            if (r4 != 0) goto L_0x007e
            if (r7 == 0) goto L_0x0081
        L_0x007e:
            c0.p0.b(r5)
        L_0x0081:
            android.graphics.RectF r2 = r1.e(r3, r2)
            r3 = 0
            r0.setPivotX(r3)
            r0.setPivotY(r3)
            float r3 = r2.width()
            android.util.Size r4 = r1.f1487a
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            r0.setScaleX(r3)
            float r3 = r2.height()
            android.util.Size r1 = r1.f1487a
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r3 = r3 / r1
            r0.setScaleY(r3)
            float r1 = r2.left
            int r3 = r0.getLeft()
            float r3 = (float) r3
            float r1 = r1 - r3
            r0.setTranslationX(r1)
            float r1 = r2.top
            int r2 = r0.getTop()
            float r2 = (float) r2
            float r1 = r1 - r2
            r0.setTranslationY(r1)
            goto L_0x00c7
        L_0x00c1:
            r2.toString()
            c0.p0.g(r5)
        L_0x00c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.c.f():void");
    }

    public abstract void g(Executor executor, PreviewView.d dVar);

    public abstract v8.a<Void> h();
}
