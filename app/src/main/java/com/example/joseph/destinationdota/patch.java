package com.example.joseph.destinationdota;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class patch extends Fragment {

WebView wv;
    public patch() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_twitchpage, container, false);
        wv=(WebView)v.findViewById(R.id.webView);
        setRetainInstance(true);
        wv.getSettings().setJavaScriptEnabled(true);
        getActivity().setTitle("Patches");
        wv.loadUrl("http://www.dota2.com/news/updates/");

        wv.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return false;
            }
        });
        return v;
    }

}
