package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.londonappbrewery.destini.R.string.T1_Ans1;
import static com.londonappbrewery.destini.R.string.T1_Ans2;
import static com.londonappbrewery.destini.R.string.T2_Ans1;
import static com.londonappbrewery.destini.R.string.T2_Ans2;
import static com.londonappbrewery.destini.R.string.T2_Story;
import static com.londonappbrewery.destini.R.string.T3_Ans1;
import static com.londonappbrewery.destini.R.string.T3_Ans2;
import static com.londonappbrewery.destini.R.string.T3_Story;
import static com.londonappbrewery.destini.R.string.T4_End;
import static com.londonappbrewery.destini.R.string.T5_End;
import static com.londonappbrewery.destini.R.string.T6_End;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mTopButton;
    Button mBottomButton;
    TextView mStatement;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);
        mStatement = (TextView) findViewById(R.id.storyTextView);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mTopButton.getText().toString().equals(getString(R.string.T1_Ans1))) {
                    // Top Button clicked for the first time
                    mStatement.setText(T3_Story);
                    mTopButton.setText(T3_Ans1);
                    mBottomButton.setText(T3_Ans2);
                } else if (mTopButton.getText().toString().equals(getString(R.string.T3_Ans1))) {
                    // T6 to the End
                    mStatement.setText(T6_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                } else if (mTopButton.getText().toString().equals(getString(R.string.T2_Ans1))) {
                    // T3_Story
                    mStatement.setText(T3_Story);
                    mTopButton.setText(T3_Ans1);
                    mBottomButton.setText(T3_Ans2);
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mBottomButton.getText().toString().equals(getString(R.string.T1_Ans2))) {
                    // Bottom Button clicked for the first time
                    mStatement.setText(T2_Story);
                    mTopButton.setText(T2_Ans1);
                    mBottomButton.setText(T2_Ans2);
                } else if (mBottomButton.getText().toString().equals(getString(R.string.T3_Ans2))) {
                    // T5 to the end
                    mStatement.setText(T5_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                } else if (mBottomButton.getText().toString().equals(getString(R.string.T2_Ans2))) {
                    // T4 to the end
                    mStatement.setText(T4_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                }
            }
        });

    }
}
