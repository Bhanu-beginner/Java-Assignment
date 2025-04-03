package com.budget.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.budget.demo.model.BudgetModel;
import com.budget.demo.service.BudgetService;

@RestController
public class BudgetController {
	
	@Autowired
	BudgetService service;
	
	@GetMapping("/getbudget")
	public List<BudgetModel> getAllBudget()
	{
		return service.getAllBudget();
	}
	
	@GetMapping("/budget/{id}")
	public BudgetModel getBudgetById(@PathVariable int id)
	{
		return service.getBudgetById(id);
	}
	
	@PostMapping("/budget/save")
	public List<BudgetModel> saveBudget(@RequestBody BudgetModel budget)
	{
		return service.saveBudget(budget);
		
	}
	
	
	@PutMapping("/budget/update/{id}")
	public List<BudgetModel> updateBudget(@PathVariable int id,@RequestBody BudgetModel budget)
	{
		return service.updateBudget(id, budget);
	}
	
	@DeleteMapping("/budget/delete/{id}")
	public List<BudgetModel> deleteBudgetById(@PathVariable int id)
	{
		return service.deleteBudgetById(id);
	}
}
