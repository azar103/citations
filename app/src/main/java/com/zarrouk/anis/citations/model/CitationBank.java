package com.zarrouk.anis.citations.model;

import java.util.Collections;
import java.util.List;

/**
 * Created by Anis Zarrouk on 08/02/2019
 */
public class CitationBank {

    private List<Citation> citations ;
    private  int mCitationIndex;

    public CitationBank(List<Citation> citations) {
        this.citations = citations;
        Collections.shuffle(citations);
        mCitationIndex = 0;
    }

    public Citation getCitations() {
        if(mCitationIndex == citations.size()){
            mCitationIndex = 0;
        }
        return citations.get(mCitationIndex++);
    }

    public void setCitations(List<Citation> ciations) {
        this.citations = ciations;
    }
}
