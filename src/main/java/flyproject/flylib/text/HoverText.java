package flyproject.flylib.text;

import flyproject.flylib.bungeelib.api.chat.ClickEvent;
import flyproject.flylib.bungeelib.api.chat.ComponentBuilder;
import flyproject.flylib.bungeelib.api.chat.HoverEvent;
import flyproject.flylib.bungeelib.api.chat.TextComponent;

public class HoverText {
    public static TextComponent getHoverText(String text, String hovertext, String action){
        TextComponent mainComponent = new TextComponent(text);
        mainComponent.setHoverEvent( new HoverEvent(HoverEvent.Action.valueOf(action), new ComponentBuilder(hovertext).create()));
        return mainComponent;
    }

    public static TextComponent getClickHoverText(String text, String hovertext, String action, String vaule){
        TextComponent mainComponent = new TextComponent(text);
        mainComponent.setHoverEvent( new HoverEvent( HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(hovertext).create()));
        mainComponent.setClickEvent(new ClickEvent(ClickEvent.Action.valueOf(action),vaule));
        return mainComponent;
    }
}
