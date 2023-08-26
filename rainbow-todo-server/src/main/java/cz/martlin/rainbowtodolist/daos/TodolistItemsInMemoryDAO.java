package cz.martlin.rainbowtodolist.daos;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import cz.martlin.rainbowtodolist.dao.TodolistItemsDAO;
import cz.martlin.rainbowtodolist.model.TodolistItem;

/**
 * The in-memory implementation of the Todlist items DAO.
 * 
 * @author martin.jasek
 *
 */
public class TodolistItemsInMemoryDAO implements TodolistItemsDAO {

	private final List<TodolistItem> items = new LinkedList<>();

	@Override
	public TodolistItem create(TodolistItem item) {
		items.add(item);
		return item;
	}

	@Override
	public List<TodolistItem> list() {
		return Collections.unmodifiableList(items);
	}

	@Override
	public String toString() {
		return "TodoListItemsInMemoryDAO [items=" + items + "]";
	}

}
