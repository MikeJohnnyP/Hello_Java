package hanhTinh;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.Random;

public class ListIterHanhTinh {
    private static ListIterator<HanhTinh> li;
    private int size = 0;

    public ListIterHanhTinh(HanhTinh[] arr) {
        this.li = Arrays.asList(arr).listIterator();
        this.size = arr.length;
    }

    public String toString() {
        refresh();
        String result = "";
        while (li.hasNext()) {
            result += li.next() + "\n";
        }
        return result;
    }

    public static void refresh() {
        while (li.hasPrevious())
            li.previous();

    }

    public boolean isContainingEngLishName(String engName) {
        refresh();
        while (li.hasNext()) {
            if (li.next().getTenTA().equalsIgnoreCase(engName))
                return true;
        }
        return false;
    }

    public String getInfoByEnglishName(String name) {
        refresh();
        String result = "";
        while (li.hasNext()) {
            HanhTinh ht = li.next();
            if (ht.getTenTA().equalsIgnoreCase(name)) {
                result = "tenTV=" + ht.getTenTV() + ", tenTA=" + ht.getTenTA() + ", chuKy=" + ht.getChuKy()
                        + ", dienTich=" + ht.getDienTich()
                        + ", khoiLuong=" + ht.getKhoiLuong();
            }
        }
        return result;
    }

    public HanhTinh getRandomPlanet() {
        refresh();
        Random r = new Random();
        int randomNum = r.nextInt(size);
        int step = 0;
        while (step < randomNum) {
            if (li.hasNext())
                li.next();
            step++;
        }
        return li.next();
    }

    public HanhTinh getPlanet_MaxChuky() {
        refresh();
        double maxCk = 0.0;
        HanhTinh com = null;
        HanhTinh result = null;
        while (li.hasNext()) {
            com = li.next();
            double newCK = com.getChuKy();
            if (maxCk < newCK) {
                maxCk = newCK;
                result = com;
            }
        }
        return result;

    }

}
