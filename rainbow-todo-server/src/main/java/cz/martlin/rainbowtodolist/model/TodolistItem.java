package cz.martlin.rainbowtodolist.model;

import java.util.UUID;

/**
 * The Todolist item, an item of a Todolist.
 * 
 * @author martin.jasek
 *
 */
public class TodolistItem {

	private final UUID id;
	private final String text;

	public TodolistItem(String text) {
		super();
		this.id = UUID.randomUUID();
		this.text = text;
	}

	public TodolistItem(UUID id, String text) {
		super();
		this.id = id;
		this.text = text;
	}

	@Override
	public String toString() {
		return "TodolistItem [id=" + id + ", text=" + text + "]";
	}
	
}
