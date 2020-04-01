package rand;

import java.math.RoundingMode;
import java.util.*;
import java.math.BigDecimal;

class Wayfair2 {
    class AD {
        Map<String, Double> map = new HashMap<>();
        private Map<String, Map<String, Double>> map2 = new HashMap<>();

        double caculate_way_bid(double para1, double para2) {
            double waybid = 0.123*para1 + 0.877*para2;
            //(si she wu ru) round towards "nearest neighbor" unless both neighbors are equidistant, in which case round up.
//            BigDecimal bg = new BigDecimal(waybid);
//            waybid = bg.setScale(2, RoundingMode.HALF_UP).doubleValue();
            return waybid;
        }

        void store_waybid_of_customer(String id, double waybid) {
//            double waybid = caculate_way_bid(2, 3);

            map.put(id, waybid);
        }

        double waybid_of_customer(String id) {
            if (map.containsKey(id)) {
                return map.get(id);
            } else {
                return -1;
            }
        }

        void store_waybid_of_customer_platform(String id, String platform, double waybid) {
            if (map2.containsKey(id)) {
                Map<String, Double> temp = map2.get(id);
                temp.put(platform, waybid);
                map2.put(id, temp);
            } else {
                Map<String, Double> temp = new HashMap<>();
                temp.put(platform, waybid);
                map2.put(id, temp);
            }
        }

        Map<String, Double> waybid_of_customer_platform(String id) {
            if (map2.containsKey(id)) {
                return map2.get(id);
            } else {
                return null;
            }
        }

        double waybid_of_customer_platform2(String id, String platform) {
            if (!map2.containsKey(id) || !map2.get(id).containsKey(platform)) {
                return -1;
            } else {
                return map2.get(id).get(platform);
            }
        }

        // what if the map is not large enough?
        /*

         */

    }

    public static void main(String[] args) {
        Wayfair2 w = new Wayfair2();
        AD a = w.new AD();

        double waybid = a.caculate_way_bid(2, 3);
        double waybid2 = a.caculate_way_bid(3, 4);
        String id = "1234";
        String pf = "google";
        String pf2 = "facebook";
        a.store_waybid_of_customer(id, waybid);
        a.store_waybid_of_customer_platform(id, pf, waybid);
        a.store_waybid_of_customer_platform(id, pf2, waybid2);

        double waybid3 = a.caculate_way_bid(4, 5);
        double waybid4 = a.caculate_way_bid(5, 6);
        String id2 = "2345";
        String pf3 = "chumhum";
        String pf4 = "baidu";
        a.store_waybid_of_customer(id2, waybid2);
        a.store_waybid_of_customer_platform(id2, pf3, waybid3);
        a.store_waybid_of_customer_platform(id2, pf4, waybid4);

        double res = a.waybid_of_customer_platform2(id, pf);

        System.out.println(res);
        System.out.println(a.map);
        System.out.println(a.map2);


    }
}
