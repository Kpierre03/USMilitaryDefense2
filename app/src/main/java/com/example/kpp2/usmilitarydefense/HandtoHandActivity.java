package com.example.kpp2.usmilitarydefense;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.kpp2.usmilitarydefense.R;


import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Kpp2 on 7/26/17.
 */

public class HandtoHandActivity extends BaseActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_hand_to_hand);
            ButterKnife.bind(this);

        }


        @Override
        protected void onNewIntent(Intent intent) {
            super.onNewIntent(intent);
        }


        @OnClick(R.id.activity_b_to_b)
        public void activityBButton(View v) {

            goToActivity(HandtoHandActivity.class);
        }


        @OnClick(R.id.activity_b_to_c)
        public void activityCButton(View v) {

            goToActivity(FirearmsActivity.class);
        }

        @OnClick(R.id.activity_b_to_d)
        public void activityDButton(View v) {

            goToActivity(AirstrikesActivity.class);
        }
    }
