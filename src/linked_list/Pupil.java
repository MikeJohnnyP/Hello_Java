package linked_list;

public class Pupil {
    private String id;
    private String fullName;
    private double averageMark;

    public Pupil(String id, String fullName, double averageMark) {
        this.id = id;
        this.fullName = fullName;
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "\nID: " + id + "\nHo va ten: " + fullName + "\nDiem trung binh: " + averageMark + "\n";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

}
