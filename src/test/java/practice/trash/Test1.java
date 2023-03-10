package practice.trash;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Test1 {

    @Test
    void test1() {
        String[] red = new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo",
                "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        new Solution().solution(red);
    }
}

class Solution {
    public String[] solution(String[] record) {

        String[] answer = new String[record.length];
        User[] userArr = new User[record.length];

        for (int i = 0; i < record.length; i++) {
            String[] cur = record[i].split(" ");
            if (cur[0].equals("Leave")) {
                userArr[i] = new User(cur[0], cur[1], "Leave");
                continue;
            }
            userArr[i] = new User(cur[0], cur[1], cur[2]);
        }

        for (int i = record.length - 1; i > 0; i--) {
            User user = userArr[i];
            if (user.status.equals("Change")) {
                for (int j = i - 1; j > 0; j--) {
                    if (userArr[j].uid.equals(user.uid))
                        userArr[j].name = user.name;
                }
            }
        }

        return Arrays.stream(userArr).filter(u -> !u.status.equals("Change")).peek(u -> System.out.println(u.name)).map(u -> {
            if (u.status.equals("Enter")) {
                return u.name + "님이 들어왔습니다.";
            } else {
                return u.name + "님이 나갔습니다.";
            }
        }).peek(u -> System.out.println(u)).toArray(String[]::new);
    }
}

class User {
    String status;
    String name;
    String uid;

    public User(String status, String uid, String name) {
        this.status = status;
        this.uid = uid;
        this.name = name;
    }
}

//tdd는 무조건 빠르게 통과

