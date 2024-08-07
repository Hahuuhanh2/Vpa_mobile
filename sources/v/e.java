package v;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.support.v4.media.a;
import c0.p0;
import f0.h;
import f0.i;
import f0.j;
import f0.k;
import f0.u0;
import g0.g;
import java.nio.BufferUnderflowException;
import java.util.concurrent.TimeUnit;

/* compiled from: Camera2CameraCaptureResult */
public final class e implements k {

    /* renamed from: a  reason: collision with root package name */
    public final u0 f15657a;

    /* renamed from: b  reason: collision with root package name */
    public final CaptureResult f15658b;

    public e(u0 u0Var, CaptureResult captureResult) {
        this.f15657a = u0Var;
        this.f15658b = captureResult;
    }

    public final u0 a() {
        return this.f15657a;
    }

    public final void b(g.a aVar) {
        int i10;
        String str;
        Integer num;
        a.b(this, aVar);
        Rect rect = (Rect) this.f15658b.get(CaptureResult.SCALER_CROP_REGION);
        if (rect != null) {
            aVar.c("ImageWidth", String.valueOf(rect.width()), aVar.f10244a);
            aVar.c("ImageLength", String.valueOf(rect.height()), aVar.f10244a);
        }
        try {
            Integer num2 = (Integer) this.f15658b.get(CaptureResult.JPEG_ORIENTATION);
            if (num2 != null) {
                aVar.d(num2.intValue());
            }
        } catch (BufferUnderflowException unused) {
            p0.g("C2CameraCaptureResult");
        }
        Long l10 = (Long) this.f15658b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l10 != null) {
            aVar.c("ExposureTime", String.valueOf(((double) l10.longValue()) / ((double) TimeUnit.SECONDS.toNanos(1))), aVar.f10244a);
        }
        Float f10 = (Float) this.f15658b.get(CaptureResult.LENS_APERTURE);
        if (f10 != null) {
            aVar.c("FNumber", String.valueOf(f10.floatValue()), aVar.f10244a);
        }
        Integer num3 = (Integer) this.f15658b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num3 != null) {
            if (Build.VERSION.SDK_INT >= 24 && (num = (Integer) this.f15658b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num3 = Integer.valueOf(num3.intValue() * ((int) (((float) num.intValue()) / 100.0f)));
            }
            int intValue = num3.intValue();
            aVar.c("SensitivityType", String.valueOf(3), aVar.f10244a);
            aVar.c("PhotographicSensitivity", String.valueOf(Math.min(65535, intValue)), aVar.f10244a);
        }
        Float f11 = (Float) this.f15658b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            aVar.c("FocalLength", ((long) (f11.floatValue() * 1000.0f)) + "/" + 1000, aVar.f10244a);
        }
        Integer num4 = (Integer) this.f15658b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num4 != null) {
            if (num4.intValue() == 0) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            int g2 = v.g(i10);
            if (g2 == 0) {
                str = String.valueOf(0);
            } else if (g2 != 1) {
                str = null;
            } else {
                str = String.valueOf(1);
            }
            aVar.c("WhiteBalance", str, aVar.f10244a);
        }
    }

    public final long c() {
        Long l10 = (Long) this.f15658b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l10 == null) {
            return -1;
        }
        return l10.longValue();
    }

    public final j d() {
        j jVar = j.UNKNOWN;
        Integer num = (Integer) this.f15658b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return jVar;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return j.INACTIVE;
        }
        if (intValue == 1) {
            return j.METERING;
        }
        if (intValue == 2) {
            return j.CONVERGED;
        }
        if (intValue == 3) {
            return j.LOCKED;
        }
        p0.b("C2CameraCaptureResult");
        return jVar;
    }

    public final int e() {
        Integer num = (Integer) this.f15658b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return 1;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return 2;
        }
        if (intValue == 2) {
            return 3;
        }
        if (intValue == 3 || intValue == 4) {
            return 4;
        }
        p0.b("C2CameraCaptureResult");
        return 1;
    }

    public final h f() {
        h hVar = h.UNKNOWN;
        Integer num = (Integer) this.f15658b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return hVar;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return h.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return h.CONVERGED;
            }
            if (intValue == 3) {
                return h.LOCKED;
            }
            if (intValue == 4) {
                return h.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                p0.b("C2CameraCaptureResult");
                return hVar;
            }
        }
        return h.SEARCHING;
    }

    public final CaptureResult g() {
        return this.f15658b;
    }

    public final i h() {
        i iVar = i.UNKNOWN;
        Integer num = (Integer) this.f15658b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return iVar;
        }
        switch (num.intValue()) {
            case 0:
                return i.INACTIVE;
            case 1:
            case 3:
                return i.SCANNING;
            case 2:
                return i.PASSIVE_FOCUSED;
            case 4:
                return i.LOCKED_FOCUSED;
            case 5:
                return i.LOCKED_NOT_FOCUSED;
            case 6:
                return i.PASSIVE_NOT_FOCUSED;
            default:
                p0.b("C2CameraCaptureResult");
                return iVar;
        }
    }

    public final int i() {
        Integer num = (Integer) this.f15658b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return 1;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return 3;
            }
            if (intValue == 3 || intValue == 4) {
                return 4;
            }
            if (intValue != 5) {
                p0.b("C2CameraCaptureResult");
                return 1;
            }
        }
        return 2;
    }
}
