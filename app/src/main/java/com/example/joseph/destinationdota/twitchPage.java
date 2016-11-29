package com.example.joseph.destinationdota;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

/**
 * Created by Joseph on 11/7/2016.
 */
public class twitchPage extends Fragment {
    WebView wv;
    String next;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_twitchpage, container, false);
        setHasOptionsMenu(false);
        getActivity().setTitle("Twitch");
        wv = (WebView) v.findViewById(R.id.webView);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("https://www.twitch.tv/directory/game/Dota%202/");

        wv.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return false;
            }
        });
        return v;
    }

    @Override
    public void onPause() {
        wv.onPause();
        super.onPause();
    }
}
