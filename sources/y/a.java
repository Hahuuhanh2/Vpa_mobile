package y;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import f0.m0;
import w.t;

/* compiled from: AeFpsRangeLegacyQuirk */
public class a implements m0 {

    /* renamed from: a  reason: collision with root package name */
    public final Range<Integer> f17333a;

    public a(t tVar) {
        Range[] rangeArr = (Range[]) tVar.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        Range<Integer> range = null;
        if (!(rangeArr == null || rangeArr.length == 0)) {
            for (Range range2 : rangeArr) {
                Range<Integer> range3 = new Range<>(Integer.valueOf(((Integer) range2.getLower()).intValue() >= 1000 ? ((Integer) range2.getLower()).intValue() / 1000 : ((Integer) range2.getLower()).intValue()), Integer.valueOf(((Integer) range2.getUpper()).intValue() >= 1000 ? ((Integer) range2.getUpper()).intValue() / 1000 : ((Integer) range2.getUpper()).intValue()));
                if (range3.getUpper().intValue() == 30 && (range == null || range3.getLower().intValue() < range.getLower().intValue())) {
                    range = range3;
                }
            }
        }
        this.f17333a = range;
    }
}
