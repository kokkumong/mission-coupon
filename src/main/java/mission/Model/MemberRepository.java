package mission.Model;

import mission.Model.Member;

import java.util.*;

public class MemberRepository {
    private final Map<String, List<Member>> membersBySuffix = new HashMap<>();

    public void save(Member member) {
        String suffix = member.getPhoneSuffix();

        membersBySuffix.putIfAbsent(suffix, new ArrayList<>());
        membersBySuffix.get(suffix).add(member);
    }

    public List<Member> findByPhoneSuffix(String suffix){
        return membersBySuffix.getOrDefault(suffix, new ArrayList<>());
    }

    public Optional<Member> findByPhoneSuffixAndName(String suffix, String name){
        List<Member> candidates = findByPhoneSuffix(suffix);
        for(Member m : candidates){
            if(m.getName().equals(name)){
                return Optional.of(m);
            }
        }
        return Optional.empty();
        }
    public boolean exists(String suffix, String name){
        return findByPhoneSuffixAndName(suffix, name).isPresent();
    }
}
