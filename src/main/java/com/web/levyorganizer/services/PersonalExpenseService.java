package com.web.levyorganizer.services;

import antlr.collections.List;
import com.web.levyorganizer.dao.PersonalExpenseRepo;
import com.web.levyorganizer.entity.PersonalExpense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonalExpenseService implements PersonalExpenseInterface{

    @Autowired
    PersonalExpenseRepo personalExpenseRepo;

    @Override
    public void addExp(PersonalExpense personalExpense) {
        personalExpenseRepo.save(personalExpense);
    }

    @Override
    public void deleteExp(long transactionNo) {

    }

    @Override
    public List findAll(long userId) {
        return null;
    }

    @Override
    public Double totalExp(long userId) {
        return personalExpenseRepo.calculateSum(userId);
    }
}
