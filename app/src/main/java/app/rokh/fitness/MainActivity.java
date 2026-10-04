package app.rokh.fitness;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends Activity {
  private WebView web;
  @Override public void onCreate(Bundle b) {
    super.onCreate(b);
    web = new WebView(this);
    web.setBackgroundColor(Color.rgb(8, 10, 14));
    web.setOverScrollMode(View.OVER_SCROLL_NEVER);
    setContentView(web);
    WebSettings s = web.getSettings();
    s.setJavaScriptEnabled(true);
    s.setDomStorageEnabled(true);
    s.setAllowFileAccess(true);
    s.setAllowContentAccess(true);
    s.setDatabaseEnabled(true);
    s.setDefaultTextEncodingName("UTF-8");
    s.setLoadWithOverviewMode(false);
    s.setUseWideViewPort(false);
    web.setWebViewClient(new WebViewClient() {
      @Override public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        if (request == null || request.isForMainFrame()) Toast.makeText(MainActivity.this, "خطا در باز کردن برنامه", Toast.LENGTH_SHORT).show();
      }
    });
    web.setWebChromeClient(new WebChromeClient());
    web.loadUrl("file:///android_asset/index.html");
  }
  @Override public void onBackPressed() {
    if (web != null && web.canGoBack()) web.goBack(); else super.onBackPressed();
  }
}
