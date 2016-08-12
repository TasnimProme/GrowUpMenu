package com.askme.asus.growupmenu;

import android.os.Build;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton show_route,driving,transit,cycling,walking;
    RelativeLayout main_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_layout = (RelativeLayout)findViewById(R.id.main_layout);

        show_route = (FloatingActionButton) findViewById(R.id.show_route);
        driving = (FloatingActionButton) findViewById(R.id.driving);
        transit = (FloatingActionButton) findViewById(R.id.transit);
        cycling = (FloatingActionButton) findViewById(R.id.cycling);
        walking = (FloatingActionButton) findViewById(R.id.walking);

        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            RelativeLayout.LayoutParams params1 = (RelativeLayout.LayoutParams) show_route.getLayoutParams();
            params1.setMargins(0, 0, 70, 76);
            show_route.setLayoutParams(params1);

            RelativeLayout.LayoutParams params2 = (RelativeLayout.LayoutParams) driving.getLayoutParams();
            params2.setMargins(0, 0, 70, 76);
            driving.setLayoutParams(params2);

            RelativeLayout.LayoutParams params3 = (RelativeLayout.LayoutParams) transit.getLayoutParams();
            params3.setMargins(0, 0, 70, 76);
            transit.setLayoutParams(params3);

            RelativeLayout.LayoutParams params4 = (RelativeLayout.LayoutParams) cycling.getLayoutParams();
            params4.setMargins(0, 0, 70, 76);
            cycling.setLayoutParams(params4);

            RelativeLayout.LayoutParams params5 = (RelativeLayout.LayoutParams) walking.getLayoutParams();
            params5.setMargins(0, 0, 70, 76);
            walking.setLayoutParams(params5);
        }

        driving.animate().scaleX(0).scaleY(0).setDuration(500);
        transit.animate().scaleX(0).scaleY(0).setDuration(500);
        cycling.animate().scaleX(0).scaleY(0).setDuration(500);
        walking.animate().scaleX(0).scaleY(0).setDuration(500);

        show_route.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

                    if(walking.getScaleX()==0)
                    {
                        show_route.animate().scaleX((float) 0.7).scaleY((float) 0.7).setDuration(500);

                        walking.animate().x((float) (main_layout.getWidth()-show_route.getWidth()*2.15)).y((float) (main_layout.getHeight()-show_route.getHeight()*1.1)).setDuration(500).alpha((float) 1.0).scaleY(1).scaleX(1);
                        driving.animate().x((float) (main_layout.getWidth()-show_route.getWidth()*1.1)).y((float) (main_layout.getHeight()-show_route.getHeight()*1.1)).setDuration(500).alpha((float) 1.0).scaleY(1).scaleX(1);
                        cycling.animate().x((float) (main_layout.getWidth()-show_route.getWidth()*1.1)).y((float) (main_layout.getHeight()-show_route.getHeight()*2.2)).setDuration(500).alpha((float) 1.0).scaleY(1).scaleX(1);
                        transit.animate().x((float) (main_layout.getWidth()-show_route.getWidth()*2.15)).y((float) (main_layout.getHeight()-show_route.getHeight()*2.2)).setDuration(500).alpha((float) 1.0).scaleY(1).scaleX(1);

                    }
                    else
                    {
                        closeAnimation();
                    }

                }
                else {
                    if(walking.getScaleX()==0)
                    {
                        show_route.animate().scaleX((float) 0.7).scaleY((float) 0.7).setDuration(500);

                        walking.animate().x((float) (main_layout.getWidth()-show_route.getWidth()*1.6)).y((float) (main_layout.getHeight()-show_route.getHeight()/1.15)).setDuration(500).alpha((float) 1.0).scaleY(1).scaleX(1);
                        driving.animate().x((float) (main_layout.getWidth()-show_route.getWidth()/1.1)).y((float) (main_layout.getHeight()-show_route.getHeight()/1.15)).setDuration(500).alpha((float) 1.0).scaleY(1).scaleX(1);
                        cycling.animate().x((float) (main_layout.getWidth()-show_route.getWidth()/1.1)).y((float) (main_layout.getHeight()-show_route.getHeight()*1.52)).setDuration(500).alpha((float) 1.0).scaleY(1).scaleX(1);
                        transit.animate().x((float) (main_layout.getWidth()-show_route.getWidth()*1.6)).y((float) (main_layout.getHeight()-show_route.getHeight()*1.52)).setDuration(500).alpha((float) 1.0).scaleY(1).scaleX(1);

                    }
                    else
                    {
                        closeAnimation();
                    }
                }

            }
        });


        driving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"driving",100).show();
                closeAnimation();
            }
        });

        cycling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"cycling",100).show();
                closeAnimation();
            }
        });

        walking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"walking",100).show();
                closeAnimation();
            }
        });

        transit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"transit",100).show();
                closeAnimation();
            }
        });


    }

    private void closeAnimation() {


        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            walking.animate().x((float) (main_layout.getWidth()-show_route.getWidth()*1.6)).y((float) (main_layout.getHeight()-show_route.getHeight()*1.6)).setDuration(500).scaleY(0).scaleX(0);
            driving.animate().x((float) (main_layout.getWidth()-show_route.getWidth()*1.6)).y((float) (main_layout.getHeight()-show_route.getHeight()*1.6)).setDuration(500).scaleY(0).scaleX(0);
            cycling.animate().x((float) (main_layout.getWidth()-show_route.getWidth()*1.6)).y((float) (main_layout.getHeight()-show_route.getHeight()*1.6)).setDuration(500).scaleY(0).scaleX(0);
            transit.animate().x((float) (main_layout.getWidth()-show_route.getWidth()*1.6)).y((float) (main_layout.getHeight()-show_route.getHeight()*1.6)).setDuration(500).scaleY(0).scaleX(0);
        }

        else {
        walking.animate().x((float) (main_layout.getWidth()-show_route.getWidth()*1.35)).y((float) (main_layout.getHeight()-show_route.getHeight()*1.18)).setDuration(500).scaleY(0).scaleX(0);
        driving.animate().x((float) (main_layout.getWidth()-show_route.getWidth()*1.35)).y((float) (main_layout.getHeight()-show_route.getHeight()*1.18)).setDuration(500).scaleY(0).scaleX(0);
        cycling.animate().x((float) (main_layout.getWidth()-show_route.getWidth()*1.35)).y((float) (main_layout.getHeight()-show_route.getHeight()*1.18)).setDuration(500).scaleY(0).scaleX(0);
        transit.animate().x((float) (main_layout.getWidth()-show_route.getWidth()*1.35)).y((float) (main_layout.getHeight()-show_route.getHeight()*1.18)).setDuration(500).scaleY(0).scaleX(0);
        }

        show_route.animate().scaleX(1).scaleY(1).setDuration(500);
    }
}
