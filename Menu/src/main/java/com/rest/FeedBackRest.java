package com.rest;

import com.model.Cordonner;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.FeedBack;
import com.service.FeedBackService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nagesh.Chauhan
 *
 */
@RestController
@RequestMapping("/rest/feedback")
public class FeedBackRest {

	@Autowired
	private FeedBackService FeedBackService;

	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<FeedBack> findAll() {
		return FeedBackService.allFeedBack();
	}
	
	@RequestMapping(value="/select/{id}", method=RequestMethod.GET)
	public FeedBack findFeedBack(@PathVariable("id") int id) {
		return FeedBackService.selectFeedBack(id);
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public void createFeedBack(FeedBack FeedBack) {
		 FeedBackService.insertFeedBack(FeedBack);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateContact(@PathVariable("id") int id, FeedBack FeedBack) {
		FeedBackService.updateFeedBack(FeedBack);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteContact(@PathVariable("id") int id) {
		FeedBackService.deleteFeedBack(id);
	}
}
