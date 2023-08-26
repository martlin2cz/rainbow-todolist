package cz.martlin.rainbowtodolist.dao;

import java.util.List;
import java.util.UUID;

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
	 * Removes the provided {@link TodolistItem}.
	 * 
	 * @param id
	 * @return
	 */
	TodolistItem remove(UUID id);

	/**
	 * Lists all the {@link TodolistItem}s.
	 * 
	 * @return
	 */
	List<TodolistItem> list();

}
