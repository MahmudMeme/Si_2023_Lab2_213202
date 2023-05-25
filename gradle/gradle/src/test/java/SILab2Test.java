import org.junit.Test;
import org.junit.jupiter.api.parallel.Execution;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SILab2Test {

    @Test
    public void function() {
        User user = new User("Mahmud", "s123s123", "memedoskim16@gmail.com");
        User user2 = new User("Stefan", "s123 s123", "stefan@gmail.com");
        User user3 = new User("TestUserName", "s====++++++", "Test@gmail.com");
        User user4 = new User("NEkojDug", "12356", "Nekoj@gmail.com");
        User user5 = new User(null, "12356", "Nekoj@gmail.com");
        User user6 = new User(null, null, null);
        List<User> userList = new ArrayList<>();
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        // SILab2.function(user,userList);// iamt @ . retur false
        // SILab2.function(user2,userList);
        // SILab2.function(user3,userList); // imat specialen znak vo pass eturn false
        // SILab2.function(user4,userList); // passwordot e mal
        // SILab2.function(user5,userList); // user name == null
        // SILab2.function(user6,userList); // throw new exeption

        assertEquals(false, SILab2.function(user, userList));
        assertFalse(SILab2.function(user2, userList));
        assertFalse(SILab2.function(user3, userList));
        assertFalse(SILab2.function(user4, userList));
        assertFalse(SILab2.function(user5, userList));
        assertThrows(RuntimeException.class, () -> SILab2.function(user6, userList));
    }
}