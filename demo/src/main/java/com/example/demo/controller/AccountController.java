package com.example.demo.controller;

import com.example.demo.model.Account;
import com.example.demo.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class AccountController {

    @Autowired
    IAccountService iAccountService;
    @RequestMapping(value = "/api/createAccount", method = RequestMethod.POST)
    public  Account createAccount(@RequestBody Account account){
        Account serviceAccount = iAccountService.createAccount(account);
        return account;
    }
}
