package com.shockwave.pdfium;

import android.content.Context;
import android.graphics.Bitmap;
import com.shockwave.pdfium.PdfDocument;
import java.io.FileDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import v0.g;

public class PdfiumCore {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f8415b = new Object();

    /* renamed from: a  reason: collision with root package name */
    public int f8416a;

    static {
        try {
            System.loadLibrary("modpng");
            System.loadLibrary("modft2");
            System.loadLibrary("modpdfium");
            System.loadLibrary("jniPdfium");
        } catch (UnsatisfiedLinkError e10) {
            e10.toString();
        }
        Class<FileDescriptor> cls = FileDescriptor.class;
    }

    public PdfiumCore(Context context) {
        this.f8416a = context.getResources().getDisplayMetrics().densityDpi;
    }

    private native void nativeCloseDocument(long j10);

    private native void nativeClosePage(long j10);

    private native long nativeGetBookmarkDestIndex(long j10, long j11);

    private native String nativeGetBookmarkTitle(long j10);

    private native String nativeGetDocumentMetaText(long j10, String str);

    private native Long nativeGetFirstChildBookmark(long j10, Long l10);

    private native int nativeGetPageCount(long j10);

    private native int nativeGetPageHeightPixel(long j10, int i10);

    private native int nativeGetPageWidthPixel(long j10, int i10);

    private native Long nativeGetSiblingBookmark(long j10, long j11);

    private native long nativeLoadPage(long j10, int i10);

    private native long nativeOpenMemDocument(byte[] bArr, String str);

    private native void nativeRenderPageBitmap(long j10, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14, boolean z10);

    public final void a(PdfDocument pdfDocument) {
        synchronized (f8415b) {
            Iterator it = ((g.c) pdfDocument.f8413b.keySet()).iterator();
            while (it.hasNext()) {
                nativeClosePage(((Long) pdfDocument.f8413b.getOrDefault((Integer) it.next(), null)).longValue());
            }
            pdfDocument.f8413b.clear();
            nativeCloseDocument(pdfDocument.f8412a);
        }
    }

    public final PdfDocument.Meta b(PdfDocument pdfDocument) {
        PdfDocument.Meta meta;
        synchronized (f8415b) {
            meta = new PdfDocument.Meta();
            nativeGetDocumentMetaText(pdfDocument.f8412a, "Title");
            nativeGetDocumentMetaText(pdfDocument.f8412a, "Author");
            nativeGetDocumentMetaText(pdfDocument.f8412a, "Subject");
            nativeGetDocumentMetaText(pdfDocument.f8412a, "Keywords");
            nativeGetDocumentMetaText(pdfDocument.f8412a, "Creator");
            nativeGetDocumentMetaText(pdfDocument.f8412a, "Producer");
            nativeGetDocumentMetaText(pdfDocument.f8412a, "CreationDate");
            nativeGetDocumentMetaText(pdfDocument.f8412a, "ModDate");
        }
        return meta;
    }

    public final int c(PdfDocument pdfDocument) {
        int nativeGetPageCount;
        synchronized (f8415b) {
            nativeGetPageCount = nativeGetPageCount(pdfDocument.f8412a);
        }
        return nativeGetPageCount;
    }

    public final int d(PdfDocument pdfDocument, int i10) {
        synchronized (f8415b) {
            Long l10 = (Long) pdfDocument.f8413b.getOrDefault(Integer.valueOf(i10), null);
            if (l10 == null) {
                return 0;
            }
            int nativeGetPageHeightPixel = nativeGetPageHeightPixel(l10.longValue(), this.f8416a);
            return nativeGetPageHeightPixel;
        }
    }

    public final int e(PdfDocument pdfDocument, int i10) {
        synchronized (f8415b) {
            Long l10 = (Long) pdfDocument.f8413b.getOrDefault(Integer.valueOf(i10), null);
            if (l10 == null) {
                return 0;
            }
            int nativeGetPageWidthPixel = nativeGetPageWidthPixel(l10.longValue(), this.f8416a);
            return nativeGetPageWidthPixel;
        }
    }

    public final ArrayList f(PdfDocument pdfDocument) {
        ArrayList arrayList;
        synchronized (f8415b) {
            arrayList = new ArrayList();
            Long nativeGetFirstChildBookmark = nativeGetFirstChildBookmark(pdfDocument.f8412a, (Long) null);
            if (nativeGetFirstChildBookmark != null) {
                i(arrayList, pdfDocument, nativeGetFirstChildBookmark.longValue());
            }
        }
        return arrayList;
    }

    public final PdfDocument g(byte[] bArr, String str) {
        PdfDocument pdfDocument = new PdfDocument();
        synchronized (f8415b) {
            pdfDocument.f8412a = nativeOpenMemDocument(bArr, str);
        }
        return pdfDocument;
    }

    public final void h(PdfDocument pdfDocument, int i10) {
        synchronized (f8415b) {
            pdfDocument.f8413b.put(Integer.valueOf(i10), Long.valueOf(nativeLoadPage(pdfDocument.f8412a, i10)));
        }
    }

    public final void i(ArrayList arrayList, PdfDocument pdfDocument, long j10) {
        PdfDocument.Bookmark bookmark = new PdfDocument.Bookmark();
        nativeGetBookmarkTitle(j10);
        nativeGetBookmarkDestIndex(pdfDocument.f8412a, j10);
        arrayList.add(bookmark);
        Long nativeGetFirstChildBookmark = nativeGetFirstChildBookmark(pdfDocument.f8412a, Long.valueOf(j10));
        if (nativeGetFirstChildBookmark != null) {
            i(bookmark.f8414a, pdfDocument, nativeGetFirstChildBookmark.longValue());
        }
        Long nativeGetSiblingBookmark = nativeGetSiblingBookmark(pdfDocument.f8412a, j10);
        if (nativeGetSiblingBookmark != null) {
            i(arrayList, pdfDocument, nativeGetSiblingBookmark.longValue());
        }
    }

    public final void j(PdfDocument pdfDocument, Bitmap bitmap, int i10, int i11, int i12, int i13, int i14, boolean z10) {
        synchronized (f8415b) {
            try {
                try {
                    nativeRenderPageBitmap(((Long) pdfDocument.f8413b.getOrDefault(Integer.valueOf(i10), null)).longValue(), bitmap, this.f8416a, i11, i12, i13, i14, z10);
                } catch (NullPointerException e10) {
                    e = e10;
                } catch (Exception e11) {
                    e = e11;
                    try {
                        e.printStackTrace();
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            } catch (NullPointerException e12) {
                e = e12;
                e.printStackTrace();
            } catch (Exception e13) {
                e = e13;
                e.printStackTrace();
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }
}
