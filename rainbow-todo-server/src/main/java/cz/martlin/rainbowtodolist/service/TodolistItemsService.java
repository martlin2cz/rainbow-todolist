package cz.martlin.rainbowtodolist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cz.martlin.rainbowtodolist.dao.TodolistItemsDAO;
import cz.martlin.rainbowtodolist.model.TodolistItem;

/**
 * The service for the {@link TodolistItem}s manipulation.
 * 
 * @author martin.jasek
 *
 */
@Service
public class TodolistItemsService {

	private final TodolistItemsDAO dao;

	@Autowired
	public TodolistItemsService( //
			TodolistItemsDAO dao) {

		super();
		this.dao = dao;
	}
	
	
	public TodolistItem create(TodolistItem item) {
		return dao.create(item);
	}
	
	public List<TodolistItem> list() {
		return dao.list();
	}

}
