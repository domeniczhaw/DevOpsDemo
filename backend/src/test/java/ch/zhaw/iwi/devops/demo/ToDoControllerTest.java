package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ToDoControllerTest {
    
    @Test
    public void testCreate() {
        PersonController controller = new PersonController();
        var person = new Person(1, "t", "d");
        controller.updatePerson(1, person);
        assertEquals(1, controller.count());
        assertEquals(1, controller.todo().size());
    }

}
