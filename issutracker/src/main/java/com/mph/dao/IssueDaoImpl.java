package com.mph.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Customer;
import com.mph.entity.Issue;

@Repository
public class IssueDaoImpl implements IssueDao{


	@Autowired
	private SessionFactory sessionFactory;
	

	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	
	@Override
	public List<Issue> getIssueList() {
		Query qry = getSession().createQuery("from Issue");
		List<Issue> issuelist = qry.list();
		return issuelist;
	}

	@Override
	public Issue getIssue(Issue issue) {
		Criteria c = getSession().createCriteria(Issue.class);
		c.add(Restrictions.eq("issue_name", issue.getIssue_name()));
		Issue iss = (Issue)c.uniqueResult();
		
		return iss;
	}

	@Override
	public void createIssue(Issue issue) {
		getSession().saveOrUpdate(issue);
		System.out.println("Issue Stored Successfully :)");
		
	}

	@Override
	public List<Issue> updateIssue(Issue issue) {
		Query qry = getSession().createQuery("update Issue set issue_name=:nam where issue_id=:eno");
		qry.setParameter("nam", issue.getIssue_name());
		
		qry.setParameter("eno", issue.getIssue_id());
		
		int noofrows = qry.executeUpdate();
		if(noofrows >0)
		{
			System.out.println("Update is successfull !!!");
		}
		return getIssueList();
	}

	@Override
	public List<Issue> deleteIssue(int issue_id) {
		Query qry = getSession().createQuery("delete Issue where issue_id=:eno");		
		qry.setParameter("eno", issue_id);		
		int noofrows = qry.executeUpdate();
		if(noofrows >0)
		{
			System.out.println("Deleted " +  issue_id + "successfully !!!");
		}
		return getIssueList();
	}

	@Override
	public Issue getIssueById(int issue_id) {
		Query query = getSession().createQuery("from Issue iss where issue_id=:eno");
		query.setParameter("eno", issue_id);
		Issue issuelist = (Issue)query.uniqueResult();
		System.out.println(issuelist);
		return issuelist; 
	}

	@Override
	public List<Issue> searchIssueById(int issue_id) {
		Query query = getSession().createQuery("from Issue iss where issue_id=:eno");
		query.setParameter("eno", issue_id);
		List<Issue> issuelist =query.list();
		System.out.println(issuelist);
		return issuelist; 
	}

}
