package dairy;

import diary.Diaries;
import diary.Diary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DiariesTest {

    @Test
    public void testThatDiariesIsCreated(){
        Diaries diaries = new Diaries();

        assertNotNull(diaries);
    }

    @Test
    public void testThatOneDiaryCanBeAdded(){
        Diaries diaries = new Diaries();

        diaries.addDiary("Kenny Smart", "1234");

        assertEquals(1, diaries.getNumberOfDiaries());
    }

    @Test
    public void testThatTwoDiariesCanBeAdded(){
        Diaries diaries = new Diaries();
        diaries.addDiary("Kenny Smart", "1234");
        diaries.addDiary("Olatunji", "1234");
        assertEquals(2, diaries.getNumberOfDiaries());
    }

    @Test
    public void testThatTwoDiariesAdded_TwoDiariesCanBeFoundByUsername(){
        Diaries diaries = new Diaries();
        diaries.addDiary("Kenny Smart", "1234");
        diaries.addDiary("Olatunji", "1234");

        assertEquals(2, diaries.getNumberOfDiaries());

        Diary diaryOne = diaries.findByUsername("Kenny Smart");
        Diary diaryTwo = diaries.findByUsername("Olatunji");

        assertNotNull(diaryOne);
        assertNotNull(diaryTwo);

        assertEquals("Kenny Smart", diaryOne.getUsername());
        assertEquals("Olatunji", diaryTwo.getUsername());

    }


    @Test
    public void testThatDiaryCanBeDeleted(){
        Diaries diaries = new Diaries();
        diaries.addDiary("Ojo", "1234");
        diaries.addDiary("Olatunji", "1234");

        assertEquals(2, diaries.getNumberOfDiaries());

        diaries.deleteDiary("Ojo",  "1234");
        assertEquals(1, diaries.getNumberOfDiaries());

        assertNull(diaries.findByUsername("Ojo"));
        assertNotNull(diaries.findByUsername("Olatunji"));

    }


}
