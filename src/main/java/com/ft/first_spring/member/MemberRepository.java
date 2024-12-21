package com.ft.first_spring.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long id);


}
