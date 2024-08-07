package j7;

import al.g0;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.biometric.R$string;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.runtime.R$id;
import c3.c;
import ca.f;
import com.airbnb.lottie.i;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import dc.q;
import dl.i;
import dl.y;
import ek.d;
import ek.g;
import f0.b0;
import fk.h;
import fl.s;
import g5.b;
import h0.e;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import l4.c0;
import l4.m;
import l4.o;
import ll.a0;
import ll.d0;
import ll.r;
import ll.t;
import ll.v;
import ll.z;
import org.json.JSONArray;
import org.json.JSONObject;
import p3.l0;
import sk.j;
import u4.u;
import x2.n;
import x2.p;
import yk.l;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public class a implements c.C0050c, q, b, f, c0, o3.a, SuccessContinuation {
    public static final int[] A = new int[0];
    public static final long[] B = new long[0];
    public static final Object[] C = new Object[0];
    public static final x0.a D = new x0.a(new long[0], new Object[0]);
    public static final String[] E = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};

    /* renamed from: a  reason: collision with root package name */
    public static Context f11700a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f11701b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Thread f11702c = null;

    /* renamed from: d  reason: collision with root package name */
    public static final u9.b f11703d = new u9.b("REMOVED_TASK", 1);

    /* renamed from: e  reason: collision with root package name */
    public static final u9.b f11704e = new u9.b("CLOSED_EMPTY", 1);

    /* renamed from: f  reason: collision with root package name */
    public static final u9.b f11705f = new u9.b("NO_VALUE", 1);

    /* renamed from: n  reason: collision with root package name */
    public static final u9.b f11706n = new u9.b("CONDITION_FALSE", 1);

    /* renamed from: o  reason: collision with root package name */
    public static final a f11707o = new a();

    /* renamed from: p  reason: collision with root package name */
    public static Field f11708p = null;

    /* renamed from: q  reason: collision with root package name */
    public static boolean f11709q = false;

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ a f11710r = new a();

    /* renamed from: s  reason: collision with root package name */
    public static String f11711s = "";

    /* renamed from: t  reason: collision with root package name */
    public static String f11712t = "";

    /* renamed from: u  reason: collision with root package name */
    public static String f11713u = "";

    /* renamed from: v  reason: collision with root package name */
    public static final a f11714v = new a();

    /* renamed from: w  reason: collision with root package name */
    public static final String[] f11715w = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "gbraid", "session_number", "session_id"};

    /* renamed from: x  reason: collision with root package name */
    public static final String[] f11716x = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_gbraid", "_sno", "_sid"};

    /* renamed from: y  reason: collision with root package name */
    public static final int[][] f11717y = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, 308, 436, 284, 646, 653, 428, 379}, new int[]{274, 562, 232, 755, 599, 524, 801, 132, 295, 116, 442, 428, 295, 42, 176, 65}, new int[]{361, 575, 922, 525, 176, 586, 640, 321, 536, 742, 677, 742, 687, 284, 193, 517, 273, 494, 263, 147, 593, 800, 571, 320, 803, 133, 231, 390, 685, 330, 63, 410}, new int[]{539, 422, 6, 93, 862, 771, 453, 106, 610, 287, 107, 505, 733, 877, 381, 612, 723, 476, 462, 172, 430, 609, 858, 822, 543, 376, 511, 400, 672, 762, 283, 184, 440, 35, 519, 31, 460, 594, 225, 535, 517, 352, 605, 158, 651, 201, 488, 502, 648, 733, 717, 83, 404, 97, 280, 771, 840, 629, 4, 381, 843, 623, 264, 543}, new int[]{521, 310, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, 400, 925, 749, 415, 822, 93, 217, 208, 928, 244, 583, 620, 246, 148, 447, 631, 292, 908, 490, 704, 516, 258, 457, 907, 594, 723, 674, 292, 272, 96, 684, 432, 686, 606, 860, 569, 193, 219, 129, 186, 236, 287, 192, 775, 278, 173, 40, 379, 712, 463, 646, 776, 171, 491, 297, 763, 156, 732, 95, 270, 447, 90, 507, 48, 228, 821, 808, 898, 784, 663, 627, 378, 382, 262, 380, 602, 754, 336, 89, 614, 87, 432, 670, 616, 157, 374, 242, 726, 600, 269, 375, 898, 845, 454, 354, 130, 814, 587, 804, 34, 211, 330, 539, 297, 827, 865, 37, 517, 834, 315, 550, 86, 801, 4, 108, 539}, new int[]{524, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, 250, 905, 786, 138, 720, 858, 194, 311, 913, 275, 190, 375, 850, 438, 733, 194, 280, 201, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, 605, 540, 913, 801, 700, 799, 137, 439, 418, 592, 668, 353, 859, 370, 694, 325, 240, 216, 257, 284, 549, 209, 884, 315, 70, 329, 793, 490, 274, 877, 162, 749, 812, 684, 461, 334, 376, 849, 521, 307, 291, 803, 712, 19, 358, 399, 908, 103, 511, 51, 8, 517, 225, 289, 470, 637, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, 136, 538, 906, 90, 2, 290, 743, 199, 655, 903, 329, 49, 802, 580, 355, 588, 188, 462, 10, 134, 628, 320, 479, 130, 739, 71, 263, 318, 374, 601, 192, 605, 142, 673, 687, 234, 722, 384, 177, 752, 607, 640, 455, 193, 689, 707, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, 309, 697, 755, 756, 60, 231, 773, 434, 421, 726, 528, 503, 118, 49, 795, 32, 144, 500, 238, 836, 394, 280, 566, 319, 9, 647, 550, 73, 914, 342, 126, 32, 681, 331, 792, 620, 60, 609, 441, 180, 791, 893, 754, 605, 383, 228, 749, 760, 213, 54, 297, 134, 54, 834, 299, 922, 191, 910, 532, 609, 829, 189, 20, 167, 29, 872, 449, 83, 402, 41, 656, 505, 579, 481, 173, 404, 251, 688, 95, 497, 555, 642, 543, 307, 159, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, 504, 35, 599, 428, 207, 409, 574, 118, 498, 285, 380, 350, 492, 197, 265, 920, 155, 914, 299, 229, 643, 294, 871, 306, 88, 87, 193, 352, 781, 846, 75, 327, 520, 435, 543, 203, 666, 249, 346, 781, 621, 640, 268, 794, 534, 539, 781, 408, 390, 644, 102, 476, 499, 290, 632, 545, 37, 858, 916, 552, 41, 542, 289, 122, 272, 383, 800, 485, 98, 752, 472, 761, 107, 784, 860, 658, 741, 290, 204, 681, 407, 855, 85, 99, 62, 482, 180, 20, 297, 451, 593, 913, 142, 808, 684, 287, 536, 561, 76, 653, 899, 729, 567, 744, 390, 513, 192, 516, 258, 240, 518, 794, 395, 768, 848, 51, 610, 384, 168, 190, 826, 328, 596, 786, 303, 570, 381, 415, 641, 156, 237, 151, 429, 531, 207, 676, 710, 89, 168, 304, 402, 40, 708, 575, 162, 864, 229, 65, 861, 841, 512, 164, 477, 221, 92, 358, 785, 288, 357, 850, 836, 827, 736, 707, 94, 8, 494, 114, 521, 2, 499, 851, 543, 152, 729, 771, 95, 248, 361, 578, 323, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, 902, 452, 167, 342, 244, 173, 35, 463, 651, 51, 699, 591, 452, 578, 37, 124, 298, 332, 552, 43, 427, 119, 662, 777, 475, 850, 764, 364, 578, 911, 283, 711, 472, 420, 245, 288, 594, 394, 511, 327, 589, 777, 699, 688, 43, 408, 842, 383, 721, 521, 560, 644, 714, 559, 62, 145, 873, 663, 713, 159, 672, 729, 624, 59, 193, 417, 158, 209, 563, 564, 343, 693, 109, 608, 563, 365, 181, 772, 677, 310, 248, 353, 708, 410, 579, 870, 617, 841, 632, 860, 289, 536, 35, 777, 618, 586, 424, 833, 77, 597, 346, 269, 757, 632, 695, 751, 331, 247, 184, 45, 787, 680, 18, 66, 407, 369, 54, 492, 228, 613, 830, 922, 437, 519, 644, 905, 789, 420, 305, 441, 207, 300, 892, 827, 141, 537, 381, 662, 513, 56, 252, 341, 242, 797, 838, 837, 720, 224, 307, 631, 61, 87, 560, 310, 756, 665, 397, 808, 851, 309, 473, 795, 378, 31, 647, 915, 459, 806, 590, 731, 425, 216, 548, 249, 321, 881, 699, 535, 673, 782, 210, 815, 905, 303, 843, 922, 281, 73, 469, 791, 660, 162, 498, 308, 155, 422, 907, 817, 187, 62, 16, 425, 535, 336, 286, 437, 375, 273, 610, 296, 183, 923, 116, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, 330, 5, 39, 923, 311, 424, 242, 749, 321, 54, 669, 316, 342, 299, 534, 105, 667, 488, 640, 672, 576, 540, 316, 486, 721, 610, 46, 656, 447, 171, 616, 464, 190, 531, 297, 321, 762, 752, 533, 175, 134, 14, 381, 433, 717, 45, 111, 20, 596, 284, 736, 138, 646, 411, 877, 669, 141, 919, 45, 780, 407, 164, 332, 899, 165, 726, 600, 325, 498, 655, 357, 752, 768, 223, 849, 647, 63, 310, 863, 251, 366, 304, 282, 738, 675, 410, 389, 244, 31, 121, 303, 263}};

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ a f11718z = new a();

    public /* synthetic */ a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        p3.l0.u(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A(d3.c r5) {
        /*
            gk.a r0 = new gk.a
            r0.<init>()
            java.lang.String r1 = "SELECT name FROM sqlite_master WHERE type = 'trigger'"
            android.database.Cursor r1 = r5.q(r1)
        L_0x000b:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x005a }
            r3 = 0
            if (r2 == 0) goto L_0x001a
            java.lang.String r2 = r1.getString(r3)     // Catch:{ all -> 0x005a }
            r0.add(r2)     // Catch:{ all -> 0x005a }
            goto L_0x000b
        L_0x001a:
            ek.i r2 = ek.i.f20112a     // Catch:{ all -> 0x005a }
            r2 = 0
            p3.l0.u(r1, r2)
            gk.a r0 = j(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x0028:
            r1 = r0
            gk.a$a r1 = (gk.a.C0284a) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0059
            java.lang.Object r1 = r1.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "triggerName"
            sk.j.e(r1, r2)
            java.lang.String r2 = "room_fts_content_sync_"
            boolean r2 = yk.h.L0(r1, r2, r3)
            if (r2 == 0) goto L_0x0028
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "DROP TRIGGER IF EXISTS "
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r5.o(r1)
            goto L_0x0028
        L_0x0059:
            return
        L_0x005a:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            p3.l0.u(r1, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.a.A(d3.c):void");
    }

    public static int A0(Object obj) {
        if (obj == null) {
            return 0;
        }
        try {
            String trim = obj.toString().trim();
            if (trim.contains(".")) {
                return Integer.parseInt(trim.substring(0, trim.lastIndexOf(".")));
            }
            return Integer.parseInt(trim);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String B(j2.c cVar) {
        StringBuilder sb2 = new StringBuilder(cVar.size());
        for (int i10 = 0; i10 < cVar.size(); i10++) {
            byte g2 = cVar.g(i10);
            if (g2 == 34) {
                sb2.append("\\\"");
            } else if (g2 == 39) {
                sb2.append("\\'");
            } else if (g2 != 92) {
                switch (g2) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (g2 >= 32 && g2 <= 126) {
                            sb2.append((char) g2);
                            break;
                        } else {
                            sb2.append('\\');
                            sb2.append((char) (((g2 >>> 6) & 3) + 48));
                            sb2.append((char) (((g2 >>> 3) & 7) + 48));
                            sb2.append((char) ((g2 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static ArrayList B0(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONArray) {
                obj = B0((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = D0((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static String C(tc.c cVar) {
        StringBuilder sb2 = new StringBuilder(cVar.size());
        for (int i10 = 0; i10 < cVar.size(); i10++) {
            byte g2 = cVar.g(i10);
            if (g2 == 34) {
                sb2.append("\\\"");
            } else if (g2 == 39) {
                sb2.append("\\'");
            } else if (g2 != 92) {
                switch (g2) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (g2 >= 32 && g2 <= 126) {
                            sb2.append((char) g2);
                            break;
                        } else {
                            sb2.append('\\');
                            sb2.append((char) (((g2 >>> 6) & 3) + 48));
                            sb2.append((char) (((g2 >>> 3) & 7) + 48));
                            sb2.append((char) ((g2 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static long C0(Object obj) {
        long j10;
        if (obj == null) {
            return 0;
        }
        try {
            String trim = obj.toString().trim();
            if (trim.contains(".")) {
                j10 = Long.parseLong(trim.substring(0, trim.lastIndexOf(".")));
            } else {
                j10 = Long.parseLong(trim);
            }
            return j10;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static View D(int i10, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View findViewById = viewGroup.getChildAt(i11).findViewById(i10);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static v0.b D0(JSONObject jSONObject) {
        v0.b bVar = new v0.b();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = B0((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = D0((JSONObject) obj);
            } else if (obj.equals(JSONObject.NULL)) {
                obj = null;
            }
            bVar.put(next, obj);
        }
        return bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object E(dl.e r4, ik.d r5) {
        /*
            boolean r0 = r5 instanceof dl.o
            if (r0 == 0) goto L_0x0013
            r0 = r5
            dl.o r0 = (dl.o) r0
            int r1 = r0.f20016d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f20016d = r1
            goto L_0x0018
        L_0x0013:
            dl.o r0 = new dl.o
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f20015c
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f20016d
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            dl.n r4 = r0.f20014b
            sk.r r0 = r0.f20013a
            p3.l0.Q0(r5)     // Catch:{ AbortFlowException -> 0x002b }
            goto L_0x005d
        L_0x002b:
            r5 = move-exception
            goto L_0x0059
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            p3.l0.Q0(r5)
            sk.r r5 = new sk.r
            r5.<init>()
            u9.b r2 = al.g0.f19020c
            r5.f22931a = r2
            dl.n r2 = new dl.n
            r2.<init>(r5)
            r0.f20013a = r5     // Catch:{ AbortFlowException -> 0x0055 }
            r0.f20014b = r2     // Catch:{ AbortFlowException -> 0x0055 }
            r0.f20016d = r3     // Catch:{ AbortFlowException -> 0x0055 }
            java.lang.Object r4 = r4.a(r2, r0)     // Catch:{ AbortFlowException -> 0x0055 }
            if (r4 != r1) goto L_0x0053
            goto L_0x0063
        L_0x0053:
            r0 = r5
            goto L_0x005d
        L_0x0055:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L_0x0059:
            dl.f<?> r1 = r5.f20848a
            if (r1 != r4) goto L_0x006c
        L_0x005d:
            T r1 = r0.f22931a
            u9.b r4 = al.g0.f19020c
            if (r1 == r4) goto L_0x0064
        L_0x0063:
            return r1
        L_0x0064:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        L_0x006c:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.a.E(dl.e, ik.d):java.lang.Object");
    }

    public static String E0(Number number) {
        try {
            return number.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static Application F(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
            if (context2 instanceof Application) {
                return (Application) context2;
            }
        }
        throw new IllegalStateException("Could not find an Application in the given context: " + context);
    }

    public static void F0() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }

    public static String G(Context context, int i10) {
        if (context == null) {
            return "";
        }
        if (i10 == 1) {
            return context.getString(R$string.fingerprint_error_hw_not_available);
        }
        if (i10 != 7) {
            switch (i10) {
                case 9:
                    break;
                case 10:
                    return context.getString(R$string.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(R$string.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(R$string.fingerprint_error_hw_not_present);
                default:
                    return context.getString(R$string.default_error_msg);
            }
        }
        return context.getString(R$string.fingerprint_error_lockout);
    }

    public static Object G0(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, cls.getCanonicalName(), obj2.getClass().getCanonicalName()}));
    }

    public static Locale H(int i10) {
        switch (i10) {
            case 1:
                return Locale.TRADITIONAL_CHINESE;
            case 2:
                return Locale.ENGLISH;
            case 3:
                return Locale.KOREA;
            case 4:
                return Locale.GERMANY;
            case 5:
                return Locale.FRANCE;
            case 6:
                return Locale.JAPAN;
            case 7:
                return new Locale("vi");
            case 8:
                return new Locale("es", "ES");
            case 9:
                return new Locale("pt", "PT");
            case 10:
                return new Locale("ar", "AE");
            case 11:
                return new Locale("ru", "rRU");
            case 12:
                return new Locale("cs", "rCZ");
            case 13:
                return new Locale("kk", "rKZ");
            default:
                return Locale.CHINESE;
        }
    }

    public static final int I(List list) {
        j.f(list, "<this>");
        return list.size() - 1;
    }

    public static int J(Context context, int i10, ke.a aVar) {
        return 0;
    }

    public static int K(String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        if (str.startsWith("video")) {
            return 2;
        }
        if (str.startsWith("audio")) {
            return 3;
        }
        return 1;
    }

    public static int L(int[] iArr, int i10, boolean z10) {
        int[] iArr2 = iArr;
        int i11 = i10;
        int i12 = 0;
        for (int i13 : iArr2) {
            i12 += i13;
        }
        int length = iArr2.length;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int i17 = length - 1;
            if (i14 >= i17) {
                return i15;
            }
            int i18 = 1 << i14;
            i16 |= i18;
            int i19 = 1;
            while (i19 < iArr2[i14]) {
                int i20 = i12 - i19;
                int i21 = length - i14;
                int i22 = i21 - 2;
                int v2 = v(i20 - 1, i22);
                if (z10 && i16 == 0) {
                    int i23 = i21 - 1;
                    if (i20 - i23 >= i23) {
                        v2 -= v(i20 - i21, i22);
                    }
                }
                if (i21 - 1 > 1) {
                    int i24 = i20 - i22;
                    int i25 = 0;
                    while (i24 > i11) {
                        i25 += v((i20 - i24) - 1, i21 - 3);
                        i24--;
                        int[] iArr3 = iArr;
                    }
                    v2 -= (i17 - i14) * i25;
                } else if (i20 > i11) {
                    v2--;
                }
                i15 += v2;
                i19++;
                i16 &= ~i18;
                iArr2 = iArr;
            }
            i12 -= i19;
            i14++;
            iArr2 = iArr;
        }
    }

    public static final s M(Object obj) {
        if (obj != l0.f13951b) {
            return (s) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static int N(Set set) {
        int i10;
        int i11 = 0;
        for (Object next : set) {
            if (next != null) {
                i10 = next.hashCode();
            } else {
                i10 = 0;
            }
            i11 = ~(~(i11 + i10));
        }
        return i11;
    }

    public static View O(LinearLayout linearLayout, int i10) {
        View inflate = LayoutInflater.from(linearLayout.getContext()).inflate(i10, linearLayout, false);
        j.e(inflate, "inflate(...)");
        return inflate;
    }

    public static e P() {
        if (e.f10516b != null) {
            return e.f10516b;
        }
        synchronized (e.class) {
            try {
                if (e.f10516b == null) {
                    e.f10516b = new e();
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return e.f10516b;
    }

    public static final boolean Q(AssertionError assertionError) {
        boolean z10;
        Logger logger = r.f20900a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message != null) {
            z10 = l.N0(message, "getsockname failed");
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return false;
    }

    public static final boolean R(Object obj) {
        if (obj == l0.f13951b) {
            return true;
        }
        return false;
    }

    public static boolean S(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("content://");
    }

    public static boolean T(Activity activity) {
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            return false;
        }
        return true;
    }

    public static boolean U(String str) {
        if (str == null || !str.startsWith("audio")) {
            return false;
        }
        return true;
    }

    public static boolean V(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("image/bmp") || str.startsWith("image/x-ms-bmp") || str.startsWith("image/vnd.wap.wbmp")) {
            return true;
        }
        return false;
    }

    public static boolean W(String str) {
        if (str == null || (!str.equals("image/gif") && !str.equals("image/GIF"))) {
            return false;
        }
        return true;
    }

    public static boolean X(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("http") || str.startsWith("https")) {
            return true;
        }
        return false;
    }

    public static boolean Y(String str) {
        if (str == null || !str.startsWith("image")) {
            return false;
        }
        return true;
    }

    public static boolean Z(String str) {
        if (str == null || !str.startsWith("video")) {
            return false;
        }
        return true;
    }

    public static final ek.c a0(rk.a aVar) {
        d[] dVarArr = d.f20101a;
        return new ek.j(aVar);
    }

    public static final g b0(rk.a aVar) {
        j.f(aVar, "initializer");
        return new g(aVar);
    }

    public static final List c0(Object obj) {
        List singletonList = Collections.singletonList(obj);
        j.e(singletonList, "singletonList(element)");
        return singletonList;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r3.equals("AUCTION_SUCCESS") != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        if (r3.equals("AUCTION_VIOLATE") == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        r2.startActivity(new android.content.Intent(r2, com.vpa.daugia.module.history.ui.activity.AuctionHistoryActivity.class));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r3.equals("AUCTION_FAIL") == false) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(com.ots.core.base.BaseActivity r2, com.vpa.daugia.module.home.data.model.Action r3, boolean r4) {
        /*
            java.lang.String r3 = r3.getActionName()
            if (r3 == 0) goto L_0x007c
            int r0 = r3.hashCode()
            java.lang.String r1 = "SELECTION_VIEW"
            switch(r0) {
                case -1819593742: goto L_0x0064;
                case -1717586298: goto L_0x0050;
                case -1471721421: goto L_0x0037;
                case 247073223: goto L_0x002e;
                case 1289063046: goto L_0x001a;
                case 1986984890: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x007c
        L_0x0011:
            java.lang.String r0 = "AUCTION_FAIL"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0059
            goto L_0x007c
        L_0x001a:
            java.lang.String r0 = "NO_CONFIRM_AUCTION_MINUTES"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0023
            goto L_0x007c
        L_0x0023:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.vpa.daugia.module.common.ui.activity.MyDocumentActivity> r0 = com.vpa.daugia.module.common.ui.activity.MyDocumentActivity.class
            r3.<init>(r2, r0)
            r2.startActivity(r3)
            goto L_0x007c
        L_0x002e:
            java.lang.String r0 = "AUCTION_SUCCESS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x007c
            goto L_0x0059
        L_0x0037:
            java.lang.String r0 = "REMIND_USER_JOIN_AUCTION_BEFORE_START_TIME"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0040
            goto L_0x007c
        L_0x0040:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.vpa.daugia.ui.MainActivity> r0 = com.vpa.daugia.ui.MainActivity.class
            r3.<init>(r2, r0)
            java.lang.String r0 = "WAITING_ACTION_VIEW"
            r3.putExtra(r1, r0)
            r2.startActivity(r3)
            goto L_0x007c
        L_0x0050:
            java.lang.String r0 = "AUCTION_VIOLATE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0059
            goto L_0x007c
        L_0x0059:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.vpa.daugia.module.history.ui.activity.AuctionHistoryActivity> r0 = com.vpa.daugia.module.history.ui.activity.AuctionHistoryActivity.class
            r3.<init>(r2, r0)
            r2.startActivity(r3)
            goto L_0x007c
        L_0x0064:
            java.lang.String r0 = "ORDER_FULLY_PAID"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x006d
            goto L_0x007c
        L_0x006d:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.vpa.daugia.module.cart.ui.CartManagerActivity> r0 = com.vpa.daugia.module.cart.ui.CartManagerActivity.class
            r3.<init>(r2, r0)
            java.lang.String r0 = "PAYMENT_SUCCESS_VIEW"
            r3.putExtra(r1, r0)
            r2.startActivity(r3)
        L_0x007c:
            if (r4 == 0) goto L_0x0081
            r2.finish()
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.a.d(com.ots.core.base.BaseActivity, com.vpa.daugia.module.home.data.model.Action, boolean):void");
    }

    public static final List d0(Object... objArr) {
        j.f(objArr, "elements");
        if (objArr.length > 0) {
            return h.l0(objArr);
        }
        return fk.r.f20213a;
    }

    public static final ArrayList e(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new fk.f(objArr, true));
    }

    public static long e0(int i10, byte[] bArr) {
        return ((long) (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16))) & 4294967295L;
    }

    public static h0.b f0() {
        if (h0.f.f10519a != null) {
            return h0.f.f10519a;
        }
        synchronized (h0.f.class) {
            try {
                if (h0.f.f10519a == null) {
                    h0.f.f10519a = new h0.b(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return h0.f.f10519a;
    }

    public static int g(int i10, int i11, int[] iArr) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else if (i15 <= i11) {
                return i14;
            } else {
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public static final ArrayList g0(Object... objArr) {
        j.f(objArr, "elements");
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new fk.f(objArr, true));
    }

    public static int h(long[] jArr, int i10, long j10) {
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = (jArr[i13] > j10 ? 1 : (jArr[i13] == j10 ? 0 : -1));
            if (i14 < 0) {
                i12 = i13 + 1;
            } else if (i14 <= 0) {
                return i13;
            } else {
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static h4.a h0(m4.d dVar, i iVar) {
        return new h4.a(0, o.a(dVar, iVar, 1.0f, g0.f19027q, false));
    }

    public static final v i(a0 a0Var) {
        j.f(a0Var, "<this>");
        return new v(a0Var);
    }

    public static h4.b i0(m4.c cVar, i iVar, boolean z10) {
        float f10;
        if (z10) {
            f10 = n4.g.c();
        } else {
            f10 = 1.0f;
        }
        return new h4.b(o.a(cVar, iVar, f10, f11714v, false));
    }

    public static final gk.a j(gk.a aVar) {
        if (aVar.f20432e == null) {
            aVar.n();
            aVar.f20431d = true;
            if (aVar.f20430c > 0) {
                return aVar;
            }
            return gk.a.f20427n;
        }
        throw new IllegalStateException();
    }

    public static h4.d j0(m4.d dVar, i iVar) {
        return new h4.d(0, o.a(dVar, iVar, 1.0f, m9.b.C, false));
    }

    public static h4.c k0(m4.d dVar, i iVar) {
        return new h4.c(1, o.a(dVar, iVar, n4.g.c(), a.a.f2b, true));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.Serializable l(ik.d r4, dl.e r5, dl.f r6) {
        /*
            boolean r0 = r4 instanceof dl.k
            if (r0 == 0) goto L_0x0013
            r0 = r4
            dl.k r0 = (dl.k) r0
            int r1 = r0.f19997c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f19997c = r1
            goto L_0x0018
        L_0x0013:
            dl.k r0 = new dl.k
            r0.<init>(r4)
        L_0x0018:
            java.lang.Object r4 = r0.f19996b
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f19997c
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            sk.r r5 = r0.f19995a
            p3.l0.Q0(r4)     // Catch:{ all -> 0x0029 }
            goto L_0x004c
        L_0x0029:
            r4 = move-exception
            r1 = r4
            goto L_0x0051
        L_0x002c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0034:
            p3.l0.Q0(r4)
            sk.r r4 = new sk.r
            r4.<init>()
            dl.l r2 = new dl.l     // Catch:{ all -> 0x004e }
            r2.<init>(r6, r4)     // Catch:{ all -> 0x004e }
            r0.f19995a = r4     // Catch:{ all -> 0x004e }
            r0.f19997c = r3     // Catch:{ all -> 0x004e }
            java.lang.Object r4 = r5.a(r2, r0)     // Catch:{ all -> 0x004e }
            if (r4 != r1) goto L_0x004c
            goto L_0x008b
        L_0x004c:
            r1 = 0
            goto L_0x008b
        L_0x004e:
            r5 = move-exception
            r1 = r5
            r5 = r4
        L_0x0051:
            T r4 = r5.f22931a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r5 = 0
            if (r4 == 0) goto L_0x0060
            boolean r6 = sk.j.a(r4, r1)
            if (r6 == 0) goto L_0x0060
            r6 = r3
            goto L_0x0061
        L_0x0060:
            r6 = r5
        L_0x0061:
            if (r6 != 0) goto L_0x0098
            ik.f r6 = r0.getContext()
            al.i1$b r0 = al.i1.b.f19045a
            ik.f$b r6 = r6.get(r0)
            al.i1 r6 = (al.i1) r6
            if (r6 == 0) goto L_0x0087
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L_0x0078
            goto L_0x0087
        L_0x0078:
            java.util.concurrent.CancellationException r6 = r6.getCancellationException()
            if (r6 == 0) goto L_0x0085
            boolean r6 = sk.j.a(r6, r1)
            if (r6 == 0) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r3 = r5
        L_0x0086:
            r5 = r3
        L_0x0087:
            if (r5 != 0) goto L_0x0098
            if (r4 != 0) goto L_0x008c
        L_0x008b:
            return r1
        L_0x008c:
            boolean r5 = r1 instanceof java.util.concurrent.CancellationException
            if (r5 == 0) goto L_0x0094
            al.g0.s(r4, r1)
            throw r4
        L_0x0094:
            al.g0.s(r1, r4)
            throw r1
        L_0x0098:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.a.l(ik.d, dl.e, dl.f):java.io.Serializable");
    }

    public static Map l0(String str) {
        y6.j.c(str);
        String[] split = str.split("\\.", -1);
        if (split.length < 2) {
            return Collections.emptyMap();
        }
        try {
            String str2 = new String(Base64.decode(split[1], 11), "UTF-8");
            Map map = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject != JSONObject.NULL) {
                        map = D0(jSONObject);
                    }
                } catch (Exception e10) {
                    e10.toString();
                    Log.isLoggable("FirebaseAppCheck", 3);
                    map = Collections.emptyMap();
                }
            }
            if (map == null) {
                return Collections.emptyMap();
            }
            return map;
        } catch (UnsupportedEncodingException e11) {
            e11.toString();
            return Collections.emptyMap();
        }
    }

    public static void m(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static final Cursor m0(n nVar, p pVar) {
        j.f(nVar, "db");
        return nVar.l(pVar, (CancellationSignal) null);
    }

    public static void n(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static String n0(int i10, boolean z10) {
        int i11 = i10 / 100;
        int i12 = i10 % 100;
        if (!z10 && i11 <= 0) {
            return o0(i12, false);
        }
        StringBuilder q10 = android.support.v4.media.a.q(android.support.v4.media.a.o(android.support.v4.media.a.p(' '), E[i11], " trăm"));
        q10.append(o0(i12, true));
        return q10.toString();
    }

    public static boolean o(FragmentActivity fragmentActivity, String str) {
        if (!T(fragmentActivity) && fragmentActivity.G().D(str) == null) {
            return true;
        }
        return false;
    }

    public static String o0(int i10, boolean z10) {
        String str;
        int i11 = i10 / 10;
        int i12 = i10 % 10;
        if (i11 > 1) {
            str = android.support.v4.media.a.o(android.support.v4.media.a.p(' '), E[i11], " mươi");
            if (i12 == 1) {
                str = b0.r(str, " mốt");
            }
        } else if (i11 == 1) {
            if (i12 == 1) {
                str = " mười một";
            } else {
                str = " mười";
            }
        } else if (!z10 || i12 <= 0) {
            str = "";
        } else {
            str = " lẻ";
        }
        if (i12 == 5 && i11 > 1) {
            return b0.r(str, " lăm");
        }
        if (i12 <= 1 && (i12 != 1 || i11 != 0)) {
            return str;
        }
        return str + ' ' + E[i12];
    }

    public static String p0(int i10, boolean z10) {
        String str;
        int i11 = i10 / 1000000;
        int i12 = i10 % 1000000;
        boolean z11 = true;
        if (i11 > 0) {
            str = n0(i11, z10) + " triệu";
            z10 = true;
        } else {
            str = "";
        }
        int i13 = i12 / 1000;
        int i14 = i12 % 1000;
        if (i13 > 0) {
            StringBuilder q10 = android.support.v4.media.a.q(str);
            q10.append(n0(i13, z10));
            q10.append(" nghìn");
            str = q10.toString();
        } else {
            z11 = z10;
        }
        if (i14 <= 0) {
            return str;
        }
        StringBuilder q11 = android.support.v4.media.a.q(str);
        q11.append(n0(i14, z11));
        return q11.toString();
    }

    public static void q(int i10, String str) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(str.length() + 40);
            sb2.append(str);
            sb2.append(" cannot be negative but was: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static void q0(ImageView imageView, boolean z10) {
        float f10 = 0.0f;
        float f11 = 180.0f;
        if (!z10) {
            f11 = 0.0f;
            f10 = 180.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "rotation", new float[]{f10, f11});
        ofFloat.setDuration(250);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }

    public static void r(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument must not be null");
        }
    }

    public static final int r0(z zVar, int i10) {
        int i11;
        j.f(zVar, "<this>");
        int[] iArr = zVar.f20929f;
        int i12 = i10 + 1;
        int i13 = 0;
        int length = zVar.f20928e.length;
        j.f(iArr, "<this>");
        int i14 = length - 1;
        while (true) {
            if (i13 <= i14) {
                i11 = (i13 + i14) >>> 1;
                int i15 = iArr[i11];
                if (i15 >= i12) {
                    if (i15 <= i12) {
                        break;
                    }
                    i14 = i11 - 1;
                } else {
                    i13 = i11 + 1;
                }
            } else {
                i11 = (-i13) - 1;
                break;
            }
        }
        if (i11 >= 0) {
            return i11;
        }
        return ~i11;
    }

    public static void s(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static final void s0(View view, r2.l lVar) {
        j.f(view, "<this>");
        view.setTag(R$id.view_tree_lifecycle_owner, lVar);
    }

    public static final void t(int i10) {
        boolean z10 = true;
        if (i10 < 1) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException(android.support.v4.media.a.m("Expected positive parallelism level, but got ", i10).toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037 A[SYNTHETIC, Splitter:B:10:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045 A[Catch:{ Exception -> 0x00b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074 A[Catch:{ Exception -> 0x00b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008f A[Catch:{ Exception -> 0x00b0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void u(lg.b r13, android.app.Activity r14) {
        /*
            java.lang.String r0 = "activity"
            sk.j.f(r14, r0)
            m9.d r0 = m9.d.d()     // Catch:{ Exception -> 0x00b0 }
            java.lang.Class<vb.h> r1 = vb.h.class
            java.lang.Object r0 = r0.b(r1)     // Catch:{ Exception -> 0x00b0 }
            vb.h r0 = (vb.h) r0     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r1 = "firebase"
            vb.e r0 = r0.a(r1)     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r1 = "getInstance(...)"
            sk.j.e(r0, r1)     // Catch:{ Exception -> 0x00b0 }
            wb.f r1 = r0.f16149h     // Catch:{ Exception -> 0x00b0 }
            wb.c r2 = r1.f16780c     // Catch:{ Exception -> 0x00b0 }
            wb.d r2 = wb.f.b(r2)     // Catch:{ Exception -> 0x00b0 }
            r3 = 0
            java.lang.String r4 = "VPA_AppVersion"
            if (r2 != 0) goto L_0x002b
        L_0x0029:
            r2 = r3
            goto L_0x0035
        L_0x002b:
            org.json.JSONObject r2 = r2.f16766b     // Catch:{ JSONException -> 0x0029 }
            long r5 = r2.getLong(r4)     // Catch:{ JSONException -> 0x0029 }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ JSONException -> 0x0029 }
        L_0x0035:
            if (r2 == 0) goto L_0x0045
            wb.c r3 = r1.f16780c     // Catch:{ Exception -> 0x00b0 }
            wb.d r3 = wb.f.b(r3)     // Catch:{ Exception -> 0x00b0 }
            r1.a(r3, r4)     // Catch:{ Exception -> 0x00b0 }
            long r1 = r2.longValue()     // Catch:{ Exception -> 0x00b0 }
            goto L_0x0066
        L_0x0045:
            wb.c r1 = r1.f16781d     // Catch:{ Exception -> 0x00b0 }
            wb.d r1 = wb.f.b(r1)     // Catch:{ Exception -> 0x00b0 }
            if (r1 != 0) goto L_0x004e
            goto L_0x0058
        L_0x004e:
            org.json.JSONObject r1 = r1.f16766b     // Catch:{ JSONException -> 0x0058 }
            long r1 = r1.getLong(r4)     // Catch:{ JSONException -> 0x0058 }
            java.lang.Long r3 = java.lang.Long.valueOf(r1)     // Catch:{ JSONException -> 0x0058 }
        L_0x0058:
            if (r3 == 0) goto L_0x005f
            long r1 = r3.longValue()     // Catch:{ Exception -> 0x00b0 }
            goto L_0x0066
        L_0x005f:
            java.lang.String r1 = "Long"
            wb.f.e(r4, r1)     // Catch:{ Exception -> 0x00b0 }
            r1 = 0
        L_0x0066:
            boolean r3 = r0.c()     // Catch:{ Exception -> 0x00b0 }
            android.content.SharedPreferences r13 = r13.f20850a     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r4 = "OnDebug"
            r5 = 0
            r13.getBoolean(r4, r5)     // Catch:{ Exception -> 0x00b0 }
            if (r3 == 0) goto L_0x008f
            jf.b r13 = new jf.b     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r8 = "Nâng cấp"
            java.lang.String r9 = "Hệ thống đang tiến hành nâng cấp. Vui lòng thử lại sau!"
            java.lang.String r10 = ""
            java.lang.String r11 = "OK"
            r12 = 0
            r6 = r13
            r7 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00b0 }
            xi.b r0 = new xi.b     // Catch:{ Exception -> 0x00b0 }
            r0.<init>(r14)     // Catch:{ Exception -> 0x00b0 }
            r13.f11889j = r0     // Catch:{ Exception -> 0x00b0 }
            r13.h()     // Catch:{ Exception -> 0x00b0 }
            return
        L_0x008f:
            r3 = 2
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x00b4
            jf.b r13 = new jf.b     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r3 = "Cập nhật phiên bản mới"
            java.lang.String r4 = "Đã có phiên bản mới. Vui lòng cập nhật để tiếp tục sử dụng"
            java.lang.String r5 = "Để sau"
            java.lang.String r6 = "Cập nhật"
            r7 = 1
            r1 = r13
            r2 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00b0 }
            xi.c r1 = new xi.c     // Catch:{ Exception -> 0x00b0 }
            r1.<init>(r0, r14)     // Catch:{ Exception -> 0x00b0 }
            r13.f11889j = r1     // Catch:{ Exception -> 0x00b0 }
            r13.h()     // Catch:{ Exception -> 0x00b0 }
            return
        L_0x00b0:
            r13 = move-exception
            kf.h.a(r13)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.a.u(lg.b, android.app.Activity):void");
    }

    public static final ll.d u0(Socket socket) {
        Logger logger = r.f20900a;
        ll.b0 b0Var = new ll.b0(socket);
        OutputStream outputStream = socket.getOutputStream();
        j.e(outputStream, "getOutputStream(...)");
        return new ll.d(b0Var, new t(outputStream, b0Var));
    }

    public static int v(int i10, int i11) {
        int i12 = i10 - i11;
        if (i12 > i11) {
            int i13 = i12;
            i12 = i11;
            i11 = i13;
        }
        int i14 = 1;
        int i15 = 1;
        while (i10 > i11) {
            i14 *= i10;
            if (i15 <= i12) {
                i14 /= i15;
                i15++;
            }
            i10--;
        }
        while (i15 <= i12) {
            i14 /= i15;
            i15++;
        }
        return i14;
    }

    public static final ll.e v0(Socket socket) {
        Logger logger = r.f20900a;
        ll.b0 b0Var = new ll.b0(socket);
        InputStream inputStream = socket.getInputStream();
        j.e(inputStream, "getInputStream(...)");
        return new ll.e(b0Var, new ll.q(inputStream, b0Var));
    }

    public static byte[] w(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            byte b10 = 0;
            long e02 = (e0(0, bArr3) >> 0) & 67108863 & 67108863;
            long e03 = (e0(3, bArr3) >> 2) & 67108863 & 67108611;
            long e04 = (e0(6, bArr3) >> 4) & 67108863 & 67092735;
            long e05 = (e0(9, bArr3) >> 6) & 67108863 & 66076671;
            long e06 = (e0(12, bArr3) >> 8) & 67108863 & 1048575;
            long j10 = e03 * 5;
            long j11 = e04 * 5;
            long j12 = e05 * 5;
            long j13 = e06 * 5;
            int i10 = 17;
            byte[] bArr5 = new byte[17];
            long j14 = 0;
            int i11 = 0;
            long j15 = 0;
            long j16 = 0;
            long j17 = 0;
            long j18 = 0;
            while (i11 < bArr4.length) {
                int min = Math.min(16, bArr4.length - i11);
                System.arraycopy(bArr4, i11, bArr5, b10, min);
                bArr5[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr5, min + 1, i10, b10);
                }
                long e07 = j18 + ((e0(b10, bArr5) >> b10) & 67108863);
                long e08 = j14 + ((e0(3, bArr5) >> 2) & 67108863);
                long e09 = j15 + ((e0(6, bArr5) >> 4) & 67108863);
                long e010 = j16 + ((e0(9, bArr5) >> 6) & 67108863);
                long e011 = j17 + (((e0(12, bArr5) >> 8) & 67108863) | ((long) (bArr5[16] << 24)));
                long j19 = (e011 * j10) + (e010 * j11) + (e09 * j12) + (e08 * j13) + (e07 * e02);
                long j20 = (e011 * j11) + (e010 * j12) + (e09 * j13) + (e08 * e02) + (e07 * e03);
                long j21 = (e011 * j12) + (e010 * j13) + (e09 * e02) + (e08 * e03) + (e07 * e04);
                long j22 = (e010 * e02) + (e09 * e03) + (e08 * e04) + (e07 * e05);
                long j23 = e010 * e03;
                long j24 = e011 * e02;
                long j25 = j20 + (j19 >> 26);
                long j26 = j21 + (j25 >> 26);
                long j27 = (e011 * j13) + j22 + (j26 >> 26);
                long j28 = j24 + j23 + (e09 * e04) + (e08 * e05) + (e07 * e06) + (j27 >> 26);
                long j29 = j28 >> 26;
                j17 = j28 & 67108863;
                long j30 = (j29 * 5) + (j19 & 67108863);
                i11 += 16;
                j15 = j26 & 67108863;
                j16 = j27 & 67108863;
                j18 = j30 & 67108863;
                j14 = (j25 & 67108863) + (j30 >> 26);
                b10 = 0;
                i10 = 17;
            }
            long j31 = j15 + (j14 >> 26);
            long j32 = j31 & 67108863;
            long j33 = j16 + (j31 >> 26);
            long j34 = j33 & 67108863;
            long j35 = j17 + (j33 >> 26);
            long j36 = j35 & 67108863;
            long j37 = ((j35 >> 26) * 5) + j18;
            long j38 = j37 >> 26;
            long j39 = j37 & 67108863;
            long j40 = (j14 & 67108863) + j38;
            long j41 = j39 + 5;
            long j42 = j41 & 67108863;
            long j43 = j40 + (j41 >> 26);
            long j44 = j32 + (j43 >> 26);
            long j45 = j34 + (j44 >> 26);
            long j46 = (j36 + (j45 >> 26)) - 67108864;
            long j47 = j46 >> 63;
            long j48 = ~j47;
            long j49 = (j40 & j47) | (j43 & 67108863 & j48);
            long j50 = (j32 & j47) | (j44 & 67108863 & j48);
            long j51 = (j45 & 67108863 & j48) | (j34 & j47);
            long j52 = (j46 & j48) | (j36 & j47);
            long e012 = e0(16, bArr3) + (((j39 & j47) | (j42 & j48) | (j49 << 26)) & 4294967295L);
            long j53 = e012 & 4294967295L;
            long e013 = e0(20, bArr3) + (((j49 >> 6) | (j50 << 20)) & 4294967295L) + (e012 >> 32);
            long e014 = e0(24, bArr3) + (((j50 >> 12) | (j51 << 14)) & 4294967295L) + (e013 >> 32);
            long e015 = e0(28, bArr3);
            byte[] bArr6 = new byte[16];
            y0(bArr6, j53, 0);
            y0(bArr6, e013 & 4294967295L, 4);
            y0(bArr6, e014 & 4294967295L, 8);
            y0(bArr6, (e015 + (((j51 >> 18) | (j52 << 8)) & 4294967295L) + (e014 >> 32)) & 4294967295L, 12);
            return bArr6;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }

    public static final ll.q w0(InputStream inputStream) {
        Logger logger = r.f20900a;
        j.f(inputStream, "<this>");
        return new ll.q(inputStream, new d0());
    }

    public static h0.a x() {
        if (h0.a.f10503a != null) {
            return h0.a.f10503a;
        }
        synchronized (h0.a.class) {
            if (h0.a.f10503a == null) {
                h0.a.f10503a = new h0.a();
            }
        }
        return h0.a.f10503a;
    }

    public static final void x0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final dl.e y(dl.e eVar) {
        i.b bVar = dl.i.f19984a;
        if (eVar instanceof y) {
            return eVar;
        }
        i.b bVar2 = dl.i.f19984a;
        i.a aVar = dl.i.f19985b;
        if (eVar instanceof dl.d) {
            dl.d dVar = (dl.d) eVar;
            if (dVar.f19968b == bVar2 && dVar.f19969c == aVar) {
                return eVar;
            }
        }
        return new dl.d(eVar, bVar2, aVar);
    }

    public static void y0(byte[] bArr, long j10, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) ((int) (255 & j10));
            i11++;
            j10 >>= 8;
        }
    }

    public static int z(int i10) {
        return (int) TypedValue.applyDimension(1, (float) i10, Resources.getSystem().getDisplayMetrics());
    }

    public static double z0(String str) {
        if (str != null) {
            try {
                return Double.parseDouble(str.toString().trim());
            } catch (Exception unused) {
            }
        }
        return (double) 0;
    }

    public long a() {
        return System.currentTimeMillis();
    }

    public Object b(m4.c cVar, float f10) {
        return Float.valueOf(m.d(cVar) * f10);
    }

    public c c(c.b bVar) {
        return new d3.d(bVar.f4556a, bVar.f4557b, bVar.f4558c, bVar.f4559d, bVar.f4560e);
    }

    public u f(u uVar, s4.h hVar) {
        return uVar;
    }

    public Object k(ca.s sVar) {
        return new lc.i();
    }

    public Object p() {
        return new ArrayList();
    }

    public void t0(int i10, View view) {
        if (!f11709q) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f11708p = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f11709q = true;
        }
        Field field = f11708p;
        if (field != null) {
            try {
                f11708p.setInt(view, i10 | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public Task then(Object obj) {
        boolean z10;
        Bundle bundle = (Bundle) obj;
        int i10 = t6.a.f14835h;
        if (bundle == null || !bundle.containsKey("google.messenger")) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return Tasks.forResult(null);
        }
        return Tasks.forResult(bundle);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(com.google.android.gms.internal.p001firebaseauthapi.zzahk r9) {
        /*
            r8 = this;
            r8.<init>()
            boolean r0 = r9.zzh()
            if (r0 == 0) goto L_0x000d
            r9.zzd()
            goto L_0x0010
        L_0x000d:
            r9.zzc()
        L_0x0010:
            r9.zzc()
            boolean r0 = r9.zzi()
            r1 = 3
            if (r0 != 0) goto L_0x001b
            return
        L_0x001b:
            java.lang.String r0 = r9.zze()
            int r2 = r0.hashCode()
            r3 = 0
            r4 = 5
            r5 = 2
            r6 = 1
            r7 = 4
            switch(r2) {
                case -1874510116: goto L_0x005e;
                case -1452371317: goto L_0x0054;
                case -1341836234: goto L_0x004a;
                case -1099157829: goto L_0x0040;
                case 870738373: goto L_0x0036;
                case 970484929: goto L_0x002c;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x0068
        L_0x002c:
            java.lang.String r2 = "RECOVER_EMAIL"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0068
            r0 = r7
            goto L_0x0069
        L_0x0036:
            java.lang.String r2 = "EMAIL_SIGNIN"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0068
            r0 = r5
            goto L_0x0069
        L_0x0040:
            java.lang.String r2 = "VERIFY_AND_CHANGE_EMAIL"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0068
            r0 = r1
            goto L_0x0069
        L_0x004a:
            java.lang.String r2 = "VERIFY_EMAIL"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0068
            r0 = r6
            goto L_0x0069
        L_0x0054:
            java.lang.String r2 = "PASSWORD_RESET"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0068
            r0 = r3
            goto L_0x0069
        L_0x005e:
            java.lang.String r2 = "REVERT_SECOND_FACTOR_ADDITION"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0068
            r0 = r4
            goto L_0x0069
        L_0x0068:
            r0 = -1
        L_0x0069:
            if (r0 == 0) goto L_0x0080
            if (r0 == r6) goto L_0x007f
            if (r0 == r5) goto L_0x007d
            if (r0 == r1) goto L_0x007b
            if (r0 == r7) goto L_0x0079
            if (r0 == r4) goto L_0x0077
            r3 = r1
            goto L_0x0080
        L_0x0077:
            r3 = 6
            goto L_0x0080
        L_0x0079:
            r3 = r5
            goto L_0x0080
        L_0x007b:
            r3 = r4
            goto L_0x0080
        L_0x007d:
            r3 = r7
            goto L_0x0080
        L_0x007f:
            r3 = r6
        L_0x0080:
            if (r3 == r7) goto L_0x00c0
            if (r3 != r1) goto L_0x0085
            goto L_0x00c0
        L_0x0085:
            boolean r0 = r9.zzg()
            if (r0 == 0) goto L_0x009e
            java.lang.String r0 = r9.zzc()
            com.google.android.gms.internal.firebase-auth-api.zzahf r9 = r9.zzb()
            com.google.firebase.auth.MultiFactorInfo r9 = m9.b.l0(r9)
            y6.j.c(r0)
            y6.j.f(r9)
            goto L_0x00c0
        L_0x009e:
            boolean r0 = r9.zzh()
            if (r0 == 0) goto L_0x00b3
            java.lang.String r0 = r9.zzd()
            java.lang.String r9 = r9.zzc()
            y6.j.c(r0)
            y6.j.c(r9)
            goto L_0x00c0
        L_0x00b3:
            boolean r0 = r9.zzf()
            if (r0 == 0) goto L_0x00c0
            java.lang.String r9 = r9.zzc()
            y6.j.c(r9)
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.a.<init>(com.google.android.gms.internal.firebase-auth-api.zzahk):void");
    }
}
