package io.github.g00fy2.quickie;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.view.PreviewView;
import com.google.mlkit.common.MlKitException;
import ek.i;
import i0.b;
import io.github.g00fy2.quickie.config.ParcelableScannerConfig;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kh.h;
import oa.c;
import q0.f;
import rk.l;
import sk.j;
import sk.k;
import w1.d0;
import w1.q0;
import w1.u0;
import zg.h0;

/* compiled from: QRScannerActivity.kt */
public final class QRScannerActivity extends AppCompatActivity {
    public static final /* synthetic */ int Q = 0;
    public pj.a I;
    public ExecutorService J;
    public int[] K = {256};
    public boolean L = true;
    public boolean M;
    public boolean N;
    public boolean O;
    public Dialog P;

    /* compiled from: QRScannerActivity.kt */
    public static final class a extends k implements l<Boolean, i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ QRScannerActivity f20720a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(QRScannerActivity qRScannerActivity) {
            super(1);
            this.f20720a = qRScannerActivity;
        }

        public final Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                QRScannerActivity qRScannerActivity = this.f20720a;
                int i10 = QRScannerActivity.Q;
                qRScannerActivity.getClass();
                try {
                    b b10 = f.b(qRScannerActivity);
                    b10.b(new c(5, b10, qRScannerActivity), k1.a.getMainExecutor(qRScannerActivity));
                } catch (Exception e10) {
                    qRScannerActivity.L(e10);
                }
            } else {
                this.f20720a.setResult(2, (Intent) null);
                this.f20720a.finish();
            }
            return i.f20112a;
        }
    }

    public final void L(Exception exc) {
        setResult(3, new Intent().putExtra("quickie-exception", exc));
        j.f(exc, "exception");
        boolean z10 = false;
        if ((exc instanceof MlKitException) && ((MlKitException) exc).f7856a == 14) {
            u6.a aVar = u6.a.f15288d;
            int c10 = aVar.c(this, 201214000);
            Dialog dialog = this.P;
            if (dialog != null && dialog.isShowing()) {
                z10 = true;
            }
            if (!z10 && c10 != 0 && aVar.e(c10)) {
                AlertDialog d10 = aVar.d(this, c10, 9000, (DialogInterface.OnCancelListener) null);
                this.P = d10;
                if (d10 != null) {
                    d10.show();
                }
                if (d10 != null) {
                    d10.setOnKeyListener(new mj.f(this));
                }
            }
            z10 = true;
        }
        if (!z10) {
            finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        LayoutInflater layoutInflater;
        ParcelableScannerConfig parcelableScannerConfig;
        super.onCreate(bundle);
        int i10 = getApplicationInfo().theme;
        if (i10 != 0) {
            layoutInflater = getLayoutInflater().cloneInContext(new l.c((Context) this, i10));
        } else {
            layoutInflater = getLayoutInflater();
        }
        View inflate = layoutInflater.inflate(R$layout.quickie_scanner_activity, (ViewGroup) null, false);
        int i11 = R$id.overlay_view;
        QROverlayView qROverlayView = (QROverlayView) j7.a.D(i11, inflate);
        if (qROverlayView != null) {
            i11 = R$id.preview_view;
            PreviewView previewView = (PreviewView) j7.a.D(i11, inflate);
            if (previewView != null) {
                FrameLayout frameLayout = (FrameLayout) inflate;
                this.I = new pj.a(frameLayout, qROverlayView, previewView);
                setContentView((View) frameLayout);
                u0.a(getWindow(), false);
                pj.a aVar = this.I;
                if (aVar != null) {
                    QROverlayView qROverlayView2 = aVar.f22659a;
                    h hVar = new h(7);
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    d0.i.u(qROverlayView2, hVar);
                    Intent intent = getIntent();
                    if (!(intent == null || (parcelableScannerConfig = (ParcelableScannerConfig) k1.b.a(intent, "quickie-config", ParcelableScannerConfig.class)) == null)) {
                        this.K = parcelableScannerConfig.f20721a;
                        pj.a aVar2 = this.I;
                        if (aVar2 != null) {
                            aVar2.f22659a.setCustomText(parcelableScannerConfig.f20722b);
                            pj.a aVar3 = this.I;
                            if (aVar3 != null) {
                                aVar3.f22659a.setCustomIcon(parcelableScannerConfig.f20723c);
                                pj.a aVar4 = this.I;
                                if (aVar4 != null) {
                                    aVar4.f22659a.setHorizontalFrameRatio(parcelableScannerConfig.f20726f);
                                    this.L = parcelableScannerConfig.f20724d;
                                    this.M = parcelableScannerConfig.f20725e;
                                    this.O = parcelableScannerConfig.f20727n;
                                    this.N = parcelableScannerConfig.f20728o;
                                } else {
                                    j.l("binding");
                                    throw null;
                                }
                            } else {
                                j.l("binding");
                                throw null;
                            }
                        } else {
                            j.l("binding");
                            throw null;
                        }
                    }
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    j.e(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
                    this.J = newSingleThreadExecutor;
                    a aVar5 = new a(this);
                    if (k1.a.checkSelfPermission(this, "android.permission.CAMERA") == 0) {
                        aVar5.invoke(Boolean.TRUE);
                        return;
                    }
                    F(new h0(aVar5, 3), new g.c()).a("android.permission.CAMERA");
                    return;
                }
                j.l("binding");
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    public final void onDestroy() {
        super.onDestroy();
        ExecutorService executorService = this.J;
        if (executorService != null) {
            executorService.shutdown();
        } else {
            j.l("analysisExecutor");
            throw null;
        }
    }
}
