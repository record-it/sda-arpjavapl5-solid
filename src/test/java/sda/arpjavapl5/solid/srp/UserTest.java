package sda.arpjavapl5.solid.srp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {


    @Test
    public void shouldReturnValidNameForNonNullName(){
        //given
        String name = "a";
        //when
        User user = new User(name, "kowal", "1234","adam@op.pl");
        //that
        assertEquals("A",user.getFirstName());
    }

    @Test
    public void shouldThrowExceptionForNullName(){
        //given
        String name = null;
        //when
        User user = new User(name, "kowal", "1234","adam@op.pl");
        //that
        assertThrows(NullPointerException.class, user::getFirstName);
    }


}