package com.ft.first_spring.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> memberMap = new HashMap<>();

    @Override
    public void save(Member member) {
        memberMap.put(member.getId(), member);
    }

    @Override
    public Member findById(Long id) {
        return memberMap.get(id);
    }
}
