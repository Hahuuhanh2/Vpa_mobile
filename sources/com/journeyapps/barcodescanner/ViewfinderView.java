package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.zxing.client.android.R$color;
import com.google.zxing.client.android.R$styleable;
import com.journeyapps.barcodescanner.CameraPreview;
import java.util.ArrayList;
import java.util.List;
import uc.j;

public class ViewfinderView extends View {

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f8001r = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f8002a = new Paint(1);

    /* renamed from: b  reason: collision with root package name */
    public final int f8003b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8004c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8005d;

    /* renamed from: e  reason: collision with root package name */
    public int f8006e;

    /* renamed from: f  reason: collision with root package name */
    public List<j> f8007f;

    /* renamed from: n  reason: collision with root package name */
    public List<j> f8008n;

    /* renamed from: o  reason: collision with root package name */
    public CameraPreview f8009o;

    /* renamed from: p  reason: collision with root package name */
    public Rect f8010p;

    /* renamed from: q  reason: collision with root package name */
    public Rect f8011q;

    public class a implements CameraPreview.e {
        public a() {
        }

        public final void a() {
            ViewfinderView viewfinderView = ViewfinderView.this;
            CameraPreview cameraPreview = viewfinderView.f8009o;
            if (cameraPreview != null) {
                Rect framingRect = cameraPreview.getFramingRect();
                Rect previewFramingRect = viewfinderView.f8009o.getPreviewFramingRect();
                if (!(framingRect == null || previewFramingRect == null)) {
                    viewfinderView.f8010p = framingRect;
                    viewfinderView.f8011q = previewFramingRect;
                }
            }
            ViewfinderView.this.invalidate();
        }

        public final void b(Exception exc) {
        }

        public final void c() {
        }

        public final void d() {
        }

        public final void e() {
        }
    }

    static {
        Class<ViewfinderView> cls = ViewfinderView.class;
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.zxing_finder);
        this.f8003b = obtainStyledAttributes.getColor(R$styleable.zxing_finder_zxing_viewfinder_mask, resources.getColor(R$color.zxing_viewfinder_mask));
        obtainStyledAttributes.getColor(R$styleable.zxing_finder_zxing_result_view, resources.getColor(R$color.zxing_result_view));
        this.f8004c = obtainStyledAttributes.getColor(R$styleable.zxing_finder_zxing_viewfinder_laser, resources.getColor(R$color.zxing_viewfinder_laser));
        this.f8005d = obtainStyledAttributes.getColor(R$styleable.zxing_finder_zxing_possible_result_points, resources.getColor(R$color.zxing_possible_result_points));
        obtainStyledAttributes.recycle();
        this.f8006e = 0;
        this.f8007f = new ArrayList(20);
        this.f8008n = new ArrayList(20);
    }

    public final void onDraw(Canvas canvas) {
        Rect rect;
        CameraPreview cameraPreview = this.f8009o;
        if (cameraPreview != null) {
            Rect framingRect = cameraPreview.getFramingRect();
            Rect previewFramingRect = this.f8009o.getPreviewFramingRect();
            if (!(framingRect == null || previewFramingRect == null)) {
                this.f8010p = framingRect;
                this.f8011q = previewFramingRect;
            }
        }
        Rect rect2 = this.f8010p;
        if (rect2 != null && (rect = this.f8011q) != null) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            this.f8002a.setColor(this.f8003b);
            float f10 = (float) width;
            canvas.drawRect(0.0f, 0.0f, f10, (float) rect2.top, this.f8002a);
            canvas.drawRect(0.0f, (float) rect2.top, (float) rect2.left, (float) (rect2.bottom + 1), this.f8002a);
            float f11 = f10;
            canvas.drawRect((float) (rect2.right + 1), (float) rect2.top, f11, (float) (rect2.bottom + 1), this.f8002a);
            canvas.drawRect(0.0f, (float) (rect2.bottom + 1), f11, (float) height, this.f8002a);
            this.f8002a.setColor(this.f8004c);
            this.f8002a.setAlpha(f8001r[this.f8006e]);
            this.f8006e = (this.f8006e + 1) % 8;
            int height2 = (rect2.height() / 2) + rect2.top;
            canvas.drawRect((float) (rect2.left + 2), (float) (height2 - 1), (float) (rect2.right - 1), (float) (height2 + 2), this.f8002a);
            float width2 = ((float) rect2.width()) / ((float) rect.width());
            float height3 = ((float) rect2.height()) / ((float) rect.height());
            int i10 = rect2.left;
            int i11 = rect2.top;
            if (!this.f8008n.isEmpty()) {
                this.f8002a.setAlpha(80);
                this.f8002a.setColor(this.f8005d);
                for (j next : this.f8008n) {
                    canvas.drawCircle((float) (((int) (next.f15488a * width2)) + i10), (float) (((int) (next.f15489b * height3)) + i11), 3.0f, this.f8002a);
                }
                this.f8008n.clear();
            }
            if (!this.f8007f.isEmpty()) {
                this.f8002a.setAlpha(160);
                this.f8002a.setColor(this.f8005d);
                for (j next2 : this.f8007f) {
                    canvas.drawCircle((float) (((int) (next2.f15488a * width2)) + i10), (float) (((int) (next2.f15489b * height3)) + i11), 6.0f, this.f8002a);
                }
                List<j> list = this.f8007f;
                List<j> list2 = this.f8008n;
                this.f8007f = list2;
                this.f8008n = list;
                list2.clear();
            }
            postInvalidateDelayed(80, rect2.left - 6, rect2.top - 6, rect2.right + 6, rect2.bottom + 6);
        }
    }

    public void setCameraPreview(CameraPreview cameraPreview) {
        this.f8009o = cameraPreview;
        cameraPreview.f7980q.add(new a());
    }
}
