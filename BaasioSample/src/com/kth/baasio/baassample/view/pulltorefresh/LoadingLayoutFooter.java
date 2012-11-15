
package com.kth.baasio.baassample.view.pulltorefresh;

import com.kth.baasio.baassample.R;

import android.content.Context;
import android.view.LayoutInflater;

public class LoadingLayoutFooter extends LoadingLayout {

    public LoadingLayoutFooter(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.pull_to_refresh_footer, this);
    }
}
