package cz.martlin.rainbowtodolist.daos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cz.martlin.rainbowtodolist.dao.TodolistItemsDAO;
import cz.martlin.rainbowtodolist.model.TodolistItem;

class TodolistItemsInMemoryDAOTest {

	private TodolistItemsDAO dao;
	
	@BeforeEach
	public void prepare() {
		 dao = new TodolistItemsInMemoryDAO();
	}
	
	@Test
	void testCreate() {
		TodolistItem item = new TodolistItem("Drink beer");
		dao.create(item);
		
		assertTrue(dao.list().contains(item));
	}

	@Test
	void testRemove() {
		TodolistItem item = dao.list().get(0);
		
		dao.remove(item.getId());
		
		assertFalse(dao.list().contains(item));
	}

	@Test
	void testList() {
		TodolistItem sampleItem = new TodolistItem("Sample todo list item");
		assertTrue(dao.list().contains(sampleItem));
	}

}
