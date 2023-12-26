package dicTreeMap;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Dictionary {
    TreeMap<String, ArrayList<String>> dic = new TreeMap<>();
    String url;

    public Dictionary(String url){
        this.url = url;
        this. dic = loadDic(url);
    }


    public TreeMap<String, ArrayList<String>> loadDic(String url){
        ArrayList<String> lines = FileUtils.readFile(url);
        TreeMap<String, ArrayList<String>> result = new TreeMap<>();
        for(String line : lines){
            StringTokenizer tokenizer = new StringTokenizer(line, "\t");
            ArrayList<String> meaning = new ArrayList<>();
            String word ="";
            int column = 0;
                while(tokenizer.hasMoreTokens()){
                   switch (column){
                       case 0:
                           word = tokenizer.nextToken();
                           break;
                       case 1:
                           StringTokenizer meaningTokens = new StringTokenizer(tokenizer.nextToken(), ";");
                           while(meaningTokens.hasMoreTokens()){
                               meaning.add(meaningTokens.nextToken());
                           }
                           break;
                   }

                column++;
            }
                result.put(word, meaning);
        }
                return result;
    }

    public void add(String word, ArrayList<String> meaning){
    }
    public static void main(String[] args) {
        Dictionary dic = new Dictionary("./src/dicTreeMap/Dictionary.txt");
        System.out.println(dic.dic.get("Run")) ;
    }
}
