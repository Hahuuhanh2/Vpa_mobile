package p3;

import a3.e;
import al.a0;
import al.b0;
import al.b2;
import al.c1;
import al.d0;
import al.d2;
import al.g0;
import al.i1;
import al.k0;
import al.m0;
import al.o0;
import al.p1;
import al.q0;
import al.r0;
import al.v0;
import al.x1;
import al.y;
import al.y1;
import al.z;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.Matrix;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.savedstate.R$id;
import androidx.work.R$bool;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import c0.p0;
import ca.f;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.zxing.WriterException;
import dc.q;
import ek.f;
import ek.i;
import fl.m;
import fl.r;
import fl.s;
import ik.d;
import ik.e;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import l4.c0;
import n3.c;
import sk.j;
import sk.u;
import tk.c;
import u9.b;
import v.v;
import v3.l;
import vk.h;
import vk.k;
import x2.g;
import x2.n;
import y3.p;

/* compiled from: WorkManagerImplExt.kt */
public class l0 implements q, SuccessContinuation, f, c0, OnFailureListener, c, xa.c {
    public static final int[][] A = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] B = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] C = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};
    public static final int[] D = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* renamed from: a  reason: collision with root package name */
    public static final d[] f13950a = new d[0];

    /* renamed from: b  reason: collision with root package name */
    public static final b f13951b = new b("CLOSED", 1);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ l0 f13952c = new l0();

    /* renamed from: d  reason: collision with root package name */
    public static final int[][] f13953d = {new int[]{121, 120, 127, 126, 133, 132, 139, 138, 145, 144, 151, 150, 157, 156, 163, 162, 169, 168, 175, 174, 181, 180, 187, 186, 193, 192, 199, 198, -2, -2}, new int[]{123, 122, 129, 128, 135, 134, 141, 140, 147, 146, 153, 152, 159, 158, 165, 164, 171, 170, 177, 176, 183, 182, 189, 188, 195, 194, 201, 200, 816, -3}, new int[]{125, 124, 131, 130, 137, 136, 143, 142, 149, 148, 155, 154, 161, 160, 167, 166, 173, 172, 179, 178, 185, 184, 191, 190, 197, 196, 203, 202, 818, 817}, new int[]{283, 282, 277, 276, 271, 270, 265, 264, 259, 258, 253, 252, 247, 246, 241, 240, 235, 234, 229, 228, 223, 222, 217, 216, 211, 210, 205, 204, 819, -3}, new int[]{285, 284, 279, 278, 273, 272, 267, 266, 261, 260, 255, 254, 249, 248, 243, 242, 237, 236, 231, 230, 225, 224, 219, 218, 213, 212, 207, 206, 821, 820}, new int[]{287, 286, 281, 280, 275, 274, 269, 268, 263, 262, 257, 256, 251, 250, 245, 244, 239, 238, 233, 232, 227, 226, 221, 220, 215, 214, 209, 208, 822, -3}, new int[]{289, 288, 295, 294, 301, 300, 307, 306, 313, 312, 319, 318, 325, 324, 331, 330, 337, 336, 343, 342, 349, 348, 355, 354, 361, 360, 367, 366, 824, 823}, new int[]{291, 290, 297, 296, 303, 302, 309, 308, 315, 314, 321, 320, 327, 326, 333, 332, 339, 338, 345, 344, 351, 350, 357, 356, 363, 362, 369, 368, 825, -3}, new int[]{293, 292, 299, 298, 305, 304, 311, 310, 317, 316, 323, 322, 329, 328, 335, 334, 341, 340, 347, 346, 353, 352, 359, 358, 365, 364, 371, 370, 827, 826}, new int[]{409, 408, 403, 402, 397, 396, 391, 390, 79, 78, -2, -2, 13, 12, 37, 36, 2, -1, 44, 43, 109, 108, 385, 384, 379, 378, 373, 372, 828, -3}, new int[]{411, 410, 405, 404, 399, 398, 393, 392, 81, 80, 40, -2, 15, 14, 39, 38, 3, -1, -1, 45, 111, 110, 387, 386, 381, 380, 375, 374, 830, 829}, new int[]{413, 412, 407, 406, 401, 400, 395, 394, 83, 82, 41, -3, -3, -3, -3, -3, 5, 4, 47, 46, 113, 112, 389, 388, 383, 382, 377, 376, 831, -3}, new int[]{415, 414, 421, 420, 427, 426, 103, 102, 55, 54, 16, -3, -3, -3, -3, -3, -3, -3, 20, 19, 85, 84, 433, 432, 439, 438, 445, 444, 833, 832}, new int[]{417, 416, 423, 422, 429, 428, 105, 104, 57, 56, -3, -3, -3, -3, -3, -3, -3, -3, 22, 21, 87, 86, 435, 434, 441, 440, 447, 446, 834, -3}, new int[]{419, 418, 425, 424, 431, 430, 107, 106, 59, 58, -3, -3, -3, -3, -3, -3, -3, -3, -3, 23, 89, 88, 437, 436, 443, 442, 449, 448, 836, 835}, new int[]{481, 480, 475, 474, 469, 468, 48, -2, 30, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 0, 53, 52, 463, 462, 457, 456, 451, 450, 837, -3}, new int[]{483, 482, 477, 476, 471, 470, 49, -1, -2, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -2, -1, 465, 464, 459, 458, 453, 452, 839, 838}, new int[]{485, 484, 479, 478, 473, 472, 51, 50, 31, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 1, -2, 42, 467, 466, 461, 460, 455, 454, 840, -3}, new int[]{487, 486, 493, 492, 499, 498, 97, 96, 61, 60, -3, -3, -3, -3, -3, -3, -3, -3, -3, 26, 91, 90, 505, 504, 511, 510, 517, 516, 842, 841}, new int[]{489, 488, 495, 494, 501, 500, 99, 98, 63, 62, -3, -3, -3, -3, -3, -3, -3, -3, 28, 27, 93, 92, 507, 506, 513, 512, 519, 518, 843, -3}, new int[]{491, 490, 497, 496, 503, 502, 101, 100, 65, 64, 17, -3, -3, -3, -3, -3, -3, -3, 18, 29, 95, 94, 509, 508, 515, 514, 521, 520, 845, 844}, new int[]{559, 558, 553, 552, 547, 546, 541, 540, 73, 72, 32, -3, -3, -3, -3, -3, -3, 10, 67, 66, 115, 114, 535, 534, 529, 528, 523, 522, 846, -3}, new int[]{561, 560, 555, 554, 549, 548, 543, 542, 75, 74, -2, -1, 7, 6, 35, 34, 11, -2, 69, 68, 117, 116, 537, 536, 531, 530, 525, 524, 848, 847}, new int[]{563, 562, 557, 556, 551, 550, 545, 544, 77, 76, -2, 33, 9, 8, 25, 24, -1, -2, 71, 70, 119, 118, 539, 538, 533, 532, 527, 526, 849, -3}, new int[]{565, 564, 571, 570, 577, 576, 583, 582, 589, 588, 595, 594, 601, 600, 607, 606, 613, 612, 619, 618, 625, 624, 631, 630, 637, 636, 643, 642, 851, 850}, new int[]{567, 566, 573, 572, 579, 578, 585, 584, 591, 590, 597, 596, 603, 602, 609, 608, 615, 614, 621, 620, 627, 626, 633, 632, 639, 638, 645, 644, 852, -3}, new int[]{569, 568, 575, 574, 581, 580, 587, 586, 593, 592, 599, 598, 605, 604, 611, 610, 617, 616, 623, 622, 629, 628, 635, 634, 641, 640, 647, 646, 854, 853}, new int[]{727, 726, 721, 720, 715, 714, 709, 708, 703, 702, 697, 696, 691, 690, 685, 684, 679, 678, 673, 672, 667, 666, 661, 660, 655, 654, 649, 648, 855, -3}, new int[]{729, 728, 723, 722, 717, 716, 711, 710, 705, 704, 699, 698, 693, 692, 687, 686, 681, 680, 675, 674, 669, 668, 663, 662, 657, 656, 651, 650, 857, 856}, new int[]{731, 730, 725, 724, 719, 718, 713, 712, 707, 706, 701, 700, 695, 694, 689, 688, 683, 682, 677, 676, 671, 670, 665, 664, 659, 658, 653, 652, 858, -3}, new int[]{733, 732, 739, 738, 745, 744, 751, 750, 757, 756, 763, 762, 769, 768, 775, 774, 781, 780, 787, 786, 793, 792, 799, 798, 805, 804, 811, 810, 860, 859}, new int[]{735, 734, 741, 740, 747, 746, 753, 752, 759, 758, 765, 764, 771, 770, 777, 776, 783, 782, 789, 788, 795, 794, 801, 800, 807, 806, 813, 812, 861, -3}, new int[]{737, 736, 743, 742, 749, 748, 755, 754, 761, 760, 767, 766, 773, 772, 779, 778, 785, 784, 791, 790, 797, 796, 803, 802, 809, 808, 815, 814, 863, 862}};

    /* renamed from: e  reason: collision with root package name */
    public static long f13954e;

    /* renamed from: f  reason: collision with root package name */
    public static final l0 f13955f = new l0();

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ l0 f13956n = new l0();

    /* renamed from: o  reason: collision with root package name */
    public static final float[][] f13957o = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: p  reason: collision with root package name */
    public static final float[][] f13958p = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: q  reason: collision with root package name */
    public static final float[] f13959q = {95.047f, 100.0f, 108.883f};

    /* renamed from: r  reason: collision with root package name */
    public static final float[][] f13960r = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: s  reason: collision with root package name */
    public static final l0 f13961s = new l0();

    /* renamed from: t  reason: collision with root package name */
    public static final l0 f13962t = new l0();

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f13963u = {0, 4, 1, 5};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f13964v = {6, 2, 7, 3};

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f13965w = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f13966x = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: y  reason: collision with root package name */
    public static final l0 f13967y = new l0();

    /* renamed from: z  reason: collision with root package name */
    public static final int[][] f13968z = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    public static final f.a A(Throwable th2) {
        j.f(th2, "exception");
        return new f.a(th2);
    }

    public static long A0(long j10, long j11) {
        long j12 = j10 + j11;
        if ((j10 ^ j12) >= 0 || (j10 ^ j11) < 0) {
            return j12;
        }
        throw new ArithmeticException("Addition overflows a long: " + j10 + " + " + j11);
    }

    public static CameraUnavailableException B(CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int i10 = cameraAccessExceptionCompat.f1276a;
        if (!(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4)) {
        }
        return new CameraUnavailableException(cameraAccessExceptionCompat);
    }

    public static long B0(int i10, long j10) {
        if (i10 != -1) {
            if (i10 == 0) {
                return 0;
            }
            if (i10 == 1) {
                return j10;
            }
            long j11 = (long) i10;
            long j12 = j10 * j11;
            if (j12 / j11 == j10) {
                return j12;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j10 + " * " + i10);
        } else if (j10 != Long.MIN_VALUE) {
            return -j10;
        } else {
            throw new ArithmeticException("Multiplication overflows a long: " + j10 + " * " + i10);
        }
    }

    public static final j0 C(Context context, a aVar) {
        n.a aVar2;
        j.f(context, "context");
        j.f(aVar, "configuration");
        a4.c cVar = new a4.c(aVar.f3742b);
        Context applicationContext = context.getApplicationContext();
        j.e(applicationContext, "context.applicationContext");
        p pVar = cVar.f91a;
        j.e(pVar, "workTaskExecutor.serialTaskExecutor");
        j7.a aVar3 = aVar.f3743c;
        boolean z10 = context.getResources().getBoolean(R$bool.workmanager_test_configuration);
        Class<WorkDatabase> cls = WorkDatabase.class;
        j.f(aVar3, "clock");
        if (z10) {
            aVar2 = new n.a(applicationContext, cls, (String) null);
            aVar2.f16964j = true;
        } else {
            aVar2 = m9.b.q(applicationContext, cls, "androidx.work.workdb");
            aVar2.f16963i = new y(applicationContext);
        }
        aVar2.f16961g = pVar;
        aVar2.f16958d.add(new b(aVar3));
        aVar2.a(i.f13930c);
        aVar2.a(new s(applicationContext, 2, 3));
        aVar2.a(j.f13933c);
        aVar2.a(k.f13947c);
        aVar2.a(new s(applicationContext, 5, 6));
        aVar2.a(l.f13949c);
        aVar2.a(m.f13969c);
        aVar2.a(n.f13972c);
        aVar2.a(new g0(applicationContext));
        aVar2.a(new s(applicationContext, 10, 11));
        aVar2.a(e.f13924c);
        aVar2.a(f.f13925c);
        aVar2.a(g.f13926c);
        aVar2.a(h.f13929c);
        aVar2.f16966l = false;
        aVar2.f16967m = true;
        WorkDatabase workDatabase = (WorkDatabase) aVar2.b();
        Context applicationContext2 = context.getApplicationContext();
        j.e(applicationContext2, "context.applicationContext");
        l lVar = new l(applicationContext2, cVar);
        a aVar4 = aVar;
        a4.c cVar2 = cVar;
        WorkDatabase workDatabase2 = workDatabase;
        r rVar = new r(context.getApplicationContext(), aVar, cVar, workDatabase);
        return new j0(context.getApplicationContext(), aVar4, cVar2, workDatabase2, k0.f13948p.e(context, aVar4, cVar2, workDatabase2, lVar, rVar), rVar, lVar);
    }

    public static long C0(long j10) {
        if (j10 == 1) {
            return 1000;
        }
        if (j10 == 0) {
            return 0;
        }
        long j11 = j10 * 1000;
        if (j11 / 1000 == j10) {
            return j11;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j10 + " * " + 1000);
    }

    public static ArrayList D(cd.b bVar) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        int i12 = bVar.f4690b;
        if (i12 > 0) {
            int i13 = bVar.f4689a;
            uc.j[] jVarArr = new uc.j[8];
            uc.j[] Q = Q(bVar, i12, i13, 0, 0, f13965w);
            int[] iArr = f13963u;
            for (int i14 = 0; i14 < 4; i14++) {
                jVarArr[iArr[i14]] = Q[i14];
            }
            uc.j jVar = jVarArr[4];
            if (jVar != null) {
                i10 = (int) jVar.f15488a;
                i11 = (int) jVar.f15489b;
            }
            uc.j[] Q2 = Q(bVar, i12, i13, i11, i10, f13966x);
            int[] iArr2 = f13964v;
            for (int i15 = 0; i15 < 4; i15++) {
                jVarArr[iArr2[i15]] = Q2[i15];
            }
            if (!(jVarArr[0] == null && jVarArr[3] == null)) {
                arrayList.add(jVarArr);
            }
        }
        return arrayList;
    }

    public static long D0(long j10, long j11) {
        long j12 = j10 - j11;
        if ((j10 ^ j12) >= 0 || (j10 ^ j11) >= 0) {
            return j12;
        }
        throw new ArithmeticException("Subtraction overflows a long: " + j10 + " - " + j11);
    }

    public static int E(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static cd.b E0(cd.b r22, int r23, int r24, cd.g r25) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            if (r1 <= 0) goto L_0x0109
            if (r2 <= 0) goto L_0x0109
            cd.b r4 = new cd.b
            r4.<init>(r1, r2)
            int r1 = r1 * 2
            float[] r5 = new float[r1]
            r7 = 0
        L_0x0016:
            if (r7 >= r2) goto L_0x0108
            float r8 = (float) r7
            r9 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 + r9
            r10 = 0
        L_0x001d:
            if (r10 >= r1) goto L_0x002c
            int r11 = r10 / 2
            float r11 = (float) r11
            float r11 = r11 + r9
            r5[r10] = r11
            int r11 = r10 + 1
            r5[r11] = r8
            int r10 = r10 + 2
            goto L_0x001d
        L_0x002c:
            float r8 = r3.f4712a
            float r9 = r3.f4713b
            float r10 = r3.f4714c
            float r11 = r3.f4715d
            float r12 = r3.f4716e
            float r13 = r3.f4717f
            float r14 = r3.f4718g
            float r15 = r3.f4719h
            float r6 = r3.f4720i
            int r2 = r1 + -1
            r3 = 0
        L_0x0041:
            if (r3 >= r2) goto L_0x006c
            r16 = r5[r3]
            int r17 = r3 + 1
            r18 = r5[r17]
            float r19 = r10 * r16
            float r20 = r13 * r18
            float r20 = r20 + r19
            float r20 = r20 + r6
            float r19 = r8 * r16
            float r21 = r11 * r18
            float r21 = r21 + r19
            float r21 = r21 + r14
            float r21 = r21 / r20
            r5[r3] = r21
            float r16 = r16 * r9
            float r18 = r18 * r12
            float r18 = r18 + r16
            float r18 = r18 + r15
            float r18 = r18 / r20
            r5[r17] = r18
            int r3 = r3 + 2
            goto L_0x0041
        L_0x006c:
            int r3 = r0.f4689a
            int r6 = r0.f4690b
            r8 = 1
            r10 = r8
            r9 = 0
        L_0x0073:
            r11 = 0
            r12 = -1
            if (r9 >= r2) goto L_0x00ab
            if (r10 == 0) goto L_0x00ab
            r10 = r5[r9]
            int r10 = (int) r10
            int r13 = r9 + 1
            r14 = r5[r13]
            int r14 = (int) r14
            if (r10 < r12) goto L_0x00a8
            if (r10 > r3) goto L_0x00a8
            if (r14 < r12) goto L_0x00a8
            if (r14 > r6) goto L_0x00a8
            if (r10 != r12) goto L_0x008e
            r5[r9] = r11
            goto L_0x0095
        L_0x008e:
            if (r10 != r3) goto L_0x0097
            int r10 = r3 + -1
            float r10 = (float) r10
            r5[r9] = r10
        L_0x0095:
            r10 = r8
            goto L_0x0098
        L_0x0097:
            r10 = 0
        L_0x0098:
            if (r14 != r12) goto L_0x009d
            r5[r13] = r11
            goto L_0x00a4
        L_0x009d:
            if (r14 != r6) goto L_0x00a5
            int r10 = r6 + -1
            float r10 = (float) r10
            r5[r13] = r10
        L_0x00a4:
            r10 = r8
        L_0x00a5:
            int r9 = r9 + 2
            goto L_0x0073
        L_0x00a8:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.f7967c
            throw r0
        L_0x00ab:
            int r2 = r1 + -2
            r9 = r8
        L_0x00ae:
            if (r2 < 0) goto L_0x00e4
            if (r9 == 0) goto L_0x00e4
            r9 = r5[r2]
            int r9 = (int) r9
            int r10 = r2 + 1
            r13 = r5[r10]
            int r13 = (int) r13
            if (r9 < r12) goto L_0x00e1
            if (r9 > r3) goto L_0x00e1
            if (r13 < r12) goto L_0x00e1
            if (r13 > r6) goto L_0x00e1
            if (r9 != r12) goto L_0x00c7
            r5[r2] = r11
            goto L_0x00ce
        L_0x00c7:
            if (r9 != r3) goto L_0x00d0
            int r9 = r3 + -1
            float r9 = (float) r9
            r5[r2] = r9
        L_0x00ce:
            r9 = r8
            goto L_0x00d1
        L_0x00d0:
            r9 = 0
        L_0x00d1:
            if (r13 != r12) goto L_0x00d6
            r5[r10] = r11
            goto L_0x00dd
        L_0x00d6:
            if (r13 != r6) goto L_0x00de
            int r9 = r6 + -1
            float r9 = (float) r9
            r5[r10] = r9
        L_0x00dd:
            r9 = r8
        L_0x00de:
            int r2 = r2 + -2
            goto L_0x00ae
        L_0x00e1:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.f7967c
            throw r0
        L_0x00e4:
            r2 = 0
        L_0x00e5:
            if (r2 >= r1) goto L_0x0100
            r3 = r5[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00fd }
            int r3 = (int) r3     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00fd }
            int r6 = r2 + 1
            r6 = r5[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00fd }
            int r6 = (int) r6     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00fd }
            boolean r3 = r0.b(r3, r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00fd }
            if (r3 == 0) goto L_0x00fa
            int r3 = r2 / 2
            r4.g(r3, r7)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00fd }
        L_0x00fa:
            int r2 = r2 + 2
            goto L_0x00e5
        L_0x00fd:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.f7967c
            throw r0
        L_0x0100:
            int r7 = r7 + 1
            r2 = r24
            r3 = r25
            goto L_0x0016
        L_0x0108:
            return r4
        L_0x0109:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.f7967c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.l0.E0(cd.b, int, int, cd.g):cd.b");
    }

    public static void F(cd.b bVar, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 2) {
            int i13 = i10 - i12;
            int i14 = i13;
            while (true) {
                int i15 = i10 + i12;
                if (i14 > i15) {
                    break;
                }
                bVar.g(i14, i13);
                bVar.g(i14, i15);
                bVar.g(i13, i14);
                bVar.g(i15, i14);
                i14++;
            }
        }
        int i16 = i10 - i11;
        bVar.g(i16, i16);
        int i17 = i16 + 1;
        bVar.g(i17, i16);
        bVar.g(i16, i17);
        int i18 = i10 + i11;
        bVar.g(i18, i16);
        bVar.g(i18, i17);
        bVar.g(i18, i18 - 1);
    }

    public static final void F0(View view, e eVar) {
        j.f(view, "<this>");
        view.setTag(R$id.view_tree_saved_state_registry_owner, eVar);
    }

    public static final long G(long j10) {
        long j11 = (j10 << 1) + 1;
        int i10 = zk.a.f23785d;
        int i11 = zk.b.f23787a;
        return j11;
    }

    public static void G0(Context context, int i10, int i11) {
        WeakReference weakReference = new WeakReference(context);
        if (i10 >= 0) {
            f((Context) weakReference.get(), j7.a.H(i10));
        } else if (i11 >= 0) {
            f((Context) weakReference.get(), j7.a.H(i11));
        } else {
            Context context2 = (Context) weakReference.get();
            Resources resources = context2.getResources();
            Configuration configuration = resources.getConfiguration();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration.setLocale(Locale.getDefault());
            context2.createConfigurationContext(configuration);
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    public static void H(int i10, int i11, wd.b bVar) {
        int i12 = 0;
        while (i12 < 8) {
            int i13 = i10 + i12;
            if (g0(bVar.a(i13, i11))) {
                bVar.b(i13, i11, 0);
                i12++;
            } else {
                throw new WriterException();
            }
        }
    }

    public static void H0(g1.a aVar, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        StringBuilder q10 = android.support.v4.media.a.q("set");
        q10.append(aVar.f10265b);
        String sb2 = q10.toString();
        try {
            boolean z10 = true;
            switch (v.g(aVar.f10266c)) {
                case 0:
                    cls.getMethod(sb2, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf((int) fArr[0])});
                    return;
                case 1:
                    cls.getMethod(sb2, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(fArr[0])});
                    return;
                case 2:
                    cls.getMethod(sb2, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf((t((int) (fArr[3] * 255.0f)) << 24) | (t((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (t((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | t((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f)))});
                    return;
                case 3:
                    Method method = cls.getMethod(sb2, new Class[]{Drawable.class});
                    int t10 = t((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f));
                    int t11 = t((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f));
                    int t12 = t((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor((t((int) (fArr[3] * 255.0f)) << 24) | (t10 << 16) | (t11 << 8) | t12);
                    method.invoke(view, new Object[]{colorDrawable});
                    return;
                case 4:
                    throw new RuntimeException("unable to interpolate strings " + aVar.f10265b);
                case 5:
                    Method method2 = cls.getMethod(sb2, new Class[]{Boolean.TYPE});
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z10 = false;
                    }
                    objArr[0] = Boolean.valueOf(z10);
                    method2.invoke(view, objArr);
                    return;
                case 6:
                    cls.getMethod(sb2, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(fArr[0])});
                    return;
                default:
                    return;
            }
        } catch (NoSuchMethodException e10) {
            f1.a.d(view);
            e10.printStackTrace();
        } catch (IllegalAccessException e11) {
            f1.a.d(view);
            e11.printStackTrace();
        } catch (InvocationTargetException e12) {
            e12.printStackTrace();
        }
    }

    public static void I(int i10, int i11, wd.b bVar) {
        for (int i12 = 0; i12 < 7; i12++) {
            int[] iArr = f13968z[i12];
            for (int i13 = 0; i13 < 7; i13++) {
                bVar.b(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    public static void I0(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.P0()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(V(status));
        }
    }

    public static void J(int i10, int i11, wd.b bVar) {
        int i12 = 0;
        while (i12 < 7) {
            int i13 = i11 + i12;
            if (g0(bVar.a(i10, i13))) {
                bVar.b(i10, i13, 0);
                i12++;
            } else {
                throw new WriterException();
            }
        }
    }

    public static final Object J0(r rVar, r rVar2, rk.p pVar) {
        Object obj;
        Object V;
        try {
            u.a(2, pVar);
            obj = pVar.invoke(rVar2, rVar);
        } catch (Throwable th2) {
            obj = new al.u(th2, false);
        }
        jk.a aVar = jk.a.COROUTINE_SUSPENDED;
        if (obj == aVar || (V = rVar.V(obj)) == m9.b.f13198c) {
            return aVar;
        }
        if (!(V instanceof al.u)) {
            return m9.b.d0(V);
        }
        throw ((al.u) V).f19094a;
    }

    public static final lk.b K(Enum[] enumArr) {
        j.f(enumArr, "entries");
        return new lk.b(enumArr);
    }

    public static final vk.f K0(h hVar, int i10) {
        boolean z10;
        j.f(hVar, "<this>");
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Integer valueOf = Integer.valueOf(i10);
        j.f(valueOf, "step");
        if (z10) {
            int i11 = hVar.f23335a;
            int i12 = hVar.f23336b;
            if (hVar.f23337c <= 0) {
                i10 = -i10;
            }
            return new vk.f(i11, i12, i10);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static final boolean L(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static cd.a L0(int i10, cd.a aVar) {
        cd.a aVar2 = new cd.a();
        int i11 = aVar.f4688b;
        int i12 = (1 << i10) - 2;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = 0;
            for (int i15 = 0; i15 < i10; i15++) {
                int i16 = i13 + i15;
                if (i16 >= i11 || aVar.e(i16)) {
                    i14 |= 1 << ((i10 - 1) - i15);
                }
            }
            int i17 = i14 & i12;
            if (i17 == i12) {
                aVar2.b(i17, i10);
            } else if (i17 == 0) {
                aVar2.b(i14 | 1, i10);
            } else {
                aVar2.b(i14, i10);
                i13 += i10;
            }
            i13--;
            i13 += i10;
        }
        return aVar2;
    }

    public static boolean M(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        } else if (obj2 == null) {
            return false;
        } else {
            return obj.equals(obj2);
        }
    }

    public static int M0(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 90;
        }
        if (i10 == 2) {
            return 180;
        }
        if (i10 == 3) {
            return 270;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.m("Unsupported surface rotation: ", i10));
    }

    public static boolean N(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null || str.length() != str2.length()) {
            return false;
        }
        return str.equals(str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x007f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long N0(java.lang.String r21, long r22, long r24, long r26) {
        /*
            r0 = r21
            r1 = r24
            r3 = r26
            int r5 = fl.u.f20263a
            java.lang.String r6 = java.lang.System.getProperty(r21)     // Catch:{ SecurityException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r6 = 0
        L_0x000e:
            if (r6 != 0) goto L_0x0014
            r5 = r22
            goto L_0x00a6
        L_0x0014:
            r7 = 10
            n(r7)
            int r8 = r6.length()
            r9 = 0
            r10 = 1
            if (r8 != 0) goto L_0x0022
            goto L_0x0077
        L_0x0022:
            char r11 = r6.charAt(r9)
            r12 = 48
            int r12 = sk.j.h(r11, r12)
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r12 >= 0) goto L_0x0045
            if (r8 != r10) goto L_0x0036
            goto L_0x0077
        L_0x0036:
            r12 = 45
            if (r11 != r12) goto L_0x003e
            r13 = -9223372036854775808
            r11 = r10
            goto L_0x0046
        L_0x003e:
            r12 = 43
            if (r11 != r12) goto L_0x0077
            r12 = r9
            r11 = r10
            goto L_0x0047
        L_0x0045:
            r11 = r9
        L_0x0046:
            r12 = r11
        L_0x0047:
            r15 = 0
            r17 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r9 = r15
            r15 = r17
        L_0x0051:
            if (r11 >= r8) goto L_0x007f
            char r5 = r6.charAt(r11)
            int r5 = java.lang.Character.digit(r5, r7)
            if (r5 >= 0) goto L_0x005e
            goto L_0x0077
        L_0x005e:
            int r19 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r19 >= 0) goto L_0x006e
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 != 0) goto L_0x0077
            long r3 = (long) r7
            long r15 = r13 / r3
            int r3 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r3 >= 0) goto L_0x006e
            goto L_0x0077
        L_0x006e:
            long r3 = (long) r7
            long r9 = r9 * r3
            long r3 = (long) r5
            long r19 = r13 + r3
            int r5 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r5 >= 0) goto L_0x0079
        L_0x0077:
            r5 = 0
            goto L_0x008b
        L_0x0079:
            long r9 = r9 - r3
            int r11 = r11 + 1
            r3 = r26
            goto L_0x0051
        L_0x007f:
            if (r12 == 0) goto L_0x0086
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            goto L_0x008b
        L_0x0086:
            long r3 = -r9
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
        L_0x008b:
            r3 = 39
            java.lang.String r4 = "System property '"
            if (r5 == 0) goto L_0x00db
            long r5 = r5.longValue()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x00a1
            r7 = r26
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x00a3
            r9 = 1
            goto L_0x00a4
        L_0x00a1:
            r7 = r26
        L_0x00a3:
            r9 = 0
        L_0x00a4:
            if (r9 == 0) goto L_0x00a7
        L_0x00a6:
            return r5
        L_0x00a7:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r4)
            r10.append(r0)
            java.lang.String r0 = "' should be in range "
            r10.append(r0)
            r10.append(r1)
            java.lang.String r0 = ".."
            r10.append(r0)
            r10.append(r7)
            java.lang.String r0 = ", but is '"
            r10.append(r0)
            r10.append(r5)
            r10.append(r3)
            java.lang.String r0 = r10.toString()
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x00db:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = "' has unrecognized value '"
            r2.append(r0)
            r2.append(r6)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.l0.N0(java.lang.String, long, long, long):long");
    }

    public static int O(float f10, int i10, int i11) {
        if (i10 == i11) {
            return i10;
        }
        float f11 = ((float) ((i10 >> 24) & 255)) / 255.0f;
        float d10 = d(((float) ((i10 >> 16) & 255)) / 255.0f);
        float d11 = d(((float) ((i10 >> 8) & 255)) / 255.0f);
        float d12 = d(((float) (i10 & 255)) / 255.0f);
        float d13 = d(((float) ((i11 >> 16) & 255)) / 255.0f);
        float d14 = d(((float) ((i11 >> 8) & 255)) / 255.0f);
        float d15 = d(((float) (i11 & 255)) / 255.0f);
        float e10 = android.support.v4.media.a.e(((float) ((i11 >> 24) & 255)) / 255.0f, f11, f10, f11);
        float e11 = android.support.v4.media.a.e(d13, d10, f10, d10);
        float e12 = android.support.v4.media.a.e(d14, d11, f10, d11);
        float e13 = android.support.v4.media.a.e(d15, d12, f10, d12);
        int round = Math.round(e(e11) * 255.0f) << 16;
        return Math.round(e(e13) * 255.0f) | round | (Math.round(e10 * 255.0f) << 24) | (Math.round(e(e12) * 255.0f) << 8);
    }

    public static int O0(String str, int i10, int i11, int i12, int i13) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return (int) N0(str, (long) i10, (long) i11, (long) i12);
    }

    public static int[] P(cd.b bVar, int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i13 = 0;
        while (bVar.b(i10, i11) && i10 > 0) {
            int i14 = i13 + 1;
            if (i13 >= 3) {
                break;
            }
            i10--;
            i13 = i14;
        }
        int length = iArr.length;
        int i15 = i10;
        int i16 = 0;
        boolean z10 = false;
        while (i10 < i12) {
            if (bVar.b(i10, i11) != z10) {
                iArr2[i16] = iArr2[i16] + 1;
            } else {
                if (i16 != length - 1) {
                    i16++;
                } else if (p0(iArr2, iArr) < 0.42f) {
                    return new int[]{i15, i10};
                } else {
                    i15 += iArr2[0] + iArr2[1];
                    int i17 = i16 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i17);
                    iArr2[i17] = 0;
                    iArr2[i16] = 0;
                    i16 = i17;
                }
                iArr2[i16] = 1;
                z10 = !z10;
            }
            i10++;
        }
        if (i16 != length - 1 || p0(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i15, i10 - 1};
    }

    public static void P0(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        } else if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        } else if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    public static uc.j[] Q(cd.b bVar, int i10, int i11, int i12, int i13, int[] iArr) {
        boolean z10;
        int i14;
        int i15;
        int i16 = i10;
        uc.j[] jVarArr = new uc.j[4];
        int[] iArr2 = new int[iArr.length];
        int i17 = i12;
        while (true) {
            if (i17 >= i16) {
                z10 = false;
                break;
            }
            int[] P = P(bVar, i13, i17, i11, iArr, iArr2);
            if (P != null) {
                int i18 = i17;
                int[] iArr3 = P;
                int i19 = i18;
                while (true) {
                    if (i19 <= 0) {
                        i15 = i19;
                        break;
                    }
                    int i20 = i19 - 1;
                    int[] P2 = P(bVar, i13, i20, i11, iArr, iArr2);
                    if (P2 == null) {
                        i15 = i20 + 1;
                        break;
                    }
                    iArr3 = P2;
                    i19 = i20;
                }
                float f10 = (float) i15;
                jVarArr[0] = new uc.j((float) iArr3[0], f10);
                jVarArr[1] = new uc.j((float) iArr3[1], f10);
                z10 = true;
                i17 = i15;
            } else {
                i17 += 5;
            }
        }
        int i21 = i17 + 1;
        if (z10) {
            int[] iArr4 = {(int) jVarArr[0].f15488a, (int) jVarArr[1].f15488a};
            int i22 = i21;
            int i23 = 0;
            while (true) {
                if (i22 >= i16) {
                    i14 = i23;
                    break;
                }
                i14 = i23;
                int[] P3 = P(bVar, iArr4[0], i22, i11, iArr, iArr2);
                if (P3 == null || Math.abs(iArr4[0] - P3[0]) >= 5 || Math.abs(iArr4[1] - P3[1]) >= 5) {
                    if (i14 > 25) {
                        break;
                    }
                    i23 = i14 + 1;
                } else {
                    iArr4 = P3;
                    i23 = 0;
                }
                i22++;
            }
            i21 = i22 - (i14 + 1);
            float f11 = (float) i21;
            jVarArr[2] = new uc.j((float) iArr4[0], f11);
            jVarArr[3] = new uc.j((float) iArr4[1], f11);
        }
        if (i21 - i17 < 10) {
            Arrays.fill(jVarArr, (Object) null);
        }
        return jVarArr;
    }

    public static final void Q0(Object obj) {
        if (obj instanceof f.a) {
            throw ((f.a) obj).f20105a;
        }
    }

    public static final Object R(s sVar, long j10, rk.p pVar) {
        boolean z10;
        while (true) {
            if (sVar.f20261c >= j10 && !sVar.c()) {
                return sVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fl.c.f20223a;
            Object obj = atomicReferenceFieldUpdater.get(sVar);
            b bVar = f13951b;
            if (obj == bVar) {
                return bVar;
            }
            s sVar2 = (s) ((fl.c) obj);
            if (sVar2 == null) {
                sVar2 = (s) pVar.invoke(Long.valueOf(sVar.f20261c + 1), sVar);
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(sVar, (Object) null, sVar2)) {
                        if (atomicReferenceFieldUpdater.get(sVar) != null) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    if (sVar.c()) {
                        sVar.d();
                    }
                }
            }
            sVar = sVar2;
        }
    }

    public static final long R0(int i10, zk.c cVar) {
        j.f(cVar, "unit");
        if (cVar.compareTo(zk.c.SECONDS) > 0) {
            return S0((long) i10, cVar);
        }
        long I = g0.I((long) i10, cVar, zk.c.NANOSECONDS) << 1;
        int i11 = zk.a.f23785d;
        int i12 = zk.b.f23787a;
        return I;
    }

    public static int S(float f10) {
        return ((int) (((double) f10) + 16384.0d)) - 16384;
    }

    public static final long S0(long j10, zk.c cVar) {
        j.f(cVar, "unit");
        zk.c cVar2 = zk.c.NANOSECONDS;
        long I = g0.I(4611686018426999999L, cVar2, cVar);
        if (new k(-I, I).m(j10)) {
            long I2 = g0.I(j10, cVar, cVar2) << 1;
            int i10 = zk.a.f23785d;
            int i11 = zk.b.f23787a;
            return I2;
        }
        zk.c cVar3 = zk.c.MILLISECONDS;
        j.f(cVar3, "targetUnit");
        return G(w(cVar3.f23795a.convert(j10, cVar.f23795a)));
    }

    public static long T(long j10, long j11) {
        if (j10 >= 0) {
            return j10 / j11;
        }
        return ((j10 + 1) / j11) - 1;
    }

    public static void T0(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.P0()) {
            taskCompletionSource.trySetResult(obj);
        } else {
            taskCompletionSource.trySetException(V(status));
        }
    }

    public static final c1 U(Executor executor) {
        if (executor instanceof q0) {
            q0 q0Var = (q0) executor;
        }
        return new c1(executor);
    }

    public static final h U0(int i10, int i11) {
        if (i11 > Integer.MIN_VALUE) {
            return new h(i10, i11 - 1);
        }
        h hVar = h.f23342d;
        return h.f23342d;
    }

    public static ApiException V(Status status) {
        boolean z10;
        if (status.f5347c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }

    /* JADX INFO: finally extract failed */
    public static final Object V0(d dVar, ik.f fVar, rk.p pVar) {
        ik.f fVar2;
        Object obj;
        ik.f context = dVar.getContext();
        boolean z10 = false;
        if (!((Boolean) fVar.fold(Boolean.FALSE, z.f19118a)).booleanValue()) {
            fVar2 = context.plus(fVar);
        } else {
            fVar2 = y.a(context, fVar, false);
        }
        g0.O(fVar2);
        if (fVar2 == context) {
            r rVar = new r(dVar, fVar2);
            obj = J0(rVar, rVar, pVar);
        } else {
            e.a aVar = e.a.f20651a;
            if (j.a(fVar2.get(aVar), context.get(aVar))) {
                d2 d2Var = new d2(dVar, fVar2);
                ik.f fVar3 = d2Var.f18986c;
                Object b10 = fl.v.b(fVar3, (Object) null);
                try {
                    Object J0 = J0(d2Var, d2Var, pVar);
                    fl.v.a(fVar3, b10);
                    obj = J0;
                } catch (Throwable th2) {
                    fl.v.a(fVar3, b10);
                    throw th2;
                }
            } else {
                o0 o0Var = new o0(dVar, fVar2);
                try {
                    g0.g0(g0.b0(g0.K(o0Var, o0Var, pVar)), i.f20112a, (rk.l) null);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = o0.f19079e;
                    while (true) {
                        int i10 = atomicIntegerFieldUpdater.get(o0Var);
                        if (i10 == 0) {
                            if (o0.f19079e.compareAndSet(o0Var, 0, 1)) {
                                z10 = true;
                                break;
                            }
                        } else if (i10 != 2) {
                            throw new IllegalStateException("Already suspended".toString());
                        }
                    }
                    if (z10) {
                        obj = jk.a.COROUTINE_SUSPENDED;
                    } else {
                        obj = m9.b.d0(o0Var.M());
                        if (obj instanceof al.u) {
                            throw ((al.u) obj).f19094a;
                        }
                    }
                } catch (Throwable th3) {
                    o0Var.resumeWith(A(th3));
                    throw th3;
                }
            }
        }
        jk.a aVar2 = jk.a.COROUTINE_SUSPENDED;
        return obj;
    }

    public static cd.a W(int i10, int i11, cd.a aVar) {
        ed.a aVar2;
        int i12;
        int i13 = aVar.f4688b / i11;
        if (i11 == 4) {
            aVar2 = ed.a.f9342k;
        } else if (i11 == 6) {
            aVar2 = ed.a.f9341j;
        } else if (i11 == 8) {
            aVar2 = ed.a.f9345n;
        } else if (i11 == 10) {
            aVar2 = ed.a.f9340i;
        } else if (i11 == 12) {
            aVar2 = ed.a.f9339h;
        } else {
            throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i11)));
        }
        g gVar = new g(aVar2);
        int i14 = i10 / i11;
        int[] iArr = new int[i14];
        int i15 = aVar.f4688b / i11;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                if (aVar.e((i16 * i11) + i18)) {
                    i12 = 1 << ((i11 - i18) - 1);
                } else {
                    i12 = 0;
                }
                i17 |= i12;
            }
            iArr[i16] = i17;
        }
        gVar.b(iArr, i14 - i13);
        cd.a aVar3 = new cd.a();
        aVar3.b(0, i10 % i11);
        for (int i19 = 0; i19 < i14; i19++) {
            aVar3.b(iArr[i19], i11);
        }
        return aVar3;
    }

    public static final Object W0(long j10, rk.p pVar, d dVar) {
        Object obj;
        Object V;
        if (j10 > 0) {
            b2 b2Var = new b2(j10, dVar);
            b2Var.invokeOnCompletion(new v0(m0.b(b2Var.f20259d.getContext()).d(b2Var.f18993e, b2Var, b2Var.f18986c)));
            boolean z10 = false;
            try {
                u.a(2, pVar);
                obj = pVar.invoke(b2Var, b2Var);
            } catch (Throwable th2) {
                obj = new al.u(th2, false);
            }
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            if (obj == aVar || (V = b2Var.V(obj)) == m9.b.f13198c) {
                return aVar;
            }
            if (V instanceof al.u) {
                Throwable th3 = ((al.u) V).f19094a;
                if (!(th3 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th3).f20847a != b2Var) {
                    z10 = true;
                }
                if (z10) {
                    throw th3;
                } else if (obj instanceof al.u) {
                    throw ((al.u) obj).f19094a;
                }
            } else {
                obj = m9.b.d0(V);
            }
            return obj;
        }
        throw new TimeoutCancellationException("Timed out immediately", (i1) null);
    }

    public static Object X(Class cls, Object obj) {
        if (obj instanceof hj.a) {
            return cls.cast(obj);
        }
        if (obj instanceof hj.b) {
            return X(cls, ((hj.b) obj).d());
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", new Object[]{obj.getClass(), hj.a.class, hj.b.class}));
    }

    public static void X0(Parcel parcel, int i10, boolean z10) {
        parcel.writeInt(i10 | 262144);
        parcel.writeInt(z10 ? 1 : 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0126 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static z.d Y(w.t r8) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r1 = r8.a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x001a
            int r1 = r1.intValue()
            if (r1 != r2) goto L_0x001a
            r1 = r3
            goto L_0x001b
        L_0x001a:
            r1 = r4
        L_0x001b:
            if (r1 == 0) goto L_0x0025
            y.a r1 = new y.a
            r1.<init>(r8)
            r0.add(r1)
        L_0x0025:
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r1 = r8.a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x0032
            r1.intValue()
        L_0x0032:
            java.util.HashSet r1 = y.x.f17355a
            java.lang.String r5 = android.os.Build.DEVICE
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r6)
            boolean r1 = r1.contains(r5)
            if (r1 == 0) goto L_0x004a
            y.x r1 = new y.x
            r1.<init>()
            r0.add(r1)
        L_0x004a:
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r1 = r8.a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x005c
            int r1 = r1.intValue()
            if (r1 != r2) goto L_0x005c
            r1 = r3
            goto L_0x005d
        L_0x005c:
            r1 = r4
        L_0x005d:
            if (r1 == 0) goto L_0x0067
            y.e r1 = new y.e
            r1.<init>(r8)
            r0.add(r1)
        L_0x0067:
            java.util.List<java.lang.String> r1 = y.u.f17352a
            java.lang.String r5 = android.os.Build.MODEL
            java.lang.String r7 = r5.toUpperCase(r6)
            boolean r1 = r1.contains(r7)
            if (r1 == 0) goto L_0x0085
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r1 = r8.a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r3) goto L_0x0085
            r1 = r3
            goto L_0x0086
        L_0x0085:
            r1 = r4
        L_0x0086:
            if (r1 == 0) goto L_0x0090
            y.u r1 = new y.u
            r1.<init>()
            r0.add(r1)
        L_0x0090:
            java.util.List<java.lang.String> r1 = y.f.f17336a
            java.lang.String r6 = r5.toUpperCase(r6)
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L_0x00ac
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r1 = r8.a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r3) goto L_0x00ac
            r1 = r3
            goto L_0x00ad
        L_0x00ac:
            r1 = r4
        L_0x00ad:
            if (r1 == 0) goto L_0x00b7
            y.f r1 = new y.f
            r1.<init>()
            r0.add(r1)
        L_0x00b7:
            java.lang.String r1 = android.os.Build.BRAND
            java.lang.String r6 = "motorola"
            boolean r6 = r6.equalsIgnoreCase(r1)
            if (r6 == 0) goto L_0x00cb
            java.lang.String r6 = "MotoG3"
            boolean r6 = r6.equalsIgnoreCase(r5)
            if (r6 == 0) goto L_0x00cb
            r6 = r3
            goto L_0x00cc
        L_0x00cb:
            r6 = r4
        L_0x00cc:
            if (r6 != 0) goto L_0x00f9
            java.lang.String r6 = "samsung"
            boolean r7 = r6.equalsIgnoreCase(r1)
            if (r7 == 0) goto L_0x00e0
            java.lang.String r7 = "SM-G532F"
            boolean r7 = r7.equalsIgnoreCase(r5)
            if (r7 == 0) goto L_0x00e0
            r7 = r3
            goto L_0x00e1
        L_0x00e0:
            r7 = r4
        L_0x00e1:
            if (r7 != 0) goto L_0x00f9
            boolean r1 = r6.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00f3
            java.lang.String r1 = "SM-J700F"
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 == 0) goto L_0x00f3
            r1 = r3
            goto L_0x00f4
        L_0x00f3:
            r1 = r4
        L_0x00f4:
            if (r1 == 0) goto L_0x00f7
            goto L_0x00f9
        L_0x00f7:
            r1 = r4
            goto L_0x00fa
        L_0x00f9:
            r1 = r3
        L_0x00fa:
            if (r1 == 0) goto L_0x0104
            y.h0 r1 = new y.h0
            r1.<init>()
            r0.add(r1)
        L_0x0104:
            java.util.List<java.lang.String> r1 = y.q.f17347a
            java.util.Iterator r1 = r1.iterator()
        L_0x010a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0126
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = android.os.Build.MODEL
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r6 = r6.toUpperCase(r7)
            boolean r5 = r6.startsWith(r5)
            if (r5 == 0) goto L_0x010a
            r1 = r3
            goto L_0x0127
        L_0x0126:
            r1 = r4
        L_0x0127:
            if (r1 == 0) goto L_0x0139
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r1 = r8.a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r3) goto L_0x0139
            r1 = r3
            goto L_0x013a
        L_0x0139:
            r1 = r4
        L_0x013a:
            if (r1 == 0) goto L_0x0144
            y.q r1 = new y.q
            r1.<init>()
            r0.add(r1)
        L_0x0144:
            java.lang.String r1 = android.os.Build.BRAND
            java.lang.String r5 = "SAMSUNG"
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 == 0) goto L_0x0164
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r1 >= r5) goto L_0x0164
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r1 = r8.a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != 0) goto L_0x0164
            r1 = r3
            goto L_0x0165
        L_0x0164:
            r1 = r4
        L_0x0165:
            if (r1 == 0) goto L_0x016f
            y.b r1 = new y.b
            r1.<init>()
            r0.add(r1)
        L_0x016f:
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r1 = r8.a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x0181
            int r1 = r1.intValue()
            if (r1 != r2) goto L_0x0181
            r1 = r3
            goto L_0x0182
        L_0x0181:
            r1 = r4
        L_0x0182:
            if (r1 == 0) goto L_0x018c
            y.i r1 = new y.i
            r1.<init>()
            r0.add(r1)
        L_0x018c:
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r1 = r8.a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x019e
            int r1 = r1.intValue()
            if (r1 != r2) goto L_0x019e
            r1 = r3
            goto L_0x019f
        L_0x019e:
            r1 = r4
        L_0x019f:
            if (r1 == 0) goto L_0x01a9
            y.z r1 = new y.z
            r1.<init>()
            r0.add(r1)
        L_0x01a9:
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r1 = r8.a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x01bb
            int r1 = r1.intValue()
            if (r1 != r2) goto L_0x01bb
            r1 = r3
            goto L_0x01bc
        L_0x01bb:
            r1 = r4
        L_0x01bc:
            if (r1 == 0) goto L_0x01c6
            y.h r1 = new y.h
            r1.<init>()
            r0.add(r1)
        L_0x01c6:
            java.util.List<java.lang.String> r1 = y.s.f17350b
            java.lang.String r2 = android.os.Build.MODEL
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r6 = r2.toLowerCase(r5)
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L_0x01e6
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r1 = r8.a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != 0) goto L_0x01e6
            r1 = r3
            goto L_0x01e7
        L_0x01e6:
            r1 = r4
        L_0x01e7:
            java.util.List<java.lang.String> r6 = y.s.f17349a
            java.lang.String r7 = r2.toLowerCase(r5)
            boolean r6 = r6.contains(r7)
            if (r1 != 0) goto L_0x01f8
            if (r6 == 0) goto L_0x01f6
            goto L_0x01f8
        L_0x01f6:
            r1 = r4
            goto L_0x01f9
        L_0x01f8:
            r1 = r3
        L_0x01f9:
            if (r1 == 0) goto L_0x0203
            y.s r1 = new y.s
            r1.<init>()
            r0.add(r1)
        L_0x0203:
            java.util.List<java.lang.String> r1 = y.v.f17353a
            java.lang.String r6 = r2.toLowerCase(r5)
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L_0x021f
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r1 = r8.a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r3) goto L_0x021f
            r1 = r3
            goto L_0x0220
        L_0x021f:
            r1 = r4
        L_0x0220:
            if (r1 == 0) goto L_0x022a
            y.v r1 = new y.v
            r1.<init>()
            r0.add(r1)
        L_0x022a:
            java.util.List<java.lang.String> r1 = y.r.f17348a
            java.lang.String r2 = r2.toLowerCase(r5)
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x0245
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r8 = r8.a(r1)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 != 0) goto L_0x0245
            goto L_0x0246
        L_0x0245:
            r3 = r4
        L_0x0246:
            if (r3 == 0) goto L_0x0250
            y.r r8 = new y.r
            r8.<init>()
            r0.add(r8)
        L_0x0250:
            z.d r8 = new z.d
            r8.<init>((java.util.ArrayList) r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.l0.Y(w.t):z.d");
    }

    public static void Y0(Parcel parcel, int i10, Bundle bundle) {
        if (bundle != null) {
            int n12 = n1(i10, parcel);
            parcel.writeBundle(bundle);
            o1(n12, parcel);
        }
    }

    public static ColorFilter Z(Context context, int i10) {
        int color = k1.a.getColor(context, i10);
        n1.b bVar = n1.b.SRC_ATOP;
        if (Build.VERSION.SDK_INT >= 29) {
            Object a10 = n1.c.a(bVar);
            if (a10 != null) {
                return n1.a.a(color, a10);
            }
            return null;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        if (mode != null) {
            return new PorterDuffColorFilter(color, mode);
        }
        return null;
    }

    public static void Z0(Parcel parcel, int i10, byte[] bArr) {
        if (bArr != null) {
            int n12 = n1(i10, parcel);
            parcel.writeByteArray(bArr);
            o1(n12, parcel);
        }
    }

    public static int a0(yf.a aVar, int i10) {
        int i11;
        int i12;
        vf.f fVar = vf.f.DROP;
        if (aVar == null) {
            return 0;
        }
        yf.b b10 = aVar.b();
        yf.b bVar = yf.b.HORIZONTAL;
        if (b10 == bVar) {
            if (aVar.b() == bVar) {
                i12 = b0(aVar, i10);
            } else {
                i12 = aVar.f23507c;
                if (aVar.a() == fVar) {
                    i12 *= 3;
                }
            }
            return i12 + aVar.f23509e;
        }
        if (aVar.b() == bVar) {
            i11 = aVar.f23507c;
            if (aVar.a() == fVar) {
                i11 *= 3;
            }
        } else {
            i11 = b0(aVar, i10);
        }
        return i11 + aVar.f23510f;
    }

    public static void a1(Parcel parcel, int i10, IBinder iBinder) {
        if (iBinder != null) {
            int n12 = n1(i10, parcel);
            parcel.writeStrongBinder(iBinder);
            o1(n12, parcel);
        }
    }

    public static int b0(yf.a aVar, int i10) {
        int i11 = aVar.f23521q;
        int i12 = aVar.f23507c;
        int i13 = aVar.f23513i;
        int i14 = aVar.f23508d;
        int i15 = 0;
        for (int i16 = 0; i16 < i11; i16++) {
            int i17 = i13 / 2;
            int i18 = i12 + i17 + i15;
            if (i10 == i16) {
                return i18;
            }
            i15 = i12 + i14 + i17 + i18;
        }
        if (aVar.a() == vf.f.DROP) {
            return i15 + (i12 * 2);
        }
        return i15;
    }

    public static void b1(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | 262144);
        parcel.writeInt(i11);
    }

    public static al.s c() {
        return new al.s((i1) null);
    }

    public static int c0(boolean z10, int i10, int i11) {
        int i12;
        if (z10) {
            i12 = ((i11 - i10) + 360) % 360;
        } else {
            i12 = (i11 + i10) % 360;
        }
        if (p0.d("CameraOrientationUtil")) {
            String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10), Integer.valueOf(i12)});
            p0.a("CameraOrientationUtil");
        }
        return i12;
    }

    public static void c1(Parcel parcel, int i10, long j10) {
        parcel.writeInt(i10 | 524288);
        parcel.writeLong(j10);
    }

    public static float d(float f10) {
        if (f10 <= 0.04045f) {
            return f10 / 12.92f;
        }
        return (float) Math.pow((double) ((f10 + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    public static final d0 d0(r2.v vVar) {
        Object obj;
        HashMap hashMap = vVar.f14497a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = vVar.f14497a.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
            }
        }
        d0 d0Var = (d0) obj;
        if (d0Var != null) {
            return d0Var;
        }
        y1 y1Var = new y1((i1) null);
        gl.c cVar = r0.f19084a;
        return (d0) vVar.c(new r2.b(y1Var.plus((ik.f) m.f20254a.a0())), "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
    }

    public static void d1(Parcel parcel, int i10, Long l10) {
        if (l10 != null) {
            parcel.writeInt(i10 | 524288);
            parcel.writeLong(l10.longValue());
        }
    }

    public static float e(float f10) {
        if (f10 <= 0.0031308f) {
            return f10 * 12.92f;
        }
        return (float) ((Math.pow((double) f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final void e0(ik.f fVar, Throwable th2) {
        Throwable th3;
        for (b0 N : fl.e.f20226a) {
            try {
                N.N(fVar, th2);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th4) {
                if (th2 == th4) {
                    th3 = th2;
                } else {
                    th3 = new RuntimeException("Exception while trying to handle coroutine exception", th4);
                    g0.s(th3, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th3);
            }
        }
        try {
            g0.s(th2, new DiagnosticCoroutineContextException(fVar));
        } catch (Throwable unused2) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }

    public static void e1(Parcel parcel, int i10, Parcelable parcelable, int i11) {
        if (parcelable != null) {
            int n12 = n1(i10, parcel);
            parcelable.writeToParcel(parcel, i11);
            o1(n12, parcel);
        }
    }

    public static void f(Context context, Locale locale) {
        String s10 = f0.b0.s(locale.getLanguage(), "$", locale.getCountry());
        if (xe.j.f17328a == null) {
            xe.j.f17328a = context.getSharedPreferences("PictureSpUtils", 0);
        }
        xe.j.f17328a.edit().putString("KEY_LOCALE", s10).apply();
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        Locale locale2 = configuration.locale;
        if (!N(locale2.getLanguage(), locale.getLanguage()) || !N(locale2.getCountry(), locale.getCountry())) {
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration.setLocale(locale);
            context.createConfigurationContext(configuration);
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    public static int f0(float f10) {
        boolean z10;
        float f11;
        boolean z11;
        float f12;
        if (f10 < 1.0f) {
            return -16777216;
        }
        if (f10 > 99.0f) {
            return -1;
        }
        float f13 = (f10 + 16.0f) / 116.0f;
        if (f10 > 8.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f11 = f13 * f13 * f13;
        } else {
            f11 = f10 / 903.2963f;
        }
        float f14 = f13 * f13 * f13;
        if (f14 > 0.008856452f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            f12 = f14;
        } else {
            f12 = ((f13 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z11) {
            f14 = ((f13 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f13959q;
        return n1.d.a((double) (f12 * fArr[0]), (double) (f11 * fArr[1]), (double) (f14 * fArr[2]));
    }

    public static void f1(Parcel parcel, int i10, String str) {
        if (str != null) {
            int n12 = n1(i10, parcel);
            parcel.writeString(str);
            o1(n12, parcel);
        }
    }

    public static final Object[] g(int i10) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new Object[i10];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public static boolean g0(int i10) {
        return i10 == -1;
    }

    public static void g1(Parcel parcel, int i10, String[] strArr) {
        if (strArr != null) {
            int n12 = n1(i10, parcel);
            parcel.writeStringArray(strArr);
            o1(n12, parcel);
        }
    }

    public static k0 h(d0 d0Var, rk.p pVar) {
        k0 k0Var = new k0(y.b(d0Var, ik.g.f20653a), true);
        k0Var.k0(1, k0Var, pVar);
        return k0Var;
    }

    public static boolean h0() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - f13954e < 600) {
            return true;
        }
        f13954e = elapsedRealtime;
        return false;
    }

    public static void h1(Parcel parcel, int i10, List list) {
        if (list != null) {
            int n12 = n1(i10, parcel);
            parcel.writeStringList(list);
            o1(n12, parcel);
        }
    }

    public static final int i(int[] iArr, int i10) {
        int length = iArr.length - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (i11 + length) >>> 1;
            int i13 = iArr[i12];
            if (i10 > i13) {
                i11 = i12 + 1;
            } else if (i10 >= i13) {
                return i12;
            } else {
                length = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final boolean i0(char c10) {
        if (Character.isWhitespace(c10) || Character.isSpaceChar(c10)) {
            return true;
        }
        return false;
    }

    public static void i1(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11) {
        if (parcelableArr != null) {
            int n12 = n1(i10, parcel);
            parcel.writeInt(r0);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    p1(parcel, parcelable, i11);
                }
            }
            o1(n12, parcel);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x022e, code lost:
        r15 = true;
        r16 = r16 & 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0231, code lost:
        if (r16 != 0) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0233, code lost:
        r16 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0236, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0238, code lost:
        if (r16 == false) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x023a, code lost:
        r13 = !r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x020b, code lost:
        r15 = r15 + r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0223, code lost:
        r16 = r15;
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x022c, code lost:
        r16 = r15;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void j(cd.a r20, int r21, ud.h r22, int r23, wd.b r24) {
        /*
            r0 = r20
            r1 = r22
            r2 = r23
            r3 = r24
            byte[][] r4 = r3.f16798a
            int r5 = r4.length
            r6 = 0
            r7 = r6
        L_0x000d:
            r8 = -1
            if (r7 >= r5) goto L_0x0018
            r9 = r4[r7]
            java.util.Arrays.fill(r9, r8)
            int r7 = r7 + 1
            goto L_0x000d
        L_0x0018:
            int[][] r4 = f13968z
            r4 = r4[r6]
            int r4 = r4.length
            I(r6, r6, r3)
            int r5 = r3.f16799b
            int r5 = r5 - r4
            I(r5, r6, r3)
            int r5 = r3.f16799b
            int r5 = r5 - r4
            I(r6, r5, r3)
            r4 = 7
            H(r6, r4, r3)
            int r5 = r3.f16799b
            int r5 = r5 + -8
            H(r5, r4, r3)
            int r5 = r3.f16799b
            int r5 = r5 + -8
            H(r6, r5, r3)
            J(r4, r6, r3)
            int r5 = r3.f16800c
            int r5 = r5 - r4
            int r5 = r5 + r8
            J(r5, r6, r3)
            int r5 = r3.f16800c
            int r5 = r5 - r4
            J(r4, r5, r3)
            int r5 = r3.f16800c
            r7 = 8
            int r5 = r5 - r7
            byte r5 = r3.a(r7, r5)
            if (r5 == 0) goto L_0x02b0
            int r5 = r3.f16800c
            int r5 = r5 - r7
            r9 = 1
            r3.b(r7, r5, r9)
            int r5 = r1.f15517a
            r10 = 5
            r11 = 2
            if (r5 >= r11) goto L_0x0067
            goto L_0x00c1
        L_0x0067:
            int r5 = r5 + r8
            int[][] r12 = B
            r5 = r12[r5]
            int r12 = r5.length
            r13 = r6
        L_0x006e:
            if (r13 >= r12) goto L_0x00c1
            r14 = r5[r13]
            if (r14 < 0) goto L_0x00b6
            int r15 = r5.length
            r8 = r6
        L_0x0076:
            if (r8 >= r15) goto L_0x00b6
            r11 = r5[r8]
            if (r11 < 0) goto L_0x00ac
            byte r18 = r3.a(r11, r14)
            boolean r18 = g0(r18)
            if (r18 == 0) goto L_0x00ac
            int r11 = r11 + -2
            int r18 = r14 + -2
            r4 = r6
        L_0x008b:
            if (r4 >= r10) goto L_0x00ac
            int[][] r19 = A
            r19 = r19[r4]
            r9 = r6
        L_0x0092:
            if (r9 >= r10) goto L_0x00a4
            int r6 = r11 + r9
            int r10 = r18 + r4
            r7 = r19[r9]
            r3.b(r6, r10, r7)
            int r9 = r9 + 1
            r6 = 0
            r7 = 8
            r10 = 5
            goto L_0x0092
        L_0x00a4:
            int r4 = r4 + 1
            r6 = 0
            r7 = 8
            r9 = 1
            r10 = 5
            goto L_0x008b
        L_0x00ac:
            int r8 = r8 + 1
            r4 = 7
            r6 = 0
            r7 = 8
            r9 = 1
            r10 = 5
            r11 = 2
            goto L_0x0076
        L_0x00b6:
            int r13 = r13 + 1
            r4 = 7
            r6 = 0
            r7 = 8
            r8 = -1
            r9 = 1
            r10 = 5
            r11 = 2
            goto L_0x006e
        L_0x00c1:
            r4 = 8
        L_0x00c3:
            int r5 = r3.f16799b
            r6 = 8
            int r5 = r5 - r6
            r6 = 6
            if (r4 >= r5) goto L_0x00eb
            int r5 = r4 + 1
            int r7 = r5 % 2
            byte r8 = r3.a(r4, r6)
            boolean r8 = g0(r8)
            if (r8 == 0) goto L_0x00dc
            r3.b(r4, r6, r7)
        L_0x00dc:
            byte r8 = r3.a(r6, r4)
            boolean r8 = g0(r8)
            if (r8 == 0) goto L_0x00e9
            r3.b(r6, r4, r7)
        L_0x00e9:
            r4 = r5
            goto L_0x00c3
        L_0x00eb:
            cd.a r4 = new cd.a
            r4.<init>()
            if (r2 < 0) goto L_0x00f8
            r5 = 8
            if (r2 >= r5) goto L_0x00f8
            r5 = 1
            goto L_0x00f9
        L_0x00f8:
            r5 = 0
        L_0x00f9:
            if (r5 == 0) goto L_0x02a8
            int r5 = n0.l.a(r21)
            r7 = 3
            int r5 = r5 << r7
            r5 = r5 | r2
            r8 = 5
            r4.b(r5, r8)
            r8 = 1335(0x537, float:1.871E-42)
            int r5 = l(r5, r8)
            r8 = 10
            r4.b(r5, r8)
            cd.a r5 = new cd.a
            r5.<init>()
            r8 = 21522(0x5412, float:3.0159E-41)
            r9 = 15
            r5.b(r8, r9)
            int r8 = r4.f4688b
            int r10 = r5.f4688b
            if (r8 != r10) goto L_0x02a0
            r8 = 0
        L_0x0124:
            int[] r10 = r4.f4687a
            int r11 = r10.length
            if (r8 >= r11) goto L_0x0135
            r11 = r10[r8]
            int[] r12 = r5.f4687a
            r12 = r12[r8]
            r11 = r11 ^ r12
            r10[r8] = r11
            int r8 = r8 + 1
            goto L_0x0124
        L_0x0135:
            int r5 = r4.f4688b
            java.lang.String r8 = "should not happen but we got: "
            if (r5 != r9) goto L_0x028c
            r5 = 0
        L_0x013c:
            int r9 = r4.f4688b
            if (r5 >= r9) goto L_0x016d
            int r9 = r9 + -1
            int r9 = r9 - r5
            boolean r9 = r4.e(r9)
            int[][] r10 = C
            r10 = r10[r5]
            r11 = 0
            r12 = r10[r11]
            r13 = 1
            r10 = r10[r13]
            r3.c(r9, r12, r10)
            r10 = 8
            if (r5 >= r10) goto L_0x015e
            int r12 = r3.f16799b
            int r12 = r12 - r5
            int r12 = r12 - r13
            r13 = r10
            goto L_0x0167
        L_0x015e:
            int r12 = r3.f16800c
            int r12 = r12 + -7
            int r13 = r5 + -8
            int r12 = r12 + r13
            r13 = r12
            r12 = r10
        L_0x0167:
            r3.c(r9, r12, r13)
            int r5 = r5 + 1
            goto L_0x013c
        L_0x016d:
            r11 = 0
            int r4 = r1.f15517a
            r5 = 7
            if (r4 >= r5) goto L_0x0174
            goto L_0x01b5
        L_0x0174:
            cd.a r4 = new cd.a
            r4.<init>()
            int r5 = r1.f15517a
            r4.b(r5, r6)
            int r1 = r1.f15517a
            r5 = 7973(0x1f25, float:1.1173E-41)
            int r1 = l(r1, r5)
            r5 = 12
            r4.b(r1, r5)
            int r1 = r4.f4688b
            r5 = 18
            if (r1 != r5) goto L_0x0278
            r1 = 17
            r5 = r11
        L_0x0194:
            if (r5 >= r6) goto L_0x01b5
            r8 = r11
        L_0x0197:
            if (r8 >= r7) goto L_0x01b2
            boolean r9 = r4.e(r1)
            int r1 = r1 + -1
            int r10 = r3.f16800c
            int r10 = r10 + -11
            int r10 = r10 + r8
            r3.c(r9, r5, r10)
            int r10 = r3.f16800c
            int r10 = r10 + -11
            int r10 = r10 + r8
            r3.c(r9, r10, r5)
            int r8 = r8 + 1
            goto L_0x0197
        L_0x01b2:
            int r5 = r5 + 1
            goto L_0x0194
        L_0x01b5:
            int r1 = r3.f16799b
            r4 = 1
            int r1 = r1 - r4
            int r5 = r3.f16800c
            int r5 = r5 - r4
            r4 = r11
            r8 = -1
        L_0x01be:
            if (r1 <= 0) goto L_0x0255
            if (r1 != r6) goto L_0x01c4
            int r1 = r1 + -1
        L_0x01c4:
            if (r5 < 0) goto L_0x024c
            int r9 = r3.f16800c
            if (r5 >= r9) goto L_0x024c
            r9 = r11
            r10 = 2
        L_0x01cc:
            if (r9 >= r10) goto L_0x0247
            int r12 = r1 - r9
            byte r13 = r3.a(r12, r5)
            boolean r13 = g0(r13)
            if (r13 == 0) goto L_0x0242
            int r13 = r0.f4688b
            if (r4 >= r13) goto L_0x01e5
            boolean r13 = r0.e(r4)
            int r4 = r4 + 1
            goto L_0x01e6
        L_0x01e5:
            r13 = r11
        L_0x01e6:
            r14 = -1
            if (r2 == r14) goto L_0x023d
            switch(r2) {
                case 0: goto L_0x022a;
                case 1: goto L_0x0227;
                case 2: goto L_0x0221;
                case 3: goto L_0x021d;
                case 4: goto L_0x0216;
                case 5: goto L_0x020e;
                case 6: goto L_0x0206;
                case 7: goto L_0x01fc;
                default: goto L_0x01ec;
            }
        L_0x01ec:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r23)
            java.lang.String r2 = "Invalid mask pattern: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x01fc:
            int r15 = r5 * r12
            int r15 = r15 % r7
            int r16 = r5 + r12
            r17 = 1
            r16 = r16 & 1
            goto L_0x020b
        L_0x0206:
            int r15 = r5 * r12
            r16 = r15 & 1
            int r15 = r15 % r7
        L_0x020b:
            int r15 = r15 + r16
            goto L_0x022c
        L_0x020e:
            int r15 = r5 * r12
            r16 = r15 & 1
            int r15 = r15 % r7
            int r15 = r15 + r16
            goto L_0x0223
        L_0x0216:
            int r15 = r5 / 2
            int r16 = r12 / 3
            int r15 = r16 + r15
            goto L_0x022c
        L_0x021d:
            int r15 = r5 + r12
            int r15 = r15 % r7
            goto L_0x0223
        L_0x0221:
            int r15 = r12 % 3
        L_0x0223:
            r16 = r15
            r15 = 1
            goto L_0x0231
        L_0x0227:
            r16 = r5
            goto L_0x022e
        L_0x022a:
            int r15 = r5 + r12
        L_0x022c:
            r16 = r15
        L_0x022e:
            r15 = 1
            r16 = r16 & 1
        L_0x0231:
            if (r16 != 0) goto L_0x0236
            r16 = r15
            goto L_0x0238
        L_0x0236:
            r16 = r11
        L_0x0238:
            if (r16 == 0) goto L_0x023e
            r13 = r13 ^ 1
            goto L_0x023e
        L_0x023d:
            r15 = 1
        L_0x023e:
            r3.c(r13, r12, r5)
            goto L_0x0244
        L_0x0242:
            r14 = -1
            r15 = 1
        L_0x0244:
            int r9 = r9 + 1
            goto L_0x01cc
        L_0x0247:
            r14 = -1
            r15 = 1
            int r5 = r5 + r8
            goto L_0x01c4
        L_0x024c:
            r10 = 2
            r14 = -1
            r15 = 1
            int r8 = -r8
            int r5 = r5 + r8
            int r1 = r1 + -2
            goto L_0x01be
        L_0x0255:
            int r1 = r0.f4688b
            if (r4 != r1) goto L_0x025a
            return
        L_0x025a:
            com.google.zxing.WriterException r1 = new com.google.zxing.WriterException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Not all bits consumed: "
            r2.<init>(r3)
            r2.append(r4)
            r3 = 47
            r2.append(r3)
            int r0 = r0.f4688b
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x0278:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            int r2 = r4.f4688b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x028c:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            int r2 = r4.f4688b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x02a0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Sizes don't match"
            r0.<init>(r1)
            throw r0
        L_0x02a8:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            java.lang.String r1 = "Invalid mask pattern"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x02b0:
            com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.l0.j(cd.a, int, ud.h, int, wd.b):void");
    }

    public static x1 j0(d0 d0Var, a0 a0Var, rk.p pVar, int i10) {
        int i11;
        x1 x1Var;
        ik.f fVar = a0Var;
        if ((i10 & 1) != 0) {
            fVar = ik.g.f20653a;
        }
        boolean z10 = false;
        if ((i10 & 2) != 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        ik.f b10 = y.b(d0Var, fVar);
        if (i11 == 2) {
            z10 = true;
        }
        if (z10) {
            x1Var = new p1(b10, pVar);
        } else {
            x1Var = new x1(b10, true);
        }
        x1Var.k0(i11, x1Var, pVar);
        return x1Var;
    }

    public static void j1(Parcel parcel, int i10, List list) {
        if (list != null) {
            int n12 = n1(i10, parcel);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                Parcelable parcelable = (Parcelable) list.get(i11);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    p1(parcel, parcelable, 0);
                }
            }
            o1(n12, parcel);
        }
    }

    public static float k0(int i10) {
        float pow;
        float f10 = ((float) i10) / 255.0f;
        if (f10 <= 0.04045f) {
            pow = f10 / 12.92f;
        } else {
            pow = (float) Math.pow((double) ((f10 + 0.055f) / 1.055f), 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static void k1(ByteArrayOutputStream byteArrayOutputStream, long j10, int i10) {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((int) ((j10 >> (i11 * 8)) & 255));
        }
        byteArrayOutputStream.write(bArr);
    }

    public static int l(int i10, int i11) {
        if (i11 != 0) {
            int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i11);
            int i12 = i10 << (numberOfLeadingZeros - 1);
            while (32 - Integer.numberOfLeadingZeros(i12) >= numberOfLeadingZeros) {
                i12 ^= i11 << ((32 - Integer.numberOfLeadingZeros(i12)) - numberOfLeadingZeros);
            }
            return i12;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    public static String l0(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }

    public static void l1(ByteArrayOutputStream byteArrayOutputStream, int i10) {
        k1(byteArrayOutputStream, (long) i10, 2);
    }

    public static int m(float f10) {
        return ((int) (((double) f10) + 16384.999999999996d)) - 16384;
    }

    public static final int m0(c.a aVar, h hVar) {
        j.f(aVar, "<this>");
        if (!hVar.isEmpty()) {
            int i10 = hVar.f23336b;
            if (i10 < Integer.MAX_VALUE) {
                return aVar.c(hVar.f23335a, i10 + 1);
            }
            int i11 = hVar.f23335a;
            if (i11 > Integer.MIN_VALUE) {
                return aVar.c(i11 - 1, i10) + 1;
            }
            return aVar.b();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + hVar);
    }

    public static float m1() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static final void n(int i10) {
        boolean z10;
        h hVar = new h(2, 36);
        if (2 > i10 || i10 > hVar.f23336b) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            StringBuilder l10 = n0.l.l("radix ", i10, " was not in valid range ");
            l10.append(new h(2, 36));
            throw new IllegalArgumentException(l10.toString());
        }
    }

    public static void n0(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof androidx.appcompat.widget.v0) {
                    editorInfo.hintText = ((androidx.appcompat.widget.v0) parent).a();
                    return;
                }
            }
        }
    }

    public static int n1(int i10, Parcel parcel) {
        parcel.writeInt(i10 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static int o(Context context, String str) {
        boolean z10;
        int i10;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d10 = i1.g.d(str);
        if (d10 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 != myUid || !v1.b.a(packageName2, packageName)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                i10 = i1.g.c((AppOpsManager) i1.g.a(context, AppOpsManager.class), d10, packageName);
            } else if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager c10 = i1.h.c(context);
                i10 = i1.h.a(c10, d10, Binder.getCallingUid(), packageName);
                if (i10 == 0) {
                    i10 = i1.h.a(c10, d10, myUid, i1.h.b(context));
                }
            } else {
                i10 = i1.g.c((AppOpsManager) i1.g.a(context, AppOpsManager.class), d10, packageName);
            }
            if (i10 != 0) {
                return -2;
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new com.google.gson.JsonIOException((java.lang.Exception) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Exception) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return bc.m.f4160a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Exception) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Exception) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: MalformedJsonException (r2v4 'e' com.google.gson.stream.MalformedJsonException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static bc.l o0(hc.a r2) {
        /*
            r2.k0()     // Catch:{ EOFException -> 0x0024, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            com.google.gson.internal.bind.TypeAdapters$t r1 = com.google.gson.internal.bind.TypeAdapters.f7804z     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.a(r2)     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            bc.l r2 = (bc.l) r2     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Exception) r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            r0.<init>((java.lang.Exception) r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Exception) r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            bc.m r2 = bc.m.f4160a
            return r2
        L_0x002b:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Exception) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.l0.o0(hc.a):bc.l");
    }

    public static void o1(int i10, Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }

    public static float p0(int[] iArr, int[] iArr2) {
        float f10;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f11 = (float) i10;
        float f12 = f11 / ((float) i11);
        float f13 = 0.8f * f12;
        float f14 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            float f15 = ((float) iArr2[i13]) * f12;
            float f16 = (float) i14;
            if (f16 > f15) {
                f10 = f16 - f15;
            } else {
                f10 = f15 - f16;
            }
            if (f10 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f10;
        }
        return f14 / f11;
    }

    public static void p1(Parcel parcel, Parcelable parcelable, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static void q(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static final Object q0(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static boolean r() {
        int i10 = 0;
        while (Pattern.compile("%[^%]*\\d").matcher((CharSequence) null).find()) {
            i10++;
        }
        if (i10 >= 2) {
            return true;
        }
        return false;
    }

    public static void r0(float f10, float[] fArr) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f10, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static boolean s() {
        return !TextUtils.isEmpty((CharSequence) null);
    }

    public static byte[] s0(InputStream inputStream, int i10) {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int read = inputStream.read(bArr, i11, i10 - i11);
            if (read >= 0) {
                i11 += read;
            } else {
                throw new IllegalStateException(android.support.v4.media.a.m("Not enough bytes to read: ", i10));
            }
        }
        return bArr;
    }

    public static int t(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static final byte[] t0(InputStream inputStream) {
        j.f(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        z(inputStream, byteArrayOutputStream, 8192);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        j.e(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    public static final void u(Closeable closeable, Throwable th2) {
        if (closeable == null) {
            return;
        }
        if (th2 == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th3) {
            g0.s(th2, th3);
        }
    }

    public static byte[] u0(FileInputStream fileInputStream, int i10, int i11) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[2048];
            int i12 = 0;
            int i13 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i12 < i10) {
                int read = fileInputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    i13 += inflater.inflate(bArr, i13, i11 - i13);
                    i12 += read;
                } else {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i10 + " bytes");
                }
            }
            if (i12 != i10) {
                throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i10 + " actual=" + i12);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                throw new IllegalStateException("Inflater did not finish");
            }
        } catch (DataFormatException e10) {
            throw new IllegalStateException(e10.getMessage());
        } catch (Throwable th2) {
            inflater.end();
            throw th2;
        }
    }

    public static final int v(int i10, h hVar) {
        j.f(hVar, "range");
        if (hVar instanceof vk.d) {
            Object valueOf = Integer.valueOf(i10);
            vk.d dVar = (vk.d) hVar;
            j.f(valueOf, "<this>");
            if (!dVar.isEmpty()) {
                dVar.g();
                if (dVar.i()) {
                    dVar.g();
                    if (!dVar.i()) {
                        valueOf = dVar.g();
                        return ((Number) valueOf).intValue();
                    }
                }
                dVar.l();
                if (dVar.i()) {
                    dVar.l();
                    if (!dVar.i()) {
                        valueOf = dVar.l();
                    }
                }
                return ((Number) valueOf).intValue();
            }
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + dVar + '.');
        } else if (hVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + hVar + '.');
        } else if (i10 < ((Number) hVar.g()).intValue()) {
            return ((Number) hVar.g()).intValue();
        } else {
            if (i10 > ((Number) hVar.l()).intValue()) {
                return ((Number) hVar.l()).intValue();
            }
            return i10;
        }
    }

    public static long v0(InputStream inputStream, int i10) {
        byte[] s02 = s0(inputStream, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 += ((long) (s02[i11] & 255)) << (i11 * 8);
        }
        return j10;
    }

    public static final long w(long j10) {
        if (j10 < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j10 > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j10;
    }

    public static int w0(InputStream inputStream) {
        return (int) v0(inputStream, 2);
    }

    public static int x(long j10, long j11) {
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        return i10 > 0 ? 1 : 0;
    }

    public static final Object x0(Object obj) {
        if (obj instanceof al.u) {
            return A(((al.u) obj).f19094a);
        }
        return obj;
    }

    public static byte[] y(byte[] bArr) {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            deflater.end();
            throw th2;
        }
        throw th;
    }

    public static void y0(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(f0.b0.r(str, " must not be null"));
        }
    }

    public static final long z(InputStream inputStream, OutputStream outputStream, int i10) {
        j.f(inputStream, "<this>");
        byte[] bArr = new byte[i10];
        int read = inputStream.read(bArr);
        long j10 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j10 += (long) read;
            read = inputStream.read(bArr);
        }
        return j10;
    }

    public static final void z0(Object[] objArr, int i10, int i11) {
        j.f(objArr, "<this>");
        while (i10 < i11) {
            objArr[i10] = null;
            i10++;
        }
    }

    public void a(String str, String str2) {
        j.f(str, "tag");
        j.f(str2, "message");
    }

    public Object b(m4.c cVar, float f10) {
        return l4.m.b(cVar, f10);
    }

    public Object k(ca.s sVar) {
        return new lc.d(sVar.c(lc.i.class));
    }

    public void onFailure(Exception exc) {
    }

    public Object p() {
        return new LinkedHashSet();
    }

    public Task then(Object obj) {
        Void voidR = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }
}
