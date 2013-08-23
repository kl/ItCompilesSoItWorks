package se.miun.itcompilesitworks;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinDatThing();
    }

    private void spinDatThing() {
        final TextView datThing = (TextView)findViewById(R.id.hello_boyz);
        datThing.animate().scaleX(10).scaleY(30).rotationBy(360).setDuration(4000).setListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animation) { // lol recursion
                datThing.animate().scaleX(0.05f).scaleY(0.05f).translationXBy(2000).setDuration(3000).setListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animation) {
                        datThing.setVisibility(View.GONE);
                    }
                });
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
