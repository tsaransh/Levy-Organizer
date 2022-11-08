package com.web.levyorganizer.services;

import antlr.collections.List;
import com.web.levyorganizer.entity.PersonalExpense;

public interface PersonalExpenseInterface {

    public void addExp(PersonalExpense personalExpense);

    public void deleteExp(long transactionNo);

    public List findAll(long userId);

}
