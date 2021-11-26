package flyproject.flylib;

import flyproject.flylib.check.UpdateChecker;
import org.bukkit.plugin.java.JavaPlugin;

public final class FlyLib extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().warning("\n" +
                "######################################\n" +
                "FlyLib is only a Developer API\n" +
                "FlyLib 仅作为开发者接口使用\n" +
                "######################################");
        // Plugin startup logic
        if (!UpdateChecker.getUpdate("http://101.35.162.208:5553/fl/flylib/version.txt").equals(getDescription().getVersion())){
            getLogger().info("\n" +
                    UpdateChecker.getUpdate("http://101.35.162.208:5553/fl/flylib/update.txt").replace("%old%",getDescription().getVersion()).replace("%new%",UpdateChecker.getUpdate("http://101.35.162.208:5553/fl/flylib/version.txt"))
            );
        }
        getLogger().info("§e§l\n" +
                " ______ _       _____           _           _   \n" +
                "|  ____| |     |  __ \\         (_)         | |  \n" +
                "| |__  | |_   _| |__) | __ ___  _  ___  ___| |_ \n" +
                "|  __| | | | | |  ___/ '__/ _ \\| |/ _ \\/ __| __|\n" +
                "| |    | | |_| | |   | | | (_) | |  __/ (__| |_ \n" +
                "|_|    |_|\\__, |_|   |_|  \\___/| |\\___|\\___|\\__|\n" +
                "           __/ |              _/ |              \n" +
                "          |___/              |__/               \n" +
                "(c) Copyright 2021 FlyProject.\n\n\n\n" +
                "§b    ________      __    _ __  \n" +
                "   / ____/ /_  __/ /   (_) /_ \n" +
                "  / /_  / / / / / /   / / __ \\\n" +
                " / __/ / / /_/ / /___/ / /_/ /\n" +
                "/_/   /_/\\__, /_____/_/_.___/ \n" +
                "        /____/                ");
    }

    private static FlyLib Instance;
    public static FlyLib getInstance() {
        return Instance;
    }
}
