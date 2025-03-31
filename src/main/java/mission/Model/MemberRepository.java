package mission.Model;

import mission.Model.Member;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private final Map<String, Member> members = new HashMap<>();

    public void register(String name, String phoneNumber){
        members.put(phoneNumber, new Member(name,phoneNumber));
    }

    public Member searchPhoneNumber(String lastNumber) throws Exception {
        return members.values().stream().filter(m->m.getPhoneNumber().endsWith(lastNumber)).findFirst().orElseThrow(()-> new MemberException(lastNumber + "  not found."));
    }

    private static class MemberException extends RuntimeException {
        public MemberException(String s) {
            super(s);
        }
    }
}
