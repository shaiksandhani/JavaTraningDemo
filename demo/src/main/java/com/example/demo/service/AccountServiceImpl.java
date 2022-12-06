package com.example.demo.service;

import com.example.demo.model.Account;
import com.example.demo.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AccountServiceImpl implements  IAccountService{

    @Autowired
    IAccountRepository iAccountRepository;
    @Override
    public Account createAccount(Account account) {
        Account save = iAccountRepository.save(account);
        Map<String,Account> stringAccountMap= new HashMap<>();
        for(Map.Entry<String,Account> entry : stringAccountMap.entrySet()){
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }
        return save;
    }
}
