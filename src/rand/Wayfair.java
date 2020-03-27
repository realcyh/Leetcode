package rand;

import java.util.*;

class Wayfair {

    class WareHouse {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Queue<Integer>> map2 = new HashMap<>();

        public int add_product(int id) {
            map.put(id, map.getOrDefault(id, 0)+1);
            return map.get(id);
        }

        public Boolean remove_product(int[] ids) {
            for (int i=0; i<ids.length; i++) {
                int cnt = map.get(ids[i]) - 1;
                if (cnt < 0) {
                    return false;
                } else {
                    map.put(ids[i], cnt);
                }
            }
            return true;
        }

        public Boolean inverse_remove_product(int[] ids) {
            for (int i=0; i<ids.length; i++) {
                if (map.get(ids[i]) == null) return false;
                map.put(ids[i], map.get(ids[i]+1));
            }
            return true;
        }

        public Boolean ship_order(int[] ids) {
            for (int i=0; i<ids.length; i++) {
                if (!map.containsKey(ids[i]) || map.get(ids[i]) == 0) {
                    // undo
                    for (int j=0; j<i; j++) {
                        map.put(ids[j], map.get(ids[j])+1);
                    }
                    return false;
                } else {
                    map.put(ids[i], map.get(ids[i])-1);
                }
            }
            return true;
        }

        public Boolean fifo(int id, int unique) {
            if (map2.containsKey(id)) {
                map2.get(id).add(unique);
            } else {
                map2.put(id, new LinkedList<>());
                map2.get(id).add(unique);
            }
            return true;
        }

        public Boolean liquidate_product(int[] ids) {
            Set<Integer> set = new HashSet<>();
            for (int i=0; i<ids.length; i++) {
                set.add(ids[i]);
            }

            for (Integer id: set) {
                if (map.containsKey(id)) continue;
                else return false;
            }

            for (Integer id: set) {
                map.put(id, 0);
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Wayfair wayfair = new Wayfair();
        WareHouse w = wayfair.new WareHouse();
        System.out.println("test");

        w.add_product(1);
        w.add_product(1);
        w.add_product(2);
        int[] ids = {1,2,1,1};
        System.out.println(w.ship_order(ids));
        System.out.println(w.map.get(1));
        System.out.println(w.map);

        w.fifo(1,11);
        w.fifo(1,12);
        w.fifo(1,13);
        System.out.println(w.map2.get(1).poll());
        System.out.println(w.map2);
    }
}
