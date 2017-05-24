package com.example.sydney.sample;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TabHost;

public class MainActivity extends Activity {

    ListView lv;
    TabHost host;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        host = (TabHost)findViewById(R.id.tabHost);
        host.setup();
        lv = (ListView)findViewById(R.id.list);


        TabHost.TabSpec spec = host.newTabSpec("Sinspection");

        spec.setContent(R.id.tab1);

        spec.setIndicator("Sinspection");

        host.addTab(spec);

        //Tab 2

        spec = host.newTabSpec("Minspection");

        spec.setContent(R.id.tab2);

        spec.setIndicator("Minspection");

        host.addTab(spec);

        //Tab 3

        spec = host.newTabSpec("Linspection");

        spec.setContent(R.id.tab3);

        spec.setIndicator("Linspection");

        host.addTab(spec);

        //Tab 4

        spec = host.newTabSpec("Winspection");

        spec.setContent(R.id.tab4);

        spec.setIndicator("Winspection");

        host.addTab(spec);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent myIntent = new Intent(MainActivity.this,NextActivity.class);
                startActivity(myIntent);
            }
        });
    }

    public static class FirstFragment extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment1, container, false);
        }
    }
}