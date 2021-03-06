package com.patrickwallin.projects.mlbcenter;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;
import com.androidnetworking.interfaces.StringRequestListener;
import com.patrickwallin.projects.mlbcenter.fragment.TeamFragment;

import org.json.JSONArray;

import java.io.IOException;
import java.util.Calendar;

import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

public class MainActivity extends AppCompatActivity {
    //private TabLayout mTabLayout;
    //private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AndroidNetworking.initialize(getApplicationContext());
        //AndroidNetworking.setParserFactory(new JacksonParserFactory());

        int year = Calendar.getInstance().get(Calendar.YEAR);

        String loginInfo = getString(R.string.username) + ":" + getString(R.string.password);
        byte[] encodingByte = Base64.encode (loginInfo.getBytes(), Base64.DEFAULT);
        final String encoding = new String(encodingByte);

        /*
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .authenticator(new Authenticator() {
                    @Override
                    public Request authenticate(Route route, Response response) throws IOException {
                        return response.request().newBuilder()
                                .header("Authorization", "Basic " + encoding)
                                .build();
                    }
                })
                .build();
*/


/*
        AndroidNetworking.get(getString(R.string.mysportsfeeds_url))
                .addPathParameter(getString(R.string.version_number), getString(R.string.mysportsfeeds_version))
                .addPathParameter(getString(R.string.season_name), String.valueOf(year) + "-" + getString(R.string.regular))
                .addPathParameter(getString(R.string.feeds),getString(R.string.feeds_conference_team_standings))
                //.setOkHttpClient(okHttpClient)
                .addHeaders("Authorization", Credentials.basic(getString(R.string.username),getString(R.string.password)))
                .setPriority(Priority.LOW)
                .build()
                .getAsString(new StringRequestListener() {
                    @Override
                    public void onResponse(String response) {
                        Log.i("tag-response",response.toString());
                    }

                    @Override
                    public void onError(ANError anError) {
                        Log.i("tag-error",anError.toString());
                    }
                });

                //.getAsJSONArray(new JSONArrayRequestListener() {
                 //   @Override
                 //   public void onResponse(JSONArray response) {
                 //       Log.i("tag-response",response.toString());
                 //   }

                  //  @Override
                  //  public void onError(ANError anError) {
                  //      Log.i("tag-error",anError.toString());
                  //  }
                //});
*/


        final TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        //tabLayout.setupWithViewPager(viewPager);
        createTabs(tabLayout);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        createViewPager(viewPager);


/*
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                Log.d("test", "position = " + position);
                viewPager.setCurrentItem(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        */

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //super.onTabSelected(tab);
                viewPager.setCurrentItem(tab.getPosition());
                Log.i("TAG", "onTabSelected: " + tab.getPosition());

                //Toast.makeText(getApplicationContext(),tab.getText(),Toast.LENGTH_LONG);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });




    }

    private void createTabs(TabLayout tabLayout) {
        String[] mainMenuTitle = getResources().getStringArray(R.array.main_menu_title);
        String[] mainMenuKey = getResources().getStringArray(R.array.main_menu_key);

        for(int i = 0; i < mainMenuTitle.length; i++) {
            //int resID = getResources().getIdentifier(teams[i].toLowerCase(), "drawable", getPackageName());
            //if(resID > 0)
              //  mTabLayout.addTab(mTabLayout.newTab().setText(teams[i]).setIcon(resID));
            //else
                if(i == 0)
                    tabLayout.addTab(tabLayout.newTab().setText(mainMenuTitle[i]).setTag(mainMenuKey[i]),true);
                else
                    tabLayout.addTab(tabLayout.newTab().setText(mainMenuTitle[i]).setTag(mainMenuKey[i]));

            /*
            TextView tab = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
            tab.setText(teams[i]);
            tab.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.nyy, 0, 0);
            mTabLayout.getTabAt(i).setCustomView(tab);
            //tabLayout.addTab(tabLayout.newTab().setCustomView(tab));
            */
        }
    }

    private void createViewPager(ViewPager viewPager) {
        String[] mainMenuKey = getResources().getStringArray(R.array.main_menu_key);
        String[] mainMenuTitle = getResources().getStringArray(R.array.main_menu_title);

        int numberOfTabs = mainMenuTitle.length;
        MainTabFragmentPagerAdapter adapter = new MainTabFragmentPagerAdapter(getSupportFragmentManager(),numberOfTabs,this);
        for(int i = 0; i < mainMenuKey.length; i++) {
            //boolean allTeam = (mainMenuTitle[i].equalsIgnoreCase("ALL") || teams[i].equalsIgnoreCase("NL") || teams[i].equalsIgnoreCase("AL") ? true : false);
            adapter.setInfoBasedOnTabPosition(i,mainMenuKey[i],mainMenuTitle[i]);
        }
        viewPager.setAdapter(adapter);
    }
}
