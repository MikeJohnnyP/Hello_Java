import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.StringTokenizer;

public class Award {
    private ArrayList<Customer> list = new ArrayList<Customer>();
    private String url;

    public Award(String url) {
        this.url = url;
        this.list = loadList(url);
    }

    private ArrayList<Customer> loadList(String url) {
        ArrayList<Customer> result = new ArrayList<Customer>();
        ArrayList<String> lines = FileUtils.readFile(url);
        for (String line : lines) {
            StringTokenizer tokens = new StringTokenizer(line, "\t");
            String fullName = "";
            int soThuTu = 0;
            int score = 0;
            String superMarketID = "";
            int colunm = 0;
            while (tokens.hasMoreTokens()) {
                switch (colunm) {
                    case 1:
                        soThuTu = Integer.parseInt(tokens.nextToken());
                        break;
                    case 2:
                        fullName = tokens.nextToken();
                        break;
                    case 3:
                        score = Integer.parseInt(tokens.nextToken());
                        break;
                    case 4:
                        superMarketID = tokens.nextToken();
                        break;

                }
                colunm++;
            }
            Customer cus = new Customer(soThuTu, fullName, score, superMarketID);
            result.add(cus);

        }
        return result;
    }

    public static Customer getRandomCustomer(ArrayList<Customer> li) {
        int random = new Random().nextInt(li.size());
        return li.get(random);
    }

    public void reverse() {
        Collections.reverse(list);
    }
    
    public ArrayList<Customer> getList() {
        return list;
    }

    public void setList(ArrayList<Customer> list) {
        this.list = list;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
     @Override
    public String toString() {
        return "" + list + "";
    }
    public static void main(String[] args) {
        Award award = new Award("./src/Text.txt");
        System.out.println("DANH SACH KHANH HANG\n" + award.getList());
        award.reverse();
        System.out.println("CHUC MUNG KHACH HANG:\n" + getRandomCustomer(award.getList()) + "DA TRUNG GIAI DAC BIET!!!");
    }
}
