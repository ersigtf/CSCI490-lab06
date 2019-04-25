package asyncs;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import com.example.lab06.PersonActivity;

import java.util.ArrayList;
import java.util.List;

import data.LabDatabase;
import entities.Person;

public class AsyncTask2 extends AsyncTask {
    Context context;
    LabDatabase database;
    List<Person> persons;

    public AsyncTask2(LabDatabase database, Context context){
        this.context = context;
        this.database = database;

    }
    @Override
    protected Object doInBackground(Object[] objects) {
        ArrayList<String>names = new ArrayList();
        persons = database.personDao().getAllPersons();
        for (Person person: persons){

            names.add(person.getName());
        }

        Intent i = new Intent(context, PersonActivity.class);
        i.putExtra("Persons", names);
        context.startActivity(i);
        return null;
    }
}
