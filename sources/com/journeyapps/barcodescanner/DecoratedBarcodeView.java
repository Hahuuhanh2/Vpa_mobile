package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.zxing.client.android.R$id;
import com.google.zxing.client.android.R$layout;
import com.google.zxing.client.android.R$styleable;
import com.journeyapps.barcodescanner.b;
import java.util.List;
import uc.j;

public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public BarcodeView f7996a;

    /* renamed from: b  reason: collision with root package name */
    public ViewfinderView f7997b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f7998c;

    public interface a {
        void a();

        void b();
    }

    public class b implements xd.a {

        /* renamed from: a  reason: collision with root package name */
        public xd.a f7999a;

        public b(b.a aVar) {
            this.f7999a = aVar;
        }

        public final void a(xd.b bVar) {
            this.f7999a.a(bVar);
        }

        public final void b(List<j> list) {
            for (j next : list) {
                ViewfinderView viewfinderView = DecoratedBarcodeView.this.f7997b;
                if (viewfinderView.f8007f.size() < 20) {
                    viewfinderView.f8007f.add(next);
                }
            }
            this.f7999a.b(list);
        }
    }

    public DecoratedBarcodeView(Context context) {
        super(context);
        a((AttributeSet) null);
    }

    public final void a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.zxing_view);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.zxing_view_zxing_scanner_layout, R$layout.zxing_barcode_scanner);
        obtainStyledAttributes.recycle();
        View.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(R$id.zxing_barcode_surface);
        this.f7996a = barcodeView;
        if (barcodeView != null) {
            barcodeView.c(attributeSet);
            ViewfinderView viewfinderView = (ViewfinderView) findViewById(R$id.zxing_viewfinder_view);
            this.f7997b = viewfinderView;
            if (viewfinderView != null) {
                viewfinderView.setCameraPreview(this.f7996a);
                this.f7998c = (TextView) findViewById(R$id.zxing_status_view);
                return;
            }
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(R$id.zxing_barcode_surface);
    }

    public TextView getStatusView() {
        return this.f7998c;
    }

    public ViewfinderView getViewFinder() {
        return this.f7997b;
    }

    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 24) {
            setTorchOn();
            return true;
        } else if (i10 == 25) {
            setTorchOff();
            return true;
        } else if (i10 == 27 || i10 == 80) {
            return true;
        } else {
            return super.onKeyDown(i10, keyEvent);
        }
    }

    public void setStatusText(String str) {
        TextView textView = this.f7998c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(a aVar) {
    }

    public void setTorchOff() {
        this.f7996a.setTorch(false);
    }

    public void setTorchOn() {
        this.f7996a.setTorch(true);
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(attributeSet);
    }
}
