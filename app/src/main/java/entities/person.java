package entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class person {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String name;

    String getName() {
        return this.name;
    }
    int getId() {
        return this.id;
    }
    void setId(int idNum){
        id = idNum;
    }
    void setName(String inputName){
        name = inputName;
    }

}
