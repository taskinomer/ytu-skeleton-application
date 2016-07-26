package tr.edu.yildiz.dao.impl;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tr.edu.yildiz.dao.payment.bank.BankDao;
import tr.edu.yildiz.domain.payment.bank.Bank;
import tr.edu.yildiz.test.GenericTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class BankDaoImplTest extends GenericTest {

    @Autowired
    private BankDao bankDao;

    @Test
    public void banks(Integer X) throws Exception {

        // data olusturma
        Bank bank = new Bank();
//        bank.setInsertDate(LocalDateTime.now()
//                .minusDays(1)
//                .plusMinutes(4));
        bank.setInsertDate(new Date());
        bank.getName("garanti");

        // testini yazdığın methodu çağır
        List<Bank> banks = bankDao.banks(X);

        // assertion
//        Assert;
    }

}
