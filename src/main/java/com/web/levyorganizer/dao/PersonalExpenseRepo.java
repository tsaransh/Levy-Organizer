package com.web.levyorganizer.dao;

import com.web.levyorganizer.entity.PersonalExpense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalExpenseRepo extends JpaRepository<PersonalExpense, Long> {
}
