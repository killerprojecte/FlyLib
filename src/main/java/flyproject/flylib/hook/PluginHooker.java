package flyproject.flylib.hook;

import org.bukkit.Bukkit;

public class PluginHooker {
    public static boolean Hook(String plugin){
        boolean status = false;
        if (Bukkit.getPluginManager().getPlugin(plugin)!=null){
            status = true;
            return status;
        }
        return status;
    }
}
