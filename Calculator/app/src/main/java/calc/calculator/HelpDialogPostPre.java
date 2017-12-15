package calc.calculator;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class HelpDialogPostPre extends Dialog {

    private static Context mContext = null;

    public HelpDialogPostPre(Context context) {
        super(context);
        mContext = context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.std_helpx);
        WebView help = (WebView)findViewById(R.id.helpView);
        String helpText = readRawTextFile(R.raw.help_prepost);
        help.loadData(helpText, "text/html; charset=utf-8", "utf-8");
    }

    private String readRawTextFile(int id) {
        InputStream inputStream = mContext.getResources().openRawResource(id);
        InputStreamReader in = new InputStreamReader(inputStream);
        BufferedReader buf = new BufferedReader(in);
        String line;
        StringBuilder text = new StringBuilder();
        try {
            while (( line = buf.readLine()) != null)
                text.append(line);
        } catch (IOException e) {
            return null;
        }
        return text.toString();
    }
}
