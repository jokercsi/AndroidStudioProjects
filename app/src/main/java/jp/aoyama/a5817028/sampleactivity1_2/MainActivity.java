package jp.aoyama.a5817028.sampleactivity1_2;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    /** Logcatのタグに含める文字列. */
    private static final String TAG = " SampleActivity1_2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* 簡易メッセージ */
        Log.v(TAG,"簡易メッセージ");
        /* デバッグメッセージ */
        Log.d(TAG,"デバッグメッセージ");
        /* 情報 */
        Log.i(TAG,"情報");
        /* 警告 */
        Log.w(TAG,"警告");
        /* エラー */
        Log.e(TAG,"エラー");
    }
}