package com.ghost.f.service.impl;

import com.ghost.f.repository.AccountRepository;
import com.ghost.f.entity.AccountEntity;
import com.ghost.f.service.AccountService;
import com.ghost.f.vo.AccountVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void saveAccount(AccountVO accountVO) {
        AccountEntity account=new AccountEntity();
        account.setStudentId(accountVO.getStudentId());
        account.setPaymentMethod(accountVO.getPaymentMethod());
        account.setMonthlyKnots(accountVO.isMonthlyKnots());
        account.setMoney(accountVO.getMoney());
        try {
            if (null!=accountVO.getDate()&&!"".equals(accountVO.getDate())){
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = simpleDateFormat.parse(accountVO.getDate());
                account.setDate(date);
                SimpleDateFormat simpleTimeFormat = new SimpleDateFormat("HH:mm");
                Date time = simpleTimeFormat.parse(accountVO.getTime());
                account.setTime(time);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        accountRepository.save(account);
    }
}
