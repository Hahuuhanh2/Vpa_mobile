package com.journeyapps.barcodescanner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.zxing.client.android.R$id;
import com.google.zxing.client.android.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;
import xd.k;
import xd.l;
import xd.m;
import yd.d;
import yd.f;
import yd.g;
import yd.h;
import yd.i;
import yd.j;
import yd.n;

public class CameraPreview extends ViewGroup {
    public static final /* synthetic */ int H = 0;
    public double A = 0.1d;
    public n B = null;
    public boolean C = false;
    public final a D = new a();
    public final b E = new b();
    public c F = new c();
    public final d G = new d();

    /* renamed from: a  reason: collision with root package name */
    public yd.d f7971a;

    /* renamed from: b  reason: collision with root package name */
    public WindowManager f7972b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f7973c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7974d = false;

    /* renamed from: e  reason: collision with root package name */
    public SurfaceView f7975e;

    /* renamed from: f  reason: collision with root package name */
    public TextureView f7976f;

    /* renamed from: n  reason: collision with root package name */
    public boolean f7977n = false;

    /* renamed from: o  reason: collision with root package name */
    public m f7978o;

    /* renamed from: p  reason: collision with root package name */
    public int f7979p = -1;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f7980q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    public i f7981r;

    /* renamed from: s  reason: collision with root package name */
    public f f7982s = new f();

    /* renamed from: t  reason: collision with root package name */
    public xd.n f7983t;

    /* renamed from: u  reason: collision with root package name */
    public xd.n f7984u;

    /* renamed from: v  reason: collision with root package name */
    public Rect f7985v;

    /* renamed from: w  reason: collision with root package name */
    public xd.n f7986w;

    /* renamed from: x  reason: collision with root package name */
    public Rect f7987x = null;

    /* renamed from: y  reason: collision with root package name */
    public Rect f7988y = null;

    /* renamed from: z  reason: collision with root package name */
    public xd.n f7989z = null;

    public class a implements SurfaceHolder.Callback {
        public a() {
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            if (surfaceHolder == null) {
                int i13 = CameraPreview.H;
                return;
            }
            CameraPreview cameraPreview = CameraPreview.this;
            cameraPreview.f7986w = new xd.n(i11, i12);
            cameraPreview.h();
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            CameraPreview.this.f7986w = null;
        }
    }

    public class b implements Handler.Callback {
        public b() {
        }

        public final boolean handleMessage(Message message) {
            i iVar;
            int i10 = message.what;
            boolean z10 = true;
            if (i10 == R$id.zxing_prewiew_size_ready) {
                CameraPreview cameraPreview = CameraPreview.this;
                xd.n nVar = (xd.n) message.obj;
                cameraPreview.f7984u = nVar;
                xd.n nVar2 = cameraPreview.f7983t;
                if (nVar2 != null) {
                    if (nVar == null || (iVar = cameraPreview.f7981r) == null) {
                        cameraPreview.f7988y = null;
                        cameraPreview.f7987x = null;
                        cameraPreview.f7985v = null;
                        throw new IllegalStateException("containerSize or previewSize is not set yet");
                    }
                    int i11 = nVar.f17310a;
                    int i12 = nVar.f17311b;
                    int i13 = nVar2.f17310a;
                    int i14 = nVar2.f17311b;
                    cameraPreview.f7985v = iVar.f17719c.b(nVar, iVar.f17717a);
                    Rect rect = new Rect(0, 0, i13, i14);
                    Rect rect2 = cameraPreview.f7985v;
                    Rect rect3 = new Rect(rect);
                    rect3.intersect(rect2);
                    if (cameraPreview.f7989z != null) {
                        rect3.inset(Math.max(0, (rect3.width() - cameraPreview.f7989z.f17310a) / 2), Math.max(0, (rect3.height() - cameraPreview.f7989z.f17311b) / 2));
                    } else {
                        int min = (int) Math.min(((double) rect3.width()) * cameraPreview.A, ((double) rect3.height()) * cameraPreview.A);
                        rect3.inset(min, min);
                        if (rect3.height() > rect3.width()) {
                            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
                        }
                    }
                    cameraPreview.f7987x = rect3;
                    Rect rect4 = new Rect(cameraPreview.f7987x);
                    Rect rect5 = cameraPreview.f7985v;
                    rect4.offset(-rect5.left, -rect5.top);
                    Rect rect6 = new Rect((rect4.left * i11) / cameraPreview.f7985v.width(), (rect4.top * i12) / cameraPreview.f7985v.height(), (rect4.right * i11) / cameraPreview.f7985v.width(), (rect4.bottom * i12) / cameraPreview.f7985v.height());
                    cameraPreview.f7988y = rect6;
                    if (rect6.width() <= 0 || cameraPreview.f7988y.height() <= 0) {
                        cameraPreview.f7988y = null;
                        cameraPreview.f7987x = null;
                    } else {
                        cameraPreview.G.a();
                    }
                    cameraPreview.requestLayout();
                    cameraPreview.h();
                }
                return true;
            }
            if (i10 == R$id.zxing_camera_error) {
                Exception exc = (Exception) message.obj;
                CameraPreview cameraPreview2 = CameraPreview.this;
                if (cameraPreview2.f7971a == null) {
                    z10 = false;
                }
                if (z10) {
                    cameraPreview2.d();
                    CameraPreview.this.G.b(exc);
                }
            } else if (i10 == R$id.zxing_camera_closed) {
                CameraPreview.this.G.d();
            }
            return false;
        }
    }

    public class c implements k {
        public c() {
        }
    }

    public class d implements e {
        public d() {
        }

        public final void a() {
            Iterator it = CameraPreview.this.f7980q.iterator();
            while (it.hasNext()) {
                ((e) it.next()).a();
            }
        }

        public final void b(Exception exc) {
            Iterator it = CameraPreview.this.f7980q.iterator();
            while (it.hasNext()) {
                ((e) it.next()).b(exc);
            }
        }

        public final void c() {
            Iterator it = CameraPreview.this.f7980q.iterator();
            while (it.hasNext()) {
                ((e) it.next()).c();
            }
        }

        public final void d() {
            Iterator it = CameraPreview.this.f7980q.iterator();
            while (it.hasNext()) {
                ((e) it.next()).d();
            }
        }

        public final void e() {
            Iterator it = CameraPreview.this.f7980q.iterator();
            while (it.hasNext()) {
                ((e) it.next()).e();
            }
        }
    }

    public interface e {
        void a();

        void b(Exception exc);

        void c();

        void d();

        void e();
    }

    static {
        Class<CameraPreview> cls = CameraPreview.class;
    }

    public CameraPreview(Context context) {
        super(context);
        b(context, (AttributeSet) null);
    }

    public static void a(CameraPreview cameraPreview) {
        boolean z10;
        if (cameraPreview.f7971a != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && cameraPreview.getDisplayRotation() != cameraPreview.f7979p) {
            cameraPreview.d();
            cameraPreview.f();
        }
    }

    private int getDisplayRotation() {
        return this.f7972b.getDefaultDisplay().getRotation();
    }

    public final void b(Context context, AttributeSet attributeSet) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        c(attributeSet);
        this.f7972b = (WindowManager) context.getSystemService("window");
        this.f7973c = new Handler(this.E);
        this.f7978o = new m();
    }

    public final void c(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.zxing_camera_preview);
        int dimension = (int) obtainStyledAttributes.getDimension(R$styleable.zxing_camera_preview_zxing_framing_rect_width, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(R$styleable.zxing_camera_preview_zxing_framing_rect_height, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f7989z = new xd.n(dimension, dimension2);
        }
        this.f7974d = obtainStyledAttributes.getBoolean(R$styleable.zxing_camera_preview_zxing_use_texture_view, true);
        int integer = obtainStyledAttributes.getInteger(R$styleable.zxing_camera_preview_zxing_preview_scaling_strategy, -1);
        if (integer == 1) {
            this.B = new h();
        } else if (integer == 2) {
            this.B = new j();
        } else if (integer == 3) {
            this.B = new yd.k();
        }
        obtainStyledAttributes.recycle();
    }

    public void d() {
        TextureView textureView;
        SurfaceView surfaceView;
        j7.a.F0();
        this.f7979p = -1;
        yd.d dVar = this.f7971a;
        if (dVar != null) {
            j7.a.F0();
            if (dVar.f17682f) {
                dVar.f17677a.b(dVar.f17689m);
            } else {
                dVar.f17683g = true;
            }
            dVar.f17682f = false;
            this.f7971a = null;
            this.f7977n = false;
        } else {
            this.f7973c.sendEmptyMessage(R$id.zxing_camera_closed);
        }
        if (this.f7986w == null && (surfaceView = this.f7975e) != null) {
            surfaceView.getHolder().removeCallback(this.D);
        }
        if (this.f7986w == null && (textureView = this.f7976f) != null) {
            textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
        }
        this.f7983t = null;
        this.f7984u = null;
        this.f7988y = null;
        m mVar = this.f7978o;
        l lVar = mVar.f17308c;
        if (lVar != null) {
            lVar.disable();
        }
        mVar.f17308c = null;
        mVar.f17307b = null;
        mVar.f17309d = null;
        this.G.c();
    }

    public void e() {
    }

    public final void f() {
        j7.a.F0();
        if (this.f7971a == null) {
            yd.d dVar = new yd.d(getContext());
            f fVar = this.f7982s;
            if (!dVar.f17682f) {
                dVar.f17685i = fVar;
                dVar.f17679c.f17701g = fVar;
            }
            this.f7971a = dVar;
            dVar.f17680d = this.f7973c;
            j7.a.F0();
            dVar.f17682f = true;
            dVar.f17683g = false;
            g gVar = dVar.f17677a;
            d.a aVar = dVar.f17686j;
            synchronized (gVar.f17716d) {
                gVar.f17715c++;
                gVar.b(aVar);
            }
            this.f7979p = getDisplayRotation();
        }
        if (this.f7986w != null) {
            h();
        } else {
            SurfaceView surfaceView = this.f7975e;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.D);
            } else {
                TextureView textureView = this.f7976f;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        this.f7976f.getSurfaceTexture();
                        this.f7986w = new xd.n(this.f7976f.getWidth(), this.f7976f.getHeight());
                        h();
                    } else {
                        this.f7976f.setSurfaceTextureListener(new xd.c(this));
                    }
                }
            }
        }
        requestLayout();
        m mVar = this.f7978o;
        Context context = getContext();
        c cVar = this.F;
        l lVar = mVar.f17308c;
        if (lVar != null) {
            lVar.disable();
        }
        mVar.f17308c = null;
        mVar.f17307b = null;
        mVar.f17309d = null;
        Context applicationContext = context.getApplicationContext();
        mVar.f17309d = cVar;
        mVar.f17307b = (WindowManager) applicationContext.getSystemService("window");
        l lVar2 = new l(mVar, applicationContext);
        mVar.f17308c = lVar2;
        lVar2.enable();
        mVar.f17306a = mVar.f17307b.getDefaultDisplay().getRotation();
    }

    public final void g(x2.g gVar) {
        yd.d dVar;
        if (!this.f7977n && (dVar = this.f7971a) != null) {
            dVar.f17678b = gVar;
            j7.a.F0();
            if (dVar.f17682f) {
                dVar.f17677a.b(dVar.f17688l);
                this.f7977n = true;
                e();
                this.G.e();
                return;
            }
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    public yd.d getCameraInstance() {
        return this.f7971a;
    }

    public f getCameraSettings() {
        return this.f7982s;
    }

    public Rect getFramingRect() {
        return this.f7987x;
    }

    public xd.n getFramingRectSize() {
        return this.f7989z;
    }

    public double getMarginFraction() {
        return this.A;
    }

    public Rect getPreviewFramingRect() {
        return this.f7988y;
    }

    public n getPreviewScalingStrategy() {
        n nVar = this.B;
        if (nVar != null) {
            return nVar;
        }
        if (this.f7976f != null) {
            return new h();
        }
        return new j();
    }

    public final void h() {
        Rect rect;
        float f10;
        xd.n nVar = this.f7986w;
        if (nVar != null && this.f7984u != null && (rect = this.f7985v) != null) {
            if (this.f7975e == null || !nVar.equals(new xd.n(rect.width(), this.f7985v.height()))) {
                TextureView textureView = this.f7976f;
                if (textureView != null && textureView.getSurfaceTexture() != null) {
                    if (this.f7984u != null) {
                        int width = this.f7976f.getWidth();
                        int height = this.f7976f.getHeight();
                        xd.n nVar2 = this.f7984u;
                        float f11 = ((float) width) / ((float) height);
                        float f12 = ((float) nVar2.f17310a) / ((float) nVar2.f17311b);
                        float f13 = 1.0f;
                        if (f11 < f12) {
                            float f14 = f12 / f11;
                            f10 = 1.0f;
                            f13 = f14;
                        } else {
                            f10 = f11 / f12;
                        }
                        Matrix matrix = new Matrix();
                        matrix.setScale(f13, f10);
                        float f15 = (float) width;
                        float f16 = (float) height;
                        matrix.postTranslate((f15 - (f13 * f15)) / 2.0f, (f16 - (f10 * f16)) / 2.0f);
                        this.f7976f.setTransform(matrix);
                    }
                    g(new x2.g(this.f7976f.getSurfaceTexture()));
                    return;
                }
                return;
            }
            g(new x2.g(this.f7975e.getHolder()));
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7974d) {
            TextureView textureView = new TextureView(getContext());
            this.f7976f = textureView;
            textureView.setSurfaceTextureListener(new xd.c(this));
            addView(this.f7976f);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.f7975e = surfaceView;
        surfaceView.getHolder().addCallback(this.D);
        addView(this.f7975e);
    }

    @SuppressLint({"DrawAllocation"})
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        xd.n nVar = new xd.n(i12 - i10, i13 - i11);
        this.f7983t = nVar;
        yd.d dVar = this.f7971a;
        if (dVar != null && dVar.f17681e == null) {
            i iVar = new i(getDisplayRotation(), nVar);
            this.f7981r = iVar;
            iVar.f17719c = getPreviewScalingStrategy();
            yd.d dVar2 = this.f7971a;
            i iVar2 = this.f7981r;
            dVar2.f17681e = iVar2;
            dVar2.f17679c.f17702h = iVar2;
            j7.a.F0();
            if (dVar2.f17682f) {
                dVar2.f17677a.b(dVar2.f17687k);
                boolean z11 = this.C;
                if (z11) {
                    yd.d dVar3 = this.f7971a;
                    dVar3.getClass();
                    j7.a.F0();
                    if (dVar3.f17682f) {
                        dVar3.f17677a.b(new yd.b(dVar3, z11));
                    }
                }
            } else {
                throw new IllegalStateException("CameraInstance is not open");
            }
        }
        SurfaceView surfaceView = this.f7975e;
        if (surfaceView != null) {
            Rect rect = this.f7985v;
            if (rect == null) {
                surfaceView.layout(0, 0, getWidth(), getHeight());
            } else {
                surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        } else {
            TextureView textureView = this.f7976f;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
            }
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.C);
        return bundle;
    }

    public void setCameraSettings(f fVar) {
        this.f7982s = fVar;
    }

    public void setFramingRectSize(xd.n nVar) {
        this.f7989z = nVar;
    }

    public void setMarginFraction(double d10) {
        if (d10 < 0.5d) {
            this.A = d10;
            return;
        }
        throw new IllegalArgumentException("The margin fraction must be less than 0.5");
    }

    public void setPreviewScalingStrategy(n nVar) {
        this.B = nVar;
    }

    public void setTorch(boolean z10) {
        this.C = z10;
        yd.d dVar = this.f7971a;
        if (dVar != null) {
            j7.a.F0();
            if (dVar.f17682f) {
                dVar.f17677a.b(new yd.b(dVar, z10));
            }
        }
    }

    public void setUseTextureView(boolean z10) {
        this.f7974d = z10;
    }

    public CameraPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
    }

    public CameraPreview(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b(context, attributeSet);
    }
}
