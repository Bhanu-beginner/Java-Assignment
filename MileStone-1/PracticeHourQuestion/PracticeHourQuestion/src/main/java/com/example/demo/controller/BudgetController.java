package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BudgetModel;

@RestController
public class BudgetController {
	
    List<BudgetModel> list = new ArrayList<>();
	
	@GetMapping("/budget/{id}")
	public BudgetModel getBudgetById(@PathVariable int id)
	{
		for(BudgetModel b:list)
		{
			if(b.getUserId()==id) {
			return b;
			}
		}
		return null;
	}
	
	@PostMapping("/budget")
	public List<BudgetModel> saveBudget(@RequestBody BudgetModel budget)
	{
		
		list.add(budget);
		
		return list;
		
	}
	
	
	@PutMapping("/budget/{id}")
	public List<BudgetModel> updateBudget(@PathVariable int id,@RequestBody BudgetModel budget)
	{
		for(BudgetModel b:list)
		{
			if(b.getUserId()==id)
			{
				b.setUserId(budget.getUserId());
				b.setCategory(budget.getCategory());
				b.setAmount(budget.getAmount());
				b.setMonths(budget.getMonths());
				
				return list;
			}
		}
		return list;
	}
}

