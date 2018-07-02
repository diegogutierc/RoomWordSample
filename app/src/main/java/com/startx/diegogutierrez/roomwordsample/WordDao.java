package com.startx.diegogutierrez.roomwordsample;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;
@Dao
public interface WordDao {

    //Tip: When inserting data, you can provide a conflict strategy.
    //If the table has more than one column, you can use
    //
    //@Insert(onConflict = OnConflictStrategy.REPLACE)
    // Default behavior is to Abort.
    @Insert
     void insert(Word word);

    @Query("Delete FROM word_table")
    void deleteAll();

    @Query("Select * from word_table ORDER BY word ASC")
    LiveData<List<Word>> getAllWords();



}
