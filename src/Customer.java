public class Customer {
    private int soThuTu;
    private String fullName;
    private int score;
    private String superMarketID;

    public Customer(int soThuTu, String fullName, int score, String superMarketID) {
        this.soThuTu = soThuTu;
        this.fullName = fullName;
        this.score = score;
        this.superMarketID = superMarketID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getSuperMarketID() {
        return superMarketID;
    }

    public void setSuperMarketID(String superMarketID) {
        this.superMarketID = superMarketID;
    }

    public int getSoThuTu() {
        return soThuTu;
    }

    public void setSoThuTu(int soThuTu) {
        this.soThuTu = soThuTu;
    }

    @Override
    public String toString() {
        return "STT: " + soThuTu + "\nTen khach Hang: " + fullName + "\nMa sieu thi: " + superMarketID + "\nDiem: "
                + score + "\n";
    }

}
