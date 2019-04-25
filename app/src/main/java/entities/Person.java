package entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Person {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String name;

    public String getName() {
        return this.name;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int idNum){
        id = idNum;
    }
    public void setName(String inputName){
        name = inputName;
    }

}
