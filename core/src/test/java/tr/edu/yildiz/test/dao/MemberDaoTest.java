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
        List<Member> members= memberDao
                .findMembersByEmail("otaskin@ebay.com");

        Assert.assertTrue(members.size() > 0);
        Assert.assertEquals(members.size(), 1);
    }

    @Test
    public void shouldSaveMember() {
        memberDao.saveOrUpdate(populateDummyMember());

        List<Member> members = memberDao.findAll();
        Assert.assertTrue(members.size() == 0);
    }


    private Member populateDummyMember() {
        Member member = new Member();

        member.setName("dummy");
        member.setSurname("user");

        return member;
    }

}
