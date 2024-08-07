package zc;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.regex.Pattern;
import uc.a;

/* compiled from: DecodeFormatManager */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f17966a = Pattern.compile(",");

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f17967b;

    static {
        EnumSet of2 = EnumSet.of(a.QR_CODE);
        EnumSet of3 = EnumSet.of(a.DATA_MATRIX);
        EnumSet of4 = EnumSet.of(a.AZTEC);
        EnumSet of5 = EnumSet.of(a.PDF_417);
        EnumSet of6 = EnumSet.of(a.UPC_A, new a[]{a.UPC_E, a.EAN_13, a.EAN_8, a.RSS_14, a.RSS_EXPANDED});
        EnumSet of7 = EnumSet.of(a.CODE_39, a.CODE_93, a.CODE_128, a.ITF, a.CODABAR);
        EnumSet copyOf = EnumSet.copyOf(of6);
        copyOf.addAll(of7);
        HashMap hashMap = new HashMap();
        f17967b = hashMap;
        hashMap.put("ONE_D_MODE", copyOf);
        hashMap.put("PRODUCT_MODE", of6);
        hashMap.put("QR_CODE_MODE", of2);
        hashMap.put("DATA_MATRIX_MODE", of3);
        hashMap.put("AZTEC_MODE", of4);
        hashMap.put("PDF417_MODE", of5);
    }
}
