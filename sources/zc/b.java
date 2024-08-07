package zc;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;
import yd.e;
import yd.f;

/* compiled from: AmbientLightManager */
public final class b implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    public e f17961a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f17962b = new Handler();

    public b(Context context, e eVar, f fVar) {
        this.f17961a = eVar;
    }

    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f10 = sensorEvent.values[0];
        if (this.f17961a == null) {
            return;
        }
        if (f10 <= 45.0f) {
            this.f17962b.post(new a(this, true));
        } else if (f10 >= 450.0f) {
            this.f17962b.post(new a(this, false));
        }
    }
}
