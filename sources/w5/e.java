package w5;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseBooleanArray;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.exception.PageRenderingException;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import x5.g;

/* compiled from: RenderingHandler */
public final class e extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public PdfiumCore f16514a;

    /* renamed from: b  reason: collision with root package name */
    public PdfDocument f16515b;

    /* renamed from: c  reason: collision with root package name */
    public PDFView f16516c;

    /* renamed from: d  reason: collision with root package name */
    public RectF f16517d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    public Rect f16518e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public Matrix f16519f = new Matrix();

    /* renamed from: g  reason: collision with root package name */
    public final SparseBooleanArray f16520g = new SparseBooleanArray();

    /* renamed from: h  reason: collision with root package name */
    public boolean f16521h = false;

    /* compiled from: RenderingHandler */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y5.a f16522a;

        public a(y5.a aVar) {
            this.f16522a = aVar;
        }

        public final void run() {
            PDFView pDFView = e.this.f16516c;
            y5.a aVar = this.f16522a;
            if (pDFView.B == 2) {
                pDFView.B = 3;
                g gVar = pDFView.H;
                if (gVar != null) {
                    pDFView.getPageCount();
                    gVar.a();
                }
            }
            if (aVar.f17531e) {
                b bVar = pDFView.f5042e;
                synchronized (bVar.f16496c) {
                    if (bVar.f16496c.size() >= 6) {
                        ((y5.a) bVar.f16496c.remove(0)).f17529c.recycle();
                    }
                    bVar.f16496c.add(aVar);
                }
            } else {
                b bVar2 = pDFView.f5042e;
                synchronized (bVar2.f16497d) {
                    bVar2.a();
                    bVar2.f16495b.offer(aVar);
                }
            }
            pDFView.invalidate();
        }
    }

    /* compiled from: RenderingHandler */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PageRenderingException f16524a;

        public b(PageRenderingException pageRenderingException) {
            this.f16524a = pageRenderingException;
        }

        public final void run() {
            PDFView pDFView = e.this.f16516c;
            PageRenderingException pageRenderingException = this.f16524a;
            x5.e eVar = pDFView.J;
            if (eVar != null) {
                int i10 = pageRenderingException.f5096a;
                pageRenderingException.getCause();
                eVar.h(i10);
                return;
            }
            int i11 = pageRenderingException.f5096a;
            pageRenderingException.getCause();
        }
    }

    /* compiled from: RenderingHandler */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public float f16526a;

        /* renamed from: b  reason: collision with root package name */
        public float f16527b;

        /* renamed from: c  reason: collision with root package name */
        public RectF f16528c;

        /* renamed from: d  reason: collision with root package name */
        public int f16529d;

        /* renamed from: e  reason: collision with root package name */
        public int f16530e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f16531f;

        /* renamed from: g  reason: collision with root package name */
        public int f16532g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f16533h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f16534i;

        public c(float f10, float f11, RectF rectF, int i10, int i11, boolean z10, int i12, boolean z11, boolean z12) {
            this.f16529d = i11;
            this.f16526a = f10;
            this.f16527b = f11;
            this.f16528c = rectF;
            this.f16530e = i10;
            this.f16531f = z10;
            this.f16532g = i12;
            this.f16533h = z11;
            this.f16534i = z12;
        }
    }

    static {
        Class<e> cls = e.class;
    }

    public e(Looper looper, PDFView pDFView, PdfiumCore pdfiumCore, PdfDocument pdfDocument) {
        super(looper);
        this.f16516c = pDFView;
        this.f16514a = pdfiumCore;
        this.f16515b = pdfDocument;
    }

    public final void a(int i10, int i11, float f10, float f11, RectF rectF, boolean z10, int i12, boolean z11, boolean z12) {
        sendMessage(obtainMessage(1, new c(f10, f11, rectF, i10, i11, z10, i12, z11, z12)));
    }

    public final y5.a b(c cVar) {
        Bitmap.Config config;
        if (this.f16520g.indexOfKey(cVar.f16529d) < 0) {
            try {
                this.f16514a.h(this.f16515b, cVar.f16529d);
                this.f16520g.put(cVar.f16529d, true);
            } catch (Exception e10) {
                this.f16520g.put(cVar.f16529d, false);
                throw new PageRenderingException(cVar.f16529d, e10);
            }
        }
        int round = Math.round(cVar.f16526a);
        int round2 = Math.round(cVar.f16527b);
        try {
            if (cVar.f16533h) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            Bitmap createBitmap = Bitmap.createBitmap(round, round2, config);
            RectF rectF = cVar.f16528c;
            this.f16519f.reset();
            float f10 = (float) round;
            float f11 = (float) round2;
            this.f16519f.postTranslate((-rectF.left) * f10, (-rectF.top) * f11);
            this.f16519f.postScale(1.0f / rectF.width(), 1.0f / rectF.height());
            this.f16517d.set(0.0f, 0.0f, f10, f11);
            this.f16519f.mapRect(this.f16517d);
            this.f16517d.round(this.f16518e);
            if (this.f16520g.get(cVar.f16529d)) {
                PdfiumCore pdfiumCore = this.f16514a;
                PdfDocument pdfDocument = this.f16515b;
                int i10 = cVar.f16529d;
                Rect rect = this.f16518e;
                pdfiumCore.j(pdfDocument, createBitmap, i10, rect.left, rect.top, rect.width(), this.f16518e.height(), cVar.f16534i);
            } else {
                createBitmap.eraseColor(this.f16516c.getInvalidPageColor());
            }
            return new y5.a(cVar.f16530e, cVar.f16529d, createBitmap, cVar.f16528c, cVar.f16531f, cVar.f16532g);
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public final void handleMessage(Message message) {
        try {
            y5.a b10 = b((c) message.obj);
            if (b10 == null) {
                return;
            }
            if (this.f16521h) {
                this.f16516c.post(new a(b10));
            } else {
                b10.f17529c.recycle();
            }
        } catch (PageRenderingException e10) {
            this.f16516c.post(new b(e10));
        }
    }
}
