package flyproject.flylib.check;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class RegistrationCode {
    public static boolean Registration(String checkurl,String code){
        String str;
        boolean status = false;
        try {
            URL url = new URL(checkurl);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream(), StandardCharsets.UTF_8));
            while ((str = reader.readLine()) != null){
                if (str==code){
                    status = true;
                    return status;
                }
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return status;
    }
}
