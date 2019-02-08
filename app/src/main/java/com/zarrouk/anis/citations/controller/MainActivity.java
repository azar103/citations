package com.zarrouk.anis.citations.controller;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.zarrouk.anis.citations.R;
import com.zarrouk.anis.citations.model.Citation;
import com.zarrouk.anis.citations.model.CitationBank;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView mCitationText;
    ImageView mImageView;
    Citation mCitation;
    CitationBank mCitationBank;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCitationText = (TextView)findViewById(R.id.activity_main_description_text);
        mImageView = (ImageView)findViewById(R.id.activity_main_header_img);
        mCitationBank = this.generateCitations();
        mCitation = mCitationBank.getCitations();
        mButton = (Button)findViewById(R.id.activity_main_generate_btn);

        this.displayCitation(mCitation);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCitationBank = generateCitations();
                mCitation = mCitationBank.getCitations();
                displayCitation(mCitation);

            }
        });


    }

    private CitationBank generateCitations(){

        return new CitationBank(Arrays.asList(
                new Citation("لن تستطيع أن تمنع طيور الهمّ أن تُحلّق فوق رأسك، ولكنك تستطيع أن تمنعها أن تُعشّش في رأسك.",R.drawable.sad1),
                new Citation("أربعة تصبح بها سيداً على قومك هي: الأدب، والعلم، والعفّة، والأمانة",R.drawable.sad2),
                new Citation("لأَننَا نُتقن الصَّمت، حمَّلونَا وزْرَ النَّوايا.",R.drawable.sad3),
                new Citation("لا تجعل حياتك كمقالٍ في جريدة، ما أروعك عندما تكون بطلاً لروايةٍ مشهورة.",R.drawable.img_4),
                new Citation("قد يفشل المرء كثيراً في عمله، ولكن لا نعتبره خائناً إلا إذا بدأ يلقي اللوم على غيره.",R.drawable.img_2),
                new Citation("هناك من يستحقّ الحب، وهناك من يستحق الكراهية، لكن المشكلة الحقيقية كيف تُفرّق بينهما.",R.drawable.img_6)


        ));
    }

   private void displayCitation(Citation citation){
         mCitationText.setText(citation.getQuote());
         mImageView.setImageResource(citation.getImage());

    }

}
