class TwelveDays {

    final String[] GIFTS_LIST = {
            "Partridge in a Pear Tree", "Turtle Doves"    ,
            "French Hens"             , "Calling Birds"   ,
            "Gold Rings"              , "Geese-a-Laying"  ,
            "Swans-a-Swimming"        , "Maids-a-Milking" ,
            "Ladies Dancing"          , "Lords-a-Leaping" ,
            "Pipers Piping"           , "Drummers Drumming"
    };

    final String[] DAY_COUNT_IN_WORDS = {
            "first"  , "second"  , "third",
            "fourth" , "fifth"   , "sixth",
            "seventh", "eighth"  , "ninth",
            "tenth"  , "eleventh", "twelfth"
    };

    final String[] GIFTS_COUNT_IN_WORDS = {
            "a"    , "two"   , "three",
            "four" , "five"  , "six"  ,
            "seven", "eight" , "nine" ,
            "ten"  , "eleven", "twelve"
    };

    String verse(int verseNumber) {
        String openingLyricBasedOnDay = openingLyricGenerator(verseNumber);
        String endingLyricBasedOnGifts =  endingLyricGenerator(verseNumber);
        return openingLyricBasedOnDay+endingLyricBasedOnGifts;
    }

    String verses(int startVerse, int endVerse) {
        String song = "";
        for(int verseIterator = startVerse; verseIterator <= endVerse; verseIterator++)
            song = song + verse(verseIterator) + ((verseIterator == endVerse) ? "" : "\n") ;
        return song;
    }
    
    String sing() {
        return verses(1,12);
    }

    String openingLyricGenerator(int verseNumber)
    {
        return "On the " + DAY_COUNT_IN_WORDS[verseNumber-1] + " day of Christmas my true love gave to me: ";
    }

    String endingLyricGenerator(int verseNumber)
    {
        String endingLyricWithTrailingComma = "";
        String endingLyric = "";
        boolean andFlag = true;
        if (verseNumber == 1)
            andFlag = false;
        for(int giftVerseIterator = verseNumber-1; giftVerseIterator >= 0; giftVerseIterator--)
            endingLyricWithTrailingComma = endingLyricWithTrailingComma + GIFTS_COUNT_IN_WORDS[giftVerseIterator] + " " + GIFTS_LIST[giftVerseIterator] + ((andFlag && giftVerseIterator == 1) ? ", and " : ", ");
        endingLyric = endingLyricWithTrailingComma.substring(0, endingLyricWithTrailingComma.length() - 2) + ".\n";
        return endingLyric;
    }
}
