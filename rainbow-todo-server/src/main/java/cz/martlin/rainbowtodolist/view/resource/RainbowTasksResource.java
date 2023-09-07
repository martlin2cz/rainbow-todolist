package cz.martlin.rainbowtodolist.view.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cz.martlin.rainbowtodolist.controller.service.RainbowTasksService;
import cz.martlin.rainbowtodolist.model.model.RainbowTask;

/**
 * The web endpoint service resource for the {@link RainbowTask}.
 * 
 * @author martin.jasek
 *
 */
@RestController
@RequestMapping("api/v1/rainbowtodolist/tasks")
public class RainbowTasksResource {

	private final RainbowTasksService service;

	@Autowired
	public RainbowTasksResource(RainbowTasksService service) {
		super();
		
		this.service = service;
	}
	
	
	@RequestMapping( //
		method = RequestMethod.GET, //
		produces = MediaType.APPLICATION_JSON_VALUE) //
	public List<RainbowTask> list() {
		return service.list();
	}
	
	
	

//	@RequestMapping( //
//			method = RequestMethod.POST, //
//			produces = MediaType.APPLICATION_JSON_VALUE //
//			)
//	public TodolistItem create(@PathParam(value = "text") String text) {
//		TodolistItem item = new TodolistItem(text);
//		return service.create(item);
//	}
//
//	@RequestMapping( //
//			method = RequestMethod.GET, //
//			produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<TodolistItem> list() {
//		return service.list();
//	}
}
