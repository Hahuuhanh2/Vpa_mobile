package mg;

import android.util.SparseIntArray;
import android.widget.TextView;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0533R$id;
import com.vpa.daugia.module.auction.data.model.BiddingPrice;
import com.vpa.daugia.module.auction.data.model.PriceTable;
import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import d2.g;
import d2.i;
import f0.b0;
import fk.p;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import qg.a;
import sk.j;
import ug.f;

/* compiled from: ActivitySessionAuctionBindingImpl */
public final class o1 extends n1 implements a.C0304a {
    public static final SparseIntArray U;
    public final TextView K;
    public final AppTextView L;
    public final AppTextView M;
    public final qg.a N;
    public final qg.a O;
    public a P = new a();
    public b Q = new b();
    public c R = new c();
    public d S = new d();
    public long T = -1;

    /* compiled from: ActivitySessionAuctionBindingImpl */
    public class a implements g {
        public a() {
        }

        public final void b() {
            boolean z10;
            String a10 = e2.c.a(o1.this.f21241w);
            AuctionRoomViewModel auctionRoomViewModel = o1.this.I;
            boolean z11 = true;
            if (auctionRoomViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i<String> iVar = auctionRoomViewModel.f19449x;
                if (iVar == null) {
                    z11 = false;
                }
                if (z11) {
                    iVar.g(a10);
                }
            }
        }
    }

    /* compiled from: ActivitySessionAuctionBindingImpl */
    public class b implements g {
        public b() {
        }

        public final void b() {
            boolean z10;
            String a10 = e2.c.a(o1.this.M);
            AuctionRoomViewModel auctionRoomViewModel = o1.this.I;
            boolean z11 = true;
            if (auctionRoomViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i<String> iVar = auctionRoomViewModel.f19448w;
                if (iVar == null) {
                    z11 = false;
                }
                if (z11) {
                    iVar.g(a10);
                }
            }
        }
    }

    /* compiled from: ActivitySessionAuctionBindingImpl */
    public class c implements g {
        public c() {
        }

        public final void b() {
            boolean z10;
            String a10 = e2.c.a(o1.this.D);
            AuctionRoomViewModel auctionRoomViewModel = o1.this.I;
            boolean z11 = true;
            if (auctionRoomViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i<String> iVar = auctionRoomViewModel.f19446u;
                if (iVar == null) {
                    z11 = false;
                }
                if (z11) {
                    iVar.g(a10);
                }
            }
        }
    }

    /* compiled from: ActivitySessionAuctionBindingImpl */
    public class d implements g {
        public d() {
        }

        public final void b() {
            boolean z10;
            String a10 = e2.c.a(o1.this.F);
            AuctionRoomViewModel auctionRoomViewModel = o1.this.I;
            boolean z11 = true;
            if (auctionRoomViewModel != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i<String> iVar = auctionRoomViewModel.f19451z;
                if (iVar == null) {
                    z11 = false;
                }
                if (z11) {
                    iVar.g(a10);
                }
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(2131361926, 10);
        sparseIntArray.put(2131362806, 11);
        sparseIntArray.put(C0533R$id.imvClock, 12);
        sparseIntArray.put(2131362022, 13);
        sparseIntArray.put(C0533R$id.tvPlate, 14);
        sparseIntArray.put(C0533R$id.divider, 15);
        sparseIntArray.put(C0533R$id.lltest, 16);
        sparseIntArray.put(C0533R$id.tvPriceLabel, 17);
        sparseIntArray.put(C0533R$id.tvNameLabel, 18);
        sparseIntArray.put(C0533R$id.tvViewDetail, 19);
        sparseIntArray.put(C0533R$id.rvAuction, 20);
        sparseIntArray.put(C0533R$id.rvRoom, 21);
        sparseIntArray.put(C0533R$id.cvFunction, 22);
        sparseIntArray.put(C0533R$id.tv1, 23);
        sparseIntArray.put(C0533R$id.imvRemove, 24);
        sparseIntArray.put(C0533R$id.llCounter, 25);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o1(d2.e r21, android.view.View r22) {
        /*
            r20 = this;
            r15 = r20
            r14 = r22
            android.util.SparseIntArray r0 = U
            r1 = 26
            r13 = 0
            r2 = r21
            java.lang.Object[] r16 = d2.l.o(r2, r14, r1, r13, r0)
            r0 = 9
            r0 = r16[r0]
            r3 = r0
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            r0 = 10
            r0 = r16[r0]
            r4 = r0
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            r0 = 5
            r0 = r16[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 7
            r0 = r16[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 13
            r0 = r16[r0]
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r0 = 22
            r0 = r16[r0]
            com.google.android.material.card.MaterialCardView r0 = (com.google.android.material.card.MaterialCardView) r0
            r0 = 15
            r0 = r16[r0]
            android.view.View r0 = (android.view.View) r0
            r0 = 12
            r0 = r16[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 24
            r0 = r16[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 25
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 16
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 0
            r0 = r16[r0]
            r7 = r0
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r0 = 20
            r0 = r16[r0]
            r8 = r0
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            r0 = 21
            r0 = r16[r0]
            r9 = r0
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            r0 = 23
            r0 = r16[r0]
            com.ots.core.utils.customview.textview.AppTextView r0 = (com.ots.core.utils.customview.textview.AppTextView) r0
            r0 = 6
            r0 = r16[r0]
            r10 = r0
            com.ots.core.utils.customview.textview.AppTextView r10 = (com.ots.core.utils.customview.textview.AppTextView) r10
            r0 = 4
            r0 = r16[r0]
            r11 = r0
            com.ots.core.utils.customview.textview.AppTextView r11 = (com.ots.core.utils.customview.textview.AppTextView) r11
            r0 = 18
            r0 = r16[r0]
            com.ots.core.utils.customview.textview.AppTextView r0 = (com.ots.core.utils.customview.textview.AppTextView) r0
            r0 = 14
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 17
            r0 = r16[r0]
            com.ots.core.utils.customview.textview.AppTextView r0 = (com.ots.core.utils.customview.textview.AppTextView) r0
            r12 = 1
            r0 = r16[r12]
            r17 = r0
            com.ots.core.utils.customview.textview.AppTextView r17 = (com.ots.core.utils.customview.textview.AppTextView) r17
            r0 = 11
            r0 = r16[r0]
            r18 = r0
            com.ots.core.utils.customview.textview.AppTextView r18 = (com.ots.core.utils.customview.textview.AppTextView) r18
            r0 = 19
            r0 = r16[r0]
            r19 = r0
            com.ots.base.utils.customview.GradientTextView r19 = (com.ots.base.utils.customview.GradientTextView) r19
            r0 = r20
            r1 = r21
            r2 = r22
            r12 = r17
            r13 = r18
            r14 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            mg.o1$a r0 = new mg.o1$a
            r0.<init>()
            r15.P = r0
            mg.o1$b r0 = new mg.o1$b
            r0.<init>()
            r15.Q = r0
            mg.o1$c r0 = new mg.o1$c
            r0.<init>()
            r15.R = r0
            mg.o1$d r0 = new mg.o1$d
            r0.<init>()
            r15.S = r0
            r0 = -1
            r15.T = r0
            com.google.android.material.button.MaterialButton r0 = r15.f21241w
            r1 = 0
            r0.setTag(r1)
            android.widget.ImageView r0 = r15.f21243y
            r0.setTag(r1)
            android.widget.ImageView r0 = r15.f21244z
            r0.setTag(r1)
            android.widget.LinearLayout r0 = r15.A
            r0.setTag(r1)
            r0 = 2
            r2 = r16[r0]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r15.K = r2
            r2.setTag(r1)
            r2 = 3
            r2 = r16[r2]
            com.ots.core.utils.customview.textview.AppTextView r2 = (com.ots.core.utils.customview.textview.AppTextView) r2
            r15.L = r2
            r2.setTag(r1)
            r2 = 8
            r2 = r16[r2]
            com.ots.core.utils.customview.textview.AppTextView r2 = (com.ots.core.utils.customview.textview.AppTextView) r2
            r15.M = r2
            r2.setTag(r1)
            com.ots.core.utils.customview.textview.AppTextView r2 = r15.D
            r2.setTag(r1)
            com.ots.core.utils.customview.textview.AppTextView r2 = r15.E
            r2.setTag(r1)
            com.ots.core.utils.customview.textview.AppTextView r2 = r15.F
            r2.setTag(r1)
            int r1 = androidx.databinding.library.R$id.dataBinding
            r2 = r22
            r2.setTag(r1, r15)
            qg.a r1 = new qg.a
            r1.<init>(r15, r0)
            r15.N = r1
            qg.a r0 = new qg.a
            r1 = 1
            r0.<init>(r15, r1)
            r15.O = r0
            r20.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.o1.<init>(d2.e, android.view.View):void");
    }

    public final void e(int i10) {
        ArrayList<BiddingPrice> prices;
        BiddingPrice biddingPrice;
        Long price;
        ArrayList<BiddingPrice> prices2;
        BiddingPrice biddingPrice2;
        Long price2;
        long j10 = 35000000;
        Long l10 = 0L;
        String str = null;
        boolean z10 = false;
        Integer num = 0;
        if (i10 == 1) {
            AuctionRoomViewModel auctionRoomViewModel = this.I;
            if (auctionRoomViewModel != null) {
                z10 = true;
            }
            if (z10) {
                Integer num2 = (Integer) auctionRoomViewModel.f19445t.f8545b;
                if (num2 == null) {
                    num2 = 1;
                }
                if (num2.intValue() > 1) {
                    i<Integer> iVar = auctionRoomViewModel.f19445t;
                    Integer num3 = (Integer) iVar.f8545b;
                    if (num3 != null) {
                        num = num3;
                    }
                    iVar.g(Integer.valueOf(num.intValue() - 1));
                    auctionRoomViewModel.f19446u.g(String.valueOf(auctionRoomViewModel.f19445t.f8545b));
                    i<Long> iVar2 = auctionRoomViewModel.f19447v;
                    T t10 = auctionRoomViewModel.f19444s.f8545b;
                    j.c(t10);
                    long longValue = ((Number) t10).longValue();
                    T t11 = auctionRoomViewModel.f19445t.f8545b;
                    j.c(t11);
                    iVar2.g(Long.valueOf(((Number) t11).longValue() * longValue));
                    i<String> iVar3 = auctionRoomViewModel.f19448w;
                    Long l11 = (Long) auctionRoomViewModel.f19447v.f8545b;
                    if (l11 != null) {
                        str = b0.t(NumberFormat.getNumberInstance(new Locale("vi", "VN")), l11.longValue(), new StringBuilder(), " đ");
                    }
                    iVar3.g(str);
                    i<String> iVar4 = auctionRoomViewModel.f19449x;
                    StringBuilder q10 = android.support.v4.media.a.q("Trả giá ");
                    Long l12 = (Long) auctionRoomViewModel.f19447v.f8545b;
                    if (l12 != null) {
                        l10 = l12;
                    }
                    long longValue2 = l10.longValue();
                    PriceTable d10 = auctionRoomViewModel.f19443r.d();
                    if (!(d10 == null || (prices = d10.getPrices()) == null || (biddingPrice = (BiddingPrice) p.N0(prices)) == null || (price = biddingPrice.getPrice()) == null)) {
                        j10 = price.longValue();
                    }
                    q10.append(b0.t(NumberFormat.getNumberInstance(new Locale("vi", "VN")), longValue2 + j10, new StringBuilder(), " đ"));
                    iVar4.g(q10.toString());
                }
            }
        } else if (i10 == 2) {
            AuctionRoomViewModel auctionRoomViewModel2 = this.I;
            if (auctionRoomViewModel2 != null) {
                z10 = true;
            }
            if (z10) {
                i<Integer> iVar5 = auctionRoomViewModel2.f19445t;
                Integer num4 = (Integer) iVar5.f8545b;
                if (num4 != null) {
                    num = num4;
                }
                iVar5.g(Integer.valueOf(num.intValue() + 1));
                auctionRoomViewModel2.f19446u.g(String.valueOf(auctionRoomViewModel2.f19445t.f8545b));
                i<Long> iVar6 = auctionRoomViewModel2.f19447v;
                T t12 = auctionRoomViewModel2.f19444s.f8545b;
                j.c(t12);
                long longValue3 = ((Number) t12).longValue();
                T t13 = auctionRoomViewModel2.f19445t.f8545b;
                j.c(t13);
                iVar6.g(Long.valueOf(((Number) t13).longValue() * longValue3));
                i<String> iVar7 = auctionRoomViewModel2.f19448w;
                Long l13 = (Long) auctionRoomViewModel2.f19447v.f8545b;
                if (l13 != null) {
                    str = b0.t(NumberFormat.getNumberInstance(new Locale("vi", "VN")), l13.longValue(), new StringBuilder(), " đ");
                }
                iVar7.g(str);
                i<String> iVar8 = auctionRoomViewModel2.f19449x;
                StringBuilder q11 = android.support.v4.media.a.q("Trả giá ");
                Long l14 = (Long) auctionRoomViewModel2.f19447v.f8545b;
                if (l14 != null) {
                    l10 = l14;
                }
                long longValue4 = l10.longValue();
                PriceTable d11 = auctionRoomViewModel2.f19443r.d();
                if (!(d11 == null || (prices2 = d11.getPrices()) == null || (biddingPrice2 = (BiddingPrice) p.N0(prices2)) == null || (price2 = biddingPrice2.getPrice()) == null)) {
                    j10 = price2.longValue();
                }
                q11.append(b0.t(NumberFormat.getNumberInstance(new Locale("vi", "VN")), longValue4 + j10, new StringBuilder(), " đ"));
                iVar8.g(q11.toString());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r26 = this;
            r1 = r26
            monitor-enter(r26)
            long r2 = r1.T     // Catch:{ all -> 0x015d }
            r4 = 0
            r1.T = r4     // Catch:{ all -> 0x015d }
            monitor-exit(r26)     // Catch:{ all -> 0x015d }
            ug.f r0 = r1.J
            com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel r6 = r1.I
            r7 = 80
            long r7 = r7 & r2
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x0063
            if (r0 == 0) goto L_0x0056
            java.lang.String r11 = r0.b()
            com.vpa.daugia.module.auction.data.model.PriceTable r12 = r0.f23050a
            java.lang.String r13 = r0.a()
            long r14 = java.lang.System.currentTimeMillis()
            com.vpa.daugia.module.auction.data.model.PriceTable r10 = r0.f23050a
            java.lang.Long r10 = r10.getStartAuction()
            if (r10 == 0) goto L_0x0034
            long r16 = r10.longValue()
            goto L_0x0036
        L_0x0034:
            r16 = r4
        L_0x0036:
            int r10 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r10 >= 0) goto L_0x003b
            goto L_0x0052
        L_0x003b:
            long r14 = java.lang.System.currentTimeMillis()
            com.vpa.daugia.module.auction.data.model.PriceTable r0 = r0.f23050a
            java.lang.Long r0 = r0.getEndRegistTime()
            if (r0 == 0) goto L_0x004c
            long r16 = r0.longValue()
            goto L_0x004e
        L_0x004c:
            r16 = r4
        L_0x004e:
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0054
        L_0x0052:
            r0 = r9
            goto L_0x005a
        L_0x0054:
            r0 = r8
            goto L_0x005a
        L_0x0056:
            r0 = r9
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x005a:
            if (r12 == 0) goto L_0x0061
            java.lang.String r10 = r12.getMoniterName()
            goto L_0x0067
        L_0x0061:
            r10 = 0
            goto L_0x0067
        L_0x0063:
            r0 = r9
            r10 = 0
            r11 = 0
            r13 = 0
        L_0x0067:
            r14 = 111(0x6f, double:5.5E-322)
            long r14 = r14 & r2
            int r12 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            r14 = 104(0x68, double:5.14E-322)
            r16 = 100
            r18 = 98
            r20 = 97
            if (r12 == 0) goto L_0x00d7
            long r22 = r2 & r20
            int r12 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x008c
            if (r6 == 0) goto L_0x0081
            d2.i<java.lang.String> r12 = r6.f19449x
            goto L_0x0082
        L_0x0081:
            r12 = 0
        L_0x0082:
            r1.u(r9, r12)
            if (r12 == 0) goto L_0x008c
            T r9 = r12.f8545b
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x008d
        L_0x008c:
            r9 = 0
        L_0x008d:
            long r22 = r2 & r18
            int r12 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x00a3
            if (r6 == 0) goto L_0x0098
            d2.i<java.lang.String> r12 = r6.f19451z
            goto L_0x0099
        L_0x0098:
            r12 = 0
        L_0x0099:
            r1.u(r8, r12)
            if (r12 == 0) goto L_0x00a3
            T r8 = r12.f8545b
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x00a4
        L_0x00a3:
            r8 = 0
        L_0x00a4:
            long r22 = r2 & r16
            int r12 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x00bb
            if (r6 == 0) goto L_0x00af
            d2.i<java.lang.String> r12 = r6.f19446u
            goto L_0x00b0
        L_0x00af:
            r12 = 0
        L_0x00b0:
            r4 = 2
            r1.u(r4, r12)
            if (r12 == 0) goto L_0x00bb
            T r4 = r12.f8545b
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x00bc
        L_0x00bb:
            r4 = 0
        L_0x00bc:
            long r24 = r2 & r14
            r22 = 0
            int r5 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r5 == 0) goto L_0x00d5
            if (r6 == 0) goto L_0x00c9
            d2.i<java.lang.String> r5 = r6.f19448w
            goto L_0x00ca
        L_0x00c9:
            r5 = 0
        L_0x00ca:
            r6 = 3
            r1.u(r6, r5)
            if (r5 == 0) goto L_0x00d5
            T r5 = r5.f8545b
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x00db
        L_0x00d5:
            r5 = 0
            goto L_0x00db
        L_0x00d7:
            r4 = 0
            r5 = 0
            r8 = 0
            r9 = 0
        L_0x00db:
            if (r7 == 0) goto L_0x00fb
            com.google.android.material.button.MaterialButton r6 = r1.f21241w
            r6.setEnabled(r0)
            android.widget.ImageView r6 = r1.f21243y
            r6.setEnabled(r0)
            android.widget.ImageView r6 = r1.f21244z
            r6.setEnabled(r0)
            android.widget.TextView r0 = r1.K
            e2.c.d(r0, r11)
            com.ots.core.utils.customview.textview.AppTextView r0 = r1.L
            e2.c.d(r0, r13)
            com.ots.core.utils.customview.textview.AppTextView r0 = r1.E
            e2.c.d(r0, r10)
        L_0x00fb:
            long r6 = r2 & r20
            r10 = 0
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0108
            com.google.android.material.button.MaterialButton r0 = r1.f21241w
            e2.c.d(r0, r9)
        L_0x0108:
            r6 = 64
            long r6 = r6 & r2
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0139
            com.google.android.material.button.MaterialButton r0 = r1.f21241w
            mg.o1$a r6 = r1.P
            e2.c.e(r0, r6)
            android.widget.ImageView r0 = r1.f21243y
            qg.a r6 = r1.O
            r0.setOnClickListener(r6)
            android.widget.ImageView r0 = r1.f21244z
            qg.a r6 = r1.N
            r0.setOnClickListener(r6)
            com.ots.core.utils.customview.textview.AppTextView r0 = r1.M
            mg.o1$b r6 = r1.Q
            e2.c.e(r0, r6)
            com.ots.core.utils.customview.textview.AppTextView r0 = r1.D
            mg.o1$c r6 = r1.R
            e2.c.e(r0, r6)
            com.ots.core.utils.customview.textview.AppTextView r0 = r1.F
            mg.o1$d r6 = r1.S
            e2.c.e(r0, r6)
        L_0x0139:
            long r6 = r2 & r14
            r9 = 0
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0146
            com.ots.core.utils.customview.textview.AppTextView r0 = r1.M
            e2.c.d(r0, r5)
        L_0x0146:
            long r5 = r2 & r16
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0151
            com.ots.core.utils.customview.textview.AppTextView r0 = r1.D
            e2.c.d(r0, r4)
        L_0x0151:
            long r2 = r2 & r18
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x015c
            com.ots.core.utils.customview.textview.AppTextView r0 = r1.F
            e2.c.d(r0, r8)
        L_0x015c:
            return
        L_0x015d:
            r0 = move-exception
            monitor-exit(r26)     // Catch:{ all -> 0x015d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.o1.h():void");
    }

    public final boolean k() {
        synchronized (this) {
            if (this.T != 0) {
                return true;
            }
            return false;
        }
    }

    public final void m() {
        synchronized (this) {
            this.T = 64;
        }
        t();
    }

    public final boolean p(Object obj, int i10, int i11) {
        if (i10 == 0) {
            i iVar = (i) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.T |= 1;
            }
            return true;
        } else if (i10 == 1) {
            i iVar2 = (i) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.T |= 2;
            }
            return true;
        } else if (i10 == 2) {
            i iVar3 = (i) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.T |= 4;
            }
            return true;
        } else if (i10 != 3) {
            return false;
        } else {
            i iVar4 = (i) obj;
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.T |= 8;
            }
            return true;
        }
    }

    public final void v(f fVar) {
        this.J = fVar;
        synchronized (this) {
            this.T |= 16;
        }
        f(3);
        t();
    }

    public final void w(AuctionRoomViewModel auctionRoomViewModel) {
        this.I = auctionRoomViewModel;
        synchronized (this) {
            this.T |= 32;
        }
        f(4);
        t();
    }
}
