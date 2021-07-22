package com.example.amrapp.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class ResizableListView extends ListView {

    public ResizableListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ResizableListView(Context context) {
        super(context);
    }

    public ResizableListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    //TODO review how this works sometime
    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }

}
