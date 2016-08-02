package tr.edu.yildiz.dao.impl;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tr.edu.yildiz.dao.payment.Impl.BankDaoImpl;
import tr.edu.yildiz.dao.payment.bank.BankDao;
import tr.edu.yildiz.domain.payment.bank.Bank;
import tr.edu.yildiz.test.GenericTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class BankDaoImplIntgTest extends GenericTest {

    @Autowired
    private BankDao bankDao;

    @Test
    public void updateBankByBankId() throws Exception{

        Bank bank = new Bank();
        bank.setName("İşBankası");

        bankDao.save(bank);
        //data olustur

        List<Bank> bankByBankId = bankDao.updateBankByBankId(bank.getBankId(),bank.getName());

        //metot cagir


        //test assertion
            //newName i gecerken degistirdi mi
            //newName bos mu

        Assert.assertNotNull(bankByBankId);
        Assert.assertTrue(bankByBankId.size() == 1);
        Assert.assertEquals(bankByBankId.get(0).getName(), bank.getName());


            //updateDate bos mu

        Assert.assertNotNull(bank.getUpdateDate());

    }
}
