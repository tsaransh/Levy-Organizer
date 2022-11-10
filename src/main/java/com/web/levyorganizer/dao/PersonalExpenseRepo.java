package com.web.levyorganizer.dao;

import com.web.levyorganizer.entity.PersonalExpense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PersonalExpenseRepo extends JpaRepository<PersonalExpense, Long> {
    @Query(value="select sum(amount) from personal_expense where user_id=:id", nativeQuery = true)
    public Double calculateSum(@Param("id") long theUserId);
}
