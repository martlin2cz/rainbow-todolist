package cz.martlin.rainbowtodolist.daos;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import cz.martlin.rainbowtodolist.dao.TodolistItemsDAO;
import cz.martlin.rainbowtodolist.model.TodolistItem;

/**
 * The in-memory implementation of the Todlist items DAO.
 * 
 * @author martin.jasek
 *
 */
@Repository
public class TodolistItemsInMemoryDAO implements TodolistItemsDAO {

	private final Map<UUID, TodolistItem> items;

	public TodolistItemsInMemoryDAO() {
		items = new LinkedHashMap<>();

		TodolistItem item = new TodolistItem("Sample todo list item");
		items.put(item.getId(), item);
	}

	@Override
	public TodolistItem create(TodolistItem item) {
		items.put(item.getId(), item);
		return item;
	}

	@Override
	public TodolistItem remove(UUID id) {
		TodolistItem removed = items.remove(id);
		return removed;
	}

	@Override
	public List<TodolistItem> list() {
		return new ArrayList<>(items.values());
	}

	@Override
	public String toString() {
		return "TodoListItemsInMemoryDAO [items=" + items + "]";
	}

}
