package com.github.barteksc.pdfviewer;

import al.g0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.GestureDetector;
import android.widget.RelativeLayout;
import com.github.barteksc.pdfviewer.a;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.vpa.daugia.module.history.ui.activity.AuctionReportActivity;
import com.vpa.daugia.module.payment.ui.activity.RegulationActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3.l0;
import w5.c;
import w5.e;
import x5.d;
import x5.f;
import x5.g;
import x5.h;
import z.j;
import zg.a0;

public class PDFView extends RelativeLayout {

    /* renamed from: b0  reason: collision with root package name */
    public static final /* synthetic */ int f5036b0 = 0;
    public boolean A = true;
    public int B = 1;
    public c C;
    public final HandlerThread D = new HandlerThread("PDF renderer");
    public e E;
    public a F;
    public d G;
    public g H;
    public h I;
    public x5.e J;
    public Paint K;
    public int L = -1;
    public int M = 0;
    public boolean N = true;
    public PdfiumCore O;
    public PdfDocument P;
    public z5.a Q;
    public boolean R = false;
    public boolean S = false;
    public boolean T = false;
    public boolean U = true;
    public PaintFlagsDrawFilter V = new PaintFlagsDrawFilter(0, 3);
    public int W = 0;

    /* renamed from: a  reason: collision with root package name */
    public float f5037a = 1.0f;

    /* renamed from: a0  reason: collision with root package name */
    public ArrayList f5038a0 = new ArrayList(10);

    /* renamed from: b  reason: collision with root package name */
    public float f5039b = 1.75f;

    /* renamed from: c  reason: collision with root package name */
    public float f5040c = 3.0f;

    /* renamed from: d  reason: collision with root package name */
    public b f5041d = b.NONE;

    /* renamed from: e  reason: collision with root package name */
    public w5.b f5042e;

    /* renamed from: f  reason: collision with root package name */
    public w5.a f5043f;

    /* renamed from: n  reason: collision with root package name */
    public w5.d f5044n;

    /* renamed from: o  reason: collision with root package name */
    public int[] f5045o;

    /* renamed from: p  reason: collision with root package name */
    public int[] f5046p;

    /* renamed from: q  reason: collision with root package name */
    public int[] f5047q;

    /* renamed from: r  reason: collision with root package name */
    public int f5048r;

    /* renamed from: s  reason: collision with root package name */
    public int f5049s;

    /* renamed from: t  reason: collision with root package name */
    public int f5050t;

    /* renamed from: u  reason: collision with root package name */
    public int f5051u;

    /* renamed from: v  reason: collision with root package name */
    public float f5052v;

    /* renamed from: w  reason: collision with root package name */
    public float f5053w;

    /* renamed from: x  reason: collision with root package name */
    public float f5054x = 0.0f;

    /* renamed from: y  reason: collision with root package name */
    public float f5055y = 0.0f;

    /* renamed from: z  reason: collision with root package name */
    public float f5056z = 1.0f;

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final j f5057a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f5058b = true;

        /* renamed from: c  reason: collision with root package name */
        public boolean f5059c = true;

        /* renamed from: d  reason: collision with root package name */
        public d f5060d;

        /* renamed from: e  reason: collision with root package name */
        public g f5061e;

        /* renamed from: f  reason: collision with root package name */
        public h f5062f;

        /* renamed from: g  reason: collision with root package name */
        public x5.e f5063g;

        /* renamed from: h  reason: collision with root package name */
        public int f5064h = 0;

        /* renamed from: i  reason: collision with root package name */
        public boolean f5065i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f5066j = false;

        /* renamed from: k  reason: collision with root package name */
        public String f5067k = null;

        /* renamed from: l  reason: collision with root package name */
        public boolean f5068l = true;

        /* renamed from: m  reason: collision with root package name */
        public int f5069m = 0;

        /* renamed from: com.github.barteksc.pdfviewer.PDFView$a$a  reason: collision with other inner class name */
        public class C0056a implements Runnable {
            public C0056a() {
            }

            public final void run() {
                int i10;
                a.this.getClass();
                a aVar = a.this;
                PDFView pDFView = PDFView.this;
                j jVar = aVar.f5057a;
                String str = aVar.f5067k;
                aVar.getClass();
                int i11 = PDFView.f5036b0;
                if (pDFView.A) {
                    pDFView.getClass();
                    pDFView.getClass();
                    int[] iArr = pDFView.f5045o;
                    if (iArr != null) {
                        i10 = iArr[0];
                    } else {
                        i10 = 0;
                    }
                    pDFView.A = false;
                    c cVar = new c(jVar, str, pDFView, pDFView.O, i10);
                    pDFView.C = cVar;
                    cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                    return;
                }
                throw new IllegalStateException("Don't call load on a PDF View without recycling it first.");
            }
        }

        public a(j jVar) {
            this.f5057a = jVar;
        }

        public final void a() {
            PDFView.this.v();
            PDFView.this.setOnDrawListener((x5.a) null);
            PDFView.this.setOnDrawAllListener((x5.a) null);
            PDFView.this.setOnPageChangeListener(this.f5060d);
            PDFView.this.setOnPageScrollListener((f) null);
            PDFView.this.setOnRenderListener(this.f5061e);
            PDFView.this.setOnTapListener(this.f5062f);
            PDFView.this.setOnPageErrorListener(this.f5063g);
            PDFView pDFView = PDFView.this;
            boolean z10 = this.f5058b;
            w5.d dVar = pDFView.f5044n;
            dVar.f16511e = z10;
            if (this.f5059c) {
                dVar.f16509c.setOnDoubleTapListener(dVar);
            } else {
                dVar.f16509c.setOnDoubleTapListener((GestureDetector.OnDoubleTapListener) null);
            }
            PDFView.this.setDefaultPage(this.f5064h);
            PDFView.this.setSwipeVertical(!this.f5065i);
            PDFView pDFView2 = PDFView.this;
            pDFView2.T = this.f5066j;
            pDFView2.setScrollHandle((z5.a) null);
            PDFView pDFView3 = PDFView.this;
            pDFView3.U = this.f5068l;
            pDFView3.setSpacing(this.f5069m);
            PDFView.this.setInvalidPageColor(-1);
            PDFView.this.f5044n.getClass();
            PDFView.this.post(new C0056a());
        }
    }

    public enum b {
        NONE,
        START,
        END
    }

    static {
        Class<PDFView> cls = PDFView.class;
    }

    public PDFView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            this.f5042e = new w5.b();
            w5.a aVar = new w5.a(this);
            this.f5043f = aVar;
            this.f5044n = new w5.d(this, aVar);
            this.K = new Paint();
            new Paint().setStyle(Paint.Style.STROKE);
            this.O = new PdfiumCore(context);
            setWillNotDraw(false);
        }
    }

    /* access modifiers changed from: private */
    public void setDefaultPage(int i10) {
        this.M = i10;
    }

    /* access modifiers changed from: private */
    public void setInvalidPageColor(int i10) {
        this.L = i10;
    }

    /* access modifiers changed from: private */
    public void setOnDrawAllListener(x5.a aVar) {
    }

    /* access modifiers changed from: private */
    public void setOnDrawListener(x5.a aVar) {
    }

    /* access modifiers changed from: private */
    public void setOnPageChangeListener(d dVar) {
        this.G = dVar;
    }

    /* access modifiers changed from: private */
    public void setOnPageErrorListener(x5.e eVar) {
        this.J = eVar;
    }

    /* access modifiers changed from: private */
    public void setOnPageScrollListener(f fVar) {
    }

    /* access modifiers changed from: private */
    public void setOnRenderListener(g gVar) {
        this.H = gVar;
    }

    /* access modifiers changed from: private */
    public void setOnTapListener(h hVar) {
        this.I = hVar;
    }

    /* access modifiers changed from: private */
    public void setScrollHandle(z5.a aVar) {
        this.Q = aVar;
    }

    /* access modifiers changed from: private */
    public void setSpacing(int i10) {
        this.W = g0.S(getContext(), i10);
    }

    public final boolean canScrollHorizontally(int i10) {
        if (this.N) {
            if (i10 < 0 && this.f5054x < 0.0f) {
                return true;
            }
            if (i10 <= 0) {
                return false;
            }
            if ((this.f5052v * this.f5056z) + this.f5054x > ((float) getWidth())) {
                return true;
            }
            return false;
        } else if (i10 < 0 && this.f5054x < 0.0f) {
            return true;
        } else {
            if (i10 <= 0) {
                return false;
            }
            if (l() + this.f5054x > ((float) getWidth())) {
                return true;
            }
            return false;
        }
    }

    public final boolean canScrollVertically(int i10) {
        if (this.N) {
            if (i10 < 0 && this.f5055y < 0.0f) {
                return true;
            }
            if (i10 <= 0) {
                return false;
            }
            if (l() + this.f5055y > ((float) getHeight())) {
                return true;
            }
            return false;
        } else if (i10 < 0 && this.f5055y < 0.0f) {
            return true;
        } else {
            if (i10 <= 0) {
                return false;
            }
            if ((this.f5053w * this.f5056z) + this.f5055y > ((float) getHeight())) {
                return true;
            }
            return false;
        }
    }

    public final void computeScroll() {
        super.computeScroll();
        if (!isInEditMode()) {
            w5.a aVar = this.f5043f;
            if (aVar.f16489c.computeScrollOffset()) {
                aVar.f16487a.u((float) aVar.f16489c.getCurrX(), (float) aVar.f16489c.getCurrY(), true);
                aVar.f16487a.s();
            } else if (aVar.f16490d) {
                aVar.f16490d = false;
                aVar.f16487a.t();
                if (aVar.f16487a.getScrollHandle() != null) {
                    DefaultScrollHandle defaultScrollHandle = (DefaultScrollHandle) aVar.f16487a.getScrollHandle();
                    defaultScrollHandle.f5103n.postDelayed(defaultScrollHandle.f5104o, 1000);
                }
            }
        }
    }

    public int getCurrentPage() {
        return this.f5049s;
    }

    public float getCurrentXOffset() {
        return this.f5054x;
    }

    public float getCurrentYOffset() {
        return this.f5055y;
    }

    public PdfDocument.Meta getDocumentMeta() {
        PdfDocument pdfDocument = this.P;
        if (pdfDocument == null) {
            return null;
        }
        return this.O.b(pdfDocument);
    }

    public int getDocumentPageCount() {
        return this.f5048r;
    }

    public int[] getFilteredUserPageIndexes() {
        return this.f5047q;
    }

    public int[] getFilteredUserPages() {
        return this.f5046p;
    }

    public int getInvalidPageColor() {
        return this.L;
    }

    public float getMaxZoom() {
        return this.f5040c;
    }

    public float getMidZoom() {
        return this.f5039b;
    }

    public float getMinZoom() {
        return this.f5037a;
    }

    public d getOnPageChangeListener() {
        return this.G;
    }

    public f getOnPageScrollListener() {
        return null;
    }

    public g getOnRenderListener() {
        return this.H;
    }

    public h getOnTapListener() {
        return this.I;
    }

    public float getOptimalPageHeight() {
        return this.f5053w;
    }

    public float getOptimalPageWidth() {
        return this.f5052v;
    }

    public int[] getOriginalUserPages() {
        return this.f5045o;
    }

    public int getPageCount() {
        int[] iArr = this.f5045o;
        if (iArr != null) {
            return iArr.length;
        }
        return this.f5048r;
    }

    public float getPositionOffset() {
        int i10;
        float f10;
        float f11;
        if (this.N) {
            f11 = -this.f5055y;
            f10 = l();
            i10 = getHeight();
        } else {
            f11 = -this.f5054x;
            f10 = l();
            i10 = getWidth();
        }
        float f12 = f11 / (f10 - ((float) i10));
        if (f12 <= 0.0f) {
            return 0.0f;
        }
        if (f12 >= 1.0f) {
            return 1.0f;
        }
        return f12;
    }

    public b getScrollDir() {
        return this.f5041d;
    }

    public z5.a getScrollHandle() {
        return this.Q;
    }

    public int getSpacingPx() {
        return this.W;
    }

    public List<PdfDocument.Bookmark> getTableOfContents() {
        PdfDocument pdfDocument = this.P;
        if (pdfDocument == null) {
            return new ArrayList();
        }
        return this.O.f(pdfDocument);
    }

    public float getZoom() {
        return this.f5056z;
    }

    public final float l() {
        int pageCount = getPageCount();
        if (this.N) {
            return ((((float) pageCount) * this.f5053w) + ((float) ((pageCount - 1) * this.W))) * this.f5056z;
        }
        return ((((float) pageCount) * this.f5052v) + ((float) ((pageCount - 1) * this.W))) * this.f5056z;
    }

    public final void m() {
        if (this.B != 1 && getWidth() != 0) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            float f10 = ((float) this.f5050t) / ((float) this.f5051u);
            float floor = (float) Math.floor((double) (width / f10));
            if (floor > height) {
                width = (float) Math.floor((double) (f10 * height));
            } else {
                height = floor;
            }
            this.f5052v = width;
            this.f5053w = height;
        }
    }

    public final float n(int i10) {
        if (this.N) {
            return ((((float) i10) * this.f5053w) + ((float) (i10 * this.W))) * this.f5056z;
        }
        return ((((float) i10) * this.f5052v) + ((float) (i10 * this.W))) * this.f5056z;
    }

    public final boolean o() {
        int pageCount = getPageCount();
        int i10 = (pageCount - 1) * this.W;
        if (this.N) {
            if ((((float) pageCount) * this.f5053w) + ((float) i10) < ((float) getHeight())) {
                return true;
            }
            return false;
        } else if ((((float) pageCount) * this.f5052v) + ((float) i10) < ((float) getWidth())) {
            return true;
        } else {
            return false;
        }
    }

    public final void onDetachedFromWindow() {
        v();
        super.onDetachedFromWindow();
    }

    public final void onDraw(Canvas canvas) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (!isInEditMode()) {
            if (this.U) {
                canvas.setDrawFilter(this.V);
            }
            Drawable background = getBackground();
            if (background == null) {
                canvas.drawColor(-1);
            } else {
                background.draw(canvas);
            }
            if (!this.A && this.B == 3) {
                float f10 = this.f5054x;
                float f11 = this.f5055y;
                canvas.translate(f10, f11);
                w5.b bVar = this.f5042e;
                synchronized (bVar.f16496c) {
                    arrayList = bVar.f16496c;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    p(canvas, (y5.a) it.next());
                }
                w5.b bVar2 = this.f5042e;
                synchronized (bVar2.f16497d) {
                    arrayList2 = new ArrayList(bVar2.f16494a);
                    arrayList2.addAll(bVar2.f16495b);
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    p(canvas, (y5.a) it2.next());
                }
                Iterator it3 = this.f5038a0.iterator();
                while (it3.hasNext()) {
                    q(canvas, ((Integer) it3.next()).intValue(), (x5.a) null);
                }
                this.f5038a0.clear();
                q(canvas, this.f5049s, (x5.a) null);
                canvas.translate(-f10, -f11);
            }
        }
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (!isInEditMode() && this.B == 3) {
            this.f5043f.b();
            m();
            if (this.N) {
                u(this.f5054x, -n(this.f5049s), true);
            } else {
                u(-n(this.f5049s), this.f5055y, true);
            }
            s();
        }
    }

    public final void p(Canvas canvas, y5.a aVar) {
        float f10;
        float f11;
        RectF rectF = aVar.f17530d;
        Bitmap bitmap = aVar.f17529c;
        if (!bitmap.isRecycled()) {
            if (this.N) {
                f11 = n(aVar.f17527a);
                f10 = 0.0f;
            } else {
                f10 = n(aVar.f17527a);
                f11 = 0.0f;
            }
            canvas.translate(f10, f11);
            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            float f12 = rectF.left * this.f5052v;
            float f13 = this.f5056z;
            float f14 = f12 * f13;
            float f15 = rectF.top * this.f5053w * f13;
            RectF rectF2 = new RectF((float) ((int) f14), (float) ((int) f15), (float) ((int) (f14 + (rectF.width() * this.f5052v * this.f5056z))), (float) ((int) (f15 + (rectF.height() * this.f5053w * this.f5056z))));
            float f16 = this.f5054x + f10;
            float f17 = this.f5055y + f11;
            if (rectF2.left + f16 >= ((float) getWidth()) || f16 + rectF2.right <= 0.0f || rectF2.top + f17 >= ((float) getHeight()) || f17 + rectF2.bottom <= 0.0f) {
                canvas.translate(-f10, -f11);
                return;
            }
            canvas.drawBitmap(bitmap, rect, rectF2, this.K);
            canvas.translate(-f10, -f11);
        }
    }

    public final void q(Canvas canvas, int i10, x5.a aVar) {
        float f10;
        if (aVar != null) {
            float f11 = 0.0f;
            if (this.N) {
                f10 = n(i10);
            } else {
                f11 = n(i10);
                f10 = 0.0f;
            }
            canvas.translate(f11, f10);
            aVar.a();
            canvas.translate(-f11, -f10);
        }
    }

    public final void r() {
        if (this.B == 3) {
            this.f5056z = ((float) getWidth()) / this.f5052v;
            setPositionOffset(0.0f);
        }
    }

    public final void s() {
        float f10;
        float f11;
        int i10;
        if (getPageCount() != 0) {
            int i11 = this.W;
            float pageCount = (float) (i11 - (i11 / getPageCount()));
            if (this.N) {
                f11 = this.f5055y;
                f10 = this.f5053w + pageCount;
                i10 = getHeight();
            } else {
                f11 = this.f5054x;
                f10 = this.f5052v + pageCount;
                i10 = getWidth();
            }
            int floor = (int) Math.floor((double) ((Math.abs(f11) + (((float) i10) / 2.0f)) / (f10 * this.f5056z)));
            if (floor < 0 || floor > getPageCount() - 1 || floor == getCurrentPage()) {
                t();
            } else {
                w(floor);
            }
        }
    }

    public void setMaxZoom(float f10) {
        this.f5040c = f10;
    }

    public void setMidZoom(float f10) {
        this.f5039b = f10;
    }

    public void setMinZoom(float f10) {
        this.f5037a = f10;
    }

    public void setPositionOffset(float f10, boolean z10) {
        if (this.N) {
            u(this.f5054x, ((-l()) + ((float) getHeight())) * f10, z10);
        } else {
            u(((-l()) + ((float) getWidth())) * f10, this.f5055y, z10);
        }
        s();
    }

    public void setSwipeVertical(boolean z10) {
        this.N = z10;
    }

    public final void t() {
        e eVar;
        int i10;
        a.C0057a aVar;
        int i11;
        int i12;
        float f10 = 0.0f;
        if (this.f5052v != 0.0f && this.f5053w != 0.0f && (eVar = this.E) != null) {
            eVar.removeMessages(1);
            w5.b bVar = this.f5042e;
            synchronized (bVar.f16497d) {
                bVar.f16494a.addAll(bVar.f16495b);
                bVar.f16495b.clear();
            }
            a aVar2 = this.F;
            PDFView pDFView = aVar2.f5076a;
            aVar2.f5078c = pDFView.getOptimalPageHeight() * pDFView.f5056z;
            PDFView pDFView2 = aVar2.f5076a;
            aVar2.f5079d = pDFView2.getOptimalPageWidth() * pDFView2.f5056z;
            aVar2.f5089n = (int) (aVar2.f5076a.getOptimalPageWidth() * 0.3f);
            aVar2.f5090o = (int) (aVar2.f5076a.getOptimalPageHeight() * 0.3f);
            aVar2.f5080e = new Pair<>(Integer.valueOf(l0.m(1.0f / (((1.0f / aVar2.f5076a.getOptimalPageWidth()) * 256.0f) / aVar2.f5076a.getZoom()))), Integer.valueOf(l0.m(1.0f / (((1.0f / aVar2.f5076a.getOptimalPageHeight()) * 256.0f) / aVar2.f5076a.getZoom()))));
            float currentXOffset = aVar2.f5076a.getCurrentXOffset();
            if (currentXOffset > 0.0f) {
                currentXOffset = 0.0f;
            }
            aVar2.f5081f = -currentXOffset;
            float currentYOffset = aVar2.f5076a.getCurrentYOffset();
            if (currentYOffset <= 0.0f) {
                f10 = currentYOffset;
            }
            aVar2.f5082g = -f10;
            aVar2.f5083h = aVar2.f5078c / ((float) ((Integer) aVar2.f5080e.second).intValue());
            aVar2.f5084i = aVar2.f5079d / ((float) ((Integer) aVar2.f5080e.first).intValue());
            aVar2.f5085j = 1.0f / ((float) ((Integer) aVar2.f5080e.first).intValue());
            float intValue = 1.0f / ((float) ((Integer) aVar2.f5080e.second).intValue());
            aVar2.f5086k = intValue;
            aVar2.f5087l = 256.0f / aVar2.f5085j;
            aVar2.f5088m = 256.0f / intValue;
            aVar2.f5077b = 1;
            PDFView pDFView3 = aVar2.f5076a;
            float spacingPx = ((float) pDFView3.getSpacingPx()) * pDFView3.f5056z;
            aVar2.f5091p = spacingPx;
            aVar2.f5091p = spacingPx - (spacingPx / ((float) aVar2.f5076a.getPageCount()));
            PDFView pDFView4 = aVar2.f5076a;
            if (pDFView4.N) {
                aVar = aVar2.b(pDFView4.getCurrentYOffset(), false);
                a.C0057a b10 = aVar2.b((aVar2.f5076a.getCurrentYOffset() - ((float) aVar2.f5076a.getHeight())) + 1.0f, true);
                if (aVar.f5093a == b10.f5093a) {
                    i12 = (b10.f5094b - aVar.f5094b) + 1;
                } else {
                    int intValue2 = (((Integer) aVar2.f5080e.second).intValue() - aVar.f5094b) + 0;
                    for (int i13 = aVar.f5093a + 1; i13 < b10.f5093a; i13++) {
                        intValue2 += ((Integer) aVar2.f5080e.second).intValue();
                    }
                    i12 = b10.f5094b + 1 + intValue2;
                }
                i10 = 0;
                for (int i14 = 0; i14 < i12 && i10 < 120; i14++) {
                    i10 += aVar2.d(false, i14, 120 - i10);
                }
            } else {
                aVar = aVar2.b(pDFView4.getCurrentXOffset(), false);
                a.C0057a b11 = aVar2.b((aVar2.f5076a.getCurrentXOffset() - ((float) aVar2.f5076a.getWidth())) + 1.0f, true);
                if (aVar.f5093a == b11.f5093a) {
                    i11 = (b11.f5095c - aVar.f5095c) + 1;
                } else {
                    int intValue3 = (((Integer) aVar2.f5080e.first).intValue() - aVar.f5095c) + 0;
                    for (int i15 = aVar.f5093a + 1; i15 < b11.f5093a; i15++) {
                        intValue3 += ((Integer) aVar2.f5080e.first).intValue();
                    }
                    i11 = b11.f5095c + 1 + intValue3;
                }
                int i16 = 0;
                for (int i17 = 0; i17 < i11 && i10 < 120; i17++) {
                    i16 = i10 + aVar2.d(false, i17, 120 - i10);
                }
            }
            int a10 = aVar2.a(aVar.f5093a - 1);
            if (a10 >= 0) {
                aVar2.e(aVar.f5093a - 1, a10);
            }
            int a11 = aVar2.a(aVar.f5093a + 1);
            if (a11 >= 0) {
                aVar2.e(aVar.f5093a + 1, a11);
            }
            if (aVar2.f5076a.getScrollDir().equals(b.END)) {
                for (int i18 = 0; i18 < 1 && i10 < 120; i18++) {
                    i10 += aVar2.d(true, i18, i10);
                }
            } else {
                for (int i19 = 0; i19 > -1 && i10 < 120; i19--) {
                    i10 += aVar2.d(false, i19, i10);
                }
            }
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(float r9, float r10, boolean r11) {
        /*
            r8 = this;
            com.github.barteksc.pdfviewer.PDFView$b r0 = com.github.barteksc.pdfviewer.PDFView.b.START
            com.github.barteksc.pdfviewer.PDFView$b r1 = com.github.barteksc.pdfviewer.PDFView.b.NONE
            com.github.barteksc.pdfviewer.PDFView$b r2 = com.github.barteksc.pdfviewer.PDFView.b.END
            boolean r3 = r8.N
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            if (r3 == 0) goto L_0x007e
            float r3 = r8.f5052v
            float r6 = r8.f5056z
            float r3 = r3 * r6
            int r6 = r8.getWidth()
            float r6 = (float) r6
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0024
            int r9 = r8.getWidth()
            int r9 = r9 / 2
            float r9 = (float) r9
            float r3 = r3 / r4
            goto L_0x003a
        L_0x0024:
            int r6 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x002a
            r9 = r5
            goto L_0x003b
        L_0x002a:
            float r6 = r9 + r3
            int r7 = r8.getWidth()
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x003b
            int r9 = r8.getWidth()
            float r9 = (float) r9
        L_0x003a:
            float r9 = r9 - r3
        L_0x003b:
            float r3 = r8.l()
            int r6 = r8.getHeight()
            float r6 = (float) r6
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0050
            int r10 = r8.getHeight()
            float r10 = (float) r10
            float r10 = r10 - r3
            float r10 = r10 / r4
            goto L_0x0068
        L_0x0050:
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0056
            r10 = r5
            goto L_0x0068
        L_0x0056:
            float r4 = r10 + r3
            int r5 = r8.getHeight()
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0068
            float r10 = -r3
            int r3 = r8.getHeight()
            float r3 = (float) r3
            float r10 = r10 + r3
        L_0x0068:
            float r3 = r8.f5055y
            int r4 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x0072
            r8.f5041d = r2
            goto L_0x00eb
        L_0x0072:
            int r2 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x007a
            r8.f5041d = r0
            goto L_0x00eb
        L_0x007a:
            r8.f5041d = r1
            goto L_0x00eb
        L_0x007e:
            float r3 = r8.f5053w
            float r6 = r8.f5056z
            float r3 = r3 * r6
            int r6 = r8.getHeight()
            float r6 = (float) r6
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0095
            int r10 = r8.getHeight()
            int r10 = r10 / 2
            float r10 = (float) r10
            float r3 = r3 / r4
            goto L_0x00ab
        L_0x0095:
            int r6 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x009b
            r10 = r5
            goto L_0x00ac
        L_0x009b:
            float r6 = r10 + r3
            int r7 = r8.getHeight()
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ac
            int r10 = r8.getHeight()
            float r10 = (float) r10
        L_0x00ab:
            float r10 = r10 - r3
        L_0x00ac:
            float r3 = r8.l()
            int r6 = r8.getWidth()
            float r6 = (float) r6
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x00c1
            int r9 = r8.getWidth()
            float r9 = (float) r9
            float r9 = r9 - r3
            float r9 = r9 / r4
            goto L_0x00d9
        L_0x00c1:
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00c7
            r9 = r5
            goto L_0x00d9
        L_0x00c7:
            float r4 = r9 + r3
            int r5 = r8.getWidth()
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d9
            float r9 = -r3
            int r3 = r8.getWidth()
            float r3 = (float) r3
            float r9 = r9 + r3
        L_0x00d9:
            float r3 = r8.f5054x
            int r4 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x00e2
            r8.f5041d = r2
            goto L_0x00eb
        L_0x00e2:
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x00e9
            r8.f5041d = r0
            goto L_0x00eb
        L_0x00e9:
            r8.f5041d = r1
        L_0x00eb:
            r8.f5054x = r9
            r8.f5055y = r10
            float r9 = r8.getPositionOffset()
            if (r11 == 0) goto L_0x0104
            z5.a r10 = r8.Q
            if (r10 == 0) goto L_0x0104
            boolean r10 = r8.o()
            if (r10 != 0) goto L_0x0104
            z5.a r10 = r8.Q
            r10.setScroll(r9)
        L_0x0104:
            r8.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.PDFView.u(float, float, boolean):void");
    }

    public final void v() {
        PdfDocument pdfDocument;
        this.f5043f.b();
        e eVar = this.E;
        if (eVar != null) {
            eVar.f16521h = false;
            eVar.removeMessages(1);
        }
        c cVar = this.C;
        if (cVar != null) {
            cVar.cancel(true);
        }
        w5.b bVar = this.f5042e;
        synchronized (bVar.f16497d) {
            Iterator<y5.a> it = bVar.f16494a.iterator();
            while (it.hasNext()) {
                it.next().f17529c.recycle();
            }
            bVar.f16494a.clear();
            Iterator<y5.a> it2 = bVar.f16495b.iterator();
            while (it2.hasNext()) {
                it2.next().f17529c.recycle();
            }
            bVar.f16495b.clear();
        }
        synchronized (bVar.f16496c) {
            Iterator it3 = bVar.f16496c.iterator();
            while (it3.hasNext()) {
                ((y5.a) it3.next()).f17529c.recycle();
            }
            bVar.f16496c.clear();
        }
        z5.a aVar = this.Q;
        if (aVar != null && this.R) {
            DefaultScrollHandle defaultScrollHandle = (DefaultScrollHandle) aVar;
            defaultScrollHandle.f5101e.removeView(defaultScrollHandle);
        }
        PdfiumCore pdfiumCore = this.O;
        if (!(pdfiumCore == null || (pdfDocument = this.P) == null)) {
            pdfiumCore.a(pdfDocument);
        }
        this.E = null;
        this.f5045o = null;
        this.f5046p = null;
        this.f5047q = null;
        this.P = null;
        this.Q = null;
        this.R = false;
        this.f5055y = 0.0f;
        this.f5054x = 0.0f;
        this.f5056z = 1.0f;
        this.A = true;
        this.B = 1;
    }

    public final void w(int i10) {
        if (!this.A) {
            if (i10 <= 0) {
                i10 = 0;
            } else {
                int[] iArr = this.f5045o;
                if (iArr == null) {
                    int i11 = this.f5048r;
                    if (i10 >= i11) {
                        i10 = i11 - 1;
                    }
                } else if (i10 >= iArr.length) {
                    i10 = iArr.length - 1;
                }
            }
            this.f5049s = i10;
            int[] iArr2 = this.f5047q;
            if (iArr2 != null && i10 >= 0 && i10 < iArr2.length) {
                int i12 = iArr2[i10];
            }
            t();
            if (this.Q != null && !o()) {
                this.Q.setPageNum(this.f5049s + 1);
            }
            d dVar = this.G;
            if (dVar != null) {
                getPageCount();
                switch (((a0) dVar).f23615a) {
                    case 3:
                        int i13 = AuctionReportActivity.V;
                        return;
                    case 5:
                        return;
                    default:
                        int i14 = RegulationActivity.O;
                        return;
                }
            }
        }
    }

    public void setPositionOffset(float f10) {
        setPositionOffset(f10, true);
    }
}
