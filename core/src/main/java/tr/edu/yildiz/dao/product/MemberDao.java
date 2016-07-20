package tr.edu.yildiz.dao.product;

import tr.edu.yildiz.dao.BaseDao;
import tr.edu.yildiz.domain.product.Member;

import java.util.List;

public interface MemberDao extends BaseDao<Member> {

    public List<Member> findMembersByEmail(String email);

}
