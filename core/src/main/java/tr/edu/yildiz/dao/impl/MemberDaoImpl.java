package tr.edu.yildiz.dao.impl;

import org.springframework.stereotype.Repository;
import tr.edu.yildiz.dao.MemberDao;
import tr.edu.yildiz.domain.Member;

import javax.transaction.Transactional;

@Repository
@Transactional
public class MemberDaoImpl extends BaseDaoImpl<Member> implements MemberDao {
}
