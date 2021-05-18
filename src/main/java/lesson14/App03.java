package lesson14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App03 {
    public static void main(String[] args) {

        Map<Map<String, String>, Map<String, String>> map = new HashMap<>();

        Map<User, Map<Session, List<String>>> userMapMap = new HashMap<>();

        List<String> tokens1 = Arrays.asList("token11", "token12");
        List<String> tokens2 = Arrays.asList("token21", "token22");

        Session session1 = new Session("session1");
        Session session2 = new Session("session2");

        Map<Session, List<String>> sessionTokensMap = new HashMap<>();
        sessionTokensMap.put(session1, tokens1);
        sessionTokensMap.put(session2, tokens2);

        User user1 = new User("user1");
        User user2 = new User("user2");

        userMapMap.put(user1, sessionTokensMap);

        System.out.println(userMapMap);

        Map<Session, List<String>> sessionListMap = userMapMap.get(user1);
        List<String> stringList = sessionListMap.get(session1);

        System.out.println(stringList);


//        Map<Session, List<String>> sessionTokensMap = userMapMap.get(new User());
//        List<String> tokens = sessionTokensMap.get(new Session());
    }

}

class Session {
    private String sessionId;

    public Session(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionId() {
        return sessionId;
    }
}

class User {


    public User(String userId) {
        this.userId = userId;
    }

    private String userId;
    private List<String> tokens;

    public String getUserId() {
        return userId;
    }

    public List<String> getTokens() {
        return tokens;
    }
}