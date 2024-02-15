package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConverterArabicToRomanTest {

    @Test
    public void numberIsLess(){
        assertNull(ConverterArabicToRoman.convertToRoman(0));
    }
    @Test
    public void numberIsGreater(){
        assertNull(ConverterArabicToRoman.convertToRoman(4000000));
    }
    @Test
    public void numberIf1_I(){
        assertEquals("I",ConverterArabicToRoman.convertToRoman(1));
    }
    @Test
    public void numberIf2_II(){
        assertEquals("II",ConverterArabicToRoman.convertToRoman(2));
    }
    @Test
    public void numberIf3_III(){
        assertEquals("III",ConverterArabicToRoman.convertToRoman(3));
    }
    @Test
    public void numberIf4_IV(){
        assertEquals("IV",ConverterArabicToRoman.convertToRoman(4));
    }
    @Test
    public void numberIf5_V(){
        assertEquals("V",ConverterArabicToRoman.convertToRoman(5));
    }
    @Test
    public void numberIf6_VI(){
        assertEquals("VI",ConverterArabicToRoman.convertToRoman(6));
    }
    @Test
    public void numberIf7_VII(){
        assertEquals("VII",ConverterArabicToRoman.convertToRoman(7));
    }
    @Test
    public void numberIf8_VIII(){
        assertEquals("VIII",ConverterArabicToRoman.convertToRoman(8));
    }
    @Test
    public void numberIf9_IX(){
        assertEquals("IX",ConverterArabicToRoman.convertToRoman(9));
    }
    @Test
    public void numberIf10_X(){
        assertEquals("X",ConverterArabicToRoman.convertToRoman(10));
    }
    @Test
    public void numberIf11_XI(){
        assertEquals("XI",ConverterArabicToRoman.convertToRoman(11));
    }

    @Test
    public void numberIf20_XX(){
        assertEquals("XX",ConverterArabicToRoman.convertToRoman(20));
    }


    @Test
    public void numberIf30_XXX(){
        assertEquals("XXX",ConverterArabicToRoman.convertToRoman(30));
    }

    @Test
    public void numberIf40_XL(){
        assertEquals("XL",ConverterArabicToRoman.convertToRoman(40));
    }
    @Test
    public void numberIf49_XLIX(){
        assertEquals("XLIX",ConverterArabicToRoman.convertToRoman(49));
    }

    @Test
    public void numberIf50_L(){
        assertEquals("L",ConverterArabicToRoman.convertToRoman(50));
    }
    @Test
    public void numberIf60_LX(){
        assertEquals("LX",ConverterArabicToRoman.convertToRoman(60));
    }
    @Test
    public void numberIf90_XC(){
        assertEquals("XC",ConverterArabicToRoman.convertToRoman(90));
    }
    @Test
    public void numberIf99_XCIX(){
        assertEquals("XCIX",ConverterArabicToRoman.convertToRoman(99));
    }
    @Test
    public void numberIf100_C(){
        assertEquals("C",ConverterArabicToRoman.convertToRoman(100));
    }
    @Test
    public void numberIf110_CX(){
        assertEquals("CX",ConverterArabicToRoman.convertToRoman(110));
    }
    @Test
    public void numberIf400_CD(){
        assertEquals("CD",ConverterArabicToRoman.convertToRoman(400));
    }
    @Test
    public void numberIf499_CDXCIX(){
        assertEquals("CDXCIX",ConverterArabicToRoman.convertToRoman(499));
    }
    @Test
    public void numberIf500_D(){
        assertEquals("D",ConverterArabicToRoman.convertToRoman(500));
    }
    @Test
    public void numberIf600_DC(){
        assertEquals("DC",ConverterArabicToRoman.convertToRoman(600));
    }
    @Test
    public void numberIf900_CM(){
        assertEquals("CM",ConverterArabicToRoman.convertToRoman(900));
    }
    @Test
    public void numberIf999_CMXCIX(){
        assertEquals("CMXCIX",ConverterArabicToRoman.convertToRoman(999));
    }
    @Test
    public void numberIf1000_M(){
        assertEquals("M",ConverterArabicToRoman.convertToRoman(1000));
    }
    @Test
    public void numberIf1100_MC(){
        assertEquals("MC",ConverterArabicToRoman.convertToRoman(1100));
    }
    @Test
    public void numberIf1400_MCD(){
        assertEquals("MCD",ConverterArabicToRoman.convertToRoman(1400));
    }
    @Test
    public void numberIf1500_MD(){
        assertEquals("MD",ConverterArabicToRoman.convertToRoman(1500));
    }
    @Test
    public void numberIf1600_MDC(){
        assertEquals("MDC",ConverterArabicToRoman.convertToRoman(1600));
    }
    @Test
    public void numberIf1900_MCM(){
        assertEquals("MCM",ConverterArabicToRoman.convertToRoman(1900));
    }
    @Test
    public void numberIf2000_MM(){
        assertEquals("MM",ConverterArabicToRoman.convertToRoman(2000));
    }
    @Test
    public void numberIf2100_MMC(){
        assertEquals("MMC",ConverterArabicToRoman.convertToRoman(2100));
    }
    @Test
    public void numberIf2400_MMCD(){
        assertEquals("MMCD",ConverterArabicToRoman.convertToRoman(2400));
    }
    @Test
    public void numberIf2500_MMD(){
        assertEquals("MMD",ConverterArabicToRoman.convertToRoman(2500));
    }
    @Test
    public void numberIf2600_MMDC(){
        assertEquals("MMDC",ConverterArabicToRoman.convertToRoman(2600));
    }
    @Test
    public void numberIf3000_MMM(){
        assertEquals("MMM",ConverterArabicToRoman.convertToRoman(3000));
    }
    @Test
    public void numberIf3100_MMMC(){
        assertEquals("MMMC",ConverterArabicToRoman.convertToRoman(3100));
    }
    @Test
    public void numberIf3999_MMMCMXCIX(){
        assertEquals("MMMCMXCIX",ConverterArabicToRoman.convertToRoman(3999));
    }

}