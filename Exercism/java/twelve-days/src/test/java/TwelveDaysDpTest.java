import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.Ignore;


    public class TwelveDaysDpTest {
        private TwelveDaysDp twelveDaysDp;

        @Before
        public void setup() {
            twelveDaysDp = new TwelveDaysDp();
        }

        @Test
        public void testVerseOne() {
            String expectedVerseOne = "On the first day of Christmas my true love gave to me: " +
                    "a Partridge in a Pear Tree.\n";
            assertEquals(expectedVerseOne, twelveDaysDp.verse(1));
        }

        @Test
        public void testVerseTwo() {
            String expectedVerseTwo = "On the second day of Christmas my true love gave to me: two Turtle Doves, " +
                    "and a Partridge in a Pear Tree.\n";
            assertEquals(expectedVerseTwo, twelveDaysDp.verse(2));
        }

        @Test
        public void testVerseThree() {
            String expectedVerseThree = "On the third day of Christmas my true love gave to me: three French Hens, " +
                    "two Turtle Doves, and a Partridge in a Pear Tree.\n";
            assertEquals(expectedVerseThree, twelveDaysDp.verse(3));
        }

        @Test
        public void testVerseFour() {
            String expectedVerseFour = "On the fourth day of Christmas my true love gave to me: four Calling Birds, " +
                    "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            assertEquals(expectedVerseFour, twelveDaysDp.verse(4));
        }

        @Test
        public void testVerseFive() {
            String expectedVerseFive = "On the fifth day of Christmas my true love gave to me: five Gold Rings, " +
                    "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            assertEquals(expectedVerseFive, twelveDaysDp.verse(5));
        }

        @Test
        public void testVerseSix() {
            String expectedVerseSix = "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, " +
                    "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                    "and a Partridge in a Pear Tree.\n";
            assertEquals(expectedVerseSix, twelveDaysDp.verse(6));
        }

        @Test
        public void testVerseSeven() {
            String expectedVerseSeven = "On the seventh day of Christmas my true love gave to me: " +
                    "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, " +
                    "two Turtle Doves, and a Partridge in a Pear Tree.\n";
            assertEquals(expectedVerseSeven, twelveDaysDp.verse(7));
        }

        @Test
        public void testVerseEight() {
            String expectedVerseEight = "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking," +
                    " seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                    "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            assertEquals(expectedVerseEight, twelveDaysDp.verse(8));
        }

        @Test
        public void testVerseNine() {
            String expectedVerseNine = "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, " +
                    "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
                    "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            assertEquals(expectedVerseNine, twelveDaysDp.verse(9));
        }

        @Test
        public void testVerseTen() {
            String expectedVerseTen = "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, " +
                    "nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, " +
                    "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                    "and a Partridge in a Pear Tree.\n";
            assertEquals(expectedVerseTen, twelveDaysDp.verse(10));
        }

        @Test
        public void testVerseEleven() {
            String expectedVerseEleven = "On the eleventh day of Christmas my true love gave to me: " +
                    "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " +
                    "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                    "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            assertEquals(expectedVerseEleven, twelveDaysDp.verse(11));
        }

        @Test
        public void testVerseTwelve() {
            String expectedVerseTwelve = "On the twelfth day of Christmas my true love gave to me: " +
                    "twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, " +
                    "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
                    "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            assertEquals(expectedVerseTwelve, twelveDaysDp.verse(12));
        }

        @Test
        public void testFirstThreeVerses() {
            String expectedVersesOneToThree = "On the first day of Christmas my true love gave to me: " +
                    "a Partridge in a Pear Tree.\n\n" +
                    "On the second day of Christmas my true love gave to me: two Turtle Doves, " +
                    "and a Partridge in a Pear Tree.\n\n" +
                    "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, " +
                    "and a Partridge in a Pear Tree.\n";
            assertEquals(expectedVersesOneToThree, twelveDaysDp.verses(1, 3));
        }

        @Test
        public void testFourthToSixthVerses() {
            String expectedVersesFourToSix = "On the fourth day of Christmas my true love gave to me: " +
                    "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n\n" +
                    "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, " +
                    "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n\n" +
                    "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, " +
                    "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            assertEquals(expectedVersesFourToSix, twelveDaysDp.verses(4, 6));
        }

        @Test
        public void testSingWholeSong() {
            String expectedSong = "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n" +
                    "\n" +
                    "On the second day of Christmas my true love gave to me: two Turtle Doves, " +
                    "and a Partridge in a Pear Tree.\n" +
                    "\n" +
                    "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, " +
                    "and a Partridge in a Pear Tree.\n" +
                    "\n" +
                    "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, " +
                    "two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                    "\n" +
                    "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, " +
                    "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                    "\n" +
                    "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, " +
                    "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                    "\n" +
                    "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, " +
                    "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                    "and a Partridge in a Pear Tree.\n" +
                    "\n" +
                    "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, " +
                    "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                    "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                    "\n" +
                    "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking," +
                    " seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                    "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                    "\n" +
                    "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing," +
                    " eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
                    "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
                    "\n" +
                    "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, " +
                    "ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, " +
                    "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                    "and a Partridge in a Pear Tree.\n" +
                    "\n" +
                    "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, " +
                    "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " +
                    "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                    "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            assertEquals(expectedSong, twelveDaysDp.sing());
        }

}
