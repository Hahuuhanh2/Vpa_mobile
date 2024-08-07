package g0;

import c0.p0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: Exif */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f10223b = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final b f10224c = new b();

    /* renamed from: d  reason: collision with root package name */
    public static final c f10225d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final List<String> f10226e = Arrays.asList(new String[]{"ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType"});

    /* renamed from: f  reason: collision with root package name */
    public static final List<String> f10227f = Arrays.asList(new String[]{"ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation"});

    /* renamed from: a  reason: collision with root package name */
    public final o2.a f10228a;

    /* compiled from: Exif */
    public class a extends ThreadLocal<SimpleDateFormat> {
        public final Object initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    /* compiled from: Exif */
    public class b extends ThreadLocal<SimpleDateFormat> {
        public final Object initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    /* compiled from: Exif */
    public class c extends ThreadLocal<SimpleDateFormat> {
        public final Object initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    public e(o2.a aVar) {
        this.f10228a = aVar;
    }

    public final void a(e eVar) {
        ArrayList arrayList = new ArrayList(f10226e);
        arrayList.removeAll(f10227f);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String c10 = this.f10228a.c(str);
            String c11 = eVar.f10228a.c(str);
            if (c10 != null && !c10.equals(c11)) {
                eVar.f10228a.y(str, c10);
            }
        }
    }

    public final int b() {
        switch (this.f10228a.d(0, "Orientation")) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public final void c(int i10) {
        int i11;
        if (i10 % 90 != 0) {
            String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", new Object[]{Integer.valueOf(i10)});
            p0.g("e");
            this.f10228a.y("Orientation", String.valueOf(0));
            return;
        }
        int i12 = i10 % 360;
        int d10 = this.f10228a.d(0, "Orientation");
        while (i12 < 0) {
            i12 += 90;
            switch (d10) {
                case 2:
                    d10 = 5;
                    break;
                case 3:
                case 8:
                    d10 = 6;
                    break;
                case 4:
                    d10 = 7;
                    break;
                case 5:
                    d10 = 4;
                    break;
                case 6:
                    d10 = 1;
                    break;
                case 7:
                    d10 = 2;
                    break;
                default:
                    d10 = 8;
                    break;
            }
        }
        while (i12 > 0) {
            i12 -= 90;
            switch (d10) {
                case 2:
                    i11 = 7;
                    break;
                case 3:
                    i11 = 8;
                    break;
                case 4:
                    i11 = 5;
                    break;
                case 5:
                    i11 = 2;
                    break;
                case 6:
                    i11 = 3;
                    break;
                case 7:
                    i11 = 4;
                    break;
                case 8:
                    i11 = 1;
                    break;
                default:
                    i11 = 6;
                    break;
            }
        }
        this.f10228a.y("Orientation", String.valueOf(d10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0190, code lost:
        if (r6.equals("M") != false) goto L_0x019c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b4 A[SYNTHETIC, Splitter:B:22:0x00b4] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00dc A[SYNTHETIC, Splitter:B:34:0x00dc] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0106 A[SYNTHETIC, Splitter:B:44:0x0106] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0117 A[Catch:{ ParseException -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01d1 A[SYNTHETIC, Splitter:B:91:0x01d1] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.util.Locale r1 = java.util.Locale.ENGLISH
            r2 = 8
            java.lang.Object[] r2 = new java.lang.Object[r2]
            o2.a r3 = r0.f10228a
            r4 = 0
            java.lang.String r5 = "ImageWidth"
            int r3 = r3.d(r4, r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r4] = r3
            o2.a r3 = r0.f10228a
            java.lang.String r5 = "ImageLength"
            int r3 = r3.d(r4, r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 1
            r2[r5] = r3
            int r3 = r19.b()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 2
            r2[r6] = r3
            o2.a r3 = r0.f10228a
            java.lang.String r7 = "Orientation"
            int r3 = r3.d(r4, r7)
            r8 = 4
            r9 = 5
            r10 = 7
            if (r3 == r8) goto L_0x0044
            if (r3 == r9) goto L_0x0044
            if (r3 == r10) goto L_0x0044
            r3 = r4
            goto L_0x0045
        L_0x0044:
            r3 = r5
        L_0x0045:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r9 = 3
            r2[r9] = r3
            o2.a r3 = r0.f10228a
            int r3 = r3.d(r4, r7)
            if (r3 == r6) goto L_0x0056
            r3 = r4
            goto L_0x0057
        L_0x0056:
            r3 = r5
        L_0x0057:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2[r8] = r3
            o2.a r3 = r0.f10228a
            java.lang.String r7 = "GPSProcessingMethod"
            java.lang.String r3 = r3.c(r7)
            o2.a r7 = r0.f10228a
            java.lang.String r10 = "GPSLatitude"
            java.lang.String r10 = r7.c(r10)
            java.lang.String r11 = "GPSLatitudeRef"
            java.lang.String r11 = r7.c(r11)
            java.lang.String r12 = "GPSLongitude"
            java.lang.String r12 = r7.c(r12)
            java.lang.String r13 = "GPSLongitudeRef"
            java.lang.String r7 = r7.c(r13)
            if (r10 == 0) goto L_0x00a6
            if (r11 == 0) goto L_0x00a6
            if (r12 == 0) goto L_0x00a6
            if (r7 == 0) goto L_0x00a6
            double r13 = o2.a.b(r10, r11)     // Catch:{ IllegalArgumentException -> 0x0096 }
            double r15 = o2.a.b(r12, r7)     // Catch:{ IllegalArgumentException -> 0x0096 }
            double[] r9 = new double[r6]     // Catch:{ IllegalArgumentException -> 0x0096 }
            r9[r4] = r13     // Catch:{ IllegalArgumentException -> 0x0096 }
            r9[r5] = r15     // Catch:{ IllegalArgumentException -> 0x0096 }
            goto L_0x00a7
        L_0x0096:
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r4] = r10
            r8[r5] = r11
            r8[r6] = r12
            r6 = 3
            r8[r6] = r7
            java.lang.String r6 = "latValue=%s, latRef=%s, lngValue=%s, lngRef=%s"
            java.lang.String.format(r6, r8)
        L_0x00a6:
            r9 = 0
        L_0x00a7:
            o2.a r6 = r0.f10228a
            r7 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.String r10 = "GPSAltitude"
            o2.a$c r10 = r6.e(r10)
            if (r10 != 0) goto L_0x00b4
            goto L_0x00ba
        L_0x00b4:
            java.nio.ByteOrder r11 = r6.f13638g     // Catch:{ NumberFormatException -> 0x00ba }
            double r7 = r10.g(r11)     // Catch:{ NumberFormatException -> 0x00ba }
        L_0x00ba:
            r10 = -1
            java.lang.String r11 = "GPSAltitudeRef"
            int r6 = r6.d(r10, r11)
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x00d0
            if (r6 < 0) goto L_0x00d0
            if (r6 != r5) goto L_0x00cc
            goto L_0x00cd
        L_0x00cc:
            r10 = r5
        L_0x00cd:
            double r13 = (double) r10
            double r7 = r7 * r13
            goto L_0x00d1
        L_0x00d0:
            r7 = r11
        L_0x00d1:
            o2.a r6 = r0.f10228a
            java.lang.String r10 = "GPSSpeed"
            o2.a$c r10 = r6.e(r10)
            if (r10 != 0) goto L_0x00dc
            goto L_0x00e2
        L_0x00dc:
            java.nio.ByteOrder r6 = r6.f13638g     // Catch:{ NumberFormatException -> 0x00e2 }
            double r11 = r10.g(r6)     // Catch:{ NumberFormatException -> 0x00e2 }
        L_0x00e2:
            o2.a r6 = r0.f10228a
            java.lang.String r10 = "GPSSpeedRef"
            java.lang.String r6 = r6.c(r10)
            java.lang.String r10 = "K"
            if (r6 != 0) goto L_0x00ef
            r6 = r10
        L_0x00ef:
            o2.a r13 = r0.f10228a
            java.lang.String r14 = "GPSDateStamp"
            java.lang.String r13 = r13.c(r14)
            o2.a r14 = r0.f10228a
            java.lang.String r15 = "GPSTimeStamp"
            java.lang.String r14 = r14.c(r15)
            if (r13 != 0) goto L_0x0104
            if (r14 != 0) goto L_0x0104
            goto L_0x0144
        L_0x0104:
            if (r14 != 0) goto L_0x0117
            g0.e$a r14 = f10223b     // Catch:{ ParseException -> 0x0144 }
            java.lang.Object r14 = r14.get()     // Catch:{ ParseException -> 0x0144 }
            java.text.SimpleDateFormat r14 = (java.text.SimpleDateFormat) r14     // Catch:{ ParseException -> 0x0144 }
            java.util.Date r13 = r14.parse(r13)     // Catch:{ ParseException -> 0x0144 }
            long r13 = r13.getTime()     // Catch:{ ParseException -> 0x0144 }
            goto L_0x0146
        L_0x0117:
            if (r13 != 0) goto L_0x012a
            g0.e$b r13 = f10224c     // Catch:{ ParseException -> 0x0144 }
            java.lang.Object r13 = r13.get()     // Catch:{ ParseException -> 0x0144 }
            java.text.SimpleDateFormat r13 = (java.text.SimpleDateFormat) r13     // Catch:{ ParseException -> 0x0144 }
            java.util.Date r13 = r13.parse(r14)     // Catch:{ ParseException -> 0x0144 }
            long r13 = r13.getTime()     // Catch:{ ParseException -> 0x0144 }
            goto L_0x0146
        L_0x012a:
            java.lang.String r15 = " "
            java.lang.String r13 = f0.b0.s(r13, r15, r14)
            if (r13 != 0) goto L_0x0133
            goto L_0x0144
        L_0x0133:
            g0.e$c r14 = f10225d     // Catch:{ ParseException -> 0x0144 }
            java.lang.Object r14 = r14.get()     // Catch:{ ParseException -> 0x0144 }
            java.text.SimpleDateFormat r14 = (java.text.SimpleDateFormat) r14     // Catch:{ ParseException -> 0x0144 }
            java.util.Date r13 = r14.parse(r13)     // Catch:{ ParseException -> 0x0144 }
            long r13 = r13.getTime()     // Catch:{ ParseException -> 0x0144 }
            goto L_0x0146
        L_0x0144:
            r13 = -1
        L_0x0146:
            if (r9 != 0) goto L_0x014e
            r3 = 5
            r4 = 0
            r0 = r3
            r3 = r1
            goto L_0x01c1
        L_0x014e:
            if (r3 != 0) goto L_0x0152
            java.lang.String r3 = "e"
        L_0x0152:
            android.location.Location r15 = new android.location.Location
            r15.<init>(r3)
            r3 = r1
            r0 = r9[r4]
            r15.setLatitude(r0)
            r0 = r9[r5]
            r15.setLongitude(r0)
            r0 = 0
            int r9 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x016b
            r15.setAltitude(r7)
        L_0x016b:
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01b6
            int r0 = r6.hashCode()
            r1 = 75
            if (r0 == r1) goto L_0x0193
            r1 = 77
            if (r0 == r1) goto L_0x018a
            r1 = 78
            if (r0 == r1) goto L_0x0180
            goto L_0x019b
        L_0x0180:
            java.lang.String r0 = "N"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x019b
            r4 = r5
            goto L_0x019c
        L_0x018a:
            java.lang.String r0 = "M"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x019b
            goto L_0x019c
        L_0x0193:
            boolean r0 = r6.equals(r10)
            if (r0 == 0) goto L_0x019b
            r4 = 2
            goto L_0x019c
        L_0x019b:
            r4 = -1
        L_0x019c:
            r0 = 4612219559875242487(0x4001e540cc78e9f7, double:2.23694)
            if (r4 == 0) goto L_0x01b1
            if (r4 == r5) goto L_0x01ab
            r4 = 4603772031953394081(0x3fe3e2456f75d9a1, double:0.621371)
            goto L_0x01b0
        L_0x01ab:
            r4 = 4607861471551832331(0x3ff269984a0e410b, double:1.15078)
        L_0x01b0:
            double r11 = r11 * r4
        L_0x01b1:
            double r11 = r11 / r0
            float r0 = (float) r11
            r15.setSpeed(r0)
        L_0x01b6:
            r0 = -1
            int r4 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x01bf
            r15.setTime(r13)
        L_0x01bf:
            r0 = 5
            r4 = r15
        L_0x01c1:
            r2[r0] = r4
            r0 = 6
            r1 = r19
            o2.a r4 = r1.f10228a
            java.lang.String r5 = "DateTimeOriginal"
            java.lang.String r4 = r4.c(r5)
            if (r4 != 0) goto L_0x01d1
            goto L_0x01e6
        L_0x01d1:
            g0.e$c r5 = f10225d     // Catch:{ ParseException -> 0x01e6 }
            java.lang.Object r5 = r5.get()     // Catch:{ ParseException -> 0x01e6 }
            java.text.SimpleDateFormat r5 = (java.text.SimpleDateFormat) r5     // Catch:{ ParseException -> 0x01e6 }
            java.util.Date r4 = r5.parse(r4)     // Catch:{ ParseException -> 0x01e6 }
            long r4 = r4.getTime()     // Catch:{ ParseException -> 0x01e6 }
            r17 = r4
            r4 = -1
            goto L_0x01ea
        L_0x01e6:
            r4 = -1
            r17 = -1
        L_0x01ea:
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x01f0
            r15 = r4
            goto L_0x020c
        L_0x01f0:
            o2.a r4 = r1.f10228a
            java.lang.String r5 = "SubSecTimeOriginal"
            java.lang.String r4 = r4.c(r5)
            if (r4 == 0) goto L_0x020a
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x020a }
        L_0x01fe:
            r6 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0208
            r6 = 10
            long r4 = r4 / r6
            goto L_0x01fe
        L_0x0208:
            long r17 = r17 + r4
        L_0x020a:
            r15 = r17
        L_0x020c:
            java.lang.Long r4 = java.lang.Long.valueOf(r15)
            r2[r0] = r4
            o2.a r0 = r1.f10228a
            java.lang.String r4 = "ImageDescription"
            java.lang.String r0 = r0.c(r4)
            r4 = 7
            r2[r4] = r0
            java.lang.String r0 = "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}"
            java.lang.String r0 = java.lang.String.format(r3, r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.e.toString():java.lang.String");
    }
}
