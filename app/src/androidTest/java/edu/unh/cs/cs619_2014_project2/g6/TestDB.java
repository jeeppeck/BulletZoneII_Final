package edu.unh.cs.cs619_2014_project2.g6;

import android.database.sqlite.SQLiteDatabase;
import android.test.AndroidTestCase;

import edu.unh.cs.cs619_2014_project2.g6.DataBase.DBAdapter;

/**
 * Created by jeep on 12/7/14.
 */
public class TestDB extends AndroidTestCase {
    public void testCreateDb() throws Throwable{
        mContext.deleteDatabase(DBAdapter.DATABASE_NAME);
        DBAdapter myDb = new DBAdapter(mContext);
        assertEquals(true, myDb.isOpen());
        myDb.close();
    }
}
