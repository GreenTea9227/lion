import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class lionPractice {

    static Map<Integer, Saying> resultMap;

    public static void main(String[] args) throws IOException, DatabindException {

        boolean flag = false;
        resultMap = LionPracticeUtil.resultMap;

        File file1 = new File("C:\\Users\\joseph\\OneDrive\\바탕 화면\\velog\\practice.txt");
        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            flag = true;
        }

        int index = readAndIndex();
        Scanner sc = new Scanner(System.in);
        if (flag) {
            System.out.println("\n프로그램 다시 시작...\n");
        }
        System.out.println("== 명언 앱 ==");

        while (true) {

            System.out.print("명령) ");
            String next = sc.nextLine().trim();
            if (next.equals("종료")) {
                saveFile(sc);
                break;
            } else if (next.equals("등록")) {
                System.out.print("명언: ");
                String m1 = sc.nextLine();

                System.out.print("작가: ");
                String m2 = sc.nextLine();
                resultMap.put(index, new Saying(index, m1, m2));
                System.out.printf("%d번 명언이 등록되었습니다.\n", index++);
            } else if (next.equals("목록")) {
                showList();
            } else if (next.startsWith("삭제?")) {
                remove(next);
            } else if (next.startsWith("수정?")) {
                update(sc, next);
            } else if (next.equals("빌드")) {
                build();
            }
        }
    }

    private static void update(Scanner sc, String next) {
        int num = next.indexOf("=");
        int substring = Integer.parseInt(next.substring(num + 1));

        try {
            Saying saying = resultMap.get(substring);
            System.out.println("명언(기존) : " + saying.say);
            System.out.print("명언 : ");
            String next1 = sc.nextLine();

            System.out.println("작가(기존) : " + saying.author);
            System.out.print("작가 : ");
            String next2 = sc.nextLine();

            resultMap.replace(substring, new Saying(substring, next1, next2));
        } catch (Exception e) {
            System.out.println(substring + " 번 명언은 존재하지 않습니다.");
        }
    }

    private static void build() throws IOException {
        System.out.println("data.json 파일의 내용이 갱신되었습니다.");
        BufferedWriter file = new BufferedWriter(new FileWriter("C:\\Users\\joseph\\OneDrive\\바탕 화면\\velog\\data.json"));
        JsonFactory jsonFactory = new JsonFactory();
        jsonFactory.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, false);
        ObjectMapper mapper = new ObjectMapper(jsonFactory);
        ArrayList<Saying> list = new ArrayList<>();

        for (int num : resultMap.keySet()) {
            Saying saying = resultMap.get(num);
            list.add(saying);
        }
        String s1 = mapper.writeValueAsString(list);
        file.write(s1);
        file.flush();
        file.close();
    }

    private static void remove(String next) {
        int num = next.indexOf("=");

        int substring = Integer.parseInt(next.substring(num + 1));
        if (resultMap.containsKey(substring)) {
            resultMap.remove(substring);
            System.out.println(substring + " 번 명언이 삭제 되었습니다.");
        } else {

            System.out.println(substring + " 번 명언은 존재하지 않습니다.");
        }
    }

    private static void showList() {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("----------------------");
        for (Saying value : resultMap.values()) {
            System.out.println(value);
        }
    }

    private static void saveFile(Scanner sc) throws IOException {
        BufferedWriter file = new BufferedWriter(new FileWriter("C:\\Users\\joseph\\OneDrive\\바탕 화면\\velog\\practice.txt"));

        for (Integer integer : resultMap.keySet()) {
            file.write(resultMap.get(integer) + "\n");
        }
        file.flush();
        file.close();
        sc.close();
    }

    private static int readAndIndex() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\joseph\\OneDrive\\바탕 화면\\velog\\practice.txt"));
        String s;
        int index = 1;
        while ((s = reader.readLine()) != null) {

            String s1 = s.replaceAll(" ", "");
            String[] split = s1.split("/", -1);
            int number = Integer.parseInt(split[0]);
            String author = split[1];
            String saying = split[2];
            resultMap.put(number, new Saying(number, author, saying));
            index = Math.max(index, number);
        }
        reader.close();
        return index;
    }

    static class Saying {
        private Integer id;
        private String author;
        private String say;

        public Saying() {
        }

        public Saying(Integer id, String say, String author) {
            this.id = id;
            this.author = author;
            this.say = say;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getSay() {
            return say;
        }

        public void setSay(String say) {
            this.say = say;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(id).append(" / ").append(author).append(" / ").append(say);
            return sb.toString();
        }
    }
}
