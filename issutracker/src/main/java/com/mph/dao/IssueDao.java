package com.mph.dao;

import java.util.List;

import com.mph.entity.Customer;
import com.mph.entity.Issue;

public interface IssueDao {

	public List<Issue> getIssueList();
	public Issue getIssue(Issue issue);
	public void createIssue(Issue issue);
	public List<Issue>updateIssue(Issue issue);
	public List<Issue>deleteIssue(int issue_id);
	
	public Issue getIssueById(int issue_id);
	public List<Issue> searchIssueById(int issue_id);
	
}
