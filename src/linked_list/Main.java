package linked_list;

public class Main {
    public static void main(String[] args) {
        Pupil st1 = new Pupil("324543", "LAM HONG PHUC", 9.6);
        Pupil st2 = new Pupil("567487", "DANG ANH NGUYEN", 7.8);
        Pupil st3 = new Pupil("563673", "LAI NHAN NGHIA", 8.4);
        Pupil st4 = new Pupil("326783", "DUONG QA", 4.3);
        Pupil st5 = new Pupil("675435", "CO CO", 5.0);
        Pupil st6 = new Pupil("785447", "TA NHAT TRIET", 8.8);
        Pupil st7 = new Pupil("784564", "SU HOA LONG", 6.7);
        Pupil st8 = new Pupil("124644", "HOANG DUNG", 8.0);

        Class a12B3 = new Class();
        a12B3.addPupil(st3);   
        a12B3.addPupil(st1);
        a12B3.addPupil(st5);
        a12B3.addPupil(st2); 
        a12B3.addPupil(st4);
        a12B3.addPupil(st6);
        a12B3.addPupil(st7);    
        a12B3.addPupil(st8);

        //System.out.println(a12B3);
        //a12B3.getTopPupils(3);
        //a12B3.getBottomPupils(3);
        // a12B3.findingAverage("Lam Hong Phuc");
        // a12B3.findingAverage("Hoang Dung");
        // a12B3.findingAverage("Vu Trong Phung");
        //System.out.println(a12B3.averageMarkOfAll());
        a12B3.remove(a12B3.averageMarkOfAll());
        System.out.println(a12B3);





    }
    
}
