package linked_list;

import java.util.LinkedList;

public class Class {
    private LinkedList<Pupil> list;

    public LinkedList<Pupil> get() {
        if (list == null)
            return list = new LinkedList<Pupil>();
        else
            return list;
    }

    public void addPupil(Pupil pupil) {
        if (get().isEmpty())
            get().add(pupil);
        else {
            if (pupil.getAverageMark() >= get().getFirst().getAverageMark()) {
                get().addFirst(pupil);
            } else if (pupil.getAverageMark() <= get().getLast().getAverageMark()) {
                get().addLast(pupil);
            }

            else {
                for (int index = 1; index <= get().size() - 1; index++) {
                    if (pupil.getAverageMark() >= get().get(index).getAverageMark()) {
                        get().add(index, pupil);
                        break;
                    }
                }
            }
        }
    }

    public void getTopPupils(int numbersOfTop) {
        if (numbersOfTop >= 0 && numbersOfTop <= get().size()) {
            for (int i = 0; i < numbersOfTop; i++) {
                System.out.println(get().get(i));
            }
        } else
            throw new IllegalArgumentException("Out of list");
    }

    public void getBottomPupils(int numbersOfBottom) {
        if (numbersOfBottom >= 0 && numbersOfBottom <= get().size()) {
            for (int i = get().size() - numbersOfBottom; i < get().size(); i++) {
                System.out.println(get().get(i));

            }
        } else
            throw new IllegalArgumentException("Out of list");
    }

    public void findingAverage(String name) {
        Pupil temp = null;
        for (int i = 0; i < get().size(); i++) {
            if (name.equalsIgnoreCase(get().get(i).getFullName())) {
                System.out.println("Ho va ten: " + get().get(i).getFullName() + "\nDiem Trung Binh: "
                        + get().get(i).getAverageMark());
                temp = get().get(i);
                break;
            }
        }
        if (temp == null)
            System.out.println("Khong co trong danh sach");
    }

    public double averageMarkOfAll() {
        double result = 0;
        int step = 0;
        for (int i = 0; i < get().size(); i++) {
            result += get().get(i).getAverageMark();
            step++;
        }
        return result / step;
    }

    public void remove(double averageMarkOfAll) {
        for (int i = 0; i < get().size(); i++) {
            if (get().get(i).getAverageMark() < averageMarkOfAll) {
                get().remove(i);
                i = 0;
            }
        }
    }

    @Override
    public String toString() {
        return "" + list + "";
    }

}
