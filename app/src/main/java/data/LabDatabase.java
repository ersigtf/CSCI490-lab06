package data;

import android.app.Person;
import android.arch.persistence.room.Database;

@Database(entities = {Person.class}, version = 1)
public abstract class LabDatabase {
    public abstract PersonDao persondao();

}
