package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    //  Test for Password length validation
    @Test
    public void isLengthValid_shouldReturnFalse_whenPasswordIsShort(){
      assertFalse(Main.isLengthValid("abc123"));
    }
    @Test
    public void isLengthValid_shouldReturnTrue_whenPasswordIsLong(){
        assertTrue(Main.isLengthValid("abcbuf1238745"));
    }
    @Test
    public void isLengthValid_shouldReturnTrue_whenPasswordIsMinimumLength(){
        assertTrue(Main.isLengthValid("abcd1234"));
    }

    //  Test if Password has numbers
    @Test
    public void containsNumbers_shouldReturnFalse_whenPasswordHasNotNumbers(){
        assertFalse(Main.containsNumbers("abchjgfhh"));
    }
    @Test
    public void containsNumbers_shouldReturnTrue_whenPasswordHasNumbers(){
        assertTrue(Main.containsNumbers("abcbuf1238745"));
    }

    //  Test if Password has Upper/Lowercase
    @Test
    public void  containsUpperAndLowercase_shouldReturnFalse_whenPasswordHasOnlyLowercase(){
        assertFalse(Main.containsUpperAndLowercase("abchurjnnce"));

    }
    @Test
    public void  containsUpperAndLowercase_shouldReturnFalse_whenPasswordHasOnlyUppercase(){
        assertFalse(Main.containsUpperAndLowercase("DFNHJHGFEN"));
    }
    @Test
    public void  containsUpperAndLowercase_shouldReturnTrue_whenPasswordHasUpperAndLowercase(){
        assertTrue(Main.containsUpperAndLowercase("ABCUejkme"));

    }

    // Test for Common Password
    @Test
    public void isCommonPassword_shouldReturnTrue_whenPasswordIsCommon(){
        assertTrue(Main.isCommonPassword("1234abcd"));
        assertTrue(Main.isCommonPassword("password1"));
        assertTrue(Main.isCommonPassword("Aa345678"));
        assertTrue(Main.isCommonPassword("123pass"));
    }
    @Test
    public void isCommonPassword_shouldReturnFalse_whenPasswordIsNotCommon(){
        assertFalse(Main.isCommonPassword("sf75sd$&HGF244%"));
    }


}

