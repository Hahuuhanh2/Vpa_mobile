package w5;

import android.os.AsyncTask;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.a;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import z.j;

/* compiled from: DecodingAsyncTask */
public final class c extends AsyncTask<Void, Void, Throwable> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f16498a = false;

    /* renamed from: b  reason: collision with root package name */
    public PDFView f16499b;

    /* renamed from: c  reason: collision with root package name */
    public PdfiumCore f16500c;

    /* renamed from: d  reason: collision with root package name */
    public PdfDocument f16501d;

    /* renamed from: e  reason: collision with root package name */
    public String f16502e;

    /* renamed from: f  reason: collision with root package name */
    public j f16503f;

    /* renamed from: g  reason: collision with root package name */
    public int f16504g;

    /* renamed from: h  reason: collision with root package name */
    public int f16505h;

    /* renamed from: i  reason: collision with root package name */
    public int f16506i;

    public c(j jVar, String str, PDFView pDFView, PdfiumCore pdfiumCore, int i10) {
        this.f16503f = jVar;
        this.f16504g = i10;
        this.f16499b = pDFView;
        this.f16502e = str;
        this.f16500c = pdfiumCore;
        pDFView.getContext();
    }

    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            j jVar = this.f16503f;
            PdfiumCore pdfiumCore = this.f16500c;
            String str = this.f16502e;
            InputStream inputStream = (InputStream) jVar.f17753b;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (-1 != read) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    PdfDocument g2 = pdfiumCore.g(byteArrayOutputStream.toByteArray(), str);
                    this.f16501d = g2;
                    this.f16500c.h(g2, this.f16504g);
                    this.f16505h = this.f16500c.e(this.f16501d, this.f16504g);
                    this.f16506i = this.f16500c.d(this.f16501d, this.f16504g);
                    return null;
                }
            }
        } catch (Throwable th2) {
            return th2;
        }
    }

    public final void onCancelled() {
        this.f16498a = true;
    }

    public final void onPostExecute(Object obj) {
        if (((Throwable) obj) != null) {
            PDFView pDFView = this.f16499b;
            pDFView.B = 4;
            pDFView.v();
            pDFView.invalidate();
            pDFView.getClass();
        } else if (!this.f16498a) {
            PDFView pDFView2 = this.f16499b;
            PdfDocument pdfDocument = this.f16501d;
            int i10 = this.f16505h;
            int i11 = this.f16506i;
            pDFView2.B = 2;
            pDFView2.f5048r = pDFView2.O.c(pdfDocument);
            pDFView2.P = pdfDocument;
            pDFView2.f5050t = i10;
            pDFView2.f5051u = i11;
            pDFView2.m();
            pDFView2.F = new a(pDFView2);
            if (!pDFView2.D.isAlive()) {
                pDFView2.D.start();
            }
            e eVar = new e(pDFView2.D.getLooper(), pDFView2, pDFView2.O, pdfDocument);
            pDFView2.E = eVar;
            eVar.f16521h = true;
            z5.a aVar = pDFView2.Q;
            if (aVar != null) {
                aVar.setupLayout(pDFView2);
                pDFView2.R = true;
            }
            pDFView2.getClass();
            int i12 = pDFView2.M;
            float f10 = -pDFView2.n(i12);
            if (pDFView2.N) {
                pDFView2.u(pDFView2.f5054x, f10, true);
            } else {
                pDFView2.u(f10, pDFView2.f5055y, true);
            }
            pDFView2.w(i12);
        }
    }
}
