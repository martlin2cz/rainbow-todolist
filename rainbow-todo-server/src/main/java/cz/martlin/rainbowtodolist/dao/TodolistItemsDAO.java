package cz.martlin.rainbowtodolist.dao;

import java.util.List;

import cz.martlin.rainbowtodolist.model.TodolistItem;

/**
 * The DAO for the {@link TodolistItem}s.
 * 
 * @author martin.jasek
 *
 */
public interface TodolistItemsDAO {

	/**
	 * Create new {@link TodolistItem}.
	 * 
	 * @param item
	 * @return
	 */
	TodolistItem create(TodolistItem item);

	/**
	 * Lists all the {@link TodolistItem}s.
	 * 
	 * @return
	 */
	List<TodolistItem> list();

}
