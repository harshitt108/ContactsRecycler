package com.example.contactsrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList <> (  );
    private ArrayList<String> mNumbers = new ArrayList <> (  );


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        Log.d(TAG,"onCreate started.");

        initContacts ();

    }
    private void initContacts(){
        Log.d(TAG,"init Contacts preparing");
        mNames.add ( "Harshit" );
        mNumbers.add ( ("9472108774") );

        mNames.add ( "Shreya" );
        mNumbers.add ( ("9472108774") );

        mNames.add ( "Sunny" );
        mNumbers.add ( ("9472108774") );

        mNames.add ( "Ankit" );
        mNumbers.add ( ("9472108774") );

        mNames.add ( "Mona" );
        mNumbers.add ( ("9472108774") );

        mNames.add ( "Dhruv" );
        mNumbers.add ( ("9472108774") );

        mNames.add ( "Nagraj" );
        mNumbers.add ( ("9472108774") );

        mNames.add ( "Doga" );
        mNumbers.add ( ("9472108774") );

        mNames.add ( "Anand" );
        mNumbers.add ( ("9472108774") );

        mNames.add ( "Surya" );
        mNumbers.add ( ("9472108774") );

        mNames.add ( "Allh" );
        mNumbers.add ( ("9472108774") );

        initRecyclerView ();

    }

    private void initRecyclerView(){
        Log.d ( TAG ,"initRecyclerView : implemented");
        RecyclerView recyclerView =findViewById (R.id.recyclerView  );
        RecyclerViewAdapter adapter = new RecyclerViewAdapter ( this,mNames,mNumbers );
        recyclerView.setAdapter ( adapter );

        recyclerView.setLayoutManager ( new LinearLayoutManager ( this,RecyclerView.VERTICAL,false ) );
    }
}