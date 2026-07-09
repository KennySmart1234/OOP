package dairy;

import diary.Diary;
import diary.Entry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    @Test
    public void testThatADiaryIsCreated(){
        Diary diary = new Diary("Kenny Smart", "1234");
        assertNotNull(diary);
    }

    @Test
    public void testToUnlockDiary(){
        Diary diary = new Diary("Kenny Smart", "1234");
        diary.unlockDiary("1234");
        assertFalse(diary.isLocked());
    }


    @Test
    public void testToUnlockDiaryAndCreateEntry(){
        Diary diary = new Diary("Kenny Smart", "1234");
        diary.unlockDiary("1234");
        diary.createEntry("The purpose of living", "Never settle for less");

        Entry entry = diary.findEntryById(1);
        assertEquals("The purpose of living", entry.getTitle());
        assertEquals("Never settle for less", entry.getBody());
        diary.lockDiary();

    }


    @Test
    public void testThatEntryCanNotBeCreatedWhenDiaryIsLocked(){
        Diary diary = new Diary("Kenny Smart", "1234");

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> diary.createEntry("Why Semicolon", "The Villagers"));

        assertEquals("Diary already locked", exception.getMessage());
        diary.lockDiary();

    }

    @Test
    public void testToCreateTwoEntryAndToFindEntryByIDAndTitle(){
        Diary diary = new Diary("Kenny Smart", "1234");

        diary.unlockDiary("1234");

        diary.createEntry("The Villagers", "Never settle for less");
        diary.createEntry("Best Time", "Best time is now");

        Entry entryOne = diary.findEntryById(1);
        Entry entryTwo = diary.findEntryById(2);

        assertEquals("The Villagers", entryOne.getTitle());
        assertEquals("Best Time", entryTwo.getTitle());

        assertEquals("Never settle for less", entryOne.getBody());
        assertEquals("Best time is now", entryTwo.getBody());

    }


    @Test
    public void testThatDiaryEntryCretedCanBeDeleted(){
        Diary diary = new Diary("Kenny Smart", "1234");
        diary.unlockDiary("1234");

        diary.createEntry("The Villagers", "Never settle for less");
        diary.createEntry("Best Time", "Best time is now");
        Entry entryOne = diary.findEntryById(1);
        Entry entryTwo = diary.findEntryById(2);
        assertEquals("The Villagers", entryOne.getTitle());
        assertEquals("Best Time", entryTwo.getTitle());

        diary.deleteEntry(1);
        assertNull(diary.findEntryById(1));


    }

    @Test
    public void testThatOneDiaryEntryCreatedCanBeUpdated(){
        Diary diary = new Diary("Kenny Smart", "1234");
        diary.unlockDiary("1234");

        diary.createEntry("The Villagers", "Never settle for less");
        Entry entryOne = diary.findEntryById(1);

        diary.updateEntry(1, "My choice", "God never fail");
        assertEquals("My choice", entryOne.getTitle());
        assertEquals("God never fail", entryOne.getBody());


    }


}
