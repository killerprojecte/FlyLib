package net.md_5.bungee.api.chat.hover.content;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import net.md_5.bungee.api.chat.BaseComponent;

public class TextSerializer implements JsonSerializer<net.md_5.bungee.api.chat.hover.content.Text>, JsonDeserializer<net.md_5.bungee.api.chat.hover.content.Text>
{

    @Override
    public net.md_5.bungee.api.chat.hover.content.Text deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException
    {
        if ( element.isJsonArray() )
        {
            return new net.md_5.bungee.api.chat.hover.content.Text( context.<BaseComponent[]>deserialize( element, BaseComponent[].class ) );
        } else if ( element.isJsonPrimitive() )
        {
            return new net.md_5.bungee.api.chat.hover.content.Text( element.getAsJsonPrimitive().getAsString() );
        } else
        {
            return new net.md_5.bungee.api.chat.hover.content.Text( new BaseComponent[]
            {
                context.deserialize( element, BaseComponent.class )
            } );
        }
    }

    @Override
    public JsonElement serialize(Text content, Type type, JsonSerializationContext context)
    {
        return context.serialize( content.getValue() );
    }
}
