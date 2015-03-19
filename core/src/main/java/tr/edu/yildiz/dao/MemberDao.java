package tr.edu.yildiz.dao;

import tr.edu.yildiz.domain.Member;

import java.util.List;

public interface MemberDao extends BaseDao<Member> {

    public List<Member> findMembersByEmail(String email);

}
