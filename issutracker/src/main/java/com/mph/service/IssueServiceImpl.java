package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.CustomerDao;
import com.mph.dao.IssueDao;
import com.mph.entity.Issue;

@Service
@Transactional
public class IssueServiceImpl implements IssueService{

	@Autowired
	IssueDao issueDao;
	
	@Override
	public List<Issue> getIssueList() {
		// TODO Auto-generated method stub
		return issueDao.getIssueList();
	}

	@Override
	public Issue getIssue(Issue issue) {
		// TODO Auto-generated method stub
		return issueDao.getIssue(issue);
	}

	@Override
	public void createIssue(Issue issue) {
		 issueDao.createIssue( issue);
		
	}

	@Override
	public List<Issue> updateIssue(Issue issue) {
		// TODO Auto-generated method stub
		return issueDao.updateIssue(issue);
	}

	@Override
	public List<Issue> deleteIssue(int issue_id) {
		
		return issueDao.deleteIssue( issue_id);
	}

	@Override
	public Issue getIssueById(int issue_id) {
		// TODO Auto-generated method stub
		return issueDao.getIssueById(issue_id);
	}

	@Override
	public List<Issue> searchIssueById(int issue_id) {
		// TODO Auto-generated method stub
		return issueDao.searchIssueById(issue_id);
	}

}
