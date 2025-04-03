package com.budget.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.budget.demo.model.BudgetModel;


@Service
public class BudgetService {
	
	List<BudgetModel> list = new ArrayList<>();
	
	
	public List<BudgetModel> saveBudget(BudgetModel b)
	{
		list.add(b);
		return list;
	}
	
	public BudgetModel getBudgetById(int id)
	{
		
		for(BudgetModel b:list)
		{
			if(b.getId()==id) {
			return b;
			}
		}
		return null;
	}
	
	public List<BudgetModel> updateBudget(int id,BudgetModel budget)
	{
		for(BudgetModel b:list)
		{
			if(b.getId()==id)
			{
				b.setId(budget.getId());
				b.setCategory(budget.getCategory());
				b.setAmount(budget.getAmount());
				b.setMonth(budget.getMonth());
				
				return list;
			}
		}
		return list;
	}

	

	public List<BudgetModel> deleteBudgetById(int id) {
		for(BudgetModel b:list)
		{
			if(b.getId()==id)
			{
				list.remove(b);
				
				return list;
			}
		}
		return list;
	}

	public List<BudgetModel> getAllBudget() {
		
		return list;
	}

}
