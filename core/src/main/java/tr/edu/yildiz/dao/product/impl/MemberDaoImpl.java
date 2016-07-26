package tr.edu.yildiz.dao.product.impl;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import tr.edu.yildiz.dao.impl.BaseDaoImpl;
import tr.edu.yildiz.dao.product.MemberDao;
import tr.edu.yildiz.domain.product.Member;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class MemberDaoImpl extends BaseDaoImpl<Member> implements MemberDao {

    @Override
    public List<Member> findMembersByEmail(String email) {
        List<Member> members = getSessionFactory().getCurrentSession()
                .createCriteria(Member.class)
                .add(Restrictions.eq("email", email))
                .list();

        return members;
    }
}
