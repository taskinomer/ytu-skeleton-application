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

public class BankDaoImplTest extends GenericTest {

    @Autowired
    private BankDao bankDao;

    @Test
    public void updateBankByBankId(Integer bankId,String newName) throws Exception{

        Bank bank = new Bank();
        bank.setName("İşBankası");

        bankDao.saveOrUpdate(bank);
        //data olustur

        List<Bank> bankByBankId = bankDao.updateBankByBankId(bankId,newName);

        //metot cagir
        //test assertion
            //newName i gecerken degistirdi mi
            //newName bos mu
            //updateDate bos mu
            //

    }
}
