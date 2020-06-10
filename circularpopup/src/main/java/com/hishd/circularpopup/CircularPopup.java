package com.hishd.circularpopup;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static com.hishd.circularpopup.Constraints.LARGE;
import static com.hishd.circularpopup.Constraints.MEDIUM;
import static com.hishd.circularpopup.Constraints.POSITION_BOTTOM;
import static com.hishd.circularpopup.Constraints.POSITION_TOP;
import static com.hishd.circularpopup.Constraints.SUCCESS;
import static com.hishd.circularpopup.Constraints.WARNING;

public class CircularPopup {
    Dialog dialog;
    Context context;
    TextView messageTextView;
    ImageView imageView;
    RelativeLayout relativeLayout;
    int size=0;
    int duration=0;

    public CircularPopup(Context context){
        this.context = context;
        dialog = new Dialog(context);
    }

    public CircularPopup createAlert(String message,int alertType,int givenSize){
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.round_back);
        dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.simple_text);
        dialog.getWindow().getAttributes().windowAnimations=R.style.slide_from_left_to_right;
        switch(givenSize){

            case MEDIUM:
                size=context.getResources().getInteger(R.integer.medium_dialog);
                break;

            case LARGE:
                size=context.getResources().getInteger(R.integer.large_dialog);
                break;
        }

        dialog.getWindow().setLayout(size,size);
        messageTextView=dialog.findViewById(R.id.msg);
        messageTextView.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Medium.ttf"));
        messageTextView.setText(message);
        imageView=dialog.findViewById(R.id.icn);
        imageView.setAnimation(AnimationUtils.loadAnimation(context,R.anim.rotate));
        relativeLayout=dialog.findViewById(R.id.rl);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        switch(alertType){
            case SUCCESS:
                // success icon
                imageView.setImageResource(R.drawable.checked_1);
                relativeLayout.setBackgroundColor(context.getResources()
                        .getColor(R.color.colorSuccess));
                break;

            case WARNING:
                // warning icon

                imageView.setImageResource(R.drawable.warning);
                relativeLayout.setBackgroundColor(context.getResources()
                        .getColor(R.color.colorWarning));
                break;

            case Constraints.ERROR:
                // error icon
                imageView.setImageResource(R.drawable.cancel1);
                relativeLayout.setBackgroundColor(context.getResources()
                        .getColor(R.color.colorError));
                break;
        }

        return this;
    }

    public CircularPopup createAlert(String message, Bitmap icon, int alertType, int givenSize){

        dialog.getWindow().setBackgroundDrawableResource(R.drawable.round_back);
        dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.simple_text);
        dialog.getWindow().getAttributes().windowAnimations=R.style.slide_from_left_to_right;
        switch(givenSize){

            case MEDIUM:
                size=context.getResources().getInteger(R.integer.medium_dialog);
                break;

            case LARGE:
                size=context.getResources().getInteger(R.integer.large_dialog);
                break;
        }
        imageView.setImageBitmap(icon);
        dialog.getWindow().setLayout(size,size);
        messageTextView=dialog.findViewById(R.id.msg);
        messageTextView.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Medium.ttf"));
        messageTextView.setText(message);
        imageView=dialog.findViewById(R.id.icn);
        relativeLayout=dialog.findViewById(R.id.rl);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        switch(alertType){
            case SUCCESS:
                // success icon
                relativeLayout.setBackgroundColor(context.getResources()
                        .getColor(R.color.colorSuccess));
                break;

            case WARNING:
                // warning icon

                relativeLayout.setBackgroundColor(context.getResources()
                        .getColor(R.color.colorWarning));
                break;

            case Constraints.ERROR:
                // error icon
                relativeLayout.setBackgroundColor(context.getResources()
                        .getColor(R.color.colorError));
                break;
        }

        return this;
    }

    public CircularPopup createAlert(String message, Drawable icon, int alertType, int givenSize){

        dialog.getWindow().setBackgroundDrawableResource(R.drawable.round_back);
        dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.simple_text);
        dialog.getWindow().getAttributes().windowAnimations=R.style.slide_from_left_to_right;
        switch(givenSize){

            case MEDIUM:
                size=context.getResources().getInteger(R.integer.medium_dialog);
                break;

            case LARGE:
                size=context.getResources().getInteger(R.integer.large_dialog);
                break;
        }
        imageView.setImageDrawable(icon);
        dialog.getWindow().setLayout(size,size);
        messageTextView=dialog.findViewById(R.id.msg);
        messageTextView.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Medium.ttf"));
        messageTextView.setText(message);
        imageView=dialog.findViewById(R.id.icn);
        relativeLayout=dialog.findViewById(R.id.rl);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        switch(alertType){
            case SUCCESS:
                // success icon
                relativeLayout.setBackgroundColor(context.getResources()
                        .getColor(R.color.colorSuccess));
                break;

            case WARNING:
                // warning icon

                relativeLayout.setBackgroundColor(context.getResources()
                        .getColor(R.color.colorWarning));
                break;

            case Constraints.ERROR:
                // error icon
                relativeLayout.setBackgroundColor(context.getResources()
                        .getColor(R.color.colorError));
                break;
        }

        return this;
    }

    public CircularPopup setDuration(int duration){
        this.duration=duration;
        return this;
    }

    public CircularPopup setBackgroundColor(int color){
        relativeLayout=dialog.findViewById(R.id.rl);
        relativeLayout.setBackgroundColor(color);
        return this;
    }

    public CircularPopup setTextSize(int textSize){
        messageTextView=dialog.findViewById(R.id.msg);
        switch (textSize){
            case Constraints.LARGE_TEXT_SIZE:
                messageTextView.setTextSize((float)context.getResources()
                        .getInteger(R.integer.large_text));
                break;

            case Constraints.NORMAL_TEXT_SIZE:
                messageTextView.setTextSize((float)context.getResources()
                        .getInteger(R.integer.normal_text));
                break;

            case Constraints.EXTRA_LARGE_TEXT_SIZE:
                messageTextView.setTextSize((float)context.getResources()
                        .getInteger(R.integer.extra_large_text));
        }
        return this;
    }

    public CircularPopup setPosition(int position){
        switch (position){
            case POSITION_BOTTOM:
                dialog.getWindow().getAttributes().gravity= Gravity.BOTTOM;
                break;
            case POSITION_TOP:
                dialog.getWindow().getAttributes().gravity= Gravity.BOTTOM;
                break;
        }

        return this;
    }

    public CircularPopup setBackDimness(float dimness){
        dialog.getWindow().setDimAmount(dimness);
        return this;
    }

    public CircularPopup setAnimation(int animation){
        int selectedAnimation=0;
        switch(animation){

            // Scale

            case Constraints.SCALE_FROM_BOTTOM_TO_BOTTOM:
                selectedAnimation=R.style.scale_from_bottom_to_bottom;
                break;

            case Constraints.SCALE_FROM_BOTTOM_TO_TOP:
                selectedAnimation=R.style.scale_from_bottom_to_top;
                break;

            case Constraints.SCALE_FROM_TOP_TO_BOTTOM:
                selectedAnimation=R.style.scale_from_top_to_bottom;
                break;

            case Constraints.SCALE_FROM_TOP_TO_TOP:
                selectedAnimation=R.style.scale_from_top_to_top;
                break;

            case Constraints.SCALE_TO_BOTTOM_FROM_BOTTOM:
                selectedAnimation=R.style.scale_to_bottom_from_bottom;
                break;

            case Constraints.SCALE_TO_TOP_FROM_BOTTOM:
                selectedAnimation=R.style.scale_to_top_from_bottom;
                break;

            case Constraints.SCALE_TO_TOP_FROM_TOP:
                selectedAnimation=R.style.scale_to_top_from_top;
                break;




            case Constraints.SCALE_FROM_LEFT_TO_LEFT:
                selectedAnimation=R.style.scale_from_left_to_left;
                break;
            case Constraints.SCALE_FROM_LEFT_TO_RIGHT:
                selectedAnimation=R.style.scale_from_left_to_right;
                break;

            case Constraints.SCALE_FROM_RIGHT_TO_LEFT:
                selectedAnimation=R.style.scale_from_right_to_left;
                break;

            case Constraints.SCALE_FROM_RIGHT_TO_RIGHT:
                selectedAnimation=R.style.scale_from_right_to_right;
                break;

            case Constraints.SCALE_TO_LEFT_FROM_LEFT:
                selectedAnimation=R.style.scale_to_left_from_left;
                break;

            case Constraints.SCALE_TO_RIGHT_FROM_LEFT:
                selectedAnimation=R.style.scale_to_right_from_left;
                break;

            case Constraints.SCALE_TO_RIGHT_FROM_RIGHT:
                selectedAnimation=R.style.scale_to_right_from_right;
                break;



            // Slide



            case Constraints.SLIDE_FROM_BOTTOM_TO_BOTTOM:
                selectedAnimation=R.style.slide_from_bottom_to_bottom;
                break;
            case Constraints.SLIDE_FROM_BOTTOM_TO_TOP:
                selectedAnimation=R.style.slide_from_bottom_to_top;
                break;

            case Constraints.SLIDE_FROM_TOP_TO_BOTTOM:
                selectedAnimation=R.style.slide_from_top_to_bottom;
                break;

            case Constraints.SLIDE_FROM_TOP_TO_TOP:
                selectedAnimation=R.style.slide_from_top_to_top;
                break;

            case Constraints.SLIDE_TO_BOTTOM_FROM_BOTTOM:
                selectedAnimation=R.style.slide_to_bottom_from_bottom;
                break;

            case Constraints.SLIDE_TO_TOP_FROM_BOTTOM:
                selectedAnimation=R.style.slide_to_top_from_bottom;
                break;

            case Constraints.SLIDE_TO_TOP_FROM_TOP:
                selectedAnimation=R.style.slide_to_top_from_top;
                break;




            case Constraints.SLIDE_FROM_LEFT_TO_LEFT:
                selectedAnimation=R.style.slide_from_left_to_left;
                break;
            case Constraints.SLIDE_FROM_LEFT_TO_RIGHT:
                selectedAnimation=R.style.slide_from_left_to_right;
                break;

            case Constraints.SLIDE_FROM_RIGHT_TO_LEFT:
                selectedAnimation=R.style.slide_from_right_to_left;
                break;

            case Constraints.SLIDE_FROM_RIGHT_TO_RIGHT:
                selectedAnimation=R.style.slide_from_right_to_right;
                break;

            case Constraints.SLIDE_TO_LEFT_FROM_LEFT:
                selectedAnimation=R.style.slide_to_left_from_left;
                break;

            case Constraints.SLIDE_TO_RIGHT_FROM_LEFT:
                selectedAnimation=R.style.slide_to_right_from_left;
                break;

            case Constraints.SLIDE_TO_RIGHT_FROM_RIGHT:
                selectedAnimation=R.style.slide_to_right_from_right;
                break;


        }
        dialog.getWindow().getAttributes().windowAnimations=selectedAnimation;

        return this;
    }

    public void show(){
        dialog.show();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(duration);
                    dialog.dismiss();
                }catch (InterruptedException e){
                    Log.e("show interrupt",e.getMessage());
                }
            }
        }).start();
    }
    
}
