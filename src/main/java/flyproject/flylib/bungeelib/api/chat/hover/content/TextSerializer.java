package flyproject.flylib.bungeelib.api.chat.hover.content;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import flyproject.flylib.bungeelib.api.chat.BaseComponent;
import flyproject.flylib.bungeelib.api.chat.hover.content.Text;

public class TextSerializer implements JsonSerializer<flyproject.flylib.bungeelib.api.chat.hover.content.Text>, JsonDeserializer<flyproject.flylib.bungeelib.api.chat.hover.content.Text>
{

    @Override
    public flyproject.flylib.bungeelib.api.chat.hover.content.Text deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException
    {
        if ( element.isJsonArray() )
        {
            return new flyproject.flylib.bungeelib.api.chat.hover.content.Text( context.<BaseComponent[]>deserialize( element, BaseComponent[].class ) );
        } else if ( element.isJsonPrimitive() )
        {
            return new flyproject.flylib.bungeelib.api.chat.hover.content.Text( element.getAsJsonPrimitive().getAsString() );
        } else
        {
            return new flyproject.flylib.bungeelib.api.chat.hover.content.Text( new BaseComponent[]
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
