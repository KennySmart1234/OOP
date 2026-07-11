package diary;
import java.util.ArrayList;
import java.util.List;

public class Diaries {

    private List<Diary> diaries;


    public Diaries() {
        diaries = new ArrayList<>();
    }


    public void addDiary(String username, String password) {
        Diary diary = new Diary(username, password);
        if (diaries.contains(diary)) {
            throw new IllegalArgumentException("Diary already exists");
        }
        diaries.add(diary);

    }

    public int getNumberOfDiaries() {
        return diaries.size();
    }

    public Diary findByUsername(String username) {
        for (Diary diary : diaries){
            if (diary.getUsername().equals(username)) {
                return diary;
            }
        }
        return null;
    }

    private Diary findDiary(String username, String password) {
        for (Diary diary : diaries){
            boolean isCorrectUserName = diary.getUsername().equals(username);
            boolean isCorrectPassword = diary.getPassword().equals(password);

            if (isCorrectUserName && isCorrectPassword) {
                return diary;
            }
        }
        throw new IllegalArgumentException("Invalid username or password");
    }



    public void deleteDiary(String username, String password) {
        Diary diary = findDiary(username, password);

            diaries.remove(diary);
    }

}
