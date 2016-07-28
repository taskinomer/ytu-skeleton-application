package tr.edu.yildiz.mapper.bank;

import tr.edu.yildiz.domain.dto.bank.BankDto;
import tr.edu.yildiz.domain.payment.bank.Bank;

import java.util.ArrayList;
import java.util.List;

public class BankToBankDto {

    public static BankDto map(Bank bank) {
        BankDto dto = new BankDto();

        dto.setId(bank.getBankId());
        dto.setName(bank.getName());

        return dto;
    }

    public static List<BankDto> map(List<Bank> banks) {
        List<BankDto> bankDtos = new ArrayList<>();

        for (Bank bank : banks) {
            bankDtos.add(map(bank));
        }

        return bankDtos;
    }
}
