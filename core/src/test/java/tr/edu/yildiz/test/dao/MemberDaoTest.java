package tr.edu.yildiz.test.dao;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tr.edu.yildiz.dao.MemberDao;
import tr.edu.yildiz.domain.Member;
import tr.edu.yildiz.test.GenericTest;

import java.util.List;

public class MemberDaoTest extends GenericTest {

    @Autowired
    private MemberDao memberDao;

    @Test
    public void shouldFindAllMembers() {
        List<Member> members = memberDao.findAll();
        Assert.assertNotNull(members);
    }

    @Test
    public void shouldFindMemberByEmail() {
        String email = "email";
        memberDao.saveOrUpdate(populateDummyMemberByEmail(email));
        List<Member> members= memberDao
                .findMembersByEmail(email);

        Assert.assertTrue(members.size() > 0);
        Assert.assertEquals(members.size(), 1);
    }

    @Test
    public void shouldSaveMember() {
        memberDao.saveOrUpdate(populateDummyMemberByEmail(""));

        List<Member> members = memberDao.findAll();
        Assert.assertTrue(members.size() > 0);
    }


    private Member populateDummyMemberByEmail(String email) {
        Member member = new Member();

        member.setName("dummy");
        member.setSurname("user");
        member.setEmail(email);

        return member;
    }

}
