package flyproject.flylib.database.sqlite;

import flyproject.flylib.FlyLib;

import java.util.logging.Level;

public class Error {
    public static void execute(FlyLib plugin, Exception ex){
        plugin.getLogger().log(Level.SEVERE, "Couldn't execute SQLite statement: ", ex);
    }
    public static void close(FlyLib plugin, Exception ex){
        plugin.getLogger().log(Level.SEVERE, "Failed to close SQLite connection: ", ex);
    }
}