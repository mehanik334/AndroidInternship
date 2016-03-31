package com.example.denisenko.myproject;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.toolbar_name);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        int[] myDataset = getDataSet();

        mRecyclerView = (RecyclerView) findViewById(R.id.event_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new RecyclerAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setOnClickListener(this);
    }


    private int[] getDataSet() {

        int[] mDataSet = {R.drawable.image1, R.drawable.image2, R.drawable.image3};
        return mDataSet;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.event_name_view:
                Toast.makeText(this, R.string.event_name, Toast.LENGTH_SHORT).show();
                break;
            case R.id.in_work_view:
                Toast.makeText(this, R.string.in_work, Toast.LENGTH_SHORT).show();
                break;
            case R.id.create_event_view:
                Toast.makeText(this, R.string.create_event, Toast.LENGTH_SHORT).show();
                break;
            case R.id.date_create_event_view:
                Toast.makeText(this, R.string.date_create_event, Toast.LENGTH_SHORT).show();
                break;
            case R.id.reg_event_view:
                Toast.makeText(this, R.string.regist_event, Toast.LENGTH_SHORT).show();
                break;
            case R.id.date_reg_event_view:
                Toast.makeText(this, R.string.date_regist_event, Toast.LENGTH_SHORT).show();
                break;
            case R.id.resolve_event_view:
                Toast.makeText(this, R.string.resolve_to, Toast.LENGTH_SHORT).show();
                break;
            case R.id.date_resolve_event_view:
                Toast.makeText(this, R.string.resolve_to_date, Toast.LENGTH_SHORT).show();
                break;
            case R.id.liable_event_view:
                Toast.makeText(this, R.string.liable, Toast.LENGTH_SHORT).show();
                break;
            case R.id.date_liable_event_view:
                Toast.makeText(this, R.string.liable_name, Toast.LENGTH_SHORT).show();
                break;
            case R.id.describe_event_view:
                Toast.makeText(this, R.string.describe_event, Toast.LENGTH_SHORT).show();
                break;
            case R.id.event_recycler_view:
                Toast.makeText(this, R.string.recycler_view_name, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
