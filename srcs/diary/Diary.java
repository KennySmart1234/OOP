package diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {

    private String username;
    private String password;
    private boolean isLocked;
    private List<Entry> entries;


    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
        isLocked = true;
        entries = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void unlockDiary(String password) {
        if (this.password.equals(password)) {
            isLocked = false;
        }
        else
            throw new IllegalArgumentException("Invalid password");
    }


    public void lockDiary(){

        isLocked = true;
    }


    public boolean isLocked(){

        return  isLocked;
    }


    public void createEntry(String title, String body){
        if (isLocked){
            throw new IllegalArgumentException("Diary already locked");
        }

        int id = entries.size() + 1;
        entries.add(new Entry(id, title, body));
    }


    public void deleteEntry(int id){
        Entry entry = findEntryById(id);

        if (entry != null) {
            entries.remove(entry);
        }
    }


    public Entry findEntryById(int id){
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                return entry;
            }
        }
        return null;
    }


    public void updateEntry(int id, String title, String body){
        Entry entry = findEntryById(id);
        if (entry != null) {
            entry.setTitle(title);
            entry.setBody(body);
        }

    }


}
