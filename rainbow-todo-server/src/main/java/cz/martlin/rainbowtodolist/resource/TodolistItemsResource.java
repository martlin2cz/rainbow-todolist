package cz.martlin.rainbowtodolist.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cz.martlin.rainbowtodolist.model.TodolistItem;
import cz.martlin.rainbowtodolist.service.TodolistItemsService;
import jakarta.websocket.server.PathParam;

/**
 * The web endpoint service resource for the {@link TodolistItem}s.
 * 
 * @author martin.jasek
 *
 */
@RestController
@RequestMapping("api/v1/todolist/items")
public class TodolistItemsResource {

	private final TodolistItemsService service;

	@Autowired
	public TodolistItemsResource(TodolistItemsService service) {
		super();
		this.service = service;
	}

	@RequestMapping( //
			method = RequestMethod.POST, //
			produces = MediaType.APPLICATION_JSON_VALUE //
			)
	public TodolistItem create(@PathParam(value = "text") String text) {
		TodolistItem item = new TodolistItem(text);
		return service.create(item);
	}

	@RequestMapping( //
			method = RequestMethod.GET, //
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<TodolistItem> list() {
		return service.list();
	}
}
