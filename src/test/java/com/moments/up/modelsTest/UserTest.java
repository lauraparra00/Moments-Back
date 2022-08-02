package com.moments.up.modelsTest;

import com.moments.up.models.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    void userHaveIdUserNameAndAvatar() {
        //Given//
        User user = new User();
        //when//
        user.setUserName("Pepito");
        user.setAvatar("pepAvatar");
        user.setId(5L);
        //then//
        assertEquals("Pepito",user.getUserName());
        assertEquals("pepAvatar", user.getAvatar());
        assertEquals(5L, user.getId());

    }
}
