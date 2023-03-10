import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.*;

public class lionPractice {

    static Map<Integer, Saying> resultMap;

    public static void main(String[] args) throws IOException, DatabindException {

        boolean flag = false;
        resultMap = LionPracticeUtil.resultMap;

        int index = LionPracticeUtil.readAndIndex();
        Scanner sc = new Scanner(System.in);
        LionPracticeUtil.isWritten(flag);

        while (true) {

            System.out.print("명령) ");
            String next = sc.nextLine().trim();
            if (next.equals("종료")) {
                LionPracticeUtil.saveFile(sc);
                break;
            } else if (next.equals("등록")) {
                index = LionPracticeUtil.saveSaying(index, sc);
            } else if (next.equals("목록")) {
                LionPracticeUtil.showList();
            } else if (next.startsWith("삭제?")) {
                LionPracticeUtil.remove(next);
            } else if (next.startsWith("수정?")) {
                LionPracticeUtil.update(sc, next);
            } else if (next.equals("빌드")) {
                LionPracticeUtil.build();
            }
        }
    }
}

